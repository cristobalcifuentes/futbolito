package com.futbolito.security.dto;

import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserLogin {

	@NotBlank
    private String nombreUsuario;
	
    @NotBlank
    private String password;

    
}
