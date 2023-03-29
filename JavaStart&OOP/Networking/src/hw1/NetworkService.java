package hw1;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class NetworkService {

	public static String getStringFromURL(String spec, String code) throws IOException {
		URL url = new URL(spec);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		String result = "";
		try (InputStream is = connection.getInputStream()) {

			BufferedReader br = new BufferedReader(new InputStreamReader(is, code));
			String temp = "";
			for (;;) {
				temp = br.readLine();
				if (temp == null) {
					break;
				}
				result += temp + System.lineSeparator();
			}

		} catch (IOException e) {
			throw e;
		}
		return result;
	}

	public static void saveURL(String spec, File file) {
		try (PrintWriter pr = new PrintWriter(file)){
			String response = getStringFromURL(spec, "UTF-8");
			String[] firstIndex = response.split("http");
			for (int i = 1; i < firstIndex.length; i++) {
				int index = 0;
				firstIndex[i] = "http" + firstIndex[i].replaceAll("\'", "\"");
				if (firstIndex[i].indexOf("\"") != -1) {
					index = firstIndex[i].indexOf("\"");
				}
				pr.print(firstIndex[i].substring(0, index) + System.lineSeparator());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}