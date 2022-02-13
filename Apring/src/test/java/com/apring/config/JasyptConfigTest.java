package com.apring.config;

import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JasyptConfigTest {


    @Test
    @DisplayName("DB 암호화 처리")
    void jasypt() {
        String username = "";
        String password = "";
        System.out.println("username = " + jasyptEncoding(username));
        System.out.println("jasypt = " + jasyptEncoding(password));
    }

    public String jasyptEncoding(String value) {

        String key = "kimsunho";
        StandardPBEStringEncryptor pbeEnc = new StandardPBEStringEncryptor();
        pbeEnc.setAlgorithm("PBEWithMD5AndDES");
        pbeEnc.setPassword(key);
        return pbeEnc.encrypt(value);
    }

}