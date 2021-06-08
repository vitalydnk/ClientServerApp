import com.clientserverapp.Phone;

import java.io.*;
import java.net.UnknownHostException;

public class Client {
    public static void main(String[] args) {
        try (Phone phone = new Phone ("127.0.0.1", 8000)) {
            System.out.println("Connected to server...");

            String request = "Minsk";
            System.out.println("Request : " + request);
            phone.writeLine(request);

            String response = phone.readLine();
            System.out.println("Response : " + response);

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}