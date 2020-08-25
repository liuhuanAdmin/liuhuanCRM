package com.bjpowernode.Dao;

import com.bjpowernode.domain.dept;

import java.util.List;

public interface DeptDao {
    public dept getbyid(String id);
    public void sava(dept s);

    List<dept> getAll();

    List<dept> getAll2();
}
