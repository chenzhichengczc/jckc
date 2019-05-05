package com.jc.modules.contact.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.jc.basic.BasicEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author : ChenHsingLou
 * @version :
 * @date : 2019/3/18 14:56
 * @description : 联系我们
 */

@TableName("jc_client")
@Data
@ApiModel("联系我们")
public class UserEntity extends BasicEntity {
    @TableId(type = IdType.AUTO)
    @ApiModelProperty(value = "主键", name = "id")
    private Integer id;

    @ApiModelProperty(value = "用户名", name = "name")
    private String name;

    @ApiModelProperty(value = "手机号码", name = "phone")
    private String phone;

    @ApiModelProperty(value = "邮箱", name = "email")
    private String email;

    @ApiModelProperty(value = "职业", name = "job")
    private String job;

    @ApiModelProperty(value = "信息", name = "message")
    private String message;

    @ApiModelProperty(value = "联系时间", name = "contact_time")
    private Date contactTime;

}
