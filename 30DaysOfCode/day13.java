class MyBook extends Book{
    String title;
    String author;
    int p;
    
    MyBook(String title , String author , int price ){
       super(title,author);
       this.p = price;
       this.title = title;
       this.author = author;
    }
    
    void display(){
       System.out.println("Title: " +title);
       System.out.println("Author: " +author);
       System.out.println("Price: " +p);
    }
}
