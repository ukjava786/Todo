package test;

import app.controller.TodoController;
import app.model.Todo;
import app.service.TodoService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class TodoControllerTest {

    @InjectMocks
    private TodoController todoController;

    @Mock
    private TodoService todoService;

    @Mock
    private Todo todo;

    @BeforeEach
    public void setUp() {
//    	MockitoAnnotations.initMocks(this);
    }

    @Test
    public void testGetAllTodos() throws Exception {
        // Arrange
        List<Todo> todos = Collections.emptyList();
        when(todoService.getAllTodos()).thenReturn(todos);
        todoService.getAllTodos();
        verify(todoService, times(1)).getAllTodos();
    }

    @Test
    public void testCreateTodo() throws Exception {
        // Arrange
        Todo sampleTodo = new Todo();
        sampleTodo.setTitle("Sample Todo");
        sampleTodo.setCompleted(false);
        when(todoService.createTodo(sampleTodo)).thenReturn(sampleTodo);
        todoService.createTodo(sampleTodo);
        verify(todoService, times(0)).createTodo(todo);
    }
}