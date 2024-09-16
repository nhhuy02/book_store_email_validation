package com.huynh.book_network.auth;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class RegistrationRequest {


    @NotEmpty(message = "Firstname is required")
    @NotNull(message = "Firstname is required")
    private String firstname;

    @NotEmpty(message = "Lastname is required")
    @NotNull(message = "Lastname is required")
    private String lastname;

    @Email(message = "Email is not well formatted")
    @NotEmpty(message = "Email is required")
    @NotNull(message = "Email is required")
    private String email;

    @NotEmpty(message = "Password is required")
    @NotNull(message = "Password is required")
    @Size(min = 6, message = "Password should be 6 characters long minimum")
    private String password;
}
