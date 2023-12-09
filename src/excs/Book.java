package excs;

public class Book {

    private String name;
    private int yearPublished;
    private int numberOfPages;

    public Book(String name, int yearPublished1, int numberOfPages){
        this.name = name;
        this.numberOfPages = numberOfPages;
        yearPublished = yearPublished1;
    }

    public Book(){}

    public String getName(){
        return name;
    }
    public int getYearPublished(){
        return yearPublished;
    }
    public int getNumberOfPages(){
        return numberOfPages;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setYearPublished(int yearPublished){
        this.yearPublished = yearPublished;
    }
    public  void setNumberOfPages(int numberOfPages){
        this.numberOfPages = numberOfPages;
    }
}
