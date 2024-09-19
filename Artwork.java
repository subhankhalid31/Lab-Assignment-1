public class Artwork{

private String title;
private int year;
private Artist artist;
 
}

public settitle(String title){
this.title=title;
}

public setyear(int year){
this.year=year
}

public setartist(Artist artist){
this.artist= artist
}

public String get title(){
return title;
}

public int getyear()
return year;
}

public String getartist(){
return artist;
}

public void displayartwork(){

  System.out.println("Artist year" + year);
  System.out.println("Artwork title;" + title);
  artist.displayartist();
  
  


}

