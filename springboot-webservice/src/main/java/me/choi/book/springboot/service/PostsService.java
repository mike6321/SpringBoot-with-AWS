package me.choi.book.springboot.service;

import lombok.RequiredArgsConstructor;
import me.choi.book.springboot.domain.Posts;
import me.choi.book.springboot.domain.PostsRepository;
import me.choi.book.springboot.web.dto.PostUpdateRequestDto;
import me.choi.book.springboot.web.dto.PostsResponseDto;
import me.choi.book.springboot.web.dto.PostsSaveRequestDto;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PostsService {

    private final PostsRepository postsRepository;

    @Transactional
    public Long save(PostsSaveRequestDto requestDto) {
        return postsRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, PostUpdateRequestDto requestDto) {
        Posts posts = postsRepository.findById(id)
                                     .orElseThrow(() -> new IllegalArgumentException("해당 게시물이 없습니다. id = " + id));
        posts.update(requestDto.getTitle(), requestDto.getContent());

        return id;
    }

    public PostsResponseDto findById(Long id) {
        Posts entity = postsRepository.findById(id)
                                     .orElseThrow(() -> new IllegalArgumentException("해당 게시물이 없습니다. id = " + id));

        return new PostsResponseDto(entity);
    }

}
