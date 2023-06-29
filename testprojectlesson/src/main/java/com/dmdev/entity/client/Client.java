package com.dmdev.entity.client;

import com.dmdev.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "client", schema = "bank")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstname;
    private String lastname;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    private String email;
    private String telephone;
    private String password;
    @Enumerated(EnumType.STRING)
    private Role role;



}
