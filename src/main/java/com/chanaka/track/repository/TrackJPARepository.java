package com.chanaka.track.repository;

import com.chanaka.track.model.TrackJPA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by chanaka on 7/27/17.
 */
public interface TrackJPARepository extends JpaRepository<TrackJPA, Integer> {

    @Query(value = "select release_id from track_has_release where track_id = :trackId", nativeQuery = true)
    public Integer findByReleaseId(@Param("trackId") Integer trackId);
}
