package ru.liga.repository;

import ru.liga.model.Anketa;

import java.util.List;

public interface AnketaRepository {
    List<Anketa> findPeople(String sex);
    int countRate();
}
