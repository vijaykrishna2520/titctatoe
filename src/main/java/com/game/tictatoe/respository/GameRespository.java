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
    @Query(value="update Game set +" +
            "box:boxNumber=:boxValue," +
            "nextPlayer=:nextPlayer where gameId=:gameId",nativeQuery = true)
    public void updateBoxByPlayerIdAndGameId(@Param("gameId") Long gameId,
                                             @Param("nextPlayer") int nextPlayer,
                                             @Param("boxNumber") int boxNumber,
                                             @Param("boxValue") int boxValue);
}
