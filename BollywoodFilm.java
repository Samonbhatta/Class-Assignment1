import java.util.ArrayList;
public class BollywoodFilm extends ForeignFilm
{
  
   
   private ArrayList<String>secondLanguageList=new ArrayList<String>();
   private ArrayList<String>songsList=new ArrayList<String>();
  
  
  
   public BollywoodFilm(String filmName,String director,int yearOfRelease,
           String language,String translation)
   {
      
       super(filmName, director, yearOfRelease, language, translation);      
   }
  
   public void addSubtitle(String subtitle)
   {
       subTitle.add(subtitle);
   }
  
  
   
   public void addSecondLanguage(String secondLaguage)
   {
       secondLanguageList.add(secondLaguage);
   }
  
  
  
   public void addSong(String songName)
   {
       songsList.add(songName);
   }
      
   
   @Override
   public String toString()
   {
      
       String bollyWoodMovie="";
       bollyWoodMovie=super.toString();
      
       bollyWoodMovie+="\n Secondary Languages(if any)"+secondLanguageList.toString();
       bollyWoodMovie+="\n Songs:\n "+songsList.toString();
      
       return bollyWoodMovie;
   }  }