package Media;

public class Books extends Media {
    @Override
    public String BarrowBook() {
        return "IF book is available check out, if not reserve book";
    }
}
