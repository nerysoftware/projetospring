package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Contact;
import com.example.demo.repository.ContactRepository;



@Service
@Transactional
public class ContatoService {
	
	@Autowired
    private ContactRepository contatoRepository;
    public List<Contact> listAllUser() {
        return contatoRepository.findAll();
    }

}
