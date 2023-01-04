package com.example.restfulwebservice.user.service;

import com.example.restfulwebservice.board.Model.Dto.BoardRequestDto;
import com.example.restfulwebservice.board.Model.Dto.BoardResponseDto;
import com.example.restfulwebservice.board.mapper.BoardMapper;
import com.example.restfulwebservice.user.Model.Dto.UserRequestDto;
import com.example.restfulwebservice.user.Model.Dto.UserResponseDto;
import com.example.restfulwebservice.user.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UserService {
    private final UserMapper userMapper;

    @Autowired
    public UserService(UserMapper userMapper){this.userMapper = userMapper;}
    //방문 리스트
    public List<UserResponseDto> getvisitlist() {

        return userMapper.selectUser();
    }
    //방문 작성
    public void postUser(UserRequestDto paramDto) {

        userMapper.insertUser(paramDto);
    }

    //수정 수정
    public void updateUser(UserRequestDto paramDto){

        userMapper.updateUser(paramDto);
    }
    //방문 삭제
    public void  deleteUser(UserRequestDto paramDto){

        userMapper.deleteUser(paramDto);
    }


}
