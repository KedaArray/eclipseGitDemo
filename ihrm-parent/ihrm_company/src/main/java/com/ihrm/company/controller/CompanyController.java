package com.ihrm.company.controller;

import java.util.List;
import org.ihrm.common.entity.Result;
import org.ihrm.common.entity.ResultCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.ihrm.company.service.CompanyService;
import com.ihrm.domain.company.Company;

@CrossOrigin
@RestController
@RequestMapping("/company")
public class CompanyController {
  @Autowired
  private CompanyService companyService;

  @RequestMapping(value = "", method = RequestMethod.POST)
  public Result add(@RequestBody Company company) throws Exception {
    companyService.add(company);
    return Result.SUCCESS();
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
  public Result delete(@PathVariable(name = "id") String id) throws Exception {
    companyService.deleteById(id);
    return Result.SUCCESS();
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
  public Result findById(@PathVariable(name = "id") String id) throws Exception {
    Company company = companyService.findById(id);
    return new Result(ResultCode.SUCCESS, company);
  }
  
  @RequestMapping(value = "", method = RequestMethod.GET)
  public Result findAll() throws Exception {
    List<Company> list = companyService.findAll();
    return new Result(ResultCode.SUCCESS,list);
  }

  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
  public Result update(@PathVariable(name = "id") String id, @RequestBody Company company)
      throws Exception {
    Company com = companyService.findById(id);

    com.setName(company.getName());
    com.setRemarks(company.getRemarks());
    com.setState(company.getState());
    com.setAuditState(company.getAuditState());

    companyService.update(company);
    return Result.SUCCESS();
  }
}
