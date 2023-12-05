package com.dipesh.jwt.jwtauth.model;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class JwtResponse {
    private String username;
    private String jwtToken;
}
