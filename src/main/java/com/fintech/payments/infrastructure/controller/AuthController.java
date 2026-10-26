package com.fintech.payments.infrastructure.controller;

import com.fintech.payments.application.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest request) {
        throw new UnsupportedOperationException("Implementar endpoint de login");
    }

    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody RegisterRequest request) {
        throw new UnsupportedOperationException("Implementar endpoint de registro");
    }

    @PostMapping("/refresh")
    public ResponseEntity<?> refresh(@RequestHeader("Authorization") String authHeader) {
        throw new UnsupportedOperationException("Implementar refresh de token");
    }

    @PostMapping("/logout")
    public ResponseEntity<?> logout(@RequestHeader("Authorization") String authHeader) {
        throw new UnsupportedOperationException("Implementar logout");
    }

    @PostMapping("/password/change")
    public ResponseEntity<?> changePassword(
            @RequestHeader("Authorization") String authHeader,
            @RequestBody ChangePasswordRequest request) {
        throw new UnsupportedOperationException("Implementar cambio de contraseña");
    }

    @PostMapping("/password/reset")
    public ResponseEntity<?> resetPassword(@RequestBody ResetPasswordRequest request) {
        throw new UnsupportedOperationException("Implementar reset de contraseña");
    }

    @GetMapping("/me")
    public ResponseEntity<?> me(@RequestHeader("Authorization") String authHeader) {
        throw new UnsupportedOperationException("Implementar endpoint de información de usuario");
    }

    public record LoginRequest(String username, String password) {}
    public record RegisterRequest(String username, String email, String password, Set<String> roles) {}
    public record ChangePasswordRequest(String oldPassword, String newPassword) {}
    public record ResetPasswordRequest(String email) {}
}