package com.blog.querydsl.service;

import com.blog.querydsl.dto.BoardDto;
import com.blog.querydsl.model.Board;
import com.blog.querydsl.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BoardService {

    private final BoardRepository boardRepository;

    public void save(BoardDto boardDto) {
        Board board = Board.toSaveEntity(boardDto);
        boardRepository.save(board);
    }
}
