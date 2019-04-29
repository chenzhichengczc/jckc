package com.jc.modules.product.entity;

import java.util.Date;

/**
 * 产品类型
 */
public class Product {
    /**
     * 主键
     */
    private Integer id;
    /**
     *产品类型名字
     */
    private String typeName;
    /**
     *产品类状态;默认产品类可用 - 0为可用 - 1为不可用
     */
    private Integer status;
    /**
     *父类;判断是否该产品类目是否为父类目，- 0为父类 - 1 不为父类
     */
    private Integer is_parent;
    /**
     *创建时间
     */
    private Date create_time;
    /**
     *创建人
     */
    private String create_by;
    /**
     *修改时间
     */
    private Date update_time;
    /**
     *修改人
     */
    private String update_by;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getIs_parent() {
        return is_parent;
    }

    public void setIs_parent(Integer is_parent) {
        this.is_parent = is_parent;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public String getCreate_by() {
        return create_by;
    }

    public void setCreate_by(String create_by) {
        this.create_by = create_by;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }

    public String getUpdate_by() {
        return update_by;
    }

    public void setUpdate_by(String update_by) {
        this.update_by = update_by;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", typeName='" + typeName + '\'' +
                ", status=" + status +
                ", is_parent=" + is_parent +
                ", create_time=" + create_time +
                ", create_by='" + create_by + '\'' +
                ", update_time=" + update_time +
                ", update_by='" + update_by + '\'' +
                '}';
    }
}
