package com.adobe.people.justinedelson.uberjardemo.impl;

import org.apache.sling.auth.core.spi.DefaultAuthenticationFeedbackHandler;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class ClassExtendingDefaultAuthenticationFeedbackHandlerTest {

    @Test
    public void shouldInitialiseObfuscatedClass() {
        DefaultAuthenticationFeedbackHandler handler = new ClassExtendingDefaultAuthenticationFeedbackHandler();
        assertNotNull(handler);
    }
}