package com.example.restfulwebservice.user.Model.Dto;

import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequestDto {

    @ApiParam(example = "아이디")
    private String id;

    @ApiParam(example = "비밀번호")
    private String password;

    @ApiParam(example = "이름")
    private String name;

    @ApiParam(example = "나이")
    private int age;

    @ApiParam(example = "전화번호")
    private int phone;

    @ApiParam(example = "성별")
    private String gender;

    @ApiParam(example = "회원번호")
    private int userSeq;


}
