package com.geekster.todo.service;

import com.geekster.todo.model.Todo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {

    private static List<Todo> todos = new ArrayList<>(); // in-memory database
    private static int todoCount = 0;

    static{
        todos.add(new Todo(++todoCount, "Learn SpringBoot", false));
        todos.add(new Todo(++todoCount, "Learn Java", false));
        todos.add(new Todo(++todoCount, "Learn javaScript", false));
        todos.add(new Todo(++todoCount, "Learn Data Structure & Algorithm", false));
        todos.add(new Todo(++todoCount, "Learn Reactjs", false));
    }

    public List<Todo> findAll(){
        return todos;
    }

    public Todo findById(int id){
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        Todo todo = todos.stream().filter(predicate).findFirst().get();
        return todo;
    }

    public void addTodo(Todo todo){
        todos.add(todo);
    }

    public void updateTodo(int id, Todo newTodo){
        // step1: find todo to be update
        // step2: update todo

        Todo todo = findById(id); // step1

        todo.setId(newTodo.getId()); // step2
        todo.setTitle(newTodo.getTitle());
        todo.setStatus(newTodo.isStatus());
    }

    public void deleteTodo(int id){
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }


}
