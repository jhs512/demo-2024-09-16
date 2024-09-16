package com.ll.demo20240916.domain.post.controller;

import com.ll.demo20240916.dto.post.PostDto.PostDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/posts")
public class ApiV1PostController {
    @GetMapping("")
    public List<PostDto> getPosts() {
        return List.of(
                new PostDto(1L, "title1", "content1"),
                new PostDto(2L, "title2", "content2")
        );
    }
}
