package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldNumberSquares() {
        SQRService sQRService = new SQRService();
        int min = 200;
        int max = 300;
        int expected = 3;
        int actual = sQRService.numberSquares(min, max);
        assertEquals(actual, expected);
    }

    @Test
    void shouldNumberSquaresBoundaryValues() {
        SQRService sQRService = new SQRService();
        int min = 100;
        int max = 9801;
        int expected = 90;
        int actual = sQRService.numberSquares(min, max);
        assertEquals(actual, expected);
    }

    @Test
    void shouldNumberSquaresOverOverlimit() {
        SQRService sQRService = new SQRService();
        int min = 200;
        int max = 9999;
        int expected = 85;
        int actual = sQRService.numberSquares(min, max);
        assertEquals(actual, expected);
    }

    @Test
    void shouldNumberSquaresUnderLimit() {
        SQRService sQRService = new SQRService();
        int min = 50;
        int max = 300;
        int expected = 8;
        int actual = sQRService.numberSquares(min, max);
        assertEquals(actual, expected);
    }
}