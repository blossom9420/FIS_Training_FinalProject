package vn.fis.training.phl.models;

import vn.fis.training.phl.models.enums.EmployeeStatus;
import vn.fis.training.phl.models.enums.Rank;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;
import java.util.Set;

public class Detective extends AbstractEntity{
    // INFO USER
    String username;
    String firstName;
    String lastName;
    String password;
    LocalDateTime hiringDate;

    // DETAILS USER
    String badgeNumber;
    Rank rank;
    Boolean armed;
    EmployeeStatus status;
    Set<CriminalCase> criminalCases;
    Set<TrackEntry> trackEntries;

    public Detective() {
       super();
    }

    public Detective(Long id, int version, String username, String firstName, String lastName,
                     String password, LocalDateTime hiringDate, String badgeNumber, Rank rank,
                     Boolean armed, EmployeeStatus status, Set<CriminalCase> criminalCases,
                     Set<TrackEntry> trackEntries) {
        super(id, version);
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.hiringDate = hiringDate;
        this.badgeNumber = badgeNumber;
        this.rank = rank;
        this.armed = armed;
        this.status = status;
        this.criminalCases = criminalCases;
        this.trackEntries = trackEntries;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LocalDateTime getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(LocalDateTime hiringDate) {
        this.hiringDate = hiringDate;
    }

    public String getBadgeNumber() {
        return badgeNumber;
    }

    public void setBadgeNumber(String badgeNumber) {
        this.badgeNumber = badgeNumber;
    }

    public Rank getRank() {
        return rank;
    }

    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Boolean getArmed() {
        return armed;
    }

    public void setArmed(Boolean armed) {
        this.armed = armed;
    }

    public EmployeeStatus getStatus() {
        return status;
    }

    public void setStatus(EmployeeStatus status) {
        this.status = status;
    }

    public Set<CriminalCase> getCriminalCases() {
        return criminalCases;
    }

    public void setCriminalCases(Set<CriminalCase> criminalCases) {
        this.criminalCases = criminalCases;
    }

    public Set<TrackEntry> getTrackEntries() {
        return trackEntries;
    }

    public void setTrackEntries(Set<TrackEntry> trackEntries) {
        this.trackEntries = trackEntries;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Detective detective = (Detective) o;
        return Objects.equals(username, detective.username) && Objects.equals(firstName, detective.firstName) &&
                Objects.equals(lastName, detective.lastName) && Objects.equals(password, detective.password) &&
                Objects.equals(hiringDate, detective.hiringDate) && Objects.equals(badgeNumber, detective.badgeNumber)
                && rank == detective.rank && Objects.equals(armed, detective.armed) && status == detective.status
                && Objects.equals(criminalCases, detective.criminalCases)
                && Objects.equals(trackEntries, detective.trackEntries);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, firstName, lastName, password, hiringDate, badgeNumber, rank, armed, status,
                criminalCases, trackEntries);
    }

    public void replace(Detective detective){
        this.id = detective.getId();
        this.version = detective.getVersion();
        this.createdAt = detective.getCreatedAt();
        this.modifiedAt = detective.getModifiedAt();

        this.username = detective.getUsername();
        this.firstName = detective.getFirstName();
        this.lastName = detective.getLastName();
        this.password = detective.getPassword();
        this.hiringDate = detective.getHiringDate();
        this.badgeNumber = detective.getBadgeNumber();
        this.rank = detective.getRank();
        this.armed = detective.getArmed();
        this.status = detective.getStatus();
        this.criminalCases = detective.getCriminalCases();
        this.trackEntries = detective.getTrackEntries();

    }
}
