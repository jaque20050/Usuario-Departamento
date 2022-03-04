package com.devsuperior.Userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.Userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
