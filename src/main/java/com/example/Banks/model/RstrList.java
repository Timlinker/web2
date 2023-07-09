package com.example.Banks.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class RstrList
{
    @JsonProperty("Rstr")
    private String rstr;

    @JsonProperty("RstrDate")
    private String rstrdate;
}