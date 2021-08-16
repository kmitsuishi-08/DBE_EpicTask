package br.com.fiap.apictask.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.fiap.apictask.model.Task;
import br.com.fiap.apictask.repository.TaskRepository;

@Controller
public class TaskController {
	
	@Autowired
	private TaskRepository repository;
	
	//@RequestMapping(value = "/task", method = RequestMethod.GET)
	@GetMapping("/task")
	public String home() {
		return "tasks";
	}
	
	//@RequestMapping(value = "/task", method = RequestMethod.POST)
	@PostMapping("/task")
	public String save(Task task) {
		repository.save(task);
		System.out.println("Save task..." + task);
		return "tasks";
	}
	
	@RequestMapping("/task/new")
	public String create() {
		return "task-form";
	}
}
