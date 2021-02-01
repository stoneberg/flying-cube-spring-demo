package com.ktds.flyingcube.config.security.service;

import com.ktds.flyingcube.biz.auth.domain.User;
import com.ktds.flyingcube.biz.auth.repository.UserRepository;
import com.ktds.flyingcube.common.exception.ApplicationExType;
import com.ktds.flyingcube.common.exception.ApplicationException;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
public class UserDetailsServiceImpl implements UserDetailsService {
	private final UserRepository userRepository;

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.findByUsername(username)
				.orElseThrow(() -> new UsernameNotFoundException("User Not Exists " + username));
				//.orElseThrow(() -> new ApplicationException(ApplicationExType.USER_NOT_FOUND));
		return UserDetailsImpl.build(user);
	}

}
