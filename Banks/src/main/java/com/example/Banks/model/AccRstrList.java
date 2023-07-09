package com.example.Banks.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class AccRstrList
{
    @JsonProperty("AccRstr")
    private String accrstr;

    @JsonProperty("AccRstrDate")
    private String accRstrDate;

    @JsonProperty("SuccessorBIC")
    private String successorBIC;

}