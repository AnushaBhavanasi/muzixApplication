package com.stackroute.config;


import com.stackroute.domain.Track;
import com.stackroute.repository.TrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:application.properties")
public class ApplicationListenerConfig implements ApplicationListener<ContextRefreshedEvent>{
    private TrackRepository trackRepository;
    @Autowired
    private Environment env;
    public ApplicationListenerConfig(TrackRepository trackRepository, Environment env){
        this.trackRepository=trackRepository;

    }
    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent){
        Track track = new Track(Integer.parseInt(env.getProperty("app.trackId")),env.getProperty("app.trackName"),env.getProperty("app.trackComments"));
        trackRepository.save(track);

    }
}