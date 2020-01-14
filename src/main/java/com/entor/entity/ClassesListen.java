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
@TableName("crm_classes_listen")
public class ClassesListen implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键编号
     */
    private String classesId;

    /**
     * 班级名称（格式：yyyy-MMxxx专业试听班）
     */
    private String classesName;

    /**
     * 试听专业编号
     */
    private String majorId;

    /**
     * 班主任编号
     */
    private String managerId;

    /**
     * 代课老师编号
     */
    private String teacherId;

    /**
     * 试听教室名称
     */
    private String classesRoom;

    /**
     * 试听开始时间
     */
    private Date beginDate;

    /**
     * 试听结束时间（正常情况是一周）
     */
    private Date endDate;

    /**
     * 创建时间
     */
    private Date createTime;


    public String getClassesId() {
        return classesId;
    }

    public void setClassesId(String classesId) {
        this.classesId = classesId;
    }

    public String getClassesName() {
        return classesName;
    }

    public void setClassesName(String classesName) {
        this.classesName = classesName;
    }

    public String getMajorId() {
        return majorId;
    }

    public void setMajorId(String majorId) {
        this.majorId = majorId;
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getClassesRoom() {
        return classesRoom;
    }

    public void setClassesRoom(String classesRoom) {
        this.classesRoom = classesRoom;
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

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "ClassesListen{" +
        "classesId=" + classesId +
        ", classesName=" + classesName +
        ", majorId=" + majorId +
        ", managerId=" + managerId +
        ", teacherId=" + teacherId +
        ", classesRoom=" + classesRoom +
        ", beginDate=" + beginDate +
        ", endDate=" + endDate +
        ", createTime=" + createTime +
        "}";
    }
}
