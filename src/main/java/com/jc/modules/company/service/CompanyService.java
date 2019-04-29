package com.jc.modules.company.service;

import com.jc.modules.company.entity.Company;
import com.jc.modules.information.entity.InformationEntity;
import org.springframework.stereotype.Service;

/**
 * @Author: Charles Chan
 * @Date: 2019/3/11 17:04
 * @Version 1.0
 * 接口
 */

public interface CompanyService {

    public Company getCompanyMessage();
    void updateInfoById(InformationEntity informationEntity);

}
