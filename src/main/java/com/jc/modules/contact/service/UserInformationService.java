package com.jc.modules.contact.service;

import com.baomidou.mybatisplus.service.IService;
import com.jc.modules.contact.entity.UserEntity;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;


public interface UserInformationService extends IService<UserEntity> {

    void insertInfo(UserEntity userEntity) throws ParseException;

}
