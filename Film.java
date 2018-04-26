public class Film
{  
  
   private String filmName;
   private String director;
   private int yearOfRelease;

   public Film()
   {
       filmName="";
       director="";
       yearOfRelease=0;
   }

   public Film(String filmName,String director,int yearOfRelease)
   {
       this.filmName=filmName;
       this.director=director;
       this.yearOfRelease=yearOfRelease;
   }
  
   public void setName(String filmName)
   {
       this.filmName=filmName;
   }
  
   public String getName()
   {
       return filmName;
   }
  
   public void setDirector(String director)
   {
       this.director=director;
   }
  
   public String getDirector()
   {
       return director;
   }
  
   public void setYear(int yearOfRelease )
   {
       this.yearOfRelease=yearOfRelease;
   }
  
   public int getyearOfRelease()
   {
       return yearOfRelease;
   }
  
  
   @Override
   public boolean equals(Object obj)
   {
       Film film=(Film)obj;
       return filmName.equals(film.getName()) &&
               director.equals(film.getDirector()) &&
               yearOfRelease==film.getyearOfRelease();
   }
  
   
   @Override
   public String toString() {
      
       
       String strFilm="Name of Film:"+filmName+"\n"+
       "Name of Director(s):"+director+ ""+
               " \n Year of Release :"+yearOfRelease + "\n ---------------------------------------------------";
       return strFilm;
   }

}