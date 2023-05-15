package com.management.service;

import com.management.model.Company;

import java.util.List;

public interface CompanyService {
    Company getById(long id);
    List<Company> getAll();
    public List<Company> get(int offset, int perPage, String sort);
    Company save(Company company);
    Company update(long id, Company company);
    void delete(long companyId);

}
