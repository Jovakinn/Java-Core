package org.utils;

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
