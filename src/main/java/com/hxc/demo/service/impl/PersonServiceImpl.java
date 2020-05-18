package com.hxc.demo.service.impl;

import com.hxc.demo.dao.PersonDao;
import com.hxc.demo.entity.Person;
import com.hxc.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonDao personDao;

    @Transactional(propagation = Propagation.REQUIRED,
    isolation = Isolation.READ_COMMITTED,
    readOnly = false,
    timeout = 3)
    public void insertIntoPerson(Person person) {
        personDao.insertIntoPerson(person);
        System.out.println("123");
    }
}
