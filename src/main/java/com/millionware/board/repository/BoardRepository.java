package com.millionware.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.millionware.board.entity.Board;

public interface BoardRepository extends JpaRepository<Board, Long>{

}
