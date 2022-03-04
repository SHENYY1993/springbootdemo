package com.shenyy.package1.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

@ApiModel(value = "Batch",description = "拍摄批次数据类")
public class Batch {
    @ApiModelProperty(value = "id",notes = "批次id")
    private Integer id;
    @ApiModelProperty(value = "拍摄日期")
    private Date date;
    @ApiModelProperty(value = "生产季id")
    private Integer prodSeasonId;
    @ApiModelProperty(value = "田间号id")
    private Integer fieldId;
    @ApiModelProperty(value = "品种id")
    private Integer varietyId;
    @ApiModelProperty(value = "请求消息id")
    private String requestMsgId;
    @ApiModelProperty(value = "返回消息id")
    private String replyMsgId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getProdSeasonId() {
        return prodSeasonId;
    }

    public void setProdSeasonId(Integer prodSeasonId) {
        this.prodSeasonId = prodSeasonId;
    }

    public Integer getFieldId() {
        return fieldId;
    }

    public void setFieldId(Integer fieldId) {
        this.fieldId = fieldId;
    }

    public Integer getVarietyId() {
        return varietyId;
    }

    public void setVarietyId(Integer varietyId) {
        this.varietyId = varietyId;
    }

    public String getRequestMsgId() {
        return requestMsgId;
    }

    public void setRequestMsgId(String requestMsgId) {
        this.requestMsgId = requestMsgId;
    }

    public String getReplyMsgId() {
        return replyMsgId;
    }

    public void setReplyMsgId(String replyMsgId) {
        this.replyMsgId = replyMsgId;
    }
}
