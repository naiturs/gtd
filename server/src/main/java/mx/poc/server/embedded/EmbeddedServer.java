package mx.poc.server.embedded;

import org.eclipse.jetty.server.Server;

public class EmbeddedServer {

    public static void main(String[] args) throws Exception {
        Server server = new Server(8080);
        server.start();
        server.dumpStdErr();
        server.join();
    }

}
