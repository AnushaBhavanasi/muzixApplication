package com.stackroute.config;

import com.stackroute.domain.Track;

import com.stackroute.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CommandLineRunnerStartUpDemo implements CommandLineRunner {

    @Value("${track1.track_id}")
    private int trackId;
    @Value("${track1.track_name}")
    private String trackName;
    @Value("${track1.track_comment}")
    private String trackComments;
    @Autowired
    TrackRepository trackRepository;
    Track track=new Track();
    @Override
    public void run(String... args) throws Exception{
        track.setTrackId(trackId);
        track.setTrackName(trackName);
        track.setTrackComments(trackComments);
        trackRepository.save(track);

    }
}