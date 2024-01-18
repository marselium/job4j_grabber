package ru.job4j.grabber.utils;

import org.junit.jupiter.api.Test;

import java.time.DateTimeException;
import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

class HabrCareerDateTimeParserTest {
    @Test
    public void whenFullMatched() {
        LocalDateTime exp = LocalDateTime.of(2024, 01, 18, 16, 07, 22);
        String date = "2024-01-18T16:07:22+03:00";
        HabrCareerDateTimeParser parser = new HabrCareerDateTimeParser();
        LocalDateTime rsl = parser.parse(date);
        assertThat(rsl).isEqualTo(exp);
    }

    @Test
    public void whenNotMatched() {
        LocalDateTime exp = LocalDateTime.of(2024, 01, 18, 16, 07, 22);
        String date = "2024-01-18T16:07:21+03:00";
        HabrCareerDateTimeParser parser = new HabrCareerDateTimeParser();
        LocalDateTime rsl = parser.parse(date);
        assertThat(rsl).isNotEqualTo(exp);
    }
}