package dev.bruno.banking.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class JwtAuthenticationResponse {
    private String accessToken;
}
