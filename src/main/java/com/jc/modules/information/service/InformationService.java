package com.jc.modules.information.service;


import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.IService;
import com.jc.modules.information.entity.InformationDetailEntity;
import com.jc.modules.information.entity.InformationEntity;

import java.util.List;

/**
 * @author ：fenghuang
 * @date ：Created in 2019/3/12 18:10
 * @description：资讯核心service
 * @modified By：
 * @version:
 */
public interface InformationService extends IService<InformationEntity> {

    /**
     * 分页查询
     *
     * @param ：page,queryWrapper
     * @return :
     * @author ：fenghuang
     * @date ：Created in 2019/3/13 14:36
     */
    List<InformationEntity> findByPage(Page<InformationEntity> page, Wrapper<InformationEntity> wrapper);
    //分页
    InformationEntity selectById(Integer id);

    void insertInfo(InformationEntity informationEntity);

    void batchInsertInfo(List<InformationEntity> infoList);

    void updateInfoById(InformationEntity informationEntity);

    void deleteInfoById(Integer id);

    /**
     * 查询资讯核心和资讯详情表的全部内容
     *
     * @param ：查找Information和InformationDetail两表内容
     * @return :
     * @author ：Mr.Chan
     * @date ：Created in 2019/3/13 15:20
     */
    List<InformationDetailEntity> findAll();

    /**
     * 使用pagehelper分页
     */
    List<InformationDetailEntity> getList(Integer categoryId);

    List<InformationEntity> selectPage();

    InformationEntity test(String typeName, String status);

    List<InformationEntity> getCatalogy();

}
