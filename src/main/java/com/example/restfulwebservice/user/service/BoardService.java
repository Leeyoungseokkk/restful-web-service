package com.example.restfulwebservice.user.service;
import com.example.restfulwebservice.user.Model.Dto.BoardRequestDto;
import com.example.restfulwebservice.user.Model.Dto.BoardResponseDto;
import com.example.restfulwebservice.user.mapper.BoardMapper;
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
        public Integer postUsers(BoardRequestDto paramDto){

            return boardMapper.insertVisit(paramDto);
        }
        //수정 수정
        public Integer updateUser(BoardRequestDto paramDto){

            return boardMapper.updateUser(paramDto);
        }
        //방문 삭제
        public Integer deleteUser(BoardRequestDto paramDto){

            return boardMapper.deleteUser(paramDto);
        }


    }
