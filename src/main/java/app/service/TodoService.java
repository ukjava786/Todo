package app.service;

import app.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
	private List<Todo> todos = new ArrayList<>();

	public List<Todo> getAllTodos() {
		return todos;
	}

	public Todo createTodo(Todo todo) {
		todo.setId(System.currentTimeMillis());
		todos.add(todo);
		return todo;
	}
}
