package com.Message.Message.service;

import com.Message.Message.repository.*;
import com.Message.Message.model.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class SessionService {

    // @Autowired
    // UserRepository userRepository;

    // @Autowired
    // LoginInfoRepository loginInfoRepository;

    // @Autowired
    // EndUserRepository endUserRepository;

    // @Autowired
    // AdministratorRepository administratorRepository;

    // @Autowired
    // AgentRepository agentRepository;

    public String getLoggedUsername() {
        Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
        String username = authentication.getName();

        return username;
    }

    public HttpEntity<String> makeAuthorizationHeader(String authorization) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", authorization);

        HttpEntity<String> entity = new HttpEntity<String>(headers);

        return entity;
    }

    public void invalidateSession() {
        SecurityContextHolder.clearContext();
    }

    /*
     * public String getLoggedEmail() { String username = getLoggedUsername();
     * String email = loginInfoRepository.findByUsername(username).getEmail();
     * 
     * return email; }
     * 
     * public EntityUser getLoggedUser() { String username = getLoggedUsername();
     * Long loginInfoID = loginInfoRepository.findByUsername(username).getId();
     * 
     * List<EntityUser> users = userRepository.findAll(); for (EntityUser user :
     * users) { if (user.getLoginInfo().getId() == loginInfoID) { return user; } }
     * return null; }
     * 
     * public EndUser getLoggedEndUser() { Long userID = getLoggedUser().getId();
     * 
     * List<EndUser> all = endUserRepository.findAll();
     * 
     * for (EndUser endUser : all) { if (endUser.getUser().getId() == userID) {
     * return endUser; } } return null; }
     * 
     * // public Administrator getLoggedAdministrator(){ // Long userID =
     * getLoggedUser().getId();
     * 
     * // List<Administrator> all = administratorRepository.findAll();
     * 
     * // for(Administrator administrator : all){ //
     * if(administrator.getUser().getId() == userID){ // return administrator; // }
     * // } // return null; // }
     * 
     * public Agent getLoggedAgent() { Long userID = getLoggedUser().getId();
     * 
     * List<Agent> all = agentRepository.findAll();
     * 
     * for (Agent agent : all) { if (agent.getUser().getId() == userID) { return
     * agent; } } return null; }
     */
}