package com.example.demojpalab2.usuario.delivery;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demojpalab2.usuario.domain.Users;
import com.example.demojpalab2.usuario.repository.UserRepository;

@RestController
@RequestMapping("users")
public class UserController {
  @Autowired
  private UserRepository repository;

  @GetMapping()
  public List<Users> getAll() {
    return repository.findAll();
  }

  @PostMapping()
  public Users save(@RequestBody Users entity) {
    return repository.save(entity);
  }

  @GetMapping("{id}")
  public Users findById(@PathVariable Long id) {
    return repository.findById(id).orElse(null);
  }

  @DeleteMapping("{id}")
  public String deleteById(@PathVariable Long id) {
    repository.deleteById(id);
    return "Eliminado";
  }
}
