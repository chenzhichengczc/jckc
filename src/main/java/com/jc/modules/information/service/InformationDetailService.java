package com.jc.modules.information.service;

import com.baomidou.mybatisplus.service.IService;
import com.jc.modules.information.entity.InformationDetailEntity;

import java.util.List;

/**
 * @author ：Mr.Chan
 * @date ：Created in 2019/3/12 14:50
 * @description：资讯详情service
 * @modified By：
 * @version:
 */
public interface InformationDetailService extends IService<InformationDetailEntity> {
    /**
     * 页面查询回显
     *
     * @param ; 数据回显
     * @return :
     * @author ：Mr.Chan
     * @date ：Created in 2019/3/13 14:55
     */
    List<InformationDetailEntity> findAll(Integer detailId);

}
