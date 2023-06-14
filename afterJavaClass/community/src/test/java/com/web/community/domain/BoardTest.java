package com.web.community.domain;

import ch.qos.logback.core.util.Loader;
import com.web.community.repository.BoardRepository;
import com.web.community.repository.UserRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;


@DataJpaTest
class BoardTest {
    private final String boardTestTitle = "테스트;";
    private final String email = "test@gmail.com";

    @Autowired
    UserRepository userRepository;

    @Autowired
    BoardRepository boardRepository;

    @BeforeEach
    public void 초기화(){
        //user를 하나 만들어 db에 저장
        User user = userRepository.save(User.builder()
                .name("choi")
                .password("123")
                .email(email)
                .createdDate(LocalDateTime.now())
                .updatedDate(LocalDateTime.now())
                .build());
        Board board = boardRepository.save(Board.builder()
                .title(boardTestTitle)
                .subTitle("서브타이틀")
                .boardType(BoardType.FREE)
                .createdDae(LocalDateTime.now())
                .upDatedate(LocalDateTime.now())
                .user(user)
                .build());
    }

    @Test
    public void 저장확인(){
        User user = userRepository.findByEmail(email);

        assertEquals(user.getEmail(), email);
        assertEquals(user.getName(), "choi");

        Board board = boardRepository.findByUser(user);
        assertEquals(board.getTitle(), boardTestTitle);
    }

}