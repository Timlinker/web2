package com.example.Banks.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class InitialED
{
    @JsonProperty("EDNo")
    private Long EDNo;

    @JsonProperty("EDDate")
    private String EDDate;

    @JsonProperty("EDAuthor")
    private Long EDAuthor;

}