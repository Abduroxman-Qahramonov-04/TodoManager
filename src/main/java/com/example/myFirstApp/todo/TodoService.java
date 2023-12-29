package com.example.myFirstApp.todo;

import jakarta.validation.Valid;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class TodoService {
    private static List<Todo> todos = new ArrayList<>();
    private static int totalCount = 0;

    static {
        todos.add(new Todo(++totalCount,"kh_versatile","Spring", LocalDate.now().plusYears(1),false));
        todos.add(new Todo(++totalCount, "Complete_Project", "Java", LocalDate.now().plusMonths(2), false));
        todos.add(new Todo(++totalCount, "Learn_Database", "SQL", LocalDate.now().plusWeeks(3), false));
        todos.add(new Todo(++totalCount, "Exercise_Routine", "Fitness", LocalDate.now().plusDays(10), false));
        todos.add(new Todo(++totalCount, "Read_Book", "Literature", LocalDate.now().plusMonths(1), false));
    }
    public List<Todo> findByUserName(String username){
        Predicate<? super Todo> predicate = todo -> todo.getUsername() == username;
        return todos.stream().filter(predicate).toList();
    }
    public void addTodo(String username,String description,LocalDate localDate,boolean isDone){
        Todo todo = new Todo(++totalCount,username,description,LocalDate.now(),false);
        todos.add(todo);
    }
    public void deleteTodo(int id){
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        todos.removeIf(predicate);
    }
    public Todo findById(int id){
        Predicate<? super Todo> predicate = todo -> todo.getId() == id;
        return todos.stream().filter(predicate).findFirst().get();
    }
    public void updateTodo(@Valid Todo todo){
        deleteTodo(todo.getId());
        todos.add(todo);
    }
}
