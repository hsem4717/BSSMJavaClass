package com.restaurant.menu.Service;

import com.restaurant.menu.Controller.dto.MenuRequestDto;
import com.restaurant.menu.Repository.MenuRepository;
import com.restaurant.menu.domain.Menu;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@AllArgsConstructor
@Service
public class MenuService {

    private final MenuRepository menuRepository;
    @Transactional
    public Long save(MenuRequestDto requestDto) {
        List<Menu> menu = menuRepository.findAll();
        if(!menu.isEmpty()){
            if(menu.get(0).getName().equals(requestDto.getName())){
                throw new IllegalArgumentException("이미 존재하는 이름입니다");
            }
        }
        return menuRepository.save(requestDto.toEntity()).getId();
    }

    @Transactional
    public Long update(Long id, MenuRequestDto requestDto) {
        Menu menu= menuRepository.findById(id).orElseThrow();
            return menu.updateData(requestDto);
        }

    public void delete(Long id) {
        menuRepository.deleteById(id);
    }

    public List<Menu> findAll() {
        List<Menu> result = menuRepository.findAll();
        return result;
    }
}
