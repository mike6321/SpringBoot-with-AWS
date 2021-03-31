package me.choi.book.springboot.domain;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Project : springboot-webservice
 *
 * @author : jwdeveloper
 * @comment :
 * Time : 7:14 오후
 */
public interface PostsRepository extends JpaRepository<Posts, Long> {
}
