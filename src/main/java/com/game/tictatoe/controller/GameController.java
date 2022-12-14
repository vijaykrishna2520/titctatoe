package com.game.tictatoe.controller;

import com.game.tictatoe.entity.GameEntity;
import com.game.tictatoe.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GameController {
    @Autowired
    private GameService gameService;
    @GetMapping("/games")
    public List<GameEntity> getAllGames(){
        return gameService.getAllGames();
    }
    @PostMapping("/game")
    public GameEntity addGame(@RequestBody GameEntity gameEntity){
        return gameService.addGame(gameEntity);
    }
    @GetMapping("/game/{id}")
    public GameEntity getGameByd(@PathVariable Long id){
        return gameService.getGameById(id);
    }
    @PostMapping("/games")
    public List<GameEntity> addGames(@RequestBody List<GameEntity> gameEntities){
        return gameService.addGames(gameEntities);
    }
    @PutMapping("/game/{id}")
    public GameEntity updateGameById(@PathVariable Long id,@RequestBody GameEntity gameEntity){
        return gameService.updateGameById(id,gameEntity);
    }
    @DeleteMapping("/game/{id}")
    public ResponseEntity<String> deleteGameById(@PathVariable Long id){
        if (gameService.deleteGameById(id)) {
            return new ResponseEntity<String>("Game deleted successfully", HttpStatus.OK);
        } else {
            return new ResponseEntity<String>("Failed to delete Game",HttpStatus.OK);
        }
    }
    @PutMapping("/box")
    public String updataBoxValue(@RequestParam Long gameId,@RequestParam Long playerId,@RequestParam int boxNumber){
        gameService.updateBoxValue(gameId,playerId,boxNumber);
    }

}
