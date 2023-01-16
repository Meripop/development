package Task5;

public class Form {
    private String email;
    private String name;
    private String birthday;
    private String workPlace;
    private int phoneNumber;


    public Form(String email, String name, String birthday) {
        this.email = email;
        this.name = name;
        this.birthday = birthday;
    }


    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public String getWorkPlace() {
        return workPlace;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWorkPlace(String workPlace) {
        this.workPlace = workPlace;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "registration.Form{" +
                "email='" + email + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", workPlace='" + workPlace + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }
}
