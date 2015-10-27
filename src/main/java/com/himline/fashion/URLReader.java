package com.himline.fashion;

import java.io.*;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
public class URLReader {
	public static void main(String[] args) {
		URL url;
		try {
			// Define your URL
			url = new URL("http://www.google.com");
			URLConnection conn = url.openConnection();
			// open the stream and put it into BufferedReader
			BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			String inputLine;
			// Save text file (HTML Source)
			String fileName = "C:/web-content.txt";
			File file = new File(fileName);

			if (!file.exists()) {
				file.createNewFile();
			}
      		// use FileWriter to write file
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			System.out.println("Printing WebPage source on console, Please wait...");
			while ((inputLine = br.readLine()) != null) {
				System.out.println(inputLine);
				bw.write(inputLine);
			}
			bw.close();
			br.close();
			System.out.println("Your file is save in C drive! Congratulations ");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
