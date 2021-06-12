package org.objects;

import org.Data.Human.Gender;
import org.Data.Human.humanMath;
import org.AppRunner;

import java.util.logging.Logger;

public class User implements humanMath {
    public static final Logger LOGGER = Logger.getLogger(AppRunner.class.getName());

    private String firstName;
    private String secondName;
    private Integer age;
    private Double averageMark;
    private Gender gender;
    private Double height;
    private Double mass;

    public User() {
    }

    public User(String firstName, String secondName, Integer age,
                Double averageMark, Gender gender,
                Double height, Double mass) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
        this.averageMark = averageMark;
        this.gender = gender;
        this.height = height;
        this.mass = mass;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getMass() {
        return mass;
    }

    public void setMass(Double mass) {
        this.mass = mass;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getAverageMark() {
        return averageMark;
    }

    public void setAverageMark(Double averageMark) {
        this.averageMark = averageMark;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public double calcMassIndex(double height, double mass) {
        double index;
        User user = new User();
        user.setHeight(height);
        user.setMass(mass);

        index = user.getMass() / (user.getHeight()*user.getHeight());

        return index;
    }

    @Override
    public void analyzeIndex(double index) {
        if (index <= 16.49 && index > 0){
            LOGGER.info("Your mass index is very low.");
        }
        if (index <= 18.49 && index >= 16.5){
            LOGGER.info("Your mass index is low.");
        }
        if (index <= 24.99 && index >= 18.5){
            LOGGER.info("Your mass index is OK");
        }
        if (index <= 29.99 && index >= 25.0){
            LOGGER.info("Your mass index is pre-obesity");
        }
        if (index <= 34.99 && index >= 30.0){
            LOGGER.info("Your mass index is 1st rate obesity.");
        }
        if (index <= 39.99 && index >= 35.0){
            LOGGER.info("Your mass index is 2nd rate obesity");
        }
        if (index >= 40.0){
            LOGGER.info("Your mass index is 3d rate obesity.");
        }
    }
}