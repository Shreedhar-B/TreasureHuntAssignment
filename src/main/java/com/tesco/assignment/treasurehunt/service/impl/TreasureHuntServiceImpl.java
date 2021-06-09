package com.tesco.assignment.treasurehunt.service.impl;

import com.tesco.assignment.treasurehunt.constants.CommonConstants;
import com.tesco.assignment.treasurehunt.service.TreasureHuntService;
import org.springframework.stereotype.Component;

@Component
public class TreasureHuntServiceImpl implements TreasureHuntService {

    @Override
    public String solveTreasureHunt(int[][] array) {

        StringBuilder stringBuilder = new StringBuilder().append("Row").append("\t").append("Column").append("\n");

        solveTreasureHunt(array, 1, 1, stringBuilder);

        return stringBuilder.toString();
    }

    private void solveTreasureHunt(int[][] arr, int row, int column, StringBuilder stringBuilder) {

        row -= 1;
        column -= 1;

        int temp = arr[row][column];

        if (temp < 11 || temp > 55) {
            stringBuilder.append(CommonConstants.TREASURE_NOT_FOUND);
            return;
        }

        int nextRow = temp / 10;
        int nextColumn = temp % 10;

        if (nextRow - 1 == row && nextColumn - 1 == column) {
            stringBuilder.append(row + 1).append("\t").append(column + 1).append("\n");
            stringBuilder.append(CommonConstants.TREASURE_FOUND).append(" at ").append(row + 1).append("\t")
                    .append(column + 1).append("\n");
            return;
        }

        stringBuilder.append(row + 1).append("\t").append(column + 1).append("\n");

        arr[row][column] = -arr[row][column];

        solveTreasureHunt(arr, nextRow, nextColumn, stringBuilder);

    }

    private void validateElement(int temp) {
        if (temp > 55 || temp < 11) {
            throw new RuntimeException(CommonConstants.INPUT_NOT_VALID);
        }
    }
}
