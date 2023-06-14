package com.restaurant.menu.Controller.dto;

import com.restaurant.menu.domain.Menu;
import com.restaurant.menu.domain.Separate;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Locale;

@Getter
@NoArgsConstructor
public class MenuRequestDto {
    private String name;
    private Separate separate;
    private Long price;

    public Menu toEntity() {
        return Menu.builder()
                .name(this.name)
                .separate(this.separate)
                .price(this.price)
                .build();
    }
}


