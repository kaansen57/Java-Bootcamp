package com.company.business.concretes;

import com.company.business.abstracts.IGameService;
import com.company.entities.concretes.Game;

import java.util.List;

public class GameManager implements IGameService {
    @Override
    public void add(Game game) {
        System.out.println(game.getGameName() + " oyunu sisteme eklendi");
    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getGameName() + " oyunu sistemden silindi");

    }

    @Override
    public void update(Game game) {
        System.out.println(game.getGameName() + " oyunu güncellendi");

    }

    @Override
    public List<Game> getAll() {
        return null;
    }
}
