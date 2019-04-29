package com.jc.modules.contact.controller;

import com.jc.common.utils.ResponseUtil;
import com.jc.common.utils.TextValidator;
import com.jc.modules.contact.entity.UserEntity;
import com.jc.modules.contact.service.UserInformationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;

/**
 * @author : ChenHsingLou
 * @date : 2019/3/18 15:33
 * @description : 用户信息controller
 * @version :
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserInformationService userInformationService;


    @RequestMapping("/insertUserInformation")
    public ResponseUtil insertUserInformation(UserEntity userEntity) throws ParseException {

        userInformationService.insertInfo(userEntity);

        return ResponseUtil.success();
    }

}
