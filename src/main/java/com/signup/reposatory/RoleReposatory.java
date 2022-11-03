package com.signup.reposatory;


import com.signup.enities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleReposatory extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
