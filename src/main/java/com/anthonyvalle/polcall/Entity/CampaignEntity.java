package com.anthonyvalle.polcall.Entity;

import javax.persistence.*;

import java.util.Collection;

@Entity
public class CampaignEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String campaignName;
    private String candidateFullName;
    private String campaignWebsite;
    private String campaignPrimaryPhoneNumber;
    private String campaignParty;
    @OneToMany(fetch = FetchType.LAZY)
    private Collection<UserEntity> volunteers;

    public CampaignEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public String getCandidateFullName() {
        return candidateFullName;
    }

    public void setCandidateFullName(String candidateFullName) {
        this.candidateFullName = candidateFullName;
    }

    public String getCampaignWebsite() {
        return campaignWebsite;
    }

    public void setCampaignWebsite(String campaignWebsite) {
        this.campaignWebsite = campaignWebsite;
    }

    public String getCampaignPrimaryPhoneNumber() {
        return campaignPrimaryPhoneNumber;
    }

    public void setCampaignPrimaryPhoneNumber(String campaignPrimaryPhoneNumber) {
        this.campaignPrimaryPhoneNumber = campaignPrimaryPhoneNumber;
    }

    public String getCampaignParty() {
        return campaignParty;
    }

    public void setCampaignParty(String campaignParty) {
        this.campaignParty = campaignParty;
    }

    public Collection<UserEntity> getVolunteers() {
        return volunteers;
    }

    public void setVolunteers(Collection<UserEntity> volunteers) {
        this.volunteers = volunteers;
    }
}
