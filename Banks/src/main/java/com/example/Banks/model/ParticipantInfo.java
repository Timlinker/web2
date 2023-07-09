package com.example.Banks.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ParticipantInfo
{
    @JsonProperty("NameP")
    private String NameP;

    @JsonProperty("EnglName")
    private String EnglName;

    @JsonProperty("RegN")
    private String RegN;

    @JsonProperty("CntrCd")
    private String CntrCd;

    @JsonProperty("Rgn")
    private String Rgn;

    @JsonProperty("Ind")
    private String Ind;

    @JsonProperty("Tnp")
    private String Tnp;

    @JsonProperty("Nnp")
    private String Nnp;

    @JsonProperty("Adr")
    private String Adr;

    @JsonProperty("PrntBIC")
    private Long PrntBIC;

    @JsonProperty("DateIn")
    private String DateIn;

    @JsonProperty("DateOut")
    private String DateOut;

    @JsonProperty("PtType")
    private String PtType;

    @JsonProperty("Srvcs")
    private String Srvcs;

    @JsonProperty("XchType")
    private String XchType;

    @JsonProperty("UID")
    private Long UID;

    @JsonProperty("ParticipantStatus")
    private String ParticipantStatus;

    @JsonProperty("RstrList")
    private RstrList Rstlist;
}