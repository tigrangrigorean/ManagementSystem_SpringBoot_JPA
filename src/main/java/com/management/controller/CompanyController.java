package com.management.controller;

import com.management.model.Company;
import com.management.service.CompanyServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/company")
public class CompanyController {

    private final CompanyServiceImpl companyServiceImpl;

    @Autowired
    public CompanyController(CompanyServiceImpl companyServiceImpl) {
        this.companyServiceImpl = companyServiceImpl;
    }
    @GetMapping("/{id}")
    @ResponseBody
    public String getCompaniesById (@PathVariable(value = "id") long id){
        return companyServiceImpl.getById(id).toString();
    }


    @GetMapping
    @ResponseBody
    public String getCompanyList() {
        return companyServiceImpl.getAll().toString();
    }

    @PostMapping("/save")
    public String createCompany(@RequestBody Company company) {
        return companyServiceImpl.save(company).toString();
    }

    @PutMapping("/{id}")
    public String updateCompany(@PathVariable(value = "id") long id, @RequestBody Company company) {
        return companyServiceImpl.update(id, company).toString();
    }


    @DeleteMapping("/remove")
    public String deleteCompany(@RequestParam(value = "id") long id) {
        companyServiceImpl.delete(id);
        return "Company by ID " + id + " deleted";
    }
}
