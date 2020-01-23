package org.launchcode.codingevents.data;

import org.launchcode.codingevents.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

<<<<<<< HEAD
/**
 * Created by Chris Bay
 */
@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {
}
=======
@Repository
public interface EventRepository extends CrudRepository<Event, Integer> {
}



// public class MyRepository implements EventRepository {}
// we don't have this!  Instead...  SpringBoot knows to do this automatically
// because we are extending the CrudRepository...

>>>>>>> 0d0b1ee592402a5d50e0ec82c5e67377a33527d5
