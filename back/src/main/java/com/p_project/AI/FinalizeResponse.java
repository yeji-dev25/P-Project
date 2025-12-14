package com.p_project.AI;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class FinalizeResponse {
    private String finalText;
    private String dominantEmotion;
    private RecommendDTO recommend;
}
