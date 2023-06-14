package com.web.community.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.util.Lazy;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@NoArgsConstructor //default 생성자 생성
@Entity
@Table
public class Board {
    @Id//기본키
    @Column(name = "board_idx")
    @GeneratedValue(strategy = GenerationType.IDENTITY)// 생성시 값 증가
    private Long idx;
    @Column(nullable = false)
    private String title;
    @Column
    private String subTitle;
    @Column
    @Enumerated(EnumType.STRING)//ENUM 타입 String으로 입력
    private BoardType boardType; //열거형
    @Column
    private LocalDateTime createdDae;
    @Column
    private LocalDateTime upDatedate;
    @OneToOne(fetch = FetchType.LAZY)
    private User user;

    @Builder //생성자에 붙이면 생성될때 값을 주입하고 이후 변경 불가
    public Board(String title, String subTitle, BoardType boardType, LocalDateTime createdDae, LocalDateTime upDatedate, User user) {
        this.title = title;
        this.subTitle = subTitle;
        this.boardType = boardType;
        this.createdDae = createdDae;
        this.upDatedate = upDatedate;
        this.user = user;
    }
}
