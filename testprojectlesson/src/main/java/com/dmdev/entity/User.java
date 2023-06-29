package com.dmdev.entity;

import com.vladmihalcea.hibernate.type.json.JsonBinaryType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users", schema = "public")
//@TypeDef(name = "dmdev", typeClass = JsonBinaryType.class)
public class User {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
    @EmbeddedId
    private PersonalInfo personalInfo;

    @Column(unique = true)
    private String username;


//    @Type(type = "dmdev")
//    private String info;

    @Enumerated(EnumType.STRING)
    private Role role;
}
