package com.example.testmovie.service;

import com.example.testmovie.DAO.Actor;
import com.example.testmovie.utils.ConditionalObj;

import java.util.ArrayList;

public interface ActorService {
    ArrayList<Actor> getAllActors();

    ArrayList<Actor> getActorByNotDefinedName(ConditionalObj co);

    int deleteActorById(Actor actor);

    int deleteActorByName(Actor actor);

    int updateActor(Actor actor);

    int addActor(Actor actor);

}
