package com.validation.dto;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {

    private int userId;
    @NotBlank(message = "please enter name")
    private String name;
    @Email(message = "please enter valid email format")
    private String email;
    @Digits(integer = 10, fraction = 0)
    private String mobile;
    @NotBlank(message = "please enter your gender")
    private String gender;
    @NotNull(message = "please enter you age")
    private int age;
    @NotBlank(message = "please enter your nationality")
    private String nationality;
}
