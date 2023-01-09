package com.blog.querydsl.model;

import com.blog.querydsl.dto.BoardDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Board {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 20)
    private String writer;

    @Column
    private String password;

    @Column(nullable = false,length = 20)
    private String title;

    @Lob
    private String content;


    public static Board toSaveEntity(BoardDto boardDto) {
        Board board = new Board();
        board.setWriter(boardDto.getWriter());
        board.setPassword(boardDto.getPassword());
        board.setTitle(boardDto.getTitle());
        board.setContent(boardDto.getContent());

        return board;
    }
}
