package com.example.restfulwebservice.user.controller;

import com.example.restfulwebservice.user.Model.Dto.BoardRequestDto;
import com.example.restfulwebservice.user.Model.Dto.BoardResponseDto;
import com.example.restfulwebservice.user.service.BoardService;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class BoardController {

    private final BoardService boardService;

    @Autowired
    public BoardController(BoardService boardService){this.boardService = boardService;}
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

    @GetMapping("/visit-get")
    @ApiOperation(value = "방문 리스트")
    public List<BoardResponseDto> getList(){

        return boardService.getvisitlist();
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
    public void  postUsers(String name,
                            String title,
                                            String visitday,
                                            String visittime,
                                             String email, String note){

        BoardRequestDto paramDto = BoardRequestDto.builder()
                .name(name)
                .title(title)
                .visitday(visitday)
                .visittime(visittime)
                .email(email)
                .note(note)
                .build();
        boardService.postUsers(paramDto);
    }

    //회원 수정
/*
    @PutMapping("/visit-put/{name}")
    @ApiOperation(value = "방문 정보 수정")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name" , value = "이름" , required = true ,dataTypeClass = String.class),
            @ApiImplicitParam(name = "title" , value = "제목" , required = false ,dataTypeClass = String.class),
            //@ApiImplicitParam(name = "visitday" , value = "방문날짜" , required = false ,dataTypeClass = LocalDate.class),
            //@ApiImplicitParam(name = "visittime" , value = "방문시간" , required = false ,dataTypeClass = LocalTime.class),
            @ApiImplicitParam(name = "email" , value = "이메일" , required = false ,dataTypeClass = String.class),
            @ApiImplicitParam(name = "note" , value = "문의사항" , required = false ,dataTypeClass = String.class)
    })
    public List<BoardResponseDto> updateUser(@PathVariable String name , String title,
                                             //String visitday,
                                             //String visittime ,
                                             String email, String note) {
        BoardRequestDto paramDto = BoardRequestDto.builder()
                .name(name)
                .title(title)
                //.visitday(visitday)
                //.visittime(visittime)
                .email(email)
                .note(note)
                .build();
        return  boardService.updateUser(paramDto);
    }


    //회원 삭제
    @DeleteMapping("/visit-delete/{name}")
    @ApiOperation(value = "방문정보 삭제")
    @ApiImplicitParam(name = "name" , value = "이름" , required = true ,dataTypeClass = String.class)
    public List<BoardResponseDto> deleteUser(@PathVariable String name){
        BoardRequestDto paramDto = BoardRequestDto.builder()
                .name(name)
                .build();
        return boardService.deleteUser(paramDto);
    }
*/


}

