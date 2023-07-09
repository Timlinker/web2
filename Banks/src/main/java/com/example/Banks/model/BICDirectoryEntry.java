package com.example.Banks.model;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class BICDirectoryEntry
{
    @JsonProperty("ParticipantInfo")
    private ParticipantInfo participantInfo;

    @JsonProperty("SWBICS")
    private SWBICS[] swibcs;

    @JsonProperty("Accounts")
    private List<Accounts> accounts;

    @JsonProperty("BIC")
    private Long BIC;

    @JsonProperty("ChangeType")
    private String ChangeType;
}