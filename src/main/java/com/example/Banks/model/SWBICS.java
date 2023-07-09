package com.example.Banks.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class SWBICS
{
    @JsonProperty("SWBIC")
    private String SWBIC;

    @JsonProperty("DefaultSWBIC")
    private String defaultSWBIC;

}
