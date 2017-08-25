package com.chanaka.track.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by chanaka on 7/27/17.
 */

@Entity
@Table(name = "location")
public class LocationJPA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "location_id")
    private Integer location_id;

    @Size(max = 10)
    @Column(name = "location_type")
    private String location_type;

    @Size(max = 100)
    @Column(name = "location_object_type")
    private String location_object_type;

    @Size(max = 100)
    @Column(name = "location_species")
    private String location_species;

    @Size(max = 100)
    @Column(name = "location_dbtype")
    private String location_dbtype;

    @Size(max = 255)
    @Column(name = "location_uri")
    private String location_uri;

    public LocationJPA() {
    }

    public LocationJPA(String location_type, String location_object_type, String location_species, String location_dbtype, String location_uri) {
        this.location_type = location_type;
        this.location_object_type = location_object_type;
        this.location_species = location_species;
        this.location_dbtype = location_dbtype;
        this.location_uri = location_uri;
    }

    public Integer getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Integer location_id) {
        this.location_id = location_id;
    }

    public String getLocation_type() {
        return location_type;
    }

    public void setLocation_type(String location_type) {
        this.location_type = location_type;
    }

    public String getLocation_object_type() {
        return location_object_type;
    }

    public void setLocation_object_type(String location_object_type) {
        this.location_object_type = location_object_type;
    }

    public String getLocation_species() {
        return location_species;
    }

    public void setLocation_species(String location_species) {
        this.location_species = location_species;
    }

    public String getLocation_dbtype() {
        return location_dbtype;
    }

    public void setLocation_dbtype(String location_dbtype) {
        this.location_dbtype = location_dbtype;
    }

    public String getLocation_uri() {
        return location_uri;
    }

    public void setLocation_uri(String location_uri) {
        this.location_uri = location_uri;
    }

    @Override
    public String toString() {
        return "LocationJPA{" +
                "location_id=" + location_id +
                ", location_type='" + location_type + '\'' +
                ", location_object_type='" + location_object_type + '\'' +
                ", location_species='" + location_species + '\'' +
                ", location_dbtype='" + location_dbtype + '\'' +
                ", location_uri='" + location_uri + '\'' +
                '}';
    }
}
