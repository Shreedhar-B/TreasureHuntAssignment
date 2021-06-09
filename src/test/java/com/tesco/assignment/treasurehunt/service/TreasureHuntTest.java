package com.tesco.assignment.treasurehunt.service;

import com.tesco.assignment.treasurehunt.constants.CommonConstants;
import com.tesco.assignment.treasurehunt.service.impl.TreasureHuntServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;


@RunWith(SpringRunner.class)
public class TreasureHuntTest {

    TreasureHuntService treasureHuntService = new TreasureHuntServiceImpl();

    @Test
    public void solveTreasureHuntTestTreasureFound() {

        int[][] arr = { { 34, 21, 32, 41, 25 },
                { 14, 42, 43, 14, 31 },
                { 54, 45, 52, 42, 23 },
                { 33, 15, 51, 31, 35 },
                { 21, 52, 33, 13, 23 } };

        assertTrue(treasureHuntService.solveTreasureHunt(arr).contains(CommonConstants.TREASURE_FOUND));

    }

    @Test
    public void solveTreasureHuntTestTreasureNotFound() {

        int[][] arr = { { 34, 21, 32, 41, 25 },
                { 14, 42, 43, 14, 31 },
                { 54, 45, 52, 42, 23 },
                { 33, 15, 51, 31, 35 },
                { 21, 22, 33, 13, 23 } };

        assertTrue(treasureHuntService.solveTreasureHunt(arr).contains(CommonConstants.TREASURE_NOT_FOUND));

    }

    @Test
    public void solveTreasureHuntTestInvalidInput() {

        int[][] arr = { { 34, 21, 32, 41, 25 },
                { 14, 42, 43, 66, 31 },
                { 54, 45, 52, 42, 23 },
                { 33, 15, 51, 31, 35 },
                { 21, 22, 33, 13, 23 } };

        Exception exception = assertThrows(RuntimeException.class, ()-> {
           treasureHuntService.solveTreasureHunt(arr);
        });

        assertEquals(CommonConstants.INPUT_NOT_VALID, exception.getMessage());

    }

}
