package com.goodmorningmovie.springboot.dto;

import static org.assertj.core.api.Assertions.assertThat;

import com.goodmorningmovie.springboot.web.dto.HelloResponseDto;
import org.junit.Test;

@Test
public class HelloResponseDtoTest {

    String name = "test";
    int amount = 1000;

    HelloResponseDto dto = new HelloResponseDto(name, amount);

    assertThat(dto.getName()).isEqualTo(name);
    assertThat(dto.getAmount()).isEqualTo(amount);
}
