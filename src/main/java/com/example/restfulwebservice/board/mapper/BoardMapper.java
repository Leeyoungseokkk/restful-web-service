package com.example.restfulwebservice.board.mapper;

import com.example.restfulwebservice.board.Model.Dto.BoardRequestDto;
import com.example.restfulwebservice.board.Model.Dto.BoardResponseDto;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface BoardMapper {
    //방문 리스트 조회
    List<BoardResponseDto>selectList();

    //방문 작성
    void insertVisit(BoardRequestDto paramDto);


    //방문글 수정

    void updateVisit(BoardRequestDto paramDto);

    //방문글 삭제

    void deleteVisit(BoardRequestDto paramDto);
}
