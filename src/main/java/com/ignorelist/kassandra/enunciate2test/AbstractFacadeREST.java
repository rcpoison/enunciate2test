/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ignorelist.kassandra.enunciate2test;

import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author poison
 * @param <K> key type
 * @param <T> entity type
 */
public abstract class AbstractFacadeREST<K, T extends EntityInterface<K>> {

	/**
	 * find all entities
	 *
	 * @return
	 */
	@GET
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public List<T> findAll() {
		throw new UnsupportedOperationException("example");
	}

	/**
	 * find entity by its unique id
	 *
	 * @param id unique id
	 * @return the entity
	 */
	@GET
	@Path("{id}")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public T find(@PathParam("id") K id) {
		throw new UnsupportedOperationException("example");
	}

	/**
	 * persist entity
	 *
	 * @param entity the entity to persist
	 * @return the persisted entity
	 */
	@POST
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public T create(T entity) {
		throw new UnsupportedOperationException("example");
	}

	/**
	 * edit entity
	 *
	 * @param entity the entity to edit
	 * @return the edited entity
	 */
	@PUT
	@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public T edit(T entity) {
		throw new UnsupportedOperationException("example");
	}

	/**
	 * delete entity by its unique id
	 *
	 * @param id the unique id
	 * @return the deleted entity
	 */
	@DELETE
	@Path("{id}")
	@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
	public T delete(@PathParam("id") K id) {
		throw new UnsupportedOperationException("example");
	}

}
