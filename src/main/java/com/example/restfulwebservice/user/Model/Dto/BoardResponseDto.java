package com.example.restfulwebservice.user.Model.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
@Builder
public class BoardResponseDto {

    @ApiModelProperty(example = "이름")
    private String name;

    @ApiModelProperty(example = "제목,방문목적")
    private String title;

    @ApiModelProperty(example = "방문날짜")
    private String visitday;

    @ApiModelProperty(example = "방문시간")
    @JsonFormat(shape = JsonFormat.Shape.STRING,pattern = "HH:mm",timezone = "Asia/Seoul")
    private String visittime;

    @ApiModelProperty(example = "이메일")
    private String email;

    @ApiModelProperty(example = "문의사항")
    private String note;

    //@ApiModelProperty(example = "시퀀스,글번호")
   // private String seq;



}
