package LAB_Assignment_2;
//public class Scenario2_BookComparisonSystem {
//}
class Book {
    private String author;
    private String[] chapterName = new String[100];

    public Book() {
        author = "jhon";
        for (int i = 0; i < 100; i++) {
            chapterName[i] = "";
        }
    }

    public Book(String author, String[] chapterName) {
        this.author = author;
        for (int i = 0; i < chapterName.length; i++) {
            this.chapterName[i] = chapterName[i];
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String[] getChapterName() {
        return chapterName;
    }

    public void setChapterName(String[] chapterName) {
        for (int i = 0; i < chapterName.length; i++) {
            this.chapterName[i] = chapterName[i];
        }
    }

    public boolean compareBook(Book b) {
        return this.author.equals(b.author);
    }

    public Book compareChapterName(Book b) {
        int thisBookchapterCount = 0;
        int otherBookchapterCount = 0;
        for (String chapter : this.chapterName) {
            if (chapter != null && !chapter.isEmpty()) {
                otherBookchapterCount++;
            }
        }

        if (thisBookchapterCount > otherBookchapterCount) {
            return this;
        } else {
            return b;
        }
    }

//    Method to display Book Info
    public void displayBookInfo() {
        System.out.println("Author:" + author);
        System.out.println("Chapter:");
        for (String chapter : chapterName) {
            if (chapter != null && !chapter.isEmpty()) {
                System.out.println(chapter + ",");
            }
        }
    }
}