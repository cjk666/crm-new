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
@TableName("crm_student_listen")
public class StudentListen implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键编号
     */
    private String id;

    /**
     * 学生姓名
     */
    private String name;

    /**
     * 学生性别
     */
    private Integer sex;

    /**
     * 学生电话
     */
    private String phone;

    /**
     * 学生地址
     */
    private String address;

    /**
     * 试听日期
     */
    private Date listenDate;

    /**
     * 试听专业
     */
    private String majorId;

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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getListenDate() {
        return listenDate;
    }

    public void setListenDate(Date listenDate) {
        this.listenDate = listenDate;
    }

    public String getMajorId() {
        return majorId;
    }

    public void setMajorId(String majorId) {
        this.majorId = majorId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "StudentListen{" +
        "id=" + id +
        ", name=" + name +
        ", sex=" + sex +
        ", phone=" + phone +
        ", address=" + address +
        ", listenDate=" + listenDate +
        ", majorId=" + majorId +
        ", createTime=" + createTime +
        "}";
    }
}
