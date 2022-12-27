package com.example.restfulwebservice.user.Model.Dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BoardRequestDto {

    @ApiModelProperty(example = "이름")
    private String name;

    @ApiModelProperty(example = "제목,방문목적")
    private String title;

    @ApiModelProperty(example = "방문날짜")
    private String visitday;

    @ApiModelProperty(example = "방문시간")
    private String visittime;

    @ApiModelProperty(example = "이메일")
    private String email;

    @ApiModelProperty(example = "문의사항")
    private String note;

    @ApiModelProperty(example = "날짜")
    private String today;

    @ApiModelProperty(example = "시퀀스")
    private String seq;
}
