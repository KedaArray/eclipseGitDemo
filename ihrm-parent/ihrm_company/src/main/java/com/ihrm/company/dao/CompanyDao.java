package com.ihrm.company.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import com.ihrm.domain.company.Company;


public interface CompanyDao
    extends JpaRepository<Company, String>, JpaSpecificationExecutor<Company> {
}
/*
 * public class CompanyDao {
 * 
 * public Company save(Company company) { // TODO Auto-generated method stub return null; }
 * 
 * public Company update(Company company) { // TODO Auto-generated method stub return null; }
 * 
 * public Company findById(String id) { // TODO Auto-generated method stub return null; }
 * 
 * public List<Company> findAll() { // TODO Auto-generated method stub return null; }
 * 
 * public void deleteById(String id) { // TODO Auto-generated method stub
 * 
 * }
 * 
 * }
 */

