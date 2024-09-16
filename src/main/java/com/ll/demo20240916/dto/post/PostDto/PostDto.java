package com.ll.demo20240916.dto.post.PostDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@AllArgsConstructor
public class PostDto {
    private long id;
    private String title;
    private String content;
}
