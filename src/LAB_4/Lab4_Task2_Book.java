package LAB_4;

//public class Lab4_Task2_Book {
//}

class Book {
    private String author;
    private String[] chapterNames;

    // No-arg constructor
    public Book() {
        author = "";
        chapterNames = new String[100];
    }

    // Two-arg constructor
    public Book(String author, String[] chapters) {
        this.author = author;
        this.chapterNames = chapters;
    }

    // Setters
    public void setAuthor(String author) {
        this.author = author;
    }

    public void setChapters(String[] chapters) {
        this.chapterNames = chapters;
    }

    // Getters
    public String getAuthor() {
        return author;
    }

    public String[] getChapters() {
        return chapterNames;
    }

    // Compare Authors
    public boolean compareBooks(Book b) {
        return this.author.equalsIgnoreCase(b.author);
    }

    // Compare Chapter Lengths
    public Book compareChapterNames(Book b) {
        int count1 = countChapters(this.chapterNames);
        int count2 = countChapters(b.chapterNames);
        return (count1 > count2) ? this : b;
    }

    private int countChapters(String[] chapters) {
        int count = 0;
        for (String s : chapters) {
            if (s != null && !s.isEmpty()) count++;
        }
        return count;
    }
}

