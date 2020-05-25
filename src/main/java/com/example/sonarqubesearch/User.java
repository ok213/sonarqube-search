package com.example.sonarqubesearch;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "PERSONS")
public class User {

    @Id
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String email;
    private String password;
    private LocalDateTime lastLogon;
    private boolean isActive;

    public User(String email, String password, LocalDateTime lastLogon, boolean isActive) {
        this.email = email;
        this.password = password;
        this.lastLogon = lastLogon;
        this.isActive = isActive;
    }

    public String getStatus() {
        if (isActive) {
            return "User is active.";
        } else {
            return "User is not active.";
        }
    }

    public String getStringNumber(int number) {
        return switch (number) {
            case 1 -> "One";
            case 2 -> "Two";
            default -> "Unknow";
        };
    }

}
