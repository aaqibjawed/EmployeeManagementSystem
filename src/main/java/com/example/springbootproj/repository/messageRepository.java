package com.example.springbootproj.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootproj.model.Message;

public interface messageRepository extends JpaRepository<Message, String> {

}
