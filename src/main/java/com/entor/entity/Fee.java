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
@TableName("crm_fee")
public class Fee implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键编号
     */
    private String id;

    /**
     * 学生编号
     */
    private String studentId;

    /**
     * 缴费金额
     */
    private Integer payMoney;

    /**
     * 缴费方式（1全款2分期）
     */
    private Integer payType;

    /**
     * 分期机构编号
     */
    private String borrowOrgId;

    /**
     * 缴费日期
     */
    private Date payDate;

    /**
     * 缴费状态（1已缴费2未交费）
     */
    private Integer payStatue;

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

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Integer getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(Integer payMoney) {
        this.payMoney = payMoney;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public String getBorrowOrgId() {
        return borrowOrgId;
    }

    public void setBorrowOrgId(String borrowOrgId) {
        this.borrowOrgId = borrowOrgId;
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Integer getPayStatue() {
        return payStatue;
    }

    public void setPayStatue(Integer payStatue) {
        this.payStatue = payStatue;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Fee{" +
        "id=" + id +
        ", studentId=" + studentId +
        ", payMoney=" + payMoney +
        ", payType=" + payType +
        ", borrowOrgId=" + borrowOrgId +
        ", payDate=" + payDate +
        ", payStatue=" + payStatue +
        ", createTime=" + createTime +
        "}";
    }
}
