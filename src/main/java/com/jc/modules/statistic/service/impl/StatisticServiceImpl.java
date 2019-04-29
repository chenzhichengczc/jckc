package com.jc.modules.statistic.service.impl;

import com.jc.modules.statistic.entity.Statistic;
import com.jc.modules.statistic.mapper.StatisticMapper;
import com.jc.modules.statistic.service.StatisticService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;

/**
 * @Author: Charles Chan
 * @Date: 2019/3/14 17:28
 * @Version 1.0
 * 实现批处理操作写入数据库
 * 访问情况
 */
@Service
public class StatisticServiceImpl implements StatisticService{

    @Resource
    private StatisticMapper statisticMapper;

    @Override
    public boolean writeStatisticVisitToDBTask(ArrayList<Statistic> arrayList) {
        try {
            for (Statistic statistic : arrayList){
                Integer insert = statisticMapper.insert(statistic);
            }
        }catch (Exception e){
            throw new RuntimeException("插入失败");
        }
        return true;
    }
}
