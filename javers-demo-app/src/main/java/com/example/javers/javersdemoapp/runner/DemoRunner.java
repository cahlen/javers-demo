package com.example.javers.javersdemoapp.runner;

import com.example.javers.javersdemoapp.dao.Person;
import com.example.javers.javersdemoapp.repository.DemoRepository;
import org.javers.core.Javers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DemoRunner implements CommandLineRunner {

    private DemoRepository demoRepository;
    private Javers javers;

    @Autowired
    public DemoRunner(DemoRepository demoRepository,
                      Javers javers) {
        this.demoRepository = demoRepository;
        this.javers = javers;
    }

    @Override
    public void run(String... args) throws Exception {
        Person personOne = new Person();
        Person personTwo = new Person();

        personOne.setName("John");
        personTwo.setName("Chris");

        javers.commit("cahlen", personOne);
        javers.commit("cahlen", personTwo);

        personOne.setName("Bill");
        personTwo.setName("George");

        demoRepository.save(personOne);
        demoRepository.save(personTwo);
    }
}
