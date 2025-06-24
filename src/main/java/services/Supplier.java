package services;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/supplier")
public class Supplier {

	@POST
	@Path("{supplier-id}")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	public String sendOrder(@PathParam("supplier-id") String supplierId, String orderNumber) {
		System.out.println(String.format("Supplier %s received the order %s", supplierId ,orderNumber));
		return "receipt-"+supplierId+"-"+orderNumber;
	}

	@DELETE
	@Path("{supplier-id}")
	@Consumes(MediaType.TEXT_PLAIN)
	@Produces(MediaType.TEXT_PLAIN)
	public String cancelOrder(@PathParam("supplier-id") String supplierId, String orderNumber) {
		System.out.println(String.format("Supplier %s acknoledeges the order cancellation %s", supplierId ,orderNumber));
		return "cancel-ack-"+supplierId+"-"+orderNumber;
	}
}
