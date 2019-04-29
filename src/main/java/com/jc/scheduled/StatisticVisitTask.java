package com.jc.scheduled;

import com.jc.modules.statistic.entity.Statistic;
import com.jc.modules.statistic.service.StatisticService;
import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @Author: Charles Chan
 * @Date: 2019/3/14 15:47
 * @Version 1.0
 * 定时把StatisticVisit.txt入数据库
 * 时间为半天12小时入库一次
 */
@Component
public class StatisticVisitTask {

    @Autowired
    private StatisticService statisticService;

    private static final String ENCODING = "utf-8";

    private static final Logger logger = LoggerFactory.getLogger(StatisticVisitTask.class);

    /**
     * 半天读取文件写入数据库中
     * 批量处理
     * cron = "0 0 0,12 * *  ?"
     * @Scheduled(fixedRate = 30000)
     */
    @Scheduled(cron = "0 0 0,12 * *  ?")
    public void writeStatisticVisitToDBTask(){
        try {
            logger.info("Scheduled 执行开始 时间:"+new Date());
            ArrayList<Statistic> arrayList = new ArrayList<Statistic>();

            Statistic statistic = null;

            List<String> strings = null;

            File file = new File("statisticVisit.txt");

            strings = FileUtils.readLines(file, ENCODING);

            //文本存在内容
            if(strings.size() != 0){
                for (String s:strings) {
                    String[] split = s.split("!");
                    statistic = new Statistic();
                    statistic.setAddressIp(split[0]);
                    statistic.setAddressUserAgent(split[1]);
                    arrayList.add(statistic);
                }
                //插入成功后,清理一下文本里面的内容
                if(statisticService.writeStatisticVisitToDBTask(arrayList)){
                    FileUtils.write(file,"",ENCODING);
                }else{
                    logger.debug("IP地址 - 用户引擎记录失败");
                    throw new RuntimeException("IP地址 - 用户引擎记录失败");
                }
            }else{
                //没有数据就返回
                return;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
