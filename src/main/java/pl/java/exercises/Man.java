package pl.java.exercises;

/**
 * Class which represents men.
 */

public class Man extends Human {
    private String height;

    public Man() {}

    public Man(String name, String surname, String height) {
        super(name, surname);
        this.height = height;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Man{" +
                "height='" + height + '\'' +
                '}' + "Name=" + this.getName() + " Surname=" + this.getSurname();
    }
}
