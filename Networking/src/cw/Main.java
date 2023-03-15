package cw;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class Main {

  public static void main(String[] args) {
//    String spec = "https://dou.ua/";
//
//    try {
//      String html = NetworkService.getStringFromURL(spec, "UTF-8");
//      System.out.println(html);
//    } catch (IOException e) {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    }

    String spec = "https://s.dou.ua/CACHE/images/img/announces/Frame_383_1/75834a690f9c63c9a9b202d65a07500b.jpg";
//
//    File folder = new File("imgs");
//    folder.mkdirs();
//
//    try {
//      System.out.println(NetworkService.getFileFromURL(spec, folder));
//    } catch (IOException e) {
//      // TODO Auto-generated catch block
//      e.printStackTrace();
//    }

    try {
      Map<String, List<String>> headers = NetworkService.getHeadersFromURL(spec);
      for (String k : headers.keySet()) {
        System.out.println(k + " - " + headers.get(k));
      }
    } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }

  }
}

