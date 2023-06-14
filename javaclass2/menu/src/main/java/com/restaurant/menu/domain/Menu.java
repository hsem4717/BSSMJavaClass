package com.restaurant.menu.domain;

import com.restaurant.menu.Controller.dto.MenuRequestDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/*
    ----메뉴에 대한 CRUD 기능 구현----
    기    능 | Method |  api 주소       | 비  고
    -----------------------------------------------
    메뉴 등록 |  POST  | api/menus      | 메뉴이름 중복X
    전체 조회 |   GET  | api/menus
    단건 조회 |   GET  | api/menus/{id}
    메뉴 수정 |   PUT  | api/menus/{id}
    메뉴 삭제 | DELETE | api/menus/{id}

    완성 후 zip 파일 아래 링크에 올리기
    https://forms.gle/gSb93uZgp4Fd1nBH9
 */

@NoArgsConstructor
@Getter
@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //메뉴 id, 자동증가
    private Long id;

    //메뉴 이름
    @Column(nullable = false)
    private String name;

    //메뉴 구분 -> MAIN, SUB, DRINK 중 선택
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Separate separate;

    //메뉴 가격
    @Column(nullable = false)
    private Long price;

    @Builder
    public Menu(String name, Separate separate, Long price) {
        this.name = name;
        this.separate = separate;
        this.price = price;
    }

    public Long updateData(MenuRequestDto requestDto) {
        this.separate = requestDto.getSeparate();
        this.price = requestDto.getPrice();
        return this.id;
    }
}
