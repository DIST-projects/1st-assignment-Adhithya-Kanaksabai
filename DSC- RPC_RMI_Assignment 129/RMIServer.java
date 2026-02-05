import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class RMIServer {

    public static void main(String[] args) {
        try {
            StudentService service = new StudentServiceImpl();

            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("StudentService", service);

            System.out.println("RMI Server started successfully");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
