package vn.fis.training.phl.models;

import vn.fis.training.phl.models.enums.TrackAction;

import java.time.LocalDateTime;

public class TrackEntry extends  AbstractEntity{
    LocalDateTime date;
    Evidence evidence;
    Detective detective;
    TrackAction action;
    String reason;

    public TrackEntry() {
        super();
    }

    public TrackEntry(Long id, int version, LocalDateTime date, Evidence evidence, Detective detective, TrackAction action, String reason) {
        super(id, version);
        this.date = date;
        this.evidence = evidence;
        this.detective = detective;
        this.action = action;
        this.reason = reason;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Evidence getEvidence() {
        return evidence;
    }

    public void setEvidence(Evidence evidence) {
        this.evidence = evidence;
    }

    public Detective getDetective() {
        return detective;
    }

    public void setDetective(Detective detective) {
        this.detective = detective;
    }

    public TrackAction getAction() {
        return action;
    }

    public void setAction(TrackAction action) {
        this.action = action;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }
}
