package com.jc.aop;

import lombok.Synchronized;
import org.apache.commons.io.FileUtils;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @Author: Charles Chan
 * @Date: 2019/3/15 19:44
 * @Version 1.0
 */
@Aspect
@Component
public class StatisticVisitAop {

    private static final Logger logger = LoggerFactory.getLogger(StatisticVisitAop.class);

    @Pointcut("execution(* com.jc.basic.CommonController.*(..))")
    public void StatisticVisitAop(){}

    @Before("StatisticVisitAop()")
    @Synchronized
    public void writeStatisticVisitToDBTask(){
        try {
            HttpServletRequest requestAttributes = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();

            String ip = requestAttributes.getRemoteAddr();

            String userAgent = requestAttributes.getHeader("user-agent");

            File file = new File("statisticVisit.txt");

            ArrayList<String> line = new ArrayList<String>();
            line.add(ip+"!"+userAgent);

            FileUtils.writeLines(file,line,true);
        }catch (IOException e ){
            logger.debug("AOP拦截信息失败");
            throw new RuntimeException("AOP拦截信息失败");
        }
    }

}
