/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.dijkrosoft.rest;

import java.math.BigInteger;
import java.util.Date;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import nl.rabo.rhd.Registergoed;
import nl.rabo.rhd.Verbouwing;

/**
 *
 * @author dick
 */
@Path("rhd")
@Stateless
public class RegistergoedService {

	@PersistenceContext
	EntityManager em;

	@POST
	@Path("metVerbouwing")
	public Response create() {
		Registergoed rg = new Registergoed();
		rg.setGemeente("mijn gem " + new Date());

		Verbouwing verb = new Verbouwing();
		verb.setVerbouwKostenOmschrijving("Keuken "+ new Date());
		rg.setVerbouwing(verb);
		verb.setRegistergoed(rg);

		em.persist(rg);

		return Response.ok().build();
	}

	@POST
	@Path("zonderVerbouwing")
	public Response createZonder() {
		Registergoed rg = new Registergoed();
		rg.setGemeente("mijn gem \n"
                        + " \n"
                        + "jdbc/moaDatasourceOracle   " + new Date());

		em.persist(rg);

		return Response.ok().build();
	}

}
