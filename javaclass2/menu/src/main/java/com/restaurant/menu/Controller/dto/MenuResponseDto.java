package com.restaurant.menu.Controller.dto;


import com.restaurant.menu.domain.Menu;
import com.restaurant.menu.domain.Separate;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Getter
@NoArgsConstructor
public class MenuResponseDto {
    private Long id;
    private Separate seperate;
    private Long price;

    public MenuResponseDto(Menu menu){
        this.id = menu.getId();
        this.seperate = menu.getSeparate();
        this.price = menu.getPrice();
    }
}

