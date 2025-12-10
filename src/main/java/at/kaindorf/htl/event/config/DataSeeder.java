package at.kaindorf.htl.event.config;


import at.kaindorf.htl.event.entity.Artist;
import at.kaindorf.htl.event.entity.Event;
import at.kaindorf.htl.event.entity.Rating;
import at.kaindorf.htl.event.repository.ArtistRepository;
import at.kaindorf.htl.event.repository.EventRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Component;
import tools.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DataSeeder implements CommandLineRunner {

    // private final ObjectMapper objectMapper;
    // private final ArtistRepository artistRepository;
    // private final EventRepository eventRepository;

    @Override
    public void run(String... args) throws Exception {



    }

    // to-do
    record JsonDataWrapper() {
    }

    // to-do
    record ArtistDto() {
    }

    // to-do
    record EventDto() {
    }

    // to-do
    record RatingDto() {
    }

}