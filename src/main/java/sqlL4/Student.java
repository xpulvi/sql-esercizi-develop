package sqlL4;

public class Student {

    protected String country;
    protected String last_name;
    protected String first_name;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public Student(String country, String last_name, String first_name) {
        this.country = country;
        this.last_name = last_name;
        this.first_name = first_name;
    }
}
