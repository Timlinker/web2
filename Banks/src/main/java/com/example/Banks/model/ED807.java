package com.example.Banks.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import lombok.Data;

import java.util.List;

@Data
@JsonRootName("ED807")
public class ED807
{
    @JsonProperty("xmlns")
    private String xmlns;

    @JsonProperty("EDNo")
    private Long EDNo;

    @JsonProperty("EDDate")
    private String EDDate;

    @JsonProperty("EDAuthor")
    private Long EDAuthor;

    @JsonProperty("EDReceiver")
    private Long EDReceiver;

    @JsonProperty("CreationReason")
    private String CreationReason;

    @JsonProperty("CreationDateTime")
    private String CreationDateTime;

    @JsonProperty("InfoTypeCode")
    private String InfoTypeCode;

    @JsonProperty("BusinessDay")
    private String BusinessDay;

    @JsonProperty("DirectoryVersion")
    private Long DirectoryVersion;

    @JsonProperty("BICDirectoryEntry")
    private List<BICDirectoryEntry> bicDirectoryEntry;

    @JsonProperty("PartInfo")
    private List<PartInfo> partinfo;

    @JsonProperty("InitialED")
    private List<InitialED> initialed;

}