package com.Booking.Booking.service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LoginInfoService implements UserDetailsService {

  
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        
        
        return new UserDetails(){
        
            @Override
            public boolean isEnabled() {
                // TODO Auto-generated method stub
                return true;
            }
        
            @Override
            public boolean isCredentialsNonExpired() {
                // TODO Auto-generated method stub
                return true;
            }
        
            @Override
            public boolean isAccountNonLocked() {
                // TODO Auto-generated method stub
                return true;
            }
        
            @Override
            public boolean isAccountNonExpired() {
                // TODO Auto-generated method stub
                return true;
            }
        
            @Override
            public String getUsername() {
                // TODO Auto-generated method stub
                return null;
            }
        
            @Override
            public String getPassword() {
                // TODO Auto-generated method stub
                return null;
            }
        
            @Override
            public Collection<? extends GrantedAuthority> getAuthorities() {
                // TODO Auto-generated method stub
                return null;
            }
        };

    }

 
}