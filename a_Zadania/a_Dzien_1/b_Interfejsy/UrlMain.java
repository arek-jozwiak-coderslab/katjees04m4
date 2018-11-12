package a_Zadania.a_Dzien_1.b_Interfejsy;

public class UrlMain {

    public static void main(String[] args) {

        Url standardUrl = new StandardUrl();
        String url = "url_example?param1=99&param2=string";
        String param1 = standardUrl.getParam("param1", url);
        System.out.println(param1);
        Url extendedUrl = new ExtendedUrl();
        String url2 = "url_example/param1.99/param2.string";
        String param2 = extendedUrl.getParam("param1", url2);
        System.out.println(param2);


    }
}
