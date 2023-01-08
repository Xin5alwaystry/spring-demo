package examples;

/**
 * @author xin5
 * @since 2023年01月08日 20:17:21
 */
public class ClientService {
    private static ClientService clientService = new ClientService();
    private ClientService() {}

    //静态工厂方法
    public static ClientService createInstance() {
        return clientService;
    }
}
