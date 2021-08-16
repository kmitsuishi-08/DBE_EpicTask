package br.com.fiap.apictask.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.apictask.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
