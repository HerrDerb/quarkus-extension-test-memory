package com.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import io.quarkus.test.QuarkusUnitTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

class Test5 {
    
    @RegisterExtension
    static final QuarkusUnitTest config = new QuarkusUnitTest().withConfigurationResource("application.properties");

    @Test
    void test(){
        assertTrue(true);
    }
}
