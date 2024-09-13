
// Імпорт бібліотеки для створення веб-сервера
import org.apache.xmlrpc.WebServer;

// Клас для веб-сервісу, який обробляє запити
public class ServiceHandler {
	// Метод для додавання двох чисел, названий інакше
	public int addNumbers(int a, int b) {
		return a + b; // Простий сумувальний метод
	}

	// Точка входу в програму
	public static void main(String[] args) {
		try {
			// Виведення повідомлення про старт сервісу
			System.out.println("XML-RPC Service is being initiated...");

			// Створення нового веб-сервера на порту 9090
			WebServer webServer = new WebServer(9090);

			// Додавання обробника запитів
			webServer.addHandler("calcHandler", new ServiceHandler());

			// Старт сервера
			webServer.start();
			System.out.println("Service is active.");
		} catch (Exception e) {
			// Обробка помилок при запуску
			System.err.println("Error initializing service: " + e);
		}
	}
}
