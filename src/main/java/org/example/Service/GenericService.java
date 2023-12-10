package org.example.Service;

import org.example.Enum.Gender;

import java.util.List;

public interface GenericService <T>{
    String add(List<T> t);
    T getById(Long id);
    List<T> getAll();
    List<T> sortByName();
    List<T> filterByGender();
    List<T> clear();
}
