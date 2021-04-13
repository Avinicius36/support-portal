package com.vinicius.SupportPortalApplication.service;

import com.vinicius.SupportPortalApplication.domain.User;
import com.vinicius.SupportPortalApplication.exception.domain.EmailExistsException;
import com.vinicius.SupportPortalApplication.exception.domain.EmailNotFoundException;
import com.vinicius.SupportPortalApplication.exception.domain.UserNotFoundException;
import com.vinicius.SupportPortalApplication.exception.domain.UsernameExistsException;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.MessagingException;
import java.io.IOException;
import java.util.List;


public interface UserService {

    User register(String firstName, String lastName, String username, String email)
            throws UserNotFoundException, UsernameExistsException, EmailExistsException, MessagingException;

    List<User> getUsers();

    User findByUsername(String username);

    User findUserByEmail(String email);

    User addNewUser(String firstName, String lastName, String username, String email, String role, boolean isNonLocked, boolean isActive, MultipartFile profileImage)
            throws UserNotFoundException, UsernameExistsException, EmailExistsException, IOException;

    User updateUser(String currentUsername, String newFirstName, String newLastName, String newUsername, String newEmail, String role, boolean isNonLocked, boolean isActive, MultipartFile profileImage)
            throws UserNotFoundException, UsernameExistsException, EmailExistsException, IOException;

    void deleteUser(long id);

    void resetPassword(String email) throws EmailNotFoundException, MessagingException;

    User updateProfileImage(String username, MultipartFile profileImage)
            throws UserNotFoundException, UsernameExistsException, EmailExistsException, IOException;
}