package com.fhir.poc.appointment.fhir.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;

@Document
public class Patient {
    @Id
    private String id;
    private String resourceType;

    Text TextObject;
    ArrayList< Object > identifier = new ArrayList <> ();
    private boolean active;
    ArrayList < Object > name = new ArrayList <> ();
    ArrayList < Object > telecom = new ArrayList <> ();
    private String gender;
    private String birthDate;
    _birthDate _birthDateObject;
    private boolean deceasedBoolean;
    ArrayList < Object > address = new ArrayList <> ();
    ArrayList < Object > contact = new ArrayList <> ();
    ManagingOrganization ManagingOrganizationObject;


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

    public boolean getActive() {
        return active;
    }

    public String getGender() {
        return gender;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public _birthDate get_birthDate() {
        return _birthDateObject;
    }

    public boolean getDeceasedBoolean() {
        return deceasedBoolean;
    }

    public ManagingOrganization getManagingOrganization() {
        return ManagingOrganizationObject;
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

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public void set_birthDate(_birthDate _birthDateObject) {
        this._birthDateObject = _birthDateObject;
    }

    public void setDeceasedBoolean(boolean deceasedBoolean) {
        this.deceasedBoolean = deceasedBoolean;
    }

    public void setManagingOrganization(ManagingOrganization managingOrganizationObject) {
        this.ManagingOrganizationObject = managingOrganizationObject;
    }
    class _birthDate {
        ArrayList < Object > extension = new ArrayList <> ();


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
    class ManagingOrganization {
        private String reference;


        // Getter Methods

        public String getReference() {
            return reference;
        }

        // Setter Methods

        public void setReference(String reference) {
            this.reference = reference;
        }

    }
}
