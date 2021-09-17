package com.sinosoft.domain;

import lombok.Generated;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Proxy;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

/**
 * @program: platform-project
 * @Date: 2021/9/16 16:02
 * @Author: Mr.SU
 * @Description: 计划表
 */

@Entity
@Proxy(lazy = false) //设置懒加载方式
@DynamicUpdate   //自动更新
public class OpBusPlanInfo {

    /**
     * 主键id.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "plan-id")
    @GenericGenerator(name = "plan-id", strategy = "com.sinosoft.util.PlanIdGenerator")
    private String planId;

    /**
     * 计划名称.
     */
    private String planName;

    /**
     * 计划简称.
     */
    private String shortPlanName;

    /**
     * 计划登记号码.
     */
    private String planRegNo;

    /**
     * 计划产品号码.
     */
    private String productNo;

    /**
     * 计划类型.
     */
    private String planType;

    /**
     * 计划类别.
     */
    private String planKind;

    /**
     * 计划设立日期.
     */
    private Date planStartDate;

    /**
     * 计划终止日期.
     */
    private Date planEndDate;

    /**
     * 方案报备通过日期.
     */
    private Date planReplyDate;

    /**
     * 合同报备日期.
     */
    private Date contReqDate;

    /**
     * 合同报备批复日期.
     */
    private Date contReplyDate;

    /**
     * 合同报备批复机构.
     */
    private String contReplyCom;

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public String getShortPlanName() {
        return shortPlanName;
    }

    public void setShortPlanName(String shortPlanName) {
        this.shortPlanName = shortPlanName;
    }

    public String getPlanRegNo() {
        return planRegNo;
    }

    public void setPlanRegNo(String planRegNo) {
        this.planRegNo = planRegNo;
    }

    public String getProductNo() {
        return productNo;
    }

    public void setProductNo(String productNo) {
        this.productNo = productNo;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public String getPlanKind() {
        return planKind;
    }

    public void setPlanKind(String planKind) {
        this.planKind = planKind;
    }

    public Date getPlanStartDate() {
        return planStartDate;
    }

    public void setPlanStartDate(Date planStartDate) {
        this.planStartDate = planStartDate;
    }

    public Date getPlanEndDate() {
        return planEndDate;
    }

    public void setPlanEndDate(Date planEndDate) {
        this.planEndDate = planEndDate;
    }

    public Date getPlanReplyDate() {
        return planReplyDate;
    }

    public void setPlanReplyDate(Date planReplyDate) {
        this.planReplyDate = planReplyDate;
    }

    public Date getContReqDate() {
        return contReqDate;
    }

    public void setContReqDate(Date contReqDate) {
        this.contReqDate = contReqDate;
    }

    public Date getContReplyDate() {
        return contReplyDate;
    }

    public void setContReplyDate(Date contReplyDate) {
        this.contReplyDate = contReplyDate;
    }

    public String getContReplyCom() {
        return contReplyCom;
    }

    public void setContReplyCom(String contReplyCom) {
        this.contReplyCom = contReplyCom;
    }

    @Override
    public String toString() {
        return "OpBusPlanInfo{" +
                "planId='" + planId + '\'' +
                ", planName='" + planName + '\'' +
                ", shortPlanName='" + shortPlanName + '\'' +
                ", planRegNo='" + planRegNo + '\'' +
                ", productNo='" + productNo + '\'' +
                ", planType='" + planType + '\'' +
                ", planKind='" + planKind + '\'' +
                ", planStartDate=" + planStartDate +
                ", planEndDate=" + planEndDate +
                ", planReplyDate=" + planReplyDate +
                ", contReqDate=" + contReqDate +
                ", contReplyDate=" + contReplyDate +
                ", contReplyCom='" + contReplyCom + '\'' +
                '}';
    }
}
