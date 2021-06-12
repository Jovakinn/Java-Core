package org.objects;

import org.Data.Animal.Animal;
import org.Data.Dog.breedsOfDog;
import org.Data.Dog.colorOfDogEyes;
import org.AppRunner;
import java.util.logging.Logger;

public class Dog implements Animal {
    public static final Logger LOGGER = Logger.getLogger(AppRunner.class.getName());

    @Override
    public void makeNoise() {
        LOGGER.info("Woof");
    }

    private String Name;
    private String Nickname;
    private Integer Age;
    private colorOfDogEyes colorOfDogEyes;
    private Boolean handicapped;
    private breedsOfDog breedsOfDog;

    public Dog(String name, String nickname,
               Integer age, org.Data.Dog.colorOfDogEyes colorOfDogEyes,
               Boolean handicapped, org.Data.Dog.breedsOfDog breedsOfDog) {
        Name = name;
        Nickname = nickname;
        Age = age;
        this.colorOfDogEyes = colorOfDogEyes;
        this.handicapped = handicapped;
        this.breedsOfDog = breedsOfDog;
    }

    public Dog() {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNickname() {
        return Nickname;
    }

    public void setNickname(String nickname) {
        Nickname = nickname;
    }

    public Integer getAge() {
        return Age;
    }

    public void setAge(Integer age) {
        Age = age;
    }

    public org.Data.Dog.colorOfDogEyes getColorOfDogEyes() {
        return colorOfDogEyes;
    }

    public void setColorOfDogEyes(org.Data.Dog.colorOfDogEyes colorOfDogEyes) {
        this.colorOfDogEyes = colorOfDogEyes;
    }

    public Boolean getHandicapped() {
        return handicapped;
    }

    public void setHandicapped(Boolean handicapped) {
        this.handicapped = handicapped;
    }

    public org.Data.Dog.breedsOfDog getBreedsOfDog() {
        return breedsOfDog;
    }

    public void setBreedsOfDog(org.Data.Dog.breedsOfDog breedsOfDog) {
        this.breedsOfDog = breedsOfDog;
    }
}
