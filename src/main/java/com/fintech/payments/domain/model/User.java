package com.fintech.payments.domain.model;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import java.util.Set;
import java.util.UUID;
import java.time.LocalDateTime;
import java.util.HashSet;

/**
 * Entidad de dominio que representa un usuario del sistema.
 * Contiene información básica del usuario, sus roles y permisos, y metadatos de auditoría.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {
    private UUID id;

    @NotBlank(message = "El nombre de usuario no puede estar vacío")
    @Size(min = 3, max = 50, message = "El nombre de usuario debe tener entre 3 y 50 caracteres")
    private String username;

    @NotBlank(message = "El email no puede estar vacío")
    @Email(message = "El email debe ser válido")
    private String email;

    @NotBlank(message = "La contraseña no puede estar vacía")
    @Size(min = 8, message = "La contraseña debe tener al menos 8 caracteres")
    private String password;

    private boolean enabled;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @Builder.Default
    private Set<Role> roles = new HashSet<>();

    /**
     * Enum que representa los roles disponibles en el sistema.
     * Cada rol tiene un conjunto de permisos asociados.
     */
    public enum Role {
        USER("USER", Set.of("READ_TRANSACTIONS", "CREATE_TRANSACTIONS")),
        ADMIN("ADMIN", Set.of("READ_TRANSACTIONS", "CREATE_TRANSACTIONS", "UPDATE_TRANSACTIONS", "DELETE_TRANSACTIONS", "MANAGE_USERS")),
        MERCHANT("MERCHANT", Set.of("READ_TRANSACTIONS", "CREATE_TRANSACTIONS", "READ_REPORTS"));

        private final String roleName;
        private final Set<String> permissions;

        Role(String roleName, Set<String> permissions) {
            this.roleName = roleName;
            this.permissions = permissions;
        }

        public String getRoleName() {
            return roleName;
        }

        public Set<String> getPermissions() {
            return permissions;
        }

        public static Role fromRoleName(String roleName) {
            for (Role role : Role.values()) {
                if (role.getRoleName().equalsIgnoreCase(roleName)) {
                    return role;
                }
            }
            throw new IllegalArgumentException("Rol no válido: " + roleName);
        }
    }

    /**
     * Verifica si el usuario tiene un rol específico.
     * @param roleName Nombre del rol a verificar.
     * @return true si el usuario tiene el rol, false en caso contrario.
     */
    public boolean hasRole(String roleName) {
        return roles.stream().anyMatch(role -> role.getRoleName().equalsIgnoreCase(roleName));
    }

    /**
     * Verifica si el usuario tiene un permiso específico.
     * @param permission Permiso a verificar.
     * @return true si el usuario tiene el permiso, false en caso contrario.
     */
    public boolean hasPermission(String permission) {
        return roles.stream()
                .flatMap(role -> role.getPermissions().stream())
                .anyMatch(p -> p.equalsIgnoreCase(permission));
    }

    /**
     * Actualiza los metadatos de auditoría del usuario.
     */
    public void updateAuditMetadata() {
        this.updatedAt = LocalDateTime.now();
        if (this.createdAt == null) {
            this.createdAt = this.updatedAt;
        }
    }
}