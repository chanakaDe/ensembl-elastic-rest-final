package com.chanaka.track.service;

import com.chanaka.track.model.Track;

import java.util.List;

/**
 * Created by chanaka on 7/17/17.
 */
public interface TrackService {

    Track save(Track track);

    Track findOne(int id);

    Iterable<Track> findAll();

    List<Track> findByDescription(String description, String track_type);

    List<Track> searchTracksByParams(String text, String species, String type, String release, String division);
}
