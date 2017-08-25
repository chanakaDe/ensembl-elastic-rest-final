package com.chanaka.track.model;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

/**
 * Created by chanaka on 7/17/17.
 */

@Document(indexName = "ensembl", type = "track")
public class Track {

    @Id
    private String id;
    private String short_name;
    private String long_name;
    private String description;
    private String track_type;
    
    private String genome_species;
    private String genome_assembly;
    private boolean genome_strain;
    
    private String release_division;
    private int release_version;
    
    private String location_type;
    private String location_object_type;
    private String location_species;
    private String location_dbtype;
    private String location_logic_names;

    public Track() {

    }
    public Track(String id, String short_name, String long_name, String description, String track_type, String genome_species, String genome_assembly, boolean genome_strain, String release_division, int release_version, String location_type, String location_object_type, String location_species, String location_dbtype, String location_logic_names) {
        this.id = id;
        this.short_name = short_name;
        this.long_name = long_name;
        this.description = description;
        this.track_type = track_type;
        this.genome_species = genome_species;
        this.genome_assembly = genome_assembly;
        this.genome_strain = genome_strain;
        this.release_division = release_division;
        this.release_version = release_version;
        this.location_type = location_type;
        this.location_object_type = location_object_type;
        this.location_species = location_species;
        this.location_dbtype = location_dbtype;
        this.location_logic_names = location_logic_names;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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
    public String getTrack_type() {
        return track_type;
    }
    public void setTrack_type(String track_type) {
        this.track_type = track_type;
    }
    public String getGenome_species() {
        return genome_species;
    }
    public void setGenome_species(String genome_species) {
        this.genome_species = genome_species;
    }
    public String getGenome_assembly() {
        return genome_assembly;
    }
    public void setGenome_assembly(String genome_assembly) {
        this.genome_assembly = genome_assembly;
    }
    public boolean isGenome_strain() {
        return genome_strain;
    }
    public void setGenome_strain(boolean genome_strain) {
        this.genome_strain = genome_strain;
    }
    public String getRelease_division() {
        return release_division;
    }
    public void setRelease_division(String release_division) {
        this.release_division = release_division;
    }
    public int getRelease_version() {
        return release_version;
    }
    public void setRelease_version(int release_version) {
        this.release_version = release_version;
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
    public String getLocation_logic_names() {
        return location_logic_names;
    }
    public void setLocation_logic_names(String location_logic_names) {
        this.location_logic_names = location_logic_names;
    }
    @Override
    public String toString() {
        return "Track{" +
                "id=" + id +
                ", short_name='" + short_name + '\'' +
                ", long_name='" + long_name + '\'' +
                ", description='" + description + '\'' +
                ", track_type='" + track_type + '\'' +
                ", genome_species='" + genome_species + '\'' +
                ", genome_assembly='" + genome_assembly + '\'' +
                ", genome_strain=" + genome_strain +
                ", release_division='" + release_division + '\'' +
                ", release_version=" + release_version +
                ", location_type='" + location_type + '\'' +
                ", location_object_type='" + location_object_type + '\'' +
                ", location_species='" + location_species + '\'' +
                ", location_dbtype='" + location_dbtype + '\'' +
                ", location_logic_names='" + location_logic_names + '\'' +
                '}';
    }
}
