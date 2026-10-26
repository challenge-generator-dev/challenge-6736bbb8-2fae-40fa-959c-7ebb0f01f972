package com.fintech.payments.infrastructure.adapter;

import com.fintech.payments.domain.model.User;
import com.fintech.payments.domain.port.UserRepository;
import jakarta.persistence.*;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Collectors;

@Repository
public class UserRepositoryAdapter implements UserRepository {

    private final UserJpaRepository jpaRepository;
    private final RoleMapper roleMapper;

    public UserRepositoryAdapter(UserJpaRepository jpaRepository, RoleMapper roleMapper) {
        this.jpaRepository = jpaRepository;
        this.roleMapper = roleMapper;
    }

    @Override
    public User save(User user) {
        UserEntity entity = toEntity(user);
        if (user.getId() == null) {
            entity.setCreatedAt(LocalDateTime.now());
        }
        entity.setUpdatedAt(LocalDateTime.now());
        UserEntity saved = jpaRepository.save(entity);
        return toDomain(saved);
    }

    @Override
    public Optional<User> findById(UUID id) {
        return jpaRepository.findById(id).map(this::toDomain);
    }

    @Override
    public Optional<User> findByUsername(String username) {
        return jpaRepository.findByUsername(username).map(this::toDomain);
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return jpaRepository.findByEmail(email).map(this::toDomain);
    }

    @Override
    public boolean existsByEmail(String email) {
        return jpaRepository.existsByEmail(email);
    }

    @Override
    public boolean existsByUsername(String username) {
        return jpaRepository.existsByUsername(username);
    }

    @Override
    public void deleteById(UUID id) {
        jpaRepository.deleteById(id);
    }

    @Override
    public List<User> findAll() {
        return jpaRepository.findAll().stream()
                .map(this::toDomain)
                .collect(Collectors.toList());
    }

    @Override
    public boolean updatePassword(UUID userId, String newPassword) {
        Optional<UserEntity> entity = jpaRepository.findById(userId);
        if (entity.isPresent()) {
            entity.get().setPassword(newPassword);
            entity.get().setUpdatedAt(LocalDateTime.now());
            jpaRepository.save(entity.get());
            return true;
        }
        return false;
    }

    @Override
    public boolean updateRoles(UUID userId, Set<User.Role> roles) {
        Optional<UserEntity> entity = jpaRepository.findById(userId);
        if (entity.isPresent()) {
            entity.get().setRoles(roleMapper.toEntityRoles(roles));
            entity.get().setUpdatedAt(LocalDateTime.now());
            jpaRepository.save(entity.get());
            return true;
        }
        return false;
    }

    private UserEntity toEntity(User user) {
        UserEntity entity = new UserEntity();
        if (user.getId() != null) {
            entity.setId(user.getId());
        }
        entity.setUsername(user.getUsername());
        entity.setEmail(user.getEmail());
        entity.setPassword(user.getPassword());
        entity.setEnabled(user.isEnabled());
        entity.setCreatedAt(user.getCreatedAt());
        entity.setUpdatedAt(user.getUpdatedAt());
        entity.setRoles(roleMapper.toEntityRoles(user.getRoles()));
        return entity;
    }

    private User toDomain(UserEntity entity) {
        User user = new User();
        user.setId(entity.getId());
        user.setUsername(entity.getUsername());
        user.setEmail(entity.getEmail());
        user.setPassword(entity.getPassword());
        user.setEnabled(entity.isEnabled());
        user.setCreatedAt(entity.getCreatedAt());
        user.setUpdatedAt(entity.getUpdatedAt());
        user.setRoles(roleMapper.toDomainRoles(entity.getRoles()));
        return user;
    }

    @Entity
    @Table(name = "users")
    public static class UserEntity {
        @Id
        @GeneratedValue(strategy = GenerationType.UUID)
        private UUID id;

        @Column(unique = true, nullable = false)
        private String username;

        @Column(unique = true, nullable = false)
        private String email;

        @Column(nullable = false)
        private String password;

        @Column(nullable = false)
        private boolean enabled;

        private LocalDateTime createdAt;
        private LocalDateTime updatedAt;

        @ElementCollection(fetch = FetchType.EAGER)
        @CollectionTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"))
        @Enumerated(EnumType.STRING)
        @Column(name = "role")
        private Set<Role> roles = new HashSet<>();

        public UUID getId() { return id; }
        public void setId(UUID id) { this.id = id; }
        public String getUsername() { return username; }
        public void setUsername(String username) { this.username = username; }
        public String getEmail() { return email; }
        public void setEmail(String email) { this.email = email; }
        public String getPassword() { return password; }
        public void setPassword(String password) { this.password = password; }
        public boolean isEnabled() { return enabled; }
        public void setEnabled(boolean enabled) { this.enabled = enabled; }
        public LocalDateTime getCreatedAt() { return createdAt; }
        public void setCreatedAt(LocalDateTime createdAt) { this.createdAt = createdAt; }
        public LocalDateTime getUpdatedAt() { return updatedAt; }
        public void setUpdatedAt(LocalDateTime updatedAt) { this.updatedAt = updatedAt; }
        public Set<Role> getRoles() { return roles; }
        public void setRoles(Set<Role> roles) { this.roles = roles; }
    }

    public enum Role {
        ADMIN, USER, OPERATOR, AUDITOR
    }

    public static class RoleMapper {
        public Set<Role> toEntityRoles(Set<User.Role> domainRoles) {
            if (domainRoles == null) return new HashSet<>();
            return domainRoles.stream()
                    .map(r -> Role.valueOf(r.name()))
                    .collect(Collectors.toSet());
        }

        public Set<User.Role> toDomainRoles(Set<Role> entityRoles) {
            if (entityRoles == null) return new HashSet<>();
            return entityRoles.stream()
                    .map(r -> User.Role.valueOf(r.name()))
                    .collect(Collectors.toSet());
        }
    }

    public interface UserJpaRepository {
        UserEntity save(UserEntity entity);
        Optional<UserEntity> findById(UUID id);
        Optional<UserEntity> findByUsername(String username);
        Optional<UserEntity> findByEmail(String email);
        boolean existsByEmail(String email);
        boolean existsByUsername(String username);
        void deleteById(UUID id);
        List<UserEntity> findAll();
    }
}