
// Імпорт бібліотеки для виконання запитів до веб-сервера
import org.apache.xmlrpc.XmlRpcClient;
import java.util.Vector;

public class ClientApp {
	public static void main(String[] args) {
		try {
			// Підключення до сервера, змінено порт на 9090
			XmlRpcClient serverConnection = new XmlRpcClient("http://localhost:9090");

			// Підготовка параметрів для запиту, використовуючи Vector
			Vector<Integer> parameters = new Vector<>();
			parameters.add(8);
			parameters.add(15);

			// Виконання методу на сервері з новою назвою методу
			int response = (Integer) serverConnection.execute("calcHandler.addNumbers", parameters);

			// Виведення результату
			System.out.println("Computed sum: " + response);
		} catch (Exception e) {
			// Виведення помилки в разі проблеми з сервером
			System.err.println("ClientApp error: " + e);
		}
	}
}
