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
@TableName("crm_student_study")
public class StudentStudy implements Serializable {

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
     * 联系电话
     */
    private String phone;

    /**
     * 联系地址
     */
    private String address;

    /**
     * 毕业学校名称
     */
    private String schoolName;

    /**
     * 专业名称
     */
    private String schoolMajor;

    /**
     * 开班日期
     */
    private Date beginDate;

    /**
     * 实训专业编号
     */
    private String majorId;

    /**
     * 合同编号
     */
    private String contractId;

    /**
     * 合同文件名称
     */
    private String contractFile;

    /**
     * 合同签订日期
     */
    private Date contractDate;

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

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolMajor() {
        return schoolMajor;
    }

    public void setSchoolMajor(String schoolMajor) {
        this.schoolMajor = schoolMajor;
    }

    public Date getBeginDate() {
        return beginDate;
    }

    public void setBeginDate(Date beginDate) {
        this.beginDate = beginDate;
    }

    public String getMajorId() {
        return majorId;
    }

    public void setMajorId(String majorId) {
        this.majorId = majorId;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getContractFile() {
        return contractFile;
    }

    public void setContractFile(String contractFile) {
        this.contractFile = contractFile;
    }

    public Date getContractDate() {
        return contractDate;
    }

    public void setContractDate(Date contractDate) {
        this.contractDate = contractDate;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "StudentStudy{" +
        "id=" + id +
        ", name=" + name +
        ", sex=" + sex +
        ", phone=" + phone +
        ", address=" + address +
        ", schoolName=" + schoolName +
        ", schoolMajor=" + schoolMajor +
        ", beginDate=" + beginDate +
        ", majorId=" + majorId +
        ", contractId=" + contractId +
        ", contractFile=" + contractFile +
        ", contractDate=" + contractDate +
        ", createTime=" + createTime +
        "}";
    }
}
