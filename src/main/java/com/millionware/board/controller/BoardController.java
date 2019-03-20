package com.millionware.board.controller;

import com.millionware.board.entity.Board;
import com.millionware.board.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping(value = "/board")
public class BoardController {

    @Autowired
    private BoardRepository repo;

    @GetMapping
    public ResponseEntity<List<Board>> getBoardAll() {

        List<Board> list = repo.findAll();

        return new ResponseEntity<List<Board>>(list, HttpStatus.OK);
    }
    
   
    @PostMapping
    public ResponseEntity<Board> setBoard(@RequestBody Board board) {
    	Board sb = repo.save(board);
    	return new ResponseEntity<Board>(sb, HttpStatus.OK);
    }

}
