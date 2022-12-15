package com.game.tictatoe.entity;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.core.serializer.Serializer;

import java.io.Serializable;
import java.util.Objects;

@Table(name="Game")
@Entity
public class GameEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @JsonIgnore
    @Embedded
    private Box box;
    @JsonIgnore
    private int nextPlayer;
    @JsonIgnore
    private int winner=-1;
    @JsonIgnore
    private boolean gameOver=false;

    public GameEntity() {
    }

    public GameEntity(Long id, String name, Box box, int nextPlayer, int winner, boolean gameOver) {
        this.id = id;
        this.name = name;
        this.box = box;
        this.nextPlayer = nextPlayer;
        this.winner = winner;
        this.gameOver = gameOver;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    public int getNextPlayer() {
        return nextPlayer;
    }

    public void setNextPlayer(int nextPlayer) {
        this.nextPlayer = nextPlayer;
    }

    public int getWinner() {
        return winner;
    }

    public void setWinner(int winner) {
        this.winner = winner;
    }

    public boolean isGameOver() {
        return gameOver;
    }

    public void setGameOver(boolean gameOver) {
        this.gameOver = gameOver;
    }

    @Override
    public String toString() {
        return "GameEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", box=" + box +
                ", nextPlayer=" + nextPlayer +
                ", winner=" + winner +
                ", gameOver=" + gameOver +
                '}';
    }
}
