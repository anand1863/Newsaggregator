package DigitalNeewsStand.newagregator;

	import java.io.BufferedReader;
	import java.io.InputStreamReader;
	import java.net.URL;

	public class Keyvalue {

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			try {
				URL url = new URL("https://newsapi.org/v2/everything?q=bitcoin&from=2019-06-21&sortBy=publishedAt&apiKey=684a4f80b9ae457fb2bae62a8461da61");
				BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
				String str = "";
				while (null != (str = br.readLine())) {
					System.out.println(str);
				}
			} catch (Exception ex) {
				ex.printStackTrace();
			}
			   
		}
	}

