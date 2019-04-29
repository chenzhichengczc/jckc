package com.jc.modules.information.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.jc.modules.information.entity.InformationDetailEntity;
import com.jc.modules.information.mapper.InformationDetailMapper;
import com.jc.modules.information.service.InformationDetailService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author ：Mr.Chan
 * @date ：Created in 2019/3/12 15:10
 * @description：资讯详情serviceImpl
 * @modified By：
 * @version:
 */
@Service
public class InformationDetailServiceImpl extends ServiceImpl<InformationDetailMapper, InformationDetailEntity>
        implements InformationDetailService {

    @Resource
    private InformationDetailMapper informationDetailMapper;

    @Override
    public List<InformationDetailEntity> findAll(Integer detailId){
        return informationDetailMapper.findAll(detailId);
    }

}
