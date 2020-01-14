package com.entor.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.util.Date;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author cjk
 * @since 2019-12-20
 */
@TableName("crm_major")
public class Major implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键编号
     */
    private String id;

    /**
     * 专业名称
     */
    private String name;

    /**
     * 专业负责人
     */
    private String manager;

    /**
     * 专业描述
     */
    private String remark;

    /**
     * 专业创建日期
     */
    private Date beginDate;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    @Override
    public String toString() {
        return "Major{" +
        "id=" + id +
        ", name=" + name +
        ", manager=" + manager +
        ", remark=" + remark +
        ", beginDate=" + beginDate +
        "}";
    }
}
