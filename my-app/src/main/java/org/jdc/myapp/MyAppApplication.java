package org.jdc.myapp;

import org.jdc.myapp.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.nio.file.FileStore;

@SpringBootApplication
public class MyAppApplication implements CommandLineRunner {

    private FileStore fileStore;
    @Autowired
    private StudentDao studentDao;

    public static void main(String[] args) {
        SpringApplication.run(MyAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        fileStore.printFileStoreInfo();
        studentDao.listEmails()
                .forEach(System.out::println);
    }
}
