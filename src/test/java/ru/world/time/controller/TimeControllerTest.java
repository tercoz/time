package ru.world.time.controller;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TimeControllerTest {

    @Test
    void getTimestamp_Gets() {
        TimeController timeConntroller = new TimeController();
        assertThat(timeConntroller.getTimestamp()).isNotNull();
    }
}