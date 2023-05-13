package com.management.service;

import com.management.model.Company;
import com.management.model.Passenger;
import com.management.repository.CompanyRepository;
import com.management.repository.PassengerRepository;
import com.management.validation.Validator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;


    @Autowired
    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }



    @Override
    public Company getById(long id) {
        Validator.checkId(id);
        Validator.checkEntity(companyRepository.getCompanyById(id));
        return companyRepository.getCompanyById(id);
    }

    @Override
    public List<Company> getAll() {
        Validator.checkList(companyRepository.findAll());
        return companyRepository.findAll();
    }

    @Override
    public List<Company> get(int offset, int perPage, String sort) {
        return null;
    }

    @Override
    public Company save(Company company) {
        return companyRepository.save(company);
    }

    @Override
    public Company update(long id, Company company) {
        Company updateCompany = companyRepository.getCompanyById(id);
        Validator.checkEntity(updateCompany);
        Validator.checkEntity(company);
        company.setId(id);
        return companyRepository.save(company);

    }

    @Override
    public void delete(long companyId) {
        Company company = companyRepository.getCompanyById(companyId);
        Validator.checkEntity(company);
        companyRepository.delete(company);
    }
}
