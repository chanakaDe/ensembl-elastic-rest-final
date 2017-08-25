/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chanaka.track.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by chanaka on 7/27/17.
 */
@Entity
@Table(name = "release")
public class ReleaseJPA implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "release_id")
    private Integer releaseId;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "release_division")
    private String releaseDivision;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "release_version")
    private int releaseVersion;

    public ReleaseJPA() {
    }

    public ReleaseJPA(Integer releaseId) {
        this.releaseId = releaseId;
    }

    public ReleaseJPA(Integer releaseId, String releaseDivision, int releaseVersion) {
        this.releaseId = releaseId;
        this.releaseDivision = releaseDivision;
        this.releaseVersion = releaseVersion;
    }

    public Integer getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(Integer releaseId) {
        this.releaseId = releaseId;
    }

    public String getReleaseDivision() {
        return releaseDivision;
    }

    public void setReleaseDivision(String releaseDivision) {
        this.releaseDivision = releaseDivision;
    }

    public int getReleaseVersion() {
        return releaseVersion;
    }

    public void setReleaseVersion(int releaseVersion) {
        this.releaseVersion = releaseVersion;
    }

}
