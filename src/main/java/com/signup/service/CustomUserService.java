package com.signup.service;

import com.signup.enities.User;
import com.signup.reposatory.UserReposatory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserService implements UserDetailsService {

    @Autowired
    private UserReposatory userReposatory;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=userReposatory.findByEmailId(username);
        CustomUserDetails customUserDetails=null;
        if (user!=null){
            customUserDetails = new CustomUserDetails();
            customUserDetails.setUser(user);
        }else {
            throw new UsernameNotFoundException("User not found "+username);
        }
        return customUserDetails;

    }




}
