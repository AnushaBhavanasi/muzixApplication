package com.stackroute.Service;

import com.stackroute.domain.Track;
import com.stackroute.exception.TrackAlreadyExistsException;
import com.stackroute.exception.TrackNotFoundException;
import com.stackroute.repository.TrackRepository;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
import java.util.List;

@Primary
@Service
public class TrackServiceImpl implements  TrackService{
    TrackRepository trackRepository;
    public TrackServiceImpl(TrackRepository trackRepository) {
        this.trackRepository = trackRepository;
    }
    @Override
    public Track saveTrack(Track track) throws TrackAlreadyExistsException {
        if(trackRepository.existsById(track.getTrackId())){
           throw new TrackAlreadyExistsException("this track id already exists");
        }
        Track savedTrack=trackRepository.save(track);
        if(savedTrack==null){
            throw new TrackAlreadyExistsException("track id already exists");
        }
        return savedTrack;
    }
    @Override
    public List<Track> getAllTracks() {
        return trackRepository.findAll();
    }
    @Override
    public String removeTrack(Track track) {
        String str="not deleted";
          if(trackRepository.existsById(track.getTrackId())){
              trackRepository.deleteById(track.getTrackId());
              str="deleted";
              return str;
          }
        return str;
    }
    @Override
    public Track updateComment(Track track) throws TrackNotFoundException {
        if (trackRepository.existsById(track.getTrackId())) {
            Track track1 = trackRepository.findById(track.getTrackId()).get();
            track1.setTrackComments(track.getTrackComments());
            trackRepository.save(track1);
            return track1;
        } else {
            throw new TrackNotFoundException("track not found");
        }
    }
    @Override
    public List<Track> getAllTrackByName(String trackName) {
        return (List<Track>) trackRepository.getTrackByName(trackName);
    }
}



