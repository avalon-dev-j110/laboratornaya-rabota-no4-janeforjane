package ru.avalon.java.dev.j10.labs;

import java.util.Date;

public class Girls implements Person {

    private String name;
    private Date birthDate;

    public Girls(String name, Date birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    @Override
    public String getName() {

        return name;
    }

    @Override
    public Date getBirthDate() {
        return birthDate;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof Girls) {

            Girls girl = (Girls) o;
            return this.birthDate.compareTo(girl.birthDate);

        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Girls{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate +
                '}';
    }
}
