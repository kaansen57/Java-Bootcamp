package com.company.business.abstracts;

import com.company.entities.concretes.Game;

import java.util.List;

public interface IGameService {
    void add(Game game);

    void delete(Game game);

    void update(Game game);

    List<Game> getAll();
}
