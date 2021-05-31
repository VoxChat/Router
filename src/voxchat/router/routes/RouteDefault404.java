package voxchat.router.routes;

import voxchat.router.enums.StatusCode;
import voxchat.router.objects.Request;
import voxchat.router.objects.Response;

/**
 * The default 404 handler. Sends "404. Route not found." as plain text back to the client.
 * @author Eric Golde
 *
 */
public class RouteDefault404 implements Route404 {

	@Override
	public void send404(Request req, Response res) {
		res.setStatusCode(StatusCode.NOT_FOUND);
		res.sendText("404. Route not found.");
	}

}
