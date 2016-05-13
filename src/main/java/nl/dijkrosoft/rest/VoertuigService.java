/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.dijkrosoft.rest;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import nl.dijkrosoft.jpa.jpamappedsuper.Auto;
import nl.dijkrosoft.jpa.jpamappedsuper.Fiets;

/**
 *
 * @author dick
 */
@Path("vrtg")
@Stateless
public class VoertuigService {

	@PersistenceContext
	EntityManager em;

	/**
	 *
	 * @param cilinders
	 * @return
	 */
	@Path("auto")
	@POST
	public Response createAuto(@QueryParam("cilinders") String cilinders) {
		Auto auto = new Auto(Integer.parseInt(cilinders));
		em.persist(auto);

		return Response.ok(auto).build();
	}

	@Path("fiets")
	@POST
	public Response createFiets(@QueryParam("groep") String groep) {
		Fiets f = new Fiets(groep);
		em.persist(f);

		return Response.ok(f).build();
	}

	@GET
	public Response status() {
		return Response.ok("Alles fine").build();
	}
}
