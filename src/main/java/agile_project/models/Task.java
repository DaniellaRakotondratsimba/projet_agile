package agile_project.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id_task;
	private String task_name;
	
	public Long getId_task() {
		return id_task;
	}
	public void setId_task(Long id_task) {
		this.id_task = id_task;
	}
	public String getTask_name() {
		return task_name;
	}
	public void setTask_name(String task_name) {
		this.task_name = task_name;
	}
	
	public Task(Long id_task, String task_name) {
		super();
		this.id_task = id_task;
		this.task_name = task_name;
	}
	
	public Task() {
		super();
		// TODO Auto-generated constructor stub
	}
}
