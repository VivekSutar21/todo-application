package com.app.todoapp.Repository;

import com.app.todoapp.Models.Tasks;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Tasks, Long> {
}
