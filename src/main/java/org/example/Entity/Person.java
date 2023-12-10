package org.example.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.example.Enum.Gender;
@Setter
@Getter
public class Person {
    private Long id;
    private String name;
    private int age;
    private Gender gender;

    public Person(Long id, String name, int age, Gender gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "\nPerson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
