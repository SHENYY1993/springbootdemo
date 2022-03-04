package com.shenyy.package1.bean;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "Field",description = "田间号数据类")
public class Field {
    @ApiModelProperty(value = "id",notes = "田间号id")
    private Integer id;
    @ApiModelProperty(value = "田间号编号")
    private String fieldCode;
    @ApiModelProperty(value = "地块类型（0：大田 1：试验田）")
    private Integer fieldType;
    @ApiModelProperty(value = "地块边界点列表")
    private String border;
    @ApiModelProperty(value = "生产季id")
    private Integer prodSeasonId;
    @ApiModelProperty(value = "品种id")
    private Integer varietyId;
    @ApiModelProperty(value = "种植密度（株/公顷）")
    private Integer plantingDensity;
    @ApiModelProperty(value = "种植行方向")
    private Double plantCourse;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFieldCode() {
        return fieldCode;
    }

    public void setFieldCode(String fieldCode) {
        this.fieldCode = fieldCode;
    }

    public Integer getFieldType() {
        return fieldType;
    }

    public void setFieldType(Integer fieldType) {
        this.fieldType = fieldType;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public Integer getProdSeasonId() {
        return prodSeasonId;
    }

    public void setProdSeasonId(Integer prodSeasonId) {
        this.prodSeasonId = prodSeasonId;
    }

    public Integer getVarietyId() {
        return varietyId;
    }

    public void setVarietyId(Integer varietyId) {
        this.varietyId = varietyId;
    }

    public Integer getPlantingDensity() {
        return plantingDensity;
    }

    public void setPlantingDensity(Integer plantingDensity) {
        this.plantingDensity = plantingDensity;
    }

    public Double getPlantCourse() {
        return plantCourse;
    }

    public void setPlantCourse(Double plantCourse) {
        this.plantCourse = plantCourse;
    }
}
