package pl.java.exercises;

/**
 * Class which represents women.
 */

public class Woman extends Human {
    private String beauty;

    public Woman() {}

    public Woman(String name, String surname, String beauty) {
        super (name, surname);
        this.beauty = beauty;
    }

    public String getBeauty() {
        return beauty;
    }

    public void setBeauty(String beauty) {
        this.beauty = beauty;
    }

    @Override
    public String toString() {
        return "Woman{" +
                "beauty='" + beauty + '\'' +
                '}' + "Name=" + this.getName() + " Surname=" + this.getSurname();
    }
}
