package com.tesco.assignment.treasurehunt.service;

import com.tesco.assignment.treasurehunt.apimodel.TreasureHuntResponseModel;
import org.springframework.stereotype.Service;

@Service
public interface TreasureHuntService {

    String solveTreasureHunt(int[][] array);

}
