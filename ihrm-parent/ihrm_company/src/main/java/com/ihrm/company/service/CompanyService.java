package com.ihrm.company.service;

import java.util.Date;
import java.util.List;
import org.ihrm.common.entity.IdWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ihrm.company.dao.CompanyDao;
import com.ihrm.domain.company.Company;

@Service
public class CompanyService {
  @Autowired
  private CompanyDao companyDao;
  @Autowired
  private IdWorker idWorker;

  public Company add(Company company) {
    company.setId(idWorker.nextId() + "");
    company.setCreateTime(new Date());
    company.setState(1);
    company.setAuditState("0");
    company.setBalance(0d);
    return companyDao.save(company);
  }

  public Company update(Company company) {
    return companyDao.save(company);
  }

  public Company findById(String id) {
    return companyDao.findById(id).get();
  }

  public List<Company> findAll() {
    return companyDao.findAll();
  }

  public void deleteById(String id) {
    companyDao.deleteById(id);
  }
}
