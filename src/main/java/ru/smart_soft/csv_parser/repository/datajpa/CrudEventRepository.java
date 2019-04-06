package ru.smart_soft.csv_parser.repository.datajpa;

import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
import ru.smart_soft.csv_parser.model.Event;

import java.util.List;

@Transactional(readOnly = true)
public interface CrudEventRepository extends JpaRepository<Event, Integer> {

    @Override
    @Transactional
    Event save(Event event);

    @Override
    @Transactional
    void deleteAll();

    //TODO group by ID
    @Override
    List<Event> findAll();

    //List<Event> findTopFiveForm();

}
