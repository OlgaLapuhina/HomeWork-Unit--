package org.example;

import org.junit.jupiter.api.*;

@DisplayName("Тестирование: SalesManager")
public class SalesManagerTest {
    private SalesManager salesManager;

    @BeforeEach
    void setUp() {
        salesManager = new SalesManager(new long[]{1, 2, 3, 4, 5});
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("Тестирование завершено.");
    }

    @Test
    @DisplayName("Тестирование на максимальную сумму")
    void max() {
        Assertions.assertEquals(5, salesManager.max());
    }

    @Test
    @DisplayName("Тестирование на минимальную сумму")
    void min() {
        Assertions.assertEquals(1, salesManager.min());
    }

    @Test
    @DisplayName("Тестирование на среднее арифметическое")
    void mediumCropped() {
        Assertions.assertEquals(3, salesManager.mediumCropped());
    }

}
