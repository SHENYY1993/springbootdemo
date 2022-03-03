package com.shenyy.package1.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "PlantBlock", description = "种植区块数据类")
public class PlantBlock {
    @ApiModelProperty(value = "id",notes = "种植区块id")
    private Integer id;
    @ApiModelProperty(value = "批次id")
    private Integer batchId;
    @ApiModelProperty(value = "中心点纬度")
    private Double latitude;

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

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }
}
