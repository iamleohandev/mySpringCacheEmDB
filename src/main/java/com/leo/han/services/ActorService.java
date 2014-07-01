package com.leo.han.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.leo.han.beans.Actor;
import com.leo.han.dao.ActorDao;

public class ActorService {

	@Autowired
	private ActorDao actorDao;

	public List<Actor> getActors() {

		return actorDao.getActors();
	}

	public Actor getActorById(Integer id) {

		return actorDao.getActorById(id);
	}

}
