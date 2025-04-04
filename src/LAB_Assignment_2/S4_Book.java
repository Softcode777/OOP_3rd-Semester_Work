package LAB_Assignment_2;

public class S4_Book extends S4_Publication {
    private int pageCount;

    // Getters and Setters
    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    // Display method
    @Override
    public void display() {
        super.display();
        System.out.println("Page Count: " + pageCount);
    }
}