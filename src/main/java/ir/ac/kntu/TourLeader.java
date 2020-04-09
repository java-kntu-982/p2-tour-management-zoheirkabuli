package ir.ac.kntu;

import java.util.ArrayList;

public class TourLeader {
    private String firstName,lastName,nationalNumber,idNumber;
    private Date born,recruitment;
    private boolean isMarried;
    private ArrayList<Region> places;

    public TourLeader(String firstName, String lastName,
                      String nationalNumber, String idNumber, Date born,
                      Date recruitment, boolean isMarried, ArrayList<Region> places) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nationalNumber = nationalNumber;
        this.idNumber = idNumber;
        this.born = born;
        this.recruitment = recruitment;
        this.isMarried = isMarried;
        this.places = places;
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

    public String getNationalNumber() {
        return nationalNumber;
    }

    public void setNationalNumber(String nationalNumber) {
        this.nationalNumber = nationalNumber;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Date getBorn() {
        return born;
    }

    public void setBorn(Date born) {
        this.born = born;
    }

    public Date getRecruitment() {
        return recruitment;
    }

    public void setRecruitment(Date recruitment) {
        this.recruitment = recruitment;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    public ArrayList<Region> getPlaces() {
        return places;
    }

    public void setPlaces(ArrayList<Region> places) {
        this.places = places;
    }

    @Override
    public String toString() {
        return  firstName + " " + lastName + "\nBorn :" + born;
    }
}
