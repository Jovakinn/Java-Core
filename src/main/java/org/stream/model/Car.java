package org.stream.model;

import org.stream.model.CarCompanies.Companies;

import java.util.Objects;

public class Car {
    private String number;
    private Integer year;
    private Companies company;

    public Car(String number, Integer year, Companies company) {
        this.number = number;
        this.year = year;
        this.company = company;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "number='" + number + '\'' +
                ", year=" + year +
                ", company=" + company +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return Objects.equals(getNumber(), car.getNumber()) && Objects.equals(getYear(), car.getYear()) && getCompany() == car.getCompany();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber(), getYear(), getCompany());
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Companies getCompany() {
        return company;
    }

    public void setCompany(Companies company) {
        this.company = company;
    }
}
