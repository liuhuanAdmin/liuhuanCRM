package com.bjpowernode.Service;

import com.bjpowernode.domain.dept;

import java.util.List;

public interface deptService {
    public dept getbyid(String id);
    public void sava(dept s);
    List<dept> getAll();

}
