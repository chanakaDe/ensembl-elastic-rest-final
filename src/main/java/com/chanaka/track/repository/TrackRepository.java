package com.chanaka.track.repository;

import com.chanaka.track.model.Track;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

/**
 * Created by chanaka on 7/17/17.
 */
public interface TrackRepository extends ElasticsearchRepository<Track, String> {

    List<Track> findByDescription(String description, String track_type);

}
