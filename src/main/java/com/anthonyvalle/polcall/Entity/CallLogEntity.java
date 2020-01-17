package com.anthonyvalle.polcall.Entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class CallLogEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private UUID callID;
    private boolean callerPickedUpPhone;
    @Lob
    private String CallNotes;

    @ManyToOne
    private VoterEntity voterEntity;

    public CallLogEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UUID getCallID() {
        return callID;
    }

    public void setCallID(UUID callID) {
        this.callID = callID;
    }

    public boolean isCallerPickedUpPhone() {
        return callerPickedUpPhone;
    }

    public void setCallerPickedUpPhone(boolean callerPickedUpPhone) {
        this.callerPickedUpPhone = callerPickedUpPhone;
    }

    public String getCallNotes() {
        return CallNotes;
    }

    public void setCallNotes(String callNotes) {
        CallNotes = callNotes;
    }
}
