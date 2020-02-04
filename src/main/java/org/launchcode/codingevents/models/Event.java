package org.launchcode.codingevents.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
// import javax.persistence.GeneratedValue;
// import javax.persistence.Id;
import javax.persistence.ManyToOne;
// import javax.validation.constraints.Email;
import javax.persistence.OneToOne;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
// import java.util.Objects;

@Entity
public class Event extends AbstractEntity {

//    @Id
//    @GeneratedValue
//    private int id;

//    private static int nextId = 1;

    @NotBlank(message = "Name is required.")
    @Size(min = 3, max = 50, message = "Name must be between 3 and 50 characters.")
    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    @Valid
    @NotNull(message = "Event details are required.")
    private EventDetails eventDetails;

//    @Size(max = 500, message = "Description too long!")
//    private String description;

//    @NotBlank(message = "Email is required.")
//    @Email(message = "Invalid email.  Try again.")

//    private String contactEmail;

    @ManyToOne
    @NotNull(message = "Category is required.")
    private EventCategory eventCategory;
//    private EventType type;

    public Event(String name, EventCategory eventCategory) {
//    public Event(String name, EventDetails eventDetails, EventCategory eventCategory) {
//    public Event(String name, String description, String contactEmail, EventCategory eventCategory) {
//    public Event(String name, String description, String contactEmail, EventType type) {
//        this();

        this.name = name;
//        this.eventDetails = eventDetails;
//        this.description = description;
//        this.contactEmail = contactEmail;
        this.eventCategory = eventCategory;
//        this.type = type;
    }


    public Event() {
//        this.id = nextId;
//        nextId++;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EventDetails getEventDetails() {
        return eventDetails;
    }

    public void setEventDetails(EventDetails eventDetails) {
        this.eventDetails = eventDetails;
    }

    //    public String getDescription() {
//        return description;
//    }

//    public void setDescription(String description) {
//        this.description = description;
//    }

//    public String getContactEmail() {
//        return contactEmail;
//    }

//    public void setContactEmail(String contactEmail) {
//        this.contactEmail = contactEmail;
//    }

    public EventCategory getEventCategory() {
        return eventCategory;
    }

    public void setEventCategory(EventCategory eventCategory) {
        this.eventCategory = eventCategory;
    }

    //    public EventType getType() {
//        return type;
//    }

//    public void setType(EventType type) {
//        this.type = type;
//    }

//    public int getId() {
//        return id;
//    }

    @Override
    public String toString() {
        return name;
    }


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

}
