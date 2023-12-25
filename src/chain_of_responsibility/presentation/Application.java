package chain_of_responsibility.presentation;

import chain_of_responsibility.domain.*;


public class Application {
    public static void main(String[] args) {
        String inputStream = "method:GET\npath:/user\nsession:example";
        ChainService service = new ChainService();
        Request request = service.exec(inputStream);
        System.out.println(request.getMethod());
        System.out.println(request.getHeaders());
        System.out.println(request.getPath());
    }
}