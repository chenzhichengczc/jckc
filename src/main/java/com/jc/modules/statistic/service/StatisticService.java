package com.jc.modules.statistic.service;


import com.jc.modules.statistic.entity.Statistic;

import java.util.ArrayList;

/**
 * @Author: Charles Chan
 * @Date: 2019/3/14 17:28
 * @Version 1.0
 */
public interface StatisticService {

    public boolean writeStatisticVisitToDBTask( ArrayList<Statistic> arrayList);

}
