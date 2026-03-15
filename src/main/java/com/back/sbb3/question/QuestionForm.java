package com.back.sbb3.question;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionForm {
    @NotEmpty(message = "[필수] 제목을 입력해 주세요.")
    @Size(max = 200)
    private String subject;

    @NotEmpty(message = "[필수] 내용을 입력해 주세요.")
    private String content;
}
