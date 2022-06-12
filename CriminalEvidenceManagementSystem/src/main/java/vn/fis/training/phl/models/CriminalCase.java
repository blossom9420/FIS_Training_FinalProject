package vn.fis.training.phl.models;

import vn.fis.training.phl.models.enums.CaseStatus;
import vn.fis.training.phl.models.enums.CaseType;

import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;

public class CriminalCase extends AbstractEntity {
    String number;
    CaseType type;
    String shortDescription;
    String detailDescription;
    CaseStatus status;
    String notes;
    Set<Evidence> evidenceSet;
    Detective leadInvestigator;
    Set<Detective> assigned;

    public CriminalCase() {
        super();
    }

    public CriminalCase(Long id, int version, String number, CaseType type, String shortDescription,
                        String detailDescription, CaseStatus status, String notes, Set<Evidence> evidenceSet,
                        Detective leadInvestigator, Set<Detective> assigned) {
        super(id, version);
        this.number = number;
        this.type = type;
        this.shortDescription = shortDescription;
        this.detailDescription = detailDescription;
        this.status = status;
        this.notes = notes;
        this.evidenceSet = evidenceSet;
        this.leadInvestigator = leadInvestigator;
        this.assigned = assigned;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public CaseType getType() {
        return type;
    }

    public void setType(CaseType type) {
        this.type = type;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getDetailDescription() {
        return detailDescription;
    }

    public void setDetailDescription(String detailDescription) {
        this.detailDescription = detailDescription;
    }

    public CaseStatus getStatus() {
        return status;
    }

    public void setStatus(CaseStatus status) {
        this.status = status;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Set<Evidence> getEvidenceSet() {
        return evidenceSet;
    }

    public void setEvidenceSet(Set<Evidence> evidenceSet) {
        this.evidenceSet = evidenceSet;
    }

    public Detective getLeadInvestigator() {
        return leadInvestigator;
    }

    public void setLeadInvestigator(Detective leadInvestigator) {
        this.leadInvestigator = leadInvestigator;
    }

    public Set<Detective> getAssigned() {
        return assigned;
    }

    public void setAssigned(Set<Detective> assigned) {
        this.assigned = assigned;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CriminalCase that = (CriminalCase) o;
        return Objects.equals(number, that.number) && type == that.type
                && Objects.equals(shortDescription, that.shortDescription)
                && Objects.equals(detailDescription, that.detailDescription)
                && status == that.status && Objects.equals(notes, that.notes)
                && Objects.equals(evidenceSet, that.evidenceSet)
                && Objects.equals(leadInvestigator, that.leadInvestigator)
                && Objects.equals(assigned, that.assigned);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, type, shortDescription, detailDescription, status, notes, evidenceSet,
                leadInvestigator, assigned);
    }

    @Override
    public String toString() {
        return "CriminalCase{" +
                ", id=" + id +
                "shortDescription='" + shortDescription + '\'' +
                '}' +"\n";
    }

    public void replace(CriminalCase criminalCase) {
        this.id = criminalCase.getId();
        this.version = criminalCase.getVersion();
        //this.createdAt = criminalCase.getCreatedAt();
        this.modifiedAt = criminalCase.getModifiedAt();
        this.number = criminalCase.getNumber();
        this.type = criminalCase.getType();
        this.shortDescription = criminalCase.getShortDescription();
        this.detailDescription = criminalCase.getDetailDescription();
        this.status = criminalCase.getStatus();
        this.notes = criminalCase.getNotes();
        this.evidenceSet = criminalCase.getEvidenceSet();
        this.leadInvestigator = criminalCase.getLeadInvestigator();
        this.assigned = criminalCase.getAssigned();

    }
}
