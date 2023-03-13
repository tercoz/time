package ru.world.time.controller;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DateTimeControllerTest {

    @Test
    void getTimestamp_Gets() {
        DateTimeController controller = new DateTimeController();
        assertThat(controller.getTimestamp()).isNotNull();
    }
}