package org.launchcode.codingevents.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

<<<<<<< HEAD
/**
 * Created by Chris Bay
 */
@Entity
public class Event extends AbstractEntity {

//    @Id
//    @GeneratedValue
//    private int id;

    @NotBlank(message = "Name is required")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters")
=======
@Entity
public class Event {

    @Id
    @GeneratedValue
    private int id;

//    private static int nextId = 1;

    @NotBlank(message = "Name is required.")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters.")
>>>>>>> 0d0b1ee592402a5d50e0ec82c5e67377a33527d5
    private String name;

    @Size(max = 500, message = "Description too long!")
    private String description;

<<<<<<< HEAD
    @NotBlank(message = "Email is required")
    @Email(message = "Invalid email. Try again.")
=======
    @NotBlank(message = "Email is required.")
    @Email(message = "Invalid email.  Try again.")
>>>>>>> 0d0b1ee592402a5d50e0ec82c5e67377a33527d5
    private String contactEmail;

    private EventType type;

    public Event(String name, String description, String contactEmail, EventType type) {
<<<<<<< HEAD
=======
//        this();
>>>>>>> 0d0b1ee592402a5d50e0ec82c5e67377a33527d5
        this.name = name;
        this.description = description;
        this.contactEmail = contactEmail;
        this.type = type;
    }

<<<<<<< HEAD
    public Event() {}
=======
    public Event() {
//        this.id = nextId;
//        nextId++;
    }
>>>>>>> 0d0b1ee592402a5d50e0ec82c5e67377a33527d5

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    public EventType getType() {
        return type;
    }

    public void setType(EventType type) {
        this.type = type;
    }

<<<<<<< HEAD
//    public int getId() {
//        return id;
//    }
=======
    public int getId() {
        return id;
    }


>>>>>>> 0d0b1ee592402a5d50e0ec82c5e67377a33527d5

    @Override
    public String toString() {
        return name;
    }

<<<<<<< HEAD
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Event event = (Event) o;
//        return id == event.id;
//    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
=======
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Event event = (Event) o;
        return id == event.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
>>>>>>> 0d0b1ee592402a5d50e0ec82c5e67377a33527d5
}
