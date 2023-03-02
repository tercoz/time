package ru.world.time.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController()
public class TimeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TimeController.class);

    @GetMapping("/time")
    public LocalDateTime index() {
        LOGGER.info("Got request on /time endpoint");
        return LocalDateTime.now();
    }
}

