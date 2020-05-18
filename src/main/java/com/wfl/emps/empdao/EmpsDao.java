package com.wfl.emps.empdao;

import com.wfl.emps.enity.Emps;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpsDao {
    //查询全部
    public List<Emps> findAll();
    //根据id查询
    public Emps findById(Integer id);
    //添加员工
    public boolean save(Emps emps);
    //删除员工
    public boolean delete(Integer id);
    //更新员工
    public boolean update(Emps emps);
}
