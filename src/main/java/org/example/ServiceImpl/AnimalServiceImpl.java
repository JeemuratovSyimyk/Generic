package org.example.ServiceImpl;

import org.example.Entity.Animal;
import org.example.Entity.Person;
import org.example.Enum.Gender;
import org.example.Service.GenericService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class AnimalServiceImpl implements GenericService<Animal> {
  Scanner scanner = new Scanner(System.in);
  int num;
    private List<Animal> animals = new ArrayList<>();
    @Override
    public String add(List<Animal> t) {
      animals.addAll(t);
        return null;
    }

    @Override
    public Animal getById(Long id) {
        for(Animal animal: animals){
          if(animal.getId().equals(id)){
            System.out.println(animal);
          }
        }
      return null;
    }

    @Override
    public List<Animal> getAll() {
        return animals;
    }

  @Override
  public List<Animal> sortByName() {
    System.out.println("""
                Choose:
                1 - By ascending
                2 - By descending""");
    int num = scanner.nextInt();
    if (num==1) {
      animals.sort(Comparator.comparing(Animal::getName));
    } else if (num == 2) {
      animals.sort(Comparator.comparing(Animal::getName));
     for (Animal animal: animals){
       System.out.println(animal.getName());
    }
  }
      return null;
  }

    @Override
    public List<Animal> filterByGender() {
      String inputGender = scanner.nextLine();
      List<Animal> filteredPeople = new ArrayList<>();
      for (Animal animal : animals) {
        if (inputGender.equalsIgnoreCase(animal.getGender().name())) {
          System.out.println(animal);
          filteredPeople.add(animal);
        }
      }
        return filteredPeople;
      }
    @Override
    public List<Animal> clear() {
       animals.clear();
        return animals;
    }


  }

