public class Training{
    private String A;
    private String B;
    private String c;
    // Obs: Sugerível mudar para enum para melhor performance.
    private LocalDate dayOfWeek;
    private boolean status;


    public Training(String a, String b, String c) {
        A = a;
        B = b;
        this.c = c;
    }

    public String getA() {
        return A;
    }

    public void setA(String a) {
        A = a;
    }

    public String getB() {
        return B;
    }

    public void setB(String b) {
        B = b;
    }

    public String getC() {
        return c;
    }

    public void setC(String c) {
        this.c = c;
    }
}