import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NameClassCodeGym {
    private static final String NAME_CLASS_RERGEC = "^[CAP][0-9]{4}[GHIKLM][0-9]$";
    public NameClassCodeGym() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(NAME_CLASS_RERGEC);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();

    }
}
