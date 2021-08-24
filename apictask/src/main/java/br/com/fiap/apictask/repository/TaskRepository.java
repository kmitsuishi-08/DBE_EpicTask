package br.com.fiap.apictask.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fiap.apictask.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long>{
	public Page<Task> findByTitleLike(String string, Pageable pageable);
}
