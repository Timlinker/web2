package com.example.Banks.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PartInfo
{
    @JsonProperty("PartNo")
    private Long PartNo;

    @JsonProperty("PartQuantity")
    private Long PartQuantity;

    @JsonProperty("PartAggregateID")
    private String PartAggregateID;

}