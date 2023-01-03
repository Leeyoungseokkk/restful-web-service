package com.example.restfulwebservice.user.mapper;

import com.example.restfulwebservice.user.Model.Dto.BoardRequestDto;
import com.example.restfulwebservice.user.Model.Dto.BoardResponseDto;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface BoardMapper {
    //회원 조회
    List<BoardResponseDto>selectList();

    //방문 작성
    void insertVisit(BoardRequestDto paramDto);


    //회원 수정

    //List<BoardResponseDto> updateUser(BoardRequestDto paramDto);

    // 글 삭제

    //List<BoardResponseDto> deleteUser(BoardRequestDto paramDto);
}
