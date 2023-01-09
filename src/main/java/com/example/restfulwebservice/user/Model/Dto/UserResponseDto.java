package com.example.restfulwebservice.user.Model.Dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
public class UserResponseDto {

    @ApiParam(example = "아이디")
    private String id;

    @ApiParam(example = "비밀번호")
    private String password;

    @ApiParam(example = "닉네임")
    private String nickname;


    @ApiParam(example = "회원번호")
    private int userSeq;
}
