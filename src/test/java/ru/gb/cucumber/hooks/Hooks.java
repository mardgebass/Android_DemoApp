package ru.gb.cucumber.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

        @Before
        public void prepareData() {
            System.out.println("Привет, все подготовительные шаги здесь.");
        }

        @After
        public void clearData() {
            System.out.println("Пока, закрываю драйвер.");
        }
    }
