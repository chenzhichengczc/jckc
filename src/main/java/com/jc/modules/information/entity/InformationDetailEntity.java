package com.jc.modules.information.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.jc.basic.BasicEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @author ： Mr.Chan
 * @date ：Created in 2019/3/22 14:32
 * @description ：资讯信息详情
 */
@TableName("jc_information_detail")
@Data
@ApiModel("资讯详情核心表")
public class InformationDetailEntity  extends BasicEntity{

    @TableId(type = IdType.AUTO)
    @ApiModelProperty(value = "主键",name = "detailId")
    private Integer detailId;

    @ApiModelProperty(value = "资讯类型id",name = "categoryId")
    private Integer categoryId;

    @ApiModelProperty(value = "资讯图片",name = "image")
    private String image;

    @ApiModelProperty(value = "资讯关键字",name = "keyword")
    private String keyword;

    @ApiModelProperty(value = "资讯点击量",name ="click")
    private Long click;

    @ApiModelProperty(value = "资讯简短描述",name = "brief")
    private String brief;

    @ApiModelProperty(value = "资讯详细描述",name = "text")
    private String text;

    @ApiModelProperty(value = "资讯来源渠道",name = "channel")
    private Integer channel;


    private InformationEntity informationEntity;

}
