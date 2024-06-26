package com.sochoeun.controller.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthResponse {
    private String firstName;
    private String lastName;
    private String email;
    private String profile;
    private List<String> roles;
    private String token;
}
