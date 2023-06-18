package com.example.shopp.entity.user;

import com.example.shopp.entity.BaseEntity;
import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

@Entity(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User extends BaseEntity {

    private String name;

    @Column(unique = true, nullable = false)
    @NotBlank(message = "email cannot be empty or null")
    @Email(message = "enter valid email or address")
    @NonNull
    private String email;

    @Column(nullable = false)
    @NotBlank(message = "password cannot be empty or null")
    @NonNull
    private String password;

    @Enumerated(EnumType.STRING)
    private UserRole userRole;
}
