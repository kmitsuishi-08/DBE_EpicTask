package br.com.fiap.apictask.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.apictask.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{

	public List<Task> findByTitleAndDescription(String title, String description);
}
