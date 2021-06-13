package org;

import org.Data.Human.Gender;
import org.objects.User;
import org.utils.UserDataRepresent;

import java.util.logging.Logger;

public class AppRunner {

    public static final Logger LOGGER = Logger.getLogger(AppRunner.class.getName());

    public static void main(String[] args) {
        // User Nastya
        User userNastya = new User("Nastya", "Borodai",
                17, 11.0, Gender.FEMALE,
                170.0, 62.0);
        UserDataRepresent.representDataset(userNastya);

        //User Max
        User userMax = new User("Max", "Khodakov",
                17, 11.0, Gender.MAlE,
                180.0, 75.0);
        UserDataRepresent.representDataset(userMax);
    }
}