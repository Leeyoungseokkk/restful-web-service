package com.example.restfulwebservice.user.mapper;

import com.example.restfulwebservice.board.Model.Dto.BoardRequestDto;
import com.example.restfulwebservice.board.Model.Dto.BoardResponseDto;
import com.example.restfulwebservice.user.Model.Dto.UserRequestDto;
import com.example.restfulwebservice.user.Model.Dto.UserResponseDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserMapper {
    //회원 리스트 조회
    List<UserResponseDto>selectUser();

    //회원가입
    void insertUser(UserRequestDto paramDto);


    //회원 수정

    void updateUser(UserRequestDto paramDto);

    //회원 삭제

    void deleteUser(UserRequestDto paramDto);
}
