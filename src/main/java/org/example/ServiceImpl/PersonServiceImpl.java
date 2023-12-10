package org.example.ServiceImpl;

import org.example.Entity.Person;
import org.example.Enum.Gender;
import org.example.Service.GenericService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PersonServiceImpl implements GenericService<Person> {
    Scanner scanner = new Scanner(System.in);
    int num;
    private List<Person> persons = new ArrayList<>();

    @Override
    public String add(List<Person> t) {
        persons.addAll(t);
        return "Persons added successfully";
    }

    @Override
    public Person getById(Long id) {
        for (Person person : persons) {
            if (person.getId().equals(id)) {
                System.out.println(person);
            }
        }
        System.out.println("Get by human and animal ID");
        return null;
    }

    @Override
    public List<Person> getAll() {
        return persons;
    }

    @Override
    public List<Person> sortByName() {
        System.out.println("""
                Choose:
                1 - By ascending
                2 - By descending""");

        int num = scanner.nextInt();
        if (num == 1) {
            persons.sort(Comparator.comparing(Person::getName));
        } else if (num == 2) {
            persons.sort(Comparator.comparing(Person::getName).reversed());
        } else {
            System.out.println("Wrong choice. Please select a valid option.");
        }
        for (Person person : persons) {
            System.out.println(person.getName());
        }
        return null;
    }
    @Override
    public List<Person> filterByGender() {
        System.out.println("Enter gender to filter");
     String filterGender = scanner.nextLine();
     List<Person> people = new ArrayList<>();
     for (Person person: people){
       if(filterGender.equalsIgnoreCase(person.getGender().name())){
           System.out.println(person);
          people.add(person);
       }
   }
        return people;
    }
    @Override
    public List<Person> clear() {
        persons.clear();
        System.out.println("List of persons cleared");
        return persons;
    }


}
