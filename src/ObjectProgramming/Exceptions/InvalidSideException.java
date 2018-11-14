package ObjectProgramming.Exceptions;

public class InvalidSideException extends Exception {

    private String messae = "Podane pole ma niepoprawna wartosc.";

    public String getMessae() {
        return messae;
    }
}
