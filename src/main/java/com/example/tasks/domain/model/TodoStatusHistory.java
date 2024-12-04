package com.example.tasks.domain.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TodoStatusHistory {
    private Long id;
    private Long todoId;
    private TaskStatus status;
    private boolean isDeleted;
    private LocalDateTime changedAt;

}
