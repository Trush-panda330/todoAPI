package com.example.tasks.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Task {
    Long id;
    String title;
    String details;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
    TaskStatus status;
    boolean isDeleted;
}