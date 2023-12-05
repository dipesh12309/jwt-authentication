package com.dipesh.jwt.jwtauth.model;

import lombok.*;

@Builder
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class JwtRequest {
    private String password;
    private String email;
}
