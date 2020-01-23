package org.launchcode.codingevents.models;

<<<<<<< HEAD
/**
 * Created by Chris Bay
 */
=======
>>>>>>> 0d0b1ee592402a5d50e0ec82c5e67377a33527d5
public enum EventType {

    CONFERENCE("Conference"),
    MEETUP("Meetup"),
    WORKSHOP("Workshop"),
    SOCIAL("Social");

    private final String displayName;

    EventType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
<<<<<<< HEAD
=======

>>>>>>> 0d0b1ee592402a5d50e0ec82c5e67377a33527d5
}
