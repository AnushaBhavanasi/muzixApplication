package com.stackroute.Service;

import com.stackroute.domain.Track;
import com.stackroute.exception.TrackAlreadyExistsException;
import com.stackroute.exception.TrackNotFoundException;

import java.util.List;

public class TrackServiceImpl1 implements TrackService {
    @Override
    public Track saveTrack(Track track) throws TrackAlreadyExistsException {
        return null;
    }
    @Override
    public List<Track> getAllTrackByName(String trackName) {
        return null;
    }

    @Override
    public List<Track> getAllTracks() {
        return null;
    }

    @Override
    public String removeTrack(Track track) {
        return null;
    }

    @Override
    public Track updateComment(Track track) throws TrackNotFoundException {
        return null;
    }
}
