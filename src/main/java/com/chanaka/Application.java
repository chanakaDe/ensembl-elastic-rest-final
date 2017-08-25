package com.chanaka;

import com.chanaka.track.model.GenomeJPA;
import com.chanaka.track.model.LocationJPA;
import com.chanaka.track.model.ReleaseJPA;
import com.chanaka.track.model.Track;
import com.chanaka.track.model.TrackJPA;
import com.chanaka.track.service.TrackJPAService;
import com.chanaka.track.service.TrackService;
import org.elasticsearch.client.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;

import java.util.List;
import java.util.Map;

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private ElasticsearchOperations es;

    @Autowired
    private TrackJPAService trackJPAService;

    @Autowired
    private TrackService trackService;

    public static void main(String args[]) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        printElasticSearchInfo();

        List<TrackJPA> tracks = trackJPAService.findAlLTracks();

        for (TrackJPA track : tracks) {

            Track saveTrackData = new Track();
            saveTrackData.setShort_name(track.getShort_name());
            saveTrackData.setLong_name(track.getLong_name());
            saveTrackData.setDescription(track.getDescription());
            saveTrackData.setTrack_type(track.getTrack_type_id().toString());

            //set genome data
            GenomeJPA genomes = trackJPAService.findGenomesFindOne(track.getGenome_id());
            saveTrackData.setGenome_species(genomes.getGenome_species());
            saveTrackData.setGenome_assembly(genomes.getGenome_assembly());
            saveTrackData.setGenome_strain(Boolean.parseBoolean(genomes.getGenome_strain()));

            //set location data
            LocationJPA locations = trackJPAService.findLocationsFindOne(track.getLocation_id());
            saveTrackData.setLocation_type(locations.getLocation_type());
            saveTrackData.setLocation_object_type(locations.getLocation_object_type());
            saveTrackData.setLocation_species(locations.getLocation_species());
            saveTrackData.setLocation_dbtype(locations.getLocation_dbtype());
            //saveTrackData.setLocation_logic_names(track.get);

            //set release data
            Integer releaseId = trackJPAService.getReleaseId(track.getTrack_id());
            ReleaseJPA findReleaseFindOne = trackJPAService.findReleaseFindOne(releaseId);
            saveTrackData.setRelease_division(findReleaseFindOne.getReleaseDivision());
            saveTrackData.setRelease_version(findReleaseFindOne.getReleaseVersion());

            trackService.save(saveTrackData);
        }

    }

    //useful for debug
    private void printElasticSearchInfo() {

        System.out.println("--ElasticSearch-->");
        Client client = es.getClient();
        Map<String, String> asMap = client.settings().getAsMap();

        asMap.forEach((k, v) -> {
            System.out.println(k + " = " + v);
        });
        System.out.println("<--ElasticSearch--");
    }

}
