package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.entity.Role;
import ru.kata.spring.boot_security.demo.entity.User;

import java.util.Collection;
import java.util.List;

public interface UserService extends UserDetailsService {

    User findByUsername(String username);

    Collection<? extends GrantedAuthority> mapRolesToAuthorities(Collection<Role> roles);

    void addUser(User user);

    void removeUserById(long id);

    User getOneUser(long id);

    List<User> getAllUsers();

    void updateUser(User updatedUser);
}
