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
@TableName("crm_borrow_org")
public class BorrowOrg implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键编号
     */
    private String id;

    /**
     * 贷款机构名称
     */
    private String name;

    /**
     * 机构描述
     */
    private String remark;

    /**
     * 合作开始日期
     */
    private Date beginDate;

    /**
     * 合作结束日期
     */
    private Date endDate;

    /**
     * 合作机构负责人
     */
    private String manager;

    /**
     * 合作机构联系方式
     */
    private String phone;

    /**
     * 创建时间
     */
    private Date createTime;


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

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "BorrowOrg{" +
        "id=" + id +
        ", name=" + name +
        ", remark=" + remark +
        ", beginDate=" + beginDate +
        ", endDate=" + endDate +
        ", manager=" + manager +
        ", phone=" + phone +
        ", createTime=" + createTime +
        "}";
    }
}
