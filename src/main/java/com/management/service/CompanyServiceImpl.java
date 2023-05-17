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
    	Validator.checkEntity(company);
        return companyRepository.save(company);
    }

    @Override
    public Company update(long id, Company updateCompany) {
    	Validator.checkId(id);
        Company company = companyRepository.getCompanyById(id);
        Validator.checkEntity(updateCompany);
        Validator.checkEntity(company);
        
        if(updateCompany.getName() == null || updateCompany.getName().isEmpty()) {
        	updateCompany.setName(company.getName());
        }
        if(updateCompany.getFoundingDate() == null || updateCompany.getFoundingDate().isEmpty()) {
        	updateCompany.setFoundingDate(company.getFoundingDate());
        }
        updateCompany.setId(id);
        return companyRepository.save(updateCompany);

    }

    @Override
    public void delete(long companyId) {
    	Validator.checkId(companyId);
        Company company = companyRepository.getCompanyById(companyId);
        Validator.checkEntity(company);
        companyRepository.delete(company);
    }
}
