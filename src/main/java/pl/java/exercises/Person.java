package pl.java.exercises;

/**
 * Created by Iza on 2016-10-30.
 */
public class Person {

    private String gender;
    private String name;
    private String surname;
    private int height;
    private int salary;
    private String company;
    private int weight;
    private String eyeColor;
    private String hairColor;

    public Person() {}

    public Person(String genderAsParam, String nameAsParam, String surnameAsParam, int heightAsParam, int salaryAsParam,
                  String companyAsParam, int weightAsParam, String eyeColorAsParam, String hairColorAsParam) {
        this.gender = genderAsParam;
        this.name = nameAsParam;
        this.surname = surnameAsParam;
        this.height = heightAsParam;
        this.salary = salaryAsParam;
        this.company = companyAsParam;
        this.weight = weightAsParam;
        this.eyeColor = eyeColorAsParam;
        this.hairColor = hairColorAsParam;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }

    public String getGender() {
        return gender;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getHeight() {
        return height;
    }

    public int getSalary() {
        return salary;
    }

    public String getCompany() {
        return company;
    }

    public int getWeight() {
        return weight;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    @Override
    public String toString() {
        return "Person{" +
                "gender='" + gender + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", height=" + height +
                ", salary=" + salary +
                ", company='" + company + '\'' +
                ", weight=" + weight +
                ", eyeColor='" + eyeColor + '\'' +
                ", hairColor='" + hairColor + '\'' +
                '}';
    }
}
