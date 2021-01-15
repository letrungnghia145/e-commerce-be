package com.tmdt.app.service;

import java.util.List;

public interface GenericService<Entity> {
	public List<Entity> getAll();

	public Entity getOne(Long id);

	public void add(Entity entity);

	public void delete(Long id);

	public void update(Entity entity);
}
