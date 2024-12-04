package com.example.tasks.repository.task;

import com.example.tasks.domain.model.Task;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TaskRepository {


    List<TaskRecord> selectList(int limit, long offset);

}
