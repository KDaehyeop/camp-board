package com.music.board.controller;


import com.music.board.entity.Board;
import com.music.board.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/api")
@RestController
@RequiredArgsConstructor
public class BoardApiController {

    private final BoardService boardService;

    @GetMapping("/board")
    public ResponseEntity<List<Board>> getBoardList() {
        return ResponseEntity.ok(boardService.getBoards());
    }
    @PostMapping("/board")
    public ResponseEntity<Integer> createBoardList(Board board){
        return ResponseEntity.ok(boardService.createBoard(board));
    }
}
