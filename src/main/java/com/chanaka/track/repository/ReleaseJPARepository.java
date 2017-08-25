/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chanaka.track.repository;

import com.chanaka.track.model.ReleaseJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by chanaka on 7/27/17.
 */
public interface ReleaseJPARepository extends JpaRepository<ReleaseJPA, Integer> {

    @Query(value = "select * from `release` where release_id = :releaseId", nativeQuery = true)
    public ReleaseJPA findByReleaseId(@Param("releaseId") Integer releaseId);
}
