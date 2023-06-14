package com.restaurant.menu.Repository;

import com.restaurant.menu.domain.Menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepository extends JpaRepository <Menu, Long> {
}
