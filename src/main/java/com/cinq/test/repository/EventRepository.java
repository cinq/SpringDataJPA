package com.cinq.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.cinq.test.domain.Event;

public interface EventRepository extends CrudRepository<Event, Long>{

}
