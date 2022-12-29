package com.example.restfulwebservice.user.Model.Dto;

import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardRequestDto {

    @ApiParam(example = "이름")
    private String name;

    @ApiParam(example = "제목,방문목적")
    private String title;

    @ApiParam(example = "방문날짜")
    private String visitday;

    @ApiParam(example = "방문시간")
    private String visittime;

    @ApiParam(example = "이메일")
    private String email;

    @ApiParam(example = "문의사항")
    private String note;

    @ApiParam(example = "날짜")
    private String today;

    @ApiParam(example = "시퀀스")
    private String seq;
}
