package com.chanaka.track.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by chanaka on 7/27/17.
 */
@Entity
@Table(name = "track")
public class TrackJPA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "track_id")
    private Integer track_id;

    @Size(max = 45)
    @Column(name = "version")
    private String version;

    @Size(max = 50)
    @Column(name = "short_name")
    private String short_name;

    @Size(max = 100)
    @Column(name = "long_name")
    private String long_name;

    @Size(max = 1000)
    @Column(name = "description")
    private String description;

    @Size(max = 11)
    @Column(name = "genome_id")
    private Integer genome_id;

    @Size(max = 11)
    @Column(name = "location_id")
    private Integer location_id;

    @Size(max = 11)
    @Column(name = "track_type_id")
    private Integer track_type_id;

    public TrackJPA() {
    }

    public TrackJPA(Integer track_id, String version, String short_name, String long_name, String description, Integer genome_id, Integer location_id, Integer track_type_id) {
        this.track_id = track_id;
        this.version = version;
        this.short_name = short_name;
        this.long_name = long_name;
        this.description = description;
        this.genome_id = genome_id;
        this.location_id = location_id;
        this.track_type_id = track_type_id;
    }

    public Integer getTrack_id() {
        return track_id;
    }

    public void setTrack_id(Integer track_id) {
        this.track_id = track_id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public String getLong_name() {
        return long_name;
    }

    public void setLong_name(String long_name) {
        this.long_name = long_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getGenome_id() {
        return genome_id;
    }

    public void setGenome_id(Integer genome_id) {
        this.genome_id = genome_id;
    }

    public Integer getLocation_id() {
        return location_id;
    }

    public void setLocation_id(Integer location_id) {
        this.location_id = location_id;
    }

    public Integer getTrack_type_id() {
        return track_type_id;
    }

    public void setTrack_type_id(Integer track_type_id) {
        this.track_type_id = track_type_id;
    }

    @Override
    public String toString() {
        return "TrackJPA{" + "track_id=" + track_id + ", version=" + version + ", short_name=" + short_name + ", long_name=" + long_name + ", description=" + description + ", genome_id=" + genome_id + ", location_id=" + location_id + ", track_type_id=" + track_type_id + '}';
    }

   
}
