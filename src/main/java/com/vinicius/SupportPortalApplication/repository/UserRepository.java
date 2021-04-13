package com.vinicius.SupportPortalApplication.repository;

import com.vinicius.SupportPortalApplication.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    User findUserByUserName(String userName);

    User findUserByEmail(String email);

}
