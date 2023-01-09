package com.blog.querydsl.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BoardDto {
    private Long id;
    private String writer;
    private String password;
    private String title;
    private String content;
}
