package com.example.tasks.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@RequiredArgsConstructor
@RestController
@RequestMapping("/tasks")
public class TaskController {

//    private final TaskService taskService;

    @GetMapping
    public ResponseEntity<String> showTasks() {
        return ResponseEntity.ok("200");
    }
}
