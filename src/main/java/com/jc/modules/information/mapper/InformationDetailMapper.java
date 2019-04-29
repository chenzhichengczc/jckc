package com.jc.modules.information.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.jc.modules.information.entity.InformationDetailEntity;

import java.util.List;
/**
 * @author ：Mr.Chan
 * @date ：Created in 2019/3/22 14:40
 * @description：资讯详情mapper
 * @modified By：
 * @version:
 */
public interface InformationDetailMapper extends BaseMapper<InformationDetailEntity> {
    List<InformationDetailEntity> findAll(Integer detailId);
}
