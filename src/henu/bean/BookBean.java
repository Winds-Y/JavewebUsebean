package henu.bean;

/**
 * User: Yangtse
 * Date: 2017/11/20
 * Time: 18:45
 */
public class BookBean {
    public static final String BOOKNAME="bookName" ;
    public static final String BOOKPRICE="bookPrice";
    public static final String BOOKAUTHOR="bookAuthor";
    public static final String BOOKPUBLISHER="bookPublisher";
    public static final String BOOKMODIFYNUMBER="bookModifyNumber";
    private String bookName;
    private String bookPrice;
    private String bookAuthor;
    private String bookPublisher;
    private int bookModifyNumber;
    public BookBean(){}
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(String bookPrice) {
        this.bookPrice = bookPrice;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookPublisher() {
        return bookPublisher;
    }

    public void setBookPublisher(String bookPublisher) {
        this.bookPublisher = bookPublisher;
    }

    public int getBookModifyNumber() {
        return bookModifyNumber;
    }

    public void setBookModifyNumber(int bookModifyNumber) {
        this.bookModifyNumber = bookModifyNumber;
    }
}
