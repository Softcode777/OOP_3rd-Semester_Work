package LAB_Assignment_2;
class S2_Book {
    private String author;
    private String[] chapterNames;
    private int chapterCount;

    //  No-argument constructor
    public S2_Book() {
        this.author = "Unknown";
        this.chapterNames = new String[100]; // Maximum of 100 chapters
        this.chapterCount = 0;
    }

    //  Parameterized constructor
    public S2_Book(String author, String[] chapterNames) {
        this.author = author;
        this.chapterNames = new String[100];

        //Using a simple for loop to copy chapter names
        for (int i = 0; i < chapterNames.length; i++) {
            this.chapterNames[i] = chapterNames[i]; // Copy chapter names
        }
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setChapterNames(String[] chapterNames) {
        this.chapterCount = chapterNames.length; // Update chapter count
        for (int i = 0; i < chapterCount; i++) {
            this.chapterNames[i] = chapterNames[i]; // Copy chapters
        }
    }

    public int getChapterCount() {
        return chapterCount;
    }

    public boolean compareBooks(S2_Book b) {
        return this.author.equals(b.author);
    }

    //  Compare number of chapters (simplified)
    public S2_Book compareChapterNames(S2_Book b) {
        return (this.chapterCount >= b.chapterCount) ? this : b;
    }

    //  Display book details
    public void displayBook() {
        System.out.println("Author: " + author);
        System.out.println("Number of Chapters: " + chapterCount);
        System.out.println("-----------------------------");
    }
}


