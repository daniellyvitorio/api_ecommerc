package com.ecommerce.api.dto;

import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class UserDTO {
    private Long id;

    private String name;
    @NotBlank(message = "o email é obrigatorio")
    @Email(message = "O email deve ser válido")
    private String email;
    @NotBlank(message = " a senha é obrigatoria")
    @Size(min = 8 , message = "a senha deve ser um formato válido")
    private String password;
    private String phone;
    @Past(message = "a data de nascimento deve ser no passado")
    private String birthDate;
    @NotBlank(message = "O papel do usuário é obrigatório")
    @Pattern(regexp = "ADMIN, USER OU MANAGER", message = "O papel deve ser ADMIN,USER OU MANAGER")
    private String roles;

}
