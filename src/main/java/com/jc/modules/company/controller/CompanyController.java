package com.jc.modules.company.controller;

import com.jc.common.json.JsonResult;
import com.jc.common.utils.ResponseUtil;
import com.jc.modules.company.entity.Company;
import com.jc.modules.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: Charles Chan
 * @Date: 2019/3/11 18:31
 * @Version 1.0
 */
@RestController
@RequestMapping("/company")
public class CompanyController {

    @Autowired
    private CompanyService companyService;

    @RequestMapping("/getCompanyMessage")
    public ResponseUtil getCompanyMessage(){
        Company companyMessage = companyService.getCompanyMessage();
        return ResponseUtil.success(companyMessage);
    }
}
