package com.bjpowernode.test;

import com.bjpowernode.Dao.DeptDao;
import com.bjpowernode.Service.deptService;
import com.bjpowernode.Service.imp.deptServiceImp;
import com.bjpowernode.Util.serviceFactort;
import com.bjpowernode.domain.dept;
import com.sun.xml.internal.ws.util.ServiceFinder;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import javax.print.ServiceUIFactory;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class test1 {
    public static void main(String[] args) {
        //张三形态,自动提交事务,
        //deptService service = new deptServiceImp();
        deptService service = (deptService) serviceFactort.getService(new deptServiceImp());
        /*dept d = new dept();//测试添加操作
        d.setDeptno(300);
        d.setDname("cxk");
        d.setLoc("beijin");

        service.sava(d);*/
        //测试查找操作
       /* dept d = service.getbyid("20");
        System.out.println(d);
*/
       List<dept> list = service.getAll();
       for (dept s : list){
           System.out.println(s);
       }

       /* List<dept> list = service.getAll2();
        for (dept s : list) {
            System.out.println(s);*/





       /* String resource = "mybatis-config.xml";
        InputStream inputStream = null;




            try {
                inputStream = Resources.getResourceAsStream(resource);
            } catch (IOException e) {
                e.printStackTrace();
            }



            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
            SqlSession session = sqlSessionFactory.openSession();
            //查询单个的信息
           *//* dept dept = session.selectOne("dept.getdeptno", "sales");
            session.close();
            System.out.println(dept);*//*
           //查询所有部门的记录
              *//* List<dept>  list = session.selectList("dept.getAlldept");
               for (dept s:list){
                   System.out.println(s);
               }
               session.close();*//*
              //来一个添加操作
        *//*dept dept = new dept();
        dept.setDeptno(300);
        dept.setDname("lisi");
        dept.setLoc("guangzz");
        int i = session.insert("dept.save",dept);
        session.commit();
        session.close();
        System.out.println(i);//没有提交事务*//*

        //修改操作
        *//*dept dept = new dept();
        dept.setDeptno(300);
        dept.setDname("zhangsan");
        dept.setLoc("zhengzhou");
        session.update("dept.updata",dept);
        session.commit();
        session.commit();
*//*


        //删除操作
        session.delete("dept.delete","300");
        session.commit();
        session.close();*/
        }
    }





