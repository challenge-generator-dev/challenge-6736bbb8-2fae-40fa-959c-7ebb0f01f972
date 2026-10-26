package com.fintech.payments.application.service;


import com.fintech.payments.domain.model.Role;
import com.fintech.payments.domain.model.User;
import com.fintech.payments.domain.port.UserRepository;

import java.util.Set;
import java.util.UUID;

public class AuthService {

    private final UserRepository userRepository;

    public AuthService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User authenticate(String username, String password) {
        throw new UnsupportedOperationException("Implementar autenticación con JWT");
    }

    public String generateToken(User user) {
        throw new UnsupportedOperationException("Implementar generación de token JWT");
    }

    public boolean validateToken(String token) {
        throw new UnsupportedOperationException("Implementar validación de token JWT");
    }

    public User registerUser(String username, String email, String password, Set<User.Role> roles) {
        throw new UnsupportedOperationException("Implementar registro de usuario");
    }

    public boolean changePassword(UUID userId, String oldPassword, String newPassword) {
        throw new UnsupportedOperationException("Implementar cambio de contraseña");
    }

    public boolean resetPassword(String email) {
        throw new UnsupportedOperationException("Implementar reset de contraseña");
    }

    public User findByUsername(String username) {
        return userRepository.findByUsername(username).orElse(null);
    }

    public boolean existsByUsername(String username) {
        return userRepository.existsByUsername(username);
    }

    public boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }
}