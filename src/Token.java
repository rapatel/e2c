public class Token {
    public TK kind;
    public String string;
    public int lineNumber;
    boolean arr;
    public Token(TK kind, String string, int lineNumber) {
        this.kind = kind;
        this.string = string;
        this.lineNumber = lineNumber;
        this.arr = false;
    }
    public Token(TK kind, String string, int lineNumber, boolean arr) {
        this.kind = kind;
        this.string = string;
        this.lineNumber = lineNumber;
        this.arr = true;
    }
    public String toString() { // make it printable for debugging
        return "Token("+kind.toString()+" "+string+" "+lineNumber+")";
    }
}
