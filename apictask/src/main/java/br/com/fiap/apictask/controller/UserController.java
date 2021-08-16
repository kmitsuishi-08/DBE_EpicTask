package br.com.fiap.apictask.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.apictask.model.User;
import br.com.fiap.apictask.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	private UserRepository repository;
	
	@GetMapping("/user")
	public String home() {
		return "users";
	}
	
	@PostMapping("/user")
	public String save(User user) {
		repository.save(user);
		System.out.println("Save user..." + user);
		return "users";
	}
	
	@RequestMapping("/user/new")
	public String create() {
		return "user-form";
	}
	
}
