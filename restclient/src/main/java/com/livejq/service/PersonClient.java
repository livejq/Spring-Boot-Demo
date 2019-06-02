package com.livejq.service;

import com.livejq.domain.Person;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public interface PersonClient {

    @RequestMapping(value = "/person/{name}", method = RequestMethod.GET)
    public Person getPerson(@PathVariable(name = "name") String name);
}
