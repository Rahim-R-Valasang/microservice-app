package com.quiz.entity;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Question {


    private Long questionId;
    private String question;

    private Long quizId;

}

