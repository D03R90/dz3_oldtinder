package ru.liga.repository.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.stereotype.Repository;
import ru.liga.model.Anketa;
import ru.liga.repository.AnketaRepository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class AnketaImpl implements AnketaRepository {
    @Autowired
    private final EntityManager entityManager;
    @Override
    public List<Anketa> findPeople(String sex){
        return entityManager.createQuery("select * from old_tinder;", Anketa.class).getResultList();
    }
    @Override
    public int countRate() {
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriver(new org.postgresql.Driver());
        dataSource.setUrl("jdbc:postgresql://localhost:5432/league_db");
        dataSource.setUsername("admin");
        dataSource.setPassword("qwerty$4");
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        int i = jdbcTemplate.queryForObject("SELECT count(*) FROM old_tinder", Integer.class);
        return i;
    }
}
