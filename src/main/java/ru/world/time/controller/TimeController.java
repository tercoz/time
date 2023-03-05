package ru.world.time.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

import static java.time.format.DateTimeFormatter.ISO_LOCAL_DATE_TIME;
import static org.springframework.http.MediaType.APPLICATION_JSON_UTF8_VALUE;

/**
 * Manages requests for timestamp.
 */
@RestController()
public class TimeController {
    private static final Logger LOGGER = LoggerFactory.getLogger(TimeController.class);

    /**
     * Gets timestamp in ISO_LOCAL_DATE_TIME format.
     */
    @GetMapping(value = "/time", produces = APPLICATION_JSON_UTF8_VALUE)
    Response getTimestamp() {
        LOGGER.info("Got request on /time endpoint");
        return Response.of(LocalDateTime.now().format(ISO_LOCAL_DATE_TIME));
    }

    @RequiredArgsConstructor(staticName = "of")
    @Getter
    public static final class Response {
        private final String timestamp;
    }
}
