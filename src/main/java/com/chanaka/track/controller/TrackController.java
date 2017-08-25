package com.chanaka.track.controller;

import com.chanaka.track.model.Track;
import com.chanaka.track.service.TrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by chanaka on 7/17/17.
 */

@CrossOrigin
@RestController
@RequestMapping("/api/elastic-test/master/track")
public class TrackController {

    @Autowired
    private TrackService trackService;

    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Track> findAll() {
        return trackService.findAll();
    }

    @RequestMapping(value = "/find-by/{description}/{track_type}", method = RequestMethod.GET)
    public List<Track> findOne(@PathVariable String description, @PathVariable String track_type) {
        return trackService.findByDescription(description, track_type);
    }

    @RequestMapping(value = "/search_advanced", method = RequestMethod.GET)
    public List<Track> searchTracksByParams(@RequestParam(value = "text", required = true) String text,
                                            @RequestParam(value = "species", required = false) String species,
                                            @RequestParam(value = "type", required = false) String type,
                                            @RequestParam(value = "release", required = false) String release,
                                            @RequestParam(value = "division", required = false) String division) {
        return trackService.searchTracksByParams(text, species, type, release, division);
    }

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String paramsTest(@RequestParam(value = "param1", required = true) String param1, @RequestParam(value = "param2", required = false) String param2) {
        return param1 + " - " + param2;
    }

}
