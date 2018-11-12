package a_Zadania.a_Dzien_1.b_Interfejsy;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtendedUrl implements Url {
    @Override
    public String getParam(String name, String url) {
        String param = "";
        Pattern pattern = Pattern.compile(name + "\\.([^\\/]+)");
        Matcher m = pattern.matcher(url);

        if (m.find()) {
            param = m.group(1);
        }
        return param;
    }
}
