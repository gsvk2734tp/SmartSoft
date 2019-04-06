package ru.smart_soft.csv_parser.repository.datajpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ru.smart_soft.csv_parser.model.Event;
import ru.smart_soft.csv_parser.repository.EventRepository;

import java.util.List;

@Repository
public class DataJpaEventImpl implements EventRepository {

    @Autowired
    private CrudEventRepository repository;


    @Override
    @Transactional
    public Event save(Event event) {
        return repository.save(event);
    }

    @Override
    @Transactional
    public void deleteAll() {
        repository.deleteAll();
    }

    @Override
    @Transactional
    public List<Event> findAll() {
        return repository.findAll();
    }
}
