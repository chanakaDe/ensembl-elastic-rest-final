package com.chanaka.track.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

/**
 * Created by chanaka on 7/27/17.
 */

@Entity
@Table(name = "genome")
public class GenomeJPA {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "genome_id")
    private Integer genome_id;

    @Size(max = 100)
    @Column(name = "genome_species")
    private String genome_species;

    @Size(max = 100)
    @Column(name = "genome_assembly")
    private String genome_assembly;

    @Size(max = 10)
    @Column(name = "genome_strain")
    private String genome_strain;

    @Size(max = 11)
    @Column(name = "species_id")
    private String species_id;

    public GenomeJPA() {
    }

    public GenomeJPA(String genome_species, String genome_assembly, String genome_strain, String species_id) {
        this.genome_species = genome_species;
        this.genome_assembly = genome_assembly;
        this.genome_strain = genome_strain;
        this.species_id = species_id;
    }

    public Integer getGenome_id() {
        return genome_id;
    }

    public void setGenome_id(Integer genome_id) {
        this.genome_id = genome_id;
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

    public String getGenome_strain() {
        return genome_strain;
    }

    public void setGenome_strain(String genome_strain) {
        this.genome_strain = genome_strain;
    }

    public String getSpecies_id() {
        return species_id;
    }

    public void setSpecies_id(String species_id) {
        this.species_id = species_id;
    }

    @Override
    public String toString() {
        return "GenomeJPA{" +
                "genome_id=" + genome_id +
                ", genome_species='" + genome_species + '\'' +
                ", genome_assembly='" + genome_assembly + '\'' +
                ", genome_strain='" + genome_strain + '\'' +
                ", species_id='" + species_id + '\'' +
                '}';
    }
}
