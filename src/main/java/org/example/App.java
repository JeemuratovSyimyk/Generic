package org.example;

import org.example.Entity.Animal;
import org.example.Entity.Person;
import org.example.Enum.Gender;
import org.example.ServiceImpl.AnimalServiceImpl;
import org.example.ServiceImpl.PersonServiceImpl;

import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        PersonServiceImpl personService = new PersonServiceImpl();
        Person person1 = new Person(1L, "Akylai", 12, Gender.FEMALE);
        Person person2 = new Person(2L, "Tahir", 21, Gender.MALE);
        Person person3 = new Person(3L, "Madlen", 23, Gender.FEMALE);
        Person person4 = new Person(4L, "Aika", 46, Gender.FEMALE);
        Person person5 = new Person(5L, "Tereza", 18, Gender.FEMALE);
        Person person6 = new Person(6L, "Nikolai", 23, Gender.MALE);

        AnimalServiceImpl animalService = new AnimalServiceImpl();
        Animal animal1 = new Animal(1L, "Hank", 2, Gender.FEMALE);
        Animal animal2 = new Animal(2L, "Tai", 4, Gender.MALE);
        Animal animal3 = new Animal(3L, "Reks", 2, Gender.MALE);
        Animal animal4 = new Animal(4L, "Kitty", 6, Gender.MALE);
        Animal animal5 = new Animal(5L, "Mops", 12, Gender.FEMALE);
        Animal animal6 = new Animal(6L, "Love", 1, Gender.FEMALE);

        int num;
        while (true) {
            System.out.println("""
                    Choose operation:
                    1-add
                    2-get by id
                    3-get all
                    4-sort by name
                    5-filter by gender
                    6-clear all""");
            num = scanner.nextInt();
            switch (num ) {
                case 1:
                    System.out.println("--------------------------------------------------------");
                    System.out.println("Add new person and animal");
                    personService.add(List.of(person1,person2,person3,person4,person5,person6));
                    animalService.add(List.of(animal1,animal2,animal3,animal4,animal5,animal6));
                    break;
                case 2:
                    System.out.println("--------------------------------------------------------");
                    personService.getById(1L);
                    animalService.getById(1L);
                   break;
                case 3:
                    System.out.println("--------------------------------------------------------");
                    System.out.println(personService.getAll());
                    System.out.println(animalService.getAll());
                case 4:
                    System.out.println("--------------------------------------------------------");
                    System.out.println(personService.sortByName());
                    System.out.println(animalService.sortByName());
                case 5:
                    System.out.println("--------------------------------------------------------");
                    System.out.println(personService.filterByGender());
                    System.out.println(animalService.filterByGender());
                case 6:
                    System.out.println("--------------------------------------------------------");
                    System.out.println(personService.clear());
                    System.out.println(animalService.clear());
            }
        }
    }
}
