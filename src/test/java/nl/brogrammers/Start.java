package nl.brogrammers;

import org.apache.wicket.util.time.Duration;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.bio.SocketConnector;
import org.eclipse.jetty.webapp.WebAppContext;

public class Start
{
    public static void main(String[] args) throws Exception
    {
	int timeout = (int) Duration.ONE_HOUR.getMilliseconds();

	Server server = new Server();
	SocketConnector connector = new SocketConnector();

	// Set some timeout options to make debugging easier.
	connector.setMaxIdleTime(timeout);
	connector.setSoLingerTime(-1);
	connector.setPort(9999);
	server.addConnector(connector);

	WebAppContext bb = new WebAppContext();
	bb.setServer(server);
	bb.setContextPath("/");
	bb.setWar("src/main/webapp");

	server.setHandler(bb);

	try
	{
	    server.start();
	} catch (Exception e)
	{
	    e.printStackTrace();
	    System.exit(1);
	}
    }
}
