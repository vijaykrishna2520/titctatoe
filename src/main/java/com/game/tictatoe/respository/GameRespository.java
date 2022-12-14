package com.game.tictatoe.respository;

import com.game.tictatoe.entity.GameEntity;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GameRespository extends CrudRepository<GameEntity,Long>{
    @Modifying
    @Query("update Game set "+"box"+":boxNumber"+":::")
    void updateBoxByPlayerIdAndGameId(GameEntity gameEntity, @Param("playerId") int playerId,@Param("boxNumber") int boxNumber);
}
