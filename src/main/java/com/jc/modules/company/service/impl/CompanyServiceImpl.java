package com.jc.modules.company.service.impl;

import com.jc.common.annotation.RedisCache;
import com.jc.common.exception.JcException;
import com.jc.modules.company.entity.Company;
import com.jc.modules.company.mapper.CompanyMapper;
import com.jc.modules.company.service.CompanyService;
import com.jc.modules.information.entity.InformationEntity;
import com.jc.modules.information.mapper.InformationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author: Charles Chan
 * @Date: 2019/3/11 17:04
 * @Version 1.0
 * 公司业务类
 */
@Service
public class CompanyServiceImpl implements CompanyService {

    //公司代号
    private static final Integer COM_CODE = 1;
    
    @Resource
    private CompanyMapper companyMapper;

    @Resource
    private InformationMapper informationMapper;

    @RedisCache(key = "pub:cache_key_in_company_get",time = 3600)
    public Company getCompanyMessage() {
        return companyMapper.selectById(COM_CODE);
    }

    @Override
    public void updateInfoById(InformationEntity informationEntity) {
        Integer integer = informationMapper.updateById(informationEntity);
        if(integer != 1){
            throw new JcException("更新资讯类型失败");
        }

        System.out.println("InformationServiceImpl.updateInfoById");

    }
}
