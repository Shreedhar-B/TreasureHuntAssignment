package com.tesco.assignment.treasurehunt.controller;

import com.tesco.assignment.treasurehunt.service.TreasureHuntService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TreasureHuntController {

    private TreasureHuntService treasureHuntService;

    @Autowired
    public void setTreasureHuntService(TreasureHuntService treasureHuntService) {
        this.treasureHuntService = treasureHuntService;
    }

    @PostMapping(value = "/solve")
    public ResponseEntity<String> solvetreasureHunt(@RequestBody int[][] array){
        return ResponseEntity.ok(treasureHuntService.solveTreasureHunt(array));
    }

}
