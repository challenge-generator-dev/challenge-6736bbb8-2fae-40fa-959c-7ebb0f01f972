package com.fintech.payments.domain.port;


import com.fintech.payments.domain.model.Role;
import com.fintech.payments.domain.model.User;
import java.util.Optional;
import java.util.UUID;
import java.util.List;

/**
 * Puerto de repositorio para operaciones de persistencia de usuarios.
 * Define las operaciones que el dominio necesita para interactuar con la capa de infraestructura.
 */
public interface UserRepository {
    /**
     * Guarda un usuario en el repositorio.
     * @param user Usuario a guardar.
     * @return Usuario guardado con su ID generado.
     */
    User save(User user);

    /**
     * Busca un usuario por su ID.
     * @param id ID del usuario.
     * @return Optional con el usuario si existe, vacío en caso contrario.
     */
    Optional<User> findById(UUID id);

    /**
     * Busca un usuario por su nombre de usuario.
     * @param username Nombre de usuario.
     * @return Optional con el usuario si existe, vacío en caso contrario.
     */
    Optional<User> findByUsername(String username);

    /**
     * Busca un usuario por su email.
     * @param email Email del usuario.
     * @return Optional con el usuario si existe, vacío en caso contrario.
     */
    Optional<User> findByEmail(String email);

    /**
     * Verifica si existe un usuario con el email proporcionado.
     * @param email Email a verificar.
     * @return true si existe, false en caso contrario.
     */
    boolean existsByEmail(String email);

    /**
     * Verifica si existe un usuario con el nombre de usuario proporcionado.
     * @param username Nombre de usuario a verificar.
     * @return true si existe, false en caso contrario.
     */
    boolean existsByUsername(String username);

    /**
     * Elimina un usuario por su ID.
     * @param id ID del usuario a eliminar.
     */
    void deleteById(UUID id);

    /**
     * Obtiene todos los usuarios del sistema.
     * @return Lista de todos los usuarios.
     */
    List<User> findAll();

    /**
     * Actualiza la contraseña de un usuario.
     * @param userId ID del usuario.
     * @param newPassword Nueva contraseña.
     * @return true si la actualización fue exitosa, false en caso contrario.
     */
    boolean updatePassword(UUID userId, String newPassword);

    /**
     * Actualiza los roles de un usuario.
     * @param userId ID del usuario.
     * @param roles Nuevos roles del usuario.
     * @return true si la actualización fue exitosa, false en caso contrario.
     */
    boolean updateRoles(UUID userId, Set<User.Role> roles);
}