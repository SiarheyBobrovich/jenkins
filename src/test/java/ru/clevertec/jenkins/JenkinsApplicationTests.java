package ru.clevertec.jenkins;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JenkinsApplicationTests {

    @Test
    void test1() {
        assertThat(true)
                .isTrue();
    }

    @Test
    void test2() {
        assertThat(false)
                .isFalse();
    }

}
