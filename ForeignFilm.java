import java.util.ArrayList;
public class ForeignFilm extends Film
{  
   private String language;
   protected ArrayList<String> subTitle=new ArrayList<String>();
   private String translation;
  
   
   public ForeignFilm(String filmName,String director,int yearOfRelease,
           String language,String translation)
   {
      
       super(filmName, director, yearOfRelease);
       
       this.language=language;
       this.translation=translation;      
   }
  
   
   public void addSubtitle(String subtitle)
   {
       subTitle.add(subtitle);
   }
  
  
  
   @Override
   public String toString()
   {
       String foreignMovie=""; 
      
       foreignMovie= super.toString();
      
       foreignMovie+="\nLanguage used :"+language+
               "\nSubtitle Information:"+subTitle.toString()+
               "\n Translation of movie found: "+translation+"\n -------------------------------------------";
      
       return foreignMovie;
   }
  
  
}