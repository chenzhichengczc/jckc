package com.jc.modules.information.controller;

import com.jc.common.json.JsonResult;
import com.jc.modules.information.entity.InformationDetailEntity;
import com.jc.modules.information.service.InformationDetailService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ：Mr.Chan
 * * @date ：Created in 2019/3/12 15:20
 * * @description：资讯详情信息controller
 * @modified By：
 * @version:
 */
@RestController
@RequestMapping("/informationDetail")
@Api(description = "资讯详请核心表")
public class InformationDetailController {

    @Autowired
    private InformationDetailService informationDetailService;

    @RequestMapping(value = "/findInformationAndDetail",method = RequestMethod.GET)
    public JsonResult findInformationAndDetail(Integer detailId){
        informationDetailService.findAll(detailId);
        return new JsonResult();
    }

}
