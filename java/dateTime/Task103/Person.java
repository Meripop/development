package Task103;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

public class Person {
    String firstName;
    String lastName;
    String placeOfBirthday;
    LocalDate timeOfBirthday;
    List<String> favoriteMovies;
    boolean isHappy;
    int height;
    String favouriteSnailType;
    int numberOfYearlyBlackOut;

    public Person(String firstName, String lastName, String placeOfBirthday, LocalDate timeOfBirthday, List<String> favoriteMovies, boolean isHappy, int height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.placeOfBirthday = placeOfBirthday;
        this.timeOfBirthday = timeOfBirthday;
        this.favoriteMovies = favoriteMovies;
        this.isHappy = isHappy;
        this.height = height;
    }

    public void setFavouriteSnailType(String favouriteSnailType) {
        this.favouriteSnailType = favouriteSnailType;
    }

    public void setNumberOfYearlyBlackOut(int numberOfYearlyBlackOut) {
        this.numberOfYearlyBlackOut = numberOfYearlyBlackOut;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPlaceOfBirthday() {
        return placeOfBirthday;
    }

    public LocalDate getTimeOfBirthday() {
        return timeOfBirthday;
    }

    public List<String> getFavoriteMovies() {
        return favoriteMovies;
    }

    public boolean isHappy() {
        return isHappy;
    }

    public int getHeight() {
        return height;
    }

    public String getFavouriteSnailType() {
        return favouriteSnailType;
    }

    public int getNumberOfYearlyBlackOut() {
        return numberOfYearlyBlackOut;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", placeOfBirthday='" + placeOfBirthday + '\'' +
                ", timeOfBirthday=" + timeOfBirthday +
                ", favoriteMovies=" + favoriteMovies +
                ", isHappy=" + isHappy +
                ", height=" + height +
                ", favouriteSnailType='" + favouriteSnailType + '\'' +
                ", numberOfYearlyBlackOut=" + numberOfYearlyBlackOut +
                '}';
    }
}
