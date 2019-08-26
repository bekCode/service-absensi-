
package com.example.uprak.uprakservice.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Group {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("project_id")
    @Expose
    private Integer projectId;
    @SerializedName("minimum_personnel")
    @Expose
    private Integer minimumPersonnel;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("attendance_qr_code")
    @Expose
    private String attendanceQrCode;
    @SerializedName("status")
    @Expose
    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getMinimumPersonnel() {
        return minimumPersonnel;
    }

    public void setMinimumPersonnel(Integer minimumPersonnel) {
        this.minimumPersonnel = minimumPersonnel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAttendanceQrCode() {
        return attendanceQrCode;
    }

    public void setAttendanceQrCode(String attendanceQrCode) {
        this.attendanceQrCode = attendanceQrCode;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

}
