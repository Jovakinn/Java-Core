package org.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

public class DataKey {
    private static final Logger LOGGER = Logger.getLogger(DataKey.class.getName());

    private String name;
    private Integer id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public static Map<DataKey, Integer> getAllData(){
        Map<DataKey, Integer> dataKeyIntegerMap = new HashMap<>();
        DataKey dataKey = new DataKey();

        dataKey.setId(1);
        dataKey.setName("Silverman");

        LOGGER.info("Data key's hashcode is: " + dataKey.hashCode());
        dataKeyIntegerMap.put(dataKey, 10);

        return dataKeyIntegerMap;
    }

    /**
     * @author Maksym Khodakov recommended use of this method to check whether
     * the file testFile.txt is in your project
     */
    public static void putAndGetData() {
        StringBuilder stringBuilder = new StringBuilder();
        File file = new File("testFile.txt");

        LOGGER.info("Object file created");
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        LOGGER.info("Stream created");

            try {
                assert fileInputStream != null;
                stringBuilder.append(fileInputStream.read());
            } catch (IOException e) {
                e.printStackTrace();
            }
            LOGGER.info("Info is reading");
    }

    @Override
    public String toString() {
        return "DataKey: [name = " + getName() + ", id = " + getId() + "]";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DataKey)) return false;
        DataKey dataKey = (DataKey) o;
        return getName().equals(dataKey.getName()) && getId().equals(dataKey.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getId());
    }
}
