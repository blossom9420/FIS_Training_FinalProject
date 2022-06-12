package vn.fis.training.phl.models;

import java.time.LocalDateTime;
import java.util.Set;

public class Evidence extends AbstractEntity{
    CriminalCase criminalCase;
    Storage storage;
    String number;
    String itemName;
    String notes;
    Boolean archieved;
    Set<TrackEntry> trackEntries;

    public Evidence() {
        super();
    }


    public Evidence(Long id, int version, CriminalCase criminalCase, Storage storage, String number, String itemName,
                    String notes, Boolean archieved, Set<TrackEntry> trackEntries) {
        super(id, version);
        this.criminalCase = criminalCase;
        this.storage = storage;
        this.number = number;
        this.itemName = itemName;
        this.notes = notes;
        this.archieved = archieved;
        this.trackEntries = trackEntries;
    }

    public CriminalCase getCriminalCase() {
        return criminalCase;
    }

    public void setCriminalCase(CriminalCase criminalCase) {
        this.criminalCase = criminalCase;
    }

    public Storage getStorage() {
        return storage;
    }

    public void setStorage(Storage storage) {
        this.storage = storage;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Boolean getArchieved() {
        return archieved;
    }

    public void setArchieved(Boolean archieved) {
        this.archieved = archieved;
    }

    public Set<TrackEntry> getTrackEntries() {
        return trackEntries;
    }

    public void setTrackEntries(Set<TrackEntry> trackEntries) {
        this.trackEntries = trackEntries;
    }

    @Override
    public String toString() {
        return "Evidence{" +
                ", id=" + id +
                "notes='" + notes + '\'' +
                '}' +"\n";
    }

    public void replace(Evidence evidence){
        this.id = evidence.getId();
        this.version = evidence.getVersion();
        this.createdAt = evidence.getCreatedAt();
        this.modifiedAt = evidence.getModifiedAt();

        this.criminalCase = evidence.getCriminalCase();
        this.storage = evidence.getStorage();
        this.number = evidence.getNumber();
        this.itemName = evidence.getItemName();
        this.notes = evidence.getNotes();
        this.archieved = evidence.getArchieved();
        this.trackEntries = evidence.getTrackEntries();
    }
}
