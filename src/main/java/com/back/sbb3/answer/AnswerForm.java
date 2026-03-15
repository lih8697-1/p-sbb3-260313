package com.back.sbb3.answer;

import jakarta.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AnswerForm {
    @NotEmpty(message = "[필수] 내용을 입력해 주세요.")
    private String content;
}
