package com.shenyue.exercise.dao;

import com.shenyue.exercise.entity.EDInfo;
import com.shenyue.exercise.entity.Emp;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 持久层接口
 */
@Mapper
@Repository
public interface EmpMapper {
    Integer insertEmp(Emp emp);

    Integer UpdateAddDepNum(int id);

    Integer UpdateReduceDepNum(int id);

    List<Emp> selectEmp();

    List<EDInfo> selectAll();

    int selectById(int id);

    List<EDInfo> selectEd();

    Integer deleteById(int id);
}
