package com.example.tasks.repository.task;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TaskRepository {

    @Select("SELECT id, title, details, created_at, updated_at, status, is_deleted " +
            "FROM tasks WHERE is_deleted = 0 ")
    List<TaskRecord> selectList();

}
