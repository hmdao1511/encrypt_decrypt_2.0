import java.util.ArrayList;

public class KeyOne {
    private String message;

    public KeyOne(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void changeMessage(String message) {
        ArrayList<Character> listOfChar = new ArrayList<>();
        for (int i = 0; i < message.length(); i++) {
            listOfChar.add(message.charAt(i));
        }
    }
}
