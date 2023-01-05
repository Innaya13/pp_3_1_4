package ru.kata.spring.boot_security.demo.entity;

import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
@Data
@Table(name = "roles")
public class Role implements GrantedAuthority {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String nameToForm;

    @Override
    public String getAuthority() {
        return null;
    }

    @Override
    public String toString() {
        return nameToForm;
    }
}
