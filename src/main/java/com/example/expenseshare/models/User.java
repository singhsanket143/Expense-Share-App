package com.example.expenseshare.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User extends BaseEntity{
    @Column(nullable = false)
    private String name;

    @Column(unique = true, nullable = false)
    private String phone;
    private String password;

}
