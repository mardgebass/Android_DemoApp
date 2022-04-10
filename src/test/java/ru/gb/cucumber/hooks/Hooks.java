package ru.gb.cucumber.hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

        @Before
        public void prepareData() {
            System.out.println("Привет, огурец. Я пишу ПЕРЕД тестом! Можно делать все подготовительные шаги здесь.");
        }

        @After
        public void clearData() {
            System.out.println("Пока, огурец. Я пишу ПОСЛЕ теста! Но можно делать, что угодно, например закрывать драйвер.");
        }
    }
