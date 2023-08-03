package dev.danvega.dcdemo.controller;

import dev.danvega.dcdemo.model.Post;
import dev.danvega.dcdemo.repository.PostRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/posts")
public class PostController {

    private final PostRepository repository;

    @GetMapping
    public List<Post> findAll() {
        return repository.findAll();
    }

}
