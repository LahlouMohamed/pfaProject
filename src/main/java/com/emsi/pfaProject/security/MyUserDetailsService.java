package com.emsi.pfaProject.security;

import com.emsi.pfaProject.entities.Utilisateur;
import com.emsi.pfaProject.repositories.IUtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.ArrayList;
@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private IUtilisateurRepository utilisateurRepository;
    @Override
    public UserDetails loadUserByUsername(String username){
        Utilisateur utilisateur=utilisateurRepository.GetUserByUsername(username);
        return new User(username,utilisateur.getPwd(), new ArrayList<>());
    }
}
