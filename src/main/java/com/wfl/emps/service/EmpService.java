package com.wfl.emps.service;

import com.wfl.emps.enity.Emps;

import java.util.List;

public interface EmpService {
    public List<Emps> findAll();
    public Emps findById(Integer id);
    public boolean save(Emps emps);
    public boolean delete (Integer id);
    public boolean update(Emps emps);
}
