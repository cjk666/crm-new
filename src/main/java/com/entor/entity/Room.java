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
@TableName("crm_room")
public class Room implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 主键编号
     */
    private String roomId;

    /**
     * 房间名称，格式：xx栋xx单元xxx号
     */
    private String roomName;

    /**
     * 详细地址，格式：xxx路xxx号xxx小区xx栋xx单元xxx号
     */
    private String roomAddress;

    /**
     * 房间能住总人数
     */
    private Integer roomTotalSize;

    /**
     * 空余床位
     */
    private Integer roomEmptySize;

    /**
     * 房间住宿人性别
     */
    private Integer roomPersonSex;

    /**
     * 房间每月住宿费
     */
    private Integer roomMoney;

    /**
     * 房间押金
     */
    private Integer roomDeposit;

    /**
     * 房东姓名
     */
    private String roomManager;

    /**
     * 房东电话
     */
    private String roomManagerPhone;

    /**
     * 创建时间
     */
    private Date createTime;


    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getRoomAddress() {
        return roomAddress;
    }

    public void setRoomAddress(String roomAddress) {
        this.roomAddress = roomAddress;
    }

    public Integer getRoomTotalSize() {
        return roomTotalSize;
    }

    public void setRoomTotalSize(Integer roomTotalSize) {
        this.roomTotalSize = roomTotalSize;
    }

    public Integer getRoomEmptySize() {
        return roomEmptySize;
    }

    public void setRoomEmptySize(Integer roomEmptySize) {
        this.roomEmptySize = roomEmptySize;
    }

    public Integer getRoomPersonSex() {
        return roomPersonSex;
    }

    public void setRoomPersonSex(Integer roomPersonSex) {
        this.roomPersonSex = roomPersonSex;
    }

    public Integer getRoomMoney() {
        return roomMoney;
    }

    public void setRoomMoney(Integer roomMoney) {
        this.roomMoney = roomMoney;
    }

    public Integer getRoomDeposit() {
        return roomDeposit;
    }

    public void setRoomDeposit(Integer roomDeposit) {
        this.roomDeposit = roomDeposit;
    }

    public String getRoomManager() {
        return roomManager;
    }

    public void setRoomManager(String roomManager) {
        this.roomManager = roomManager;
    }

    public String getRoomManagerPhone() {
        return roomManagerPhone;
    }

    public void setRoomManagerPhone(String roomManagerPhone) {
        this.roomManagerPhone = roomManagerPhone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Room{" +
        "roomId=" + roomId +
        ", roomName=" + roomName +
        ", roomAddress=" + roomAddress +
        ", roomTotalSize=" + roomTotalSize +
        ", roomEmptySize=" + roomEmptySize +
        ", roomPersonSex=" + roomPersonSex +
        ", roomMoney=" + roomMoney +
        ", roomDeposit=" + roomDeposit +
        ", roomManager=" + roomManager +
        ", roomManagerPhone=" + roomManagerPhone +
        ", createTime=" + createTime +
        "}";
    }
}
