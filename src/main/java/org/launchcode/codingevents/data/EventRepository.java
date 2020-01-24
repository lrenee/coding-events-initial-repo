package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {
}



// public class MyRepository implements EventRepository {}
// we don't have this!  Instead...  SpringBoot knows to do this automatically
// because we are extending the CrudRepository...

