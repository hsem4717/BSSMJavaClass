package com.web.community.repository;

import com.sun.xml.bind.v2.model.core.ID;
import com.web.community.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
