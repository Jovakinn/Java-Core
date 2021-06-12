package org.objects;

import org.Data.Cat.breedsOfCat;
import org.Data.Animal.Animal;
import org.Data.Cat.colorOfCatEyes;
import org.AppRunner;
import java.util.logging.Logger;

public class Cat implements Animal {
    public static final Logger LOGGER = Logger.getLogger(AppRunner.class.getName());

    @Override
    public void makeNoise() {
        LOGGER.info("Meow");
    }

    private String Name;
    private String Nickname;
    private Integer Age;
    private colorOfCatEyes colorOfCatEyes;
    private Boolean handicapped;
    private breedsOfCat breedsOfCat;

    public Cat() {
    }

    public Cat(String name, String nickname, Integer age,
               org.Data.Cat.colorOfCatEyes colorOfCatEyes, Boolean handicapped,
               org.Data.Cat.breedsOfCat breedsOfCat) {
        Name = name;
        Nickname = nickname;
        Age = age;
        this.colorOfCatEyes = colorOfCatEyes;
        this.handicapped = handicapped;
        this.breedsOfCat = breedsOfCat;
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

    public org.Data.Cat.colorOfCatEyes getColorOfCatEyes() {
        return colorOfCatEyes;
    }

    public void setColorOfCatEyes(org.Data.Cat.colorOfCatEyes colorOfCatEyes) {
        this.colorOfCatEyes = colorOfCatEyes;
    }

    public Boolean getHandicapped() {
        return handicapped;
    }

    public void setHandicapped(Boolean handicapped) {
        this.handicapped = handicapped;
    }

    public org.Data.Cat.breedsOfCat getBreedsOfCat() {
        return breedsOfCat;
    }

    public void setBreedsOfCat(org.Data.Cat.breedsOfCat breedsOfCat) {
        this.breedsOfCat = breedsOfCat;
    }
}
