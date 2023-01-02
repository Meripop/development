package abstractTask16;

public abstract class AbstractDog {
    protected String type;
    protected String name;
    protected String gender;
    protected String birthDay;
    protected Double weight;
    protected String additionalProperties;

    public AbstractDog(String type, String name, String gender, String birthDay, Double weight, String additionalProperties) {
        this.type = type;
        this.name = name;
        this.gender = gender;
        this.birthDay = birthDay;
        this.weight = weight;
        this.additionalProperties = additionalProperties;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getAdditionalProperties() {
        return additionalProperties;
    }

    public void setAdditionalProperties(String additionalProperties) {
        this.additionalProperties = additionalProperties;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDay='" + birthDay + '\'' +
                ", weight=" + weight +
                ", additionalProperties='" + additionalProperties + '\'' +
                '}';
    }
}
