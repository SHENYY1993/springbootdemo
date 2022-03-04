package com.shenyy.package1.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.Date;
import java.util.List;

@ApiModel(value = "DetectReport", description = "检测报告数据类")
public class DetectReport<T> {
    @ApiModelProperty(value = "id")
    private Integer id;
    @ApiModelProperty(value = "批次id")
    private Integer batchId;
    @ApiModelProperty(value = "批次日期")
    private Date date;
    @ApiModelProperty(value = "品种编号")
    private String batchCode;
    @ApiModelProperty(value = "田间号")
    private String fieldCode;
    @ApiModelProperty(value = "地块位置信息")
    private String fieldPosition;
    @ApiModelProperty(value = "种植区块数据列表")
    private List<T> dataList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getBatchCode() {
        return batchCode;
    }

    public void setBatchCode(String batchCode) {
        this.batchCode = batchCode;
    }

    public String getFieldCode() {
        return fieldCode;
    }

    public void setFieldCode(String fieldCode) {
        this.fieldCode = fieldCode;
    }

    public String getFieldPosition() {
        return fieldPosition;
    }

    public void setFieldPosition(String fieldPosition) {
        this.fieldPosition = fieldPosition;
    }

    public List<T> getDataList() {
        return dataList;
    }

    public void setDataList(List<T> dataList) {
        this.dataList = dataList;
    }
}
