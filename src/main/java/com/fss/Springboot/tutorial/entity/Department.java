package com.fss.Springboot.tutorial.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    private String departemntName;
    private String departmentAddress;
    private String departemntCode;

    @Override
    public String toString() {
        return "Department{" +
                "departmentId=" + departmentId +
                ", departemntName='" + departemntName + '\'' +
                ", departmentAddress='" + departmentAddress + '\'' +
                ", departemntCode='" + departemntCode + '\'' +
                '}';
    }

    public Department() {
    }

    public Department(Long departmentId, String departemntName, String departmentAddress, String departemntCode) {
        this.departmentId = departmentId;
        this.departemntName = departemntName;
        this.departmentAddress = departmentAddress;
        this.departemntCode = departemntCode;
    }

    public Long getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Long departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartemntName() {
        return departemntName;
    }

    public void setDepartemntName(String departemntName) {
        this.departemntName = departemntName;
    }

    public String getDepartmentAddress() {
        return departmentAddress;
    }

    public void setDepartmentAddress(String departmentAddress) {
        this.departmentAddress = departmentAddress;
    }

    public String getDepartemntCode() {
        return departemntCode;
    }

    public void setDepartemntCode(String departemntCode) {
        this.departemntCode = departemntCode;
    }
}
