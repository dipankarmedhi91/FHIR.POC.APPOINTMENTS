package com.fhir.poc.appointment.fhir.models;

import java.util.ArrayList;

public class Appointment {
    private String resourceType;
    private String id;
    Text TextObject;
    private String status;
    ArrayList< Object > serviceCategory = new ArrayList <> ();
    ArrayList < Object > serviceType = new ArrayList <> ();
    ArrayList < Object > specialty = new ArrayList <> ();
    AppointmentType AppointmentTypeObject;
    ArrayList < Object > reasonReference = new ArrayList <> ();
    private float priority;
    private String description;
    private String start;
    private String end;
    private String created;
    private String comment;
    ArrayList < Object > basedOn = new ArrayList <> ();
    ArrayList < Object > participant = new ArrayList <> ();


    // Getter Methods

    public String getResourceType() {
        return resourceType;
    }

    public String getId() {
        return id;
    }

    public Text getText() {
        return TextObject;
    }

    public String getStatus() {
        return status;
    }

    public AppointmentType getAppointmentType() {
        return AppointmentTypeObject;
    }

    public float getPriority() {
        return priority;
    }

    public String getDescription() {
        return description;
    }

    public String getStart() {
        return start;
    }

    public String getEnd() {
        return end;
    }

    public String getCreated() {
        return created;
    }

    public String getComment() {
        return comment;
    }

    // Setter Methods

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setText(Text textObject) {
        this.TextObject = textObject;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAppointmentType(AppointmentType appointmentTypeObject) {
        this.AppointmentTypeObject = appointmentTypeObject;
    }

    public void setPriority(float priority) {
        this.priority = priority;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    class AppointmentType {
        ArrayList < Object > coding = new ArrayList <> ();


        // Getter Methods



        // Setter Methods


    }

    class Text {
        private String status;
        private String div;


        // Getter Methods

        public String getStatus() {
            return status;
        }

        public String getDiv() {
            return div;
        }

        // Setter Methods

        public void setStatus(String status) {
            this.status = status;
        }

        public void setDiv(String div) {
            this.div = div;
        }
    }
}