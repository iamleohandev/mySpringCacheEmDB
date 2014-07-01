package com.leo.han.dao;

import java.util.List;

import com.leo.han.beans.Actor;

public interface ActorDao {

	List<Actor> getActors();

	Actor getActorById(Integer id);
}
