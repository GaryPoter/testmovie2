package com.example.testmovie.service;

import com.example.testmovie.DAO.Actor;
import com.example.testmovie.mappers.ActorMapper;
import com.example.testmovie.utils.ConditionalObj;
import com.example.testmovie.utils.Table;
import com.example.testmovie.utils.TableHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;

@Service
@Transactional(readOnly = true)
public class ActorServiceIml implements ActorService {

    @Autowired
    private ActorMapper actorMapper;

    @Override
    public ArrayList<Actor> getAllActors() {
        Table table = TableHelper.getTable("actor");
        return actorMapper.getObjWithParams(table);
    }

    @Override
    public ArrayList<Actor> getActorByNotDefinedName(ConditionalObj co) {
        Table table = TableHelper.getTable(Actor.TABLE_NAME);
        return actorMapper.getObjWithParams(table);
    }

    @Override
    public int deleteActorById(Actor actor) {
        Table table = TableHelper.getTable(Actor.TABLE_NAME);
        return actorMapper.deleteObjWithParams(table);
    }

    @Override
    public int deleteActorByName(Actor actor) {
        Table table = TableHelper.getTable(Actor.TABLE_NAME);
        return actorMapper.deleteObjWithParams(table);
    }

    @Override
    public int updateActor(Actor actor) {
        Table table = TableHelper.getTable(Actor.TABLE_NAME);
        return actorMapper.updateObjWirhParams(table);
    }

    @Override
    public int addActor(Actor actor) {
        Table table = TableHelper.getTable(Actor.TABLE_NAME);
        return actorMapper.addObjWithParams(table);
    }
}
