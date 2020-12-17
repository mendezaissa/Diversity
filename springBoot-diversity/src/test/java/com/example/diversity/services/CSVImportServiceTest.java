package com.example.diversity.services;

import com.example.diversity.DiversityApplication;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@ExtendWith(SpringExtension.class)
@ActiveProfiles("production")
class CSVImportServiceTest {
    @Autowired
    CSVImportService impo;

//    @Test
//    void importSenators() throws IOException {
//        impo.importSenators("/Users/amendez/Desktop/Github/Diversity/springBoot-diversity/src/main/java/com/example/diversity/services/FINAL_senators.csv");
//    }

//    @Test
//    void importMayors() throws IOException {
//        impo.importMayors("/Users/amendez/Desktop/Github/Diversity/springBoot-diversity/src/main/java/com/example/diversity/services/MayorsList.csv");
//    }

//    @Test
//    void importHORs() throws IOException{
//        impo.importHORs("/Users/amendez/Desktop/Github/Diversity/springBoot-diversity/src/main/java/com/example/diversity/services/final_HOR.csv");
//    }

//    @Test
//    void importGovernors() throws IOException{
//        impo.importGovernors("/Users/amendez/Desktop/Github/Diversity/springBoot-diversity/src/main/java/com/example/diversity/services/Governors.csv");
//    }

}