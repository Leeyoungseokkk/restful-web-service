package com.example.restfulwebservice.board.service;
import com.example.restfulwebservice.board.Model.Dto.BoardRequestDto;
import com.example.restfulwebservice.board.Model.Dto.BoardResponseDto;
import com.example.restfulwebservice.board.mapper.BoardMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
    @Service
    @Slf4j
    public class BoardService {
        private final BoardMapper boardMapper;

        @Autowired
        public BoardService(BoardMapper boardMapper){this.boardMapper = boardMapper;}
        //방문 리스트
        public List<BoardResponseDto> getvisitlist() {

            return boardMapper.selectList();
        }
        //방문 작성
        public void postVisit(BoardRequestDto paramDto) {

            boardMapper.insertVisit(paramDto);
        }

        //수정 수정
        public void updateVisit(BoardRequestDto paramDto){

             boardMapper.updateVisit(paramDto);
        }
        //방문 삭제
        public void  deleteVisit(BoardRequestDto paramDto){

             boardMapper.deleteVisit(paramDto);
        }


    }
