package com.stackroute.Service;

import com.stackroute.domain.Track;
import com.stackroute.exception.TrackAlreadyExistsException;
import com.stackroute.exception.TrackNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TrackService {
    public Track saveTrack(Track track) throws TrackAlreadyExistsException;
    public List<Track> getAllTrackByName(String trackName);
    public List<Track> getAllTracks();
    public String removeTrack(Track track);
    public Track updateComment(Track track) throws TrackNotFoundException;


}
