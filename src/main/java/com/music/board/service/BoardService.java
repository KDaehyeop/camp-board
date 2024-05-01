package com.music.board.service;

import com.music.board.entity.Board;
import com.music.board.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BoardService {

    private final BoardRepository boardRepository;

    public void write(Board board) {
        boardRepository.save(board);
    }

    public List<Board> getBoards() {
        return boardRepository.findAll();
    }

    public Integer createBoard(Board board) {
        boardRepository.save(board);
        return board.getId();
    }

}
