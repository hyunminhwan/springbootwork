package com.study.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.study.springboot.domain.Board;
import com.study.springboot.domain.Member;
import com.study.springboot.repository.BoardRepository;




@Service
public class BoardService {
	
	@Autowired
	BoardRepository boardRepository;

	public Board binsert(Board board) {
		Board board1 =boardRepository.save(board);
		return board1;
	}
	

}