package LAB_Assignment_2;

public class S2_Book {
    private String author;
    private String[] chapterNames;

    public S2_Book() {
        this.author = "NA";
        this.chapterNames = new String[100];
    }

    public S2_Book(String author, String[] chapterNames) {
        this.author = author;
        this.chapterNames = chapterNames;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String[] getChapterNames() {
        return chapterNames;
    }
    public void setChapterNames(String[] chapterNames) {
        this.chapterNames = chapterNames;
    }

    public boolean compareBooks(S2_Book b) {
        if (this.author.equals(b.getAuthor())) {
            return true;
        } else {
            return false;
        }
    }

    public S2_Book compareChapterNames(S2_Book b) {
        int thisChapterCount = countChapters(this.chapterNames);
        int otherChapterCount = countChapters(b.getChapterNames());

        if (thisChapterCount > otherChapterCount) {
            return this;
        } else {
            return b;
        }
    }

    // Helper method to count non-null chapters
    private int countChapters(String[] chapters) {
        int count = 0;
        for (String chapter : chapters) {
            if (chapter != null) {
                count++;
            }
        }
        return count;
    }
}
