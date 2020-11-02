package com.lixin.testweb.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class RegisterDto {
        String username;
        String password;
        String email;
        String code;
}
