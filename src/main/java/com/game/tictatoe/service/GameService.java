package com.game.tictatoe.service;

import com.game.tictatoe.entity.GameEntity;
import com.game.tictatoe.respository.GameRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {
    @Autowired
    private GameRespository gameRespository;
    public List<GameEntity> getAllGames(){
        return (List<GameEntity>)gameRespository.findAll();
    }
    public GameEntity addGame(GameEntity gameEntity){
        return gameRespository.save(gameEntity);
    }

    public GameEntity getGameById(Long id) {
        Optional<GameEntity> gameEntity= gameRespository.findById(id);
        if (gameEntity.isPresent()) {
            return gameEntity.get();
        } else {
            return null;
        }
    }

    public List<GameEntity> addGames(List<GameEntity> gameEntities) {
        return (List<GameEntity>)gameRespository.saveAll(gameEntities);
    }

    public Boolean deleteGameById(Long id) {
        if (getGameById(id)!=null) {
            gameRespository.deleteById(id);
            return true;
        } else {
            return false;
        }
    }

    public GameEntity updateGameById(Long id,GameEntity gameEntity) {
        gameEntity.setId(id);
        return gameRespository.save(gameEntity);
    }

    public GameEntity updateBoxValue(Long gameId, Long playerId,int boxNumber) {
        GameEntity gameEntity=getGameById(gameId);
        if(gameEntity!=null){

        }
        else{
            return null;
        }
    }
    public GameEntity updateBoxByPlayerIdAndGameId(GameEntity gameEntity,Long playerId,int boxNumber){
        if(playerId==1){
            gameRespository.updateBoxByPlayerIdAndGameId(gameEntity,1,boxNumber);

        }
    }

}
