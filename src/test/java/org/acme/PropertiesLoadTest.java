package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.eclipse.microprofile.config.inject.ConfigProperty;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

@QuarkusTest
public class PropertiesLoadTest {

    @ConfigProperty(name = "config.from.test.application")
    String testProperty;

    @Test
    public void propertyFromTest() {
        Assertions.assertEquals("hello from test/resources", testProperty);
    }


}
