package com.jc.modules.company.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.jc.basic.BasicEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @Author: Charles Chan
 * @Date: 2019/3/11 16:26
 * @Version 1.0
 */
@Data
@ApiModel("公司主体")
@TableName("jc_company")
public class Company extends BasicEntity {
    //主键
    @TableId(type = IdType.AUTO)
    private  Long id;

    @ApiModelProperty(value = "公司编号",name = "comCode")
    private  Long comCode = 1L;

    @ApiModelProperty(value = "公司名字",name = "comName")
    private  String comName;

    @ApiModelProperty(value = "公司地址",name = "comAddress")
    private  String comAddress;

    @ApiModelProperty(value = "公司QQ",name = "comQq")
    private  String comQq;

    @ApiModelProperty(value = "公司邮箱",name = "comEmail")
    private  String comEmail;

    @ApiModelProperty(value = "公司座机",name = "comStudio")
    private  String comStudio;

    @ApiModelProperty(value = "公司联系人",name = "comContacts")
    private  String comContacts;

    @ApiModelProperty(value = "公司简短介绍",name = "comIntroductionBrief")
    private  String comIntroductionBrief;

    @ApiModelProperty(value = "公司介绍",name = "comIntroductionText")
    private  String comIntroductionText;

    @ApiModelProperty(value = "公司业务",name = "comBusiness")
    private  String comBusiness;

    @ApiModelProperty(value = "公司文化",name = "comCulture")
    private  String comCulture;

    @ApiModelProperty(value = "公司logo",name = "comLogo")
    private  String comLogo;

    @ApiModelProperty(value = "公司创建时间",name = "comCreateTime")
    private  Date comCreateTime;

    @ApiModelProperty(value = "公司创建人",name = "comCreateBy")
    private  String comCreateBy;

}
