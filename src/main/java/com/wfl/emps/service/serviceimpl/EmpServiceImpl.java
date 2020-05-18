package com.wfl.emps.service.serviceimpl;

import com.wfl.emps.empdao.EmpsDao;
import com.wfl.emps.enity.Emps;
import com.wfl.emps.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpsDao empsDao;

    @Override
    public List<Emps> findAll() {
        return empsDao.findAll();
    }

    @Override
    public Emps findById(Integer id) {
        return empsDao.findById(id);
    }

    @Override
    public boolean save(Emps emp) {
        return empsDao.save(emp);
    }

    @Override
    public boolean delete(Integer id) {
        return empsDao.delete(id);
    }

    @Override
    public boolean update(Emps emps) {
        return empsDao.update(emps);
    }
}
