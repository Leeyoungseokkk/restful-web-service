package com.example.restfulwebservice.user.controller;

import com.example.restfulwebservice.board.Model.Dto.BoardRequestDto;
import com.example.restfulwebservice.board.Model.Dto.BoardResponseDto;
import com.example.restfulwebservice.board.service.BoardService;
import com.example.restfulwebservice.user.Model.Dto.UserRequestDto;
import com.example.restfulwebservice.user.Model.Dto.UserResponseDto;
import com.example.restfulwebservice.user.service.UserService;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService){this.userService = userService;}
    LocalDateTime dateTime = LocalDateTime.now(); // 2022 - 12 - 21 13:44:12
    LocalDate today = LocalDate.now();//2022 - 12 - 21
    public static void main (String args[]){
        LocalDateTime dateTime = LocalDateTime.now();
        LocalDate today = LocalDate.now();
        today.format(DateTimeFormatter.ofPattern("yyyy-mm-dd"));
        LocalDateTime dateTimeFormatter = LocalDateTime.now();
        System.out.println("날짜 : " + dateTimeFormatter);
        System.out.println("날짜 : " + today);

    }

    @GetMapping("/user")
    @ApiOperation(value = "회원 리스트")
    @ApiResponses({
            @ApiResponse(code = 200,message = "야호 ! 성공"),
            @ApiResponse(code = 401,message = "실패1"),
            @ApiResponse(code = 403,message = "권한없어요"),
            @ApiResponse(code = 404,message = "페이지가 없어요"),
            @ApiResponse(code = 500,message = "서버에러에요!"),
    })
    public List<UserResponseDto> getList(){

        return userService.getvisitlist();
    }
    //회원 가입
    /*
    @PostMapping("/visit-post")
    @ApiOperation(value = " 방문 입력")
    @ApiImplicitParams({
    @ApiImplicitParam(name = "name" , value = "이름" , required = false ,dataTypeClass = String.class),
            @ApiImplicitParam(name = "title" , value = "제목" , required = false ,dataTypeClass = String.class),
            @ApiImplicitParam(name = "visitday" , value = "방문날짜" , required = false ,dataTypeClass = LocalDate.class),
            @ApiImplicitParam(name = "visittime" , value = "방문시간" , required = false ,dataTypeClass = LocalTime.class),
            @ApiImplicitParam(name = "email" , value = "이메일" , required = false ,dataTypeClass = String.class),
            @ApiImplicitParam(name = "note" , value = "문의사항" , required = false ,dataTypeClass = String.class)
    })
    public  List<BoardResponseDto> postUsers(@RequestBody String name , String title, String visitday,String visittime ,String email, String note){

        BoardRequestDto paramDto = BoardRequestDto.builder()
                .name(name)
                .title(title)
                .visitday(visitday)
                .visittime(visittime)
                .email(email)
                .note(note)
                .build();
        return  boardService.postUsers(paramDto);
    }
*/
    @PostMapping("/user")
    @ApiOperation(value = " 방문 입력")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id" , value = "아이디" , required = false ,dataTypeClass = String.class),
            @ApiImplicitParam(name = "password" , value = "비밀번호" , required = false ,dataTypeClass = String.class),
            @ApiImplicitParam(name = "name" , value = "이름" , required = false ,dataTypeClass = String.class),
            @ApiImplicitParam(name = "age" , value = "나이" , required = false ,dataTypeClass = int.class),
            @ApiImplicitParam(name = "phone" , value = "전화번호" , required = false ,dataTypeClass = int.class),
            @ApiImplicitParam(name = "gender" , value = "성별" , required = false ,dataTypeClass = String.class)
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "야호 ! 성공"),
            @ApiResponse(code = 401,message = "실패1"),
            @ApiResponse(code = 403,message = "권한없어요"),
            @ApiResponse(code = 404,message = "페이지가 없어요"),
            @ApiResponse(code = 500,message = "서버에러에요!"),
    })
    public void  postUsers(String id, String password, String name, int age, int phone, String gender){
        UserRequestDto paramDto = UserRequestDto.builder()
                .id(id)
                .password(password)
                .name(name)
                .age(age)
                .phone(phone)
                .gender(gender)
                .build();
        userService.postUser(paramDto);
    }

    //회원 수정

    @PutMapping("/user")
    @ApiOperation(value = "방문 정보 수정")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "userSeq" , value = "회원 번호" , required = true ,dataTypeClass = int.class),
            @ApiImplicitParam(name = "id" , value = "아이디" , required = false ,dataTypeClass = String.class),
            @ApiImplicitParam(name = "password" , value = "비밀번호" , required = false ,dataTypeClass = String.class),
            @ApiImplicitParam(name = "name" , value = "이름" , required = false ,dataTypeClass = String.class),
            @ApiImplicitParam(name = "age" , value = "나이" , required = false ,dataTypeClass = int.class),
            @ApiImplicitParam(name = "phone" , value = "전화번호" , required = false ,dataTypeClass = int.class),
            @ApiImplicitParam(name = "gender" , value = "성별" , required = false ,dataTypeClass = String.class)
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "야호 ! 성공"),
            @ApiResponse(code = 401,message = "실패1"),
            @ApiResponse(code = 403,message = "권한없어요"),
            @ApiResponse(code = 404,message = "페이지가 없어요"),
            @ApiResponse(code = 500,message = "서버에러에요!"),
    })
    public void updateUser(int userSeq, String id, String password, String name, int age, int phone, String gender){
        UserRequestDto paramDto = UserRequestDto.builder()
                .userSeq(userSeq)
                .id(id)
                .password(password)
                .name(name)
                .age(age)
                .phone(phone)
                .gender(gender)
                .build();
        userService.updateUser(paramDto);
    }


    //회원 삭제
    @DeleteMapping("/user")
    @ApiOperation(value = "방문 정보 삭제")
    @ApiImplicitParam(name = "userSeq" , value = "회원 번호" , required = true ,dataTypeClass = int.class)
    @ApiResponses({
            @ApiResponse(code = 200,message = "야호 ! 성공"),
            @ApiResponse(code = 401,message = "실패1"),
            @ApiResponse(code = 403,message = "권한없어요"),
            @ApiResponse(code = 404,message = "페이지가 없어요"),
            @ApiResponse(code = 500,message = "서버에러에요!"),
    })
    public void deleteUser(int userSeq){
        UserRequestDto paramDto = UserRequestDto.builder()
                .userSeq(userSeq)
                .build();
        userService.deleteUser(paramDto);
    }



}

