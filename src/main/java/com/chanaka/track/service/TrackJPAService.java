package com.chanaka.track.service;

import com.chanaka.track.model.GenomeJPA;
import com.chanaka.track.model.LocationJPA;
import com.chanaka.track.model.ReleaseJPA;
import com.chanaka.track.model.TrackJPA;
import com.chanaka.track.repository.GenomeJPARepository;
import com.chanaka.track.repository.LocationJPARepository;
import com.chanaka.track.repository.ReleaseJPARepository;
import com.chanaka.track.repository.TrackJPARepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by chanaka on 7/27/17.
 */

@org.springframework.stereotype.Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class TrackJPAService {

    @Autowired
    private TrackJPARepository trackJPARepository;
    
    @Autowired
    private GenomeJPARepository genomeJPARepository;
    
    @Autowired
    private LocationJPARepository locationJPARepository;
    
    @Autowired
    private ReleaseJPARepository releaseJPARepository;

    public List<TrackJPA> findAlLTracks() {
        return trackJPARepository.findAll();
    }

    public GenomeJPA findGenomesFindOne(Integer genome_id) {
        return genomeJPARepository.findOne(genome_id);
    }

    public LocationJPA findLocationsFindOne(Integer location_id) {
        return locationJPARepository.findOne(location_id);
    }

    public ReleaseJPA findReleaseFindOne(Integer release_id) {
        return releaseJPARepository.findByReleaseId(release_id);
    }
    
    public Integer getReleaseId(Integer track_id) {
        return trackJPARepository.findByReleaseId(track_id);
    }

}
