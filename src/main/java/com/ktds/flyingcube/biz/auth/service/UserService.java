package com.ktds.flyingcube.biz.auth.service;

import com.ktds.flyingcube.biz.auth.domain.User;
import com.ktds.flyingcube.biz.auth.dto.UserRes.UserDto;
import com.ktds.flyingcube.biz.auth.mapper.UserMapper;
import com.ktds.flyingcube.biz.auth.repository.UserRepository;
import com.ktds.flyingcube.common.exception.ApplicationExType;
import com.ktds.flyingcube.common.exception.ApplicationException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
@Transactional(readOnly = true)
public class UserService {

    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserDto findUser(String username) {
        User user = userRepository.findByUsername(username)
                .orElseThrow(() -> new ApplicationException(ApplicationExType.USER_NOT_FOUND));
        return userMapper.toDto(user);
    }

}
