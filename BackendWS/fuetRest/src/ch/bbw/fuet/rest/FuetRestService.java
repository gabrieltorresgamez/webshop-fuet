package ch.bbw.fuet.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/")
public class FuetRestService {
	@GET
	@Path("/test")
	@Produces("text/plain")
	public String helloWorld() {
		return "hello welt";
	}
}
