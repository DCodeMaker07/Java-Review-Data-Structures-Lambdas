package org.TLPS1.dataStructures.queue;

public class Work {

    private String title;
    private String author;
    private boolean isPrinted;

    public Work(String title, String author) {
        this.title = title;
        this.author = author;
        this.isPrinted = false;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isPrinted() {
        return isPrinted;
    }

    public void setPrinted(boolean printed) {
        isPrinted = printed;
    }

    @Override
    public String toString() {
        return "Work{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isPrinted=" + isPrinted +
                '}';
    }
}
