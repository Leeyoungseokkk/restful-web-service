package com.example.restfulwebservice.user.Model.Dto;

import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserRequestDto {


    @ApiParam(example = "아이디")
    @NotBlank(message = "아이디는 필수 입력 값입니다.")
    private String id;

    @ApiParam(example = "비밀번호")
    @NotBlank(message = "비밀번호는 필수 입력 값입니다.")
    private String password;

    @ApiParam(example = "닉네임")
    private String nickname;

    @ApiParam(example = "회원번호")
    private int userSeq;


}
