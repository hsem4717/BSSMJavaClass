package com.restaurant.menu.Controller;


import com.restaurant.menu.Controller.dto.MenuRequestDto;
import com.restaurant.menu.Service.MenuService;
import com.restaurant.menu.domain.Menu;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class MenuController {

    private final MenuService menuService;

    @PostMapping("/api/menus")
    public Long create(@RequestBody MenuRequestDto requestDto) {
        return menuService.save(requestDto);
    }

    @GetMapping("/api/menus")
    public List<Menu> findAll() {
        return menuService.findAll();
    }
    @PutMapping("api/menus/{id}")
    public Long update(@PathVariable Long id, @RequestBody MenuRequestDto requestDto) {
        return menuService.update(id, requestDto);
    }

    @DeleteMapping("api/menus/{id}")
    public void delete(@PathVariable Long id){
       menuService.delete(id);
    }
}
