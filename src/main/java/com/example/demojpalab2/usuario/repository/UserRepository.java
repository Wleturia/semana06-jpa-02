package com.example.demojpalab2.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demojpalab2.usuario.domain.Users;

public interface UserRepository extends JpaRepository<Users, Long> {

}
