package com.game.tictatoe.respository;

import com.game.tictatoe.entity.GameEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRespository extends CrudRepository<GameEntity,Long>{
}
