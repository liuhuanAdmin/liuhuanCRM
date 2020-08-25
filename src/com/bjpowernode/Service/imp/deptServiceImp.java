package com.bjpowernode.Service.imp;

import com.bjpowernode.Dao.DeptDao;
import com.bjpowernode.Service.deptService;
import com.bjpowernode.Util.SqlSessionUtil;
import com.bjpowernode.domain.dept;

import java.util.List;

public class deptServiceImp implements deptService {

    private DeptDao deptDao = SqlSessionUtil.getsession().getMapper(DeptDao.class)  ;
    @Override
    public dept getbyid(String id) {
        dept d = deptDao.getbyid(id);
        return d;
    }

    @Override
    public void sava(dept s) {
        deptDao.sava(s);

    }

    @Override
    public List<dept> getAll() {
        List<dept> list = deptDao.getAll();
        return list;
    }


    }
