package com.anthonyvalle.polcall.Entity;

import javax.persistence.*;

import java.util.Collection;


@Entity
public class VoterEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String publicID;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private int age;
    private String gender;
    private boolean MobileNumber;
    private String partyAffiliation;
    @OneToMany(fetch = FetchType.LAZY)
    private Collection<CallLogEntity> callLog;



    public VoterEntity() {
    }

    public Long getId() {
        return id;
    }

    public String getPublicID() {
        return publicID;
    }

    public void setPublicID(String publicID) {
        this.publicID = publicID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isMobileNumber() {
        return MobileNumber;
    }

    public void setMobileNumber(boolean mobileNumber) {
        MobileNumber = mobileNumber;
    }

    public String getPartyAffiliation() {
        return partyAffiliation;
    }

    public void setPartyAffiliation(String partyAffiliation) {
        this.partyAffiliation = partyAffiliation;
    }

    public Collection<CallLogEntity> getCallLog() {
        return callLog;
    }

    public void setCallLog(Collection<CallLogEntity> callLog) {
        this.callLog = callLog;
    }

    @Override
    public String toString() {
        return "VoterEntity{" +
                "id=" + id +
                ", publicID='" + publicID + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

}
