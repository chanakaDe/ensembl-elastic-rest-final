/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.chanaka.track.repository;

import com.chanaka.track.model.LocationJPA;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by chanaka on 7/27/17.
 */
public interface LocationJPARepository extends JpaRepository<LocationJPA, Integer>{
    
}
