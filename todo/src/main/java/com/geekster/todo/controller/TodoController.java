package com.geekster.todo.controller;

import com.geekster.todo.model.Todo;
import com.geekster.todo.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/todo")
public class TodoController {

    @Autowired // used to inject dependency
    private TodoService todoService;

//    public TodoController(TodoService todoService){ // to initialize value and create an object when hit any API
//        this.todoService = todoService;
//    }

    // http://localhost:8080/api/v1/todo/add-todo
    @PostMapping("add-todo")
    public void addTodo(@RequestBody Todo todo){
        todoService.addTodo(todo);
    }

    // http://localhost:8080/api/v1/todo/find-todo/id/1
    @GetMapping("find-todo/id/{id}")
    public Todo findTodoById(@PathVariable int id){
        return todoService.findById(id);
    }

    // http://localhost:8080/api/v1/todo/find-all
    @GetMapping("find-all")
    public List<Todo> findAllTodos(){  // controller is talking to service layer
        return todoService.findAll();
    }

    // http://localhost:8080/api/v1/todo/update-add/id/2
    @PutMapping("update-add/id/{id}")
    public void updateTodo(@PathVariable int id, @RequestBody Todo todo){
        todoService.updateTodo(id, todo);

    }

    // http://localhost:8080/api/v1/todo/delete-add/id/1
    @DeleteMapping("delete-add/id/{id}")
    public void deleteTodo(@PathVariable int id){
        todoService.deleteTodo(id);
    }

//    @DeleteMapping("delete-todo/id/{id}")
//    public ResponseEntity<Todo> deleteTodo(@PathVariable int id){
//        todoService.deleteTodo(id);
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//        return new ResponseEntity<>(HttpStatus.OK); // 200
//        return new ResponseEntity<>(HttpStatus.CREATED); // 201
//        return new ResponseEntity<>(HttpStatus.NOT_FOUND); // 404
//        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//    }
}
