package me.choi.book.springboot.web.dto;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * Project : springboot-webservice
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 11:48 오후
 */
@Getter
@RequiredArgsConstructor
public class HelloResponseDto {

    private final String name;
    private final int amount;

}
