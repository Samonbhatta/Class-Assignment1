import java.util.Scanner;
public class Demo
{
   public static void main(String[] args)
   {

       final int size=10;
       int userChoice;
       
       Film[] films=new Film[size];
       Scanner scanner=new Scanner(System.in);

       int index=0;

       String filmName;
       String director;
       int yearOfRelease;
       String language;
       String subTitle;
       String translation;
       String secondLanguage;
       String song;
       char ch;

       do
       {

           userChoice=menu();

           switch (userChoice)
           {
           case 1:      
               System.out.println("Enter film name");
               filmName=scanner.nextLine();
               System.out.println("Enter direcitor name");
               director=scanner.nextLine();
               System.out.println("Enter year of release");
               yearOfRelease=scanner.nextInt();
               scanner.nextLine();
               films[index]=new Film(filmName, director, yearOfRelease);

               break;
           case 2:  
               System.out.println("Enter film name");
               filmName=scanner.nextLine();
               System.out.println("Enter direcitor name");
               director=scanner.nextLine();
               System.out.println("Enter year of release");
               yearOfRelease=scanner.nextInt();
               scanner.nextLine();
               System.out.println("Enter languages in which the film is released.");
               language=scanner.nextLine();
               System.out.println("Enter tanslation of film in different language (if applicable)");
               translation=scanner.nextLine();

               ForeignFilm foreignFilm=new ForeignFilm(filmName, director, yearOfRelease, language, translation);

               System.out.println("Enter sub title");

               do
               {
                   subTitle=scanner.nextLine();
                   foreignFilm.addSubtitle(subTitle);

                   System.out.println("Would you like to add more? Press (y) to add more else press(n).");
                   ch=scanner.nextLine().charAt(0);
                   scanner.nextLine();

               }while(ch!='n');


               //assign the object to the array of films at index
               films[index]=foreignFilm;

               break;
           case 3:  
               System.out.println("Enter film name");
               filmName=scanner.nextLine();
               System.out.println("Enter direcitor name");
               director=scanner.nextLine();
               System.out.println("Enter year");
               yearOfRelease=scanner.nextInt();
               scanner.nextLine();
               System.out.println("Enter language");
               language=scanner.nextLine();
               System.out.println("Enter tanslation");
               translation=scanner.nextLine();

               BollywoodFilm bollywoodFilm=new BollywoodFilm(filmName, director, yearOfRelease, language, translation);

               System.out.println("Enter sub title");

               do
               {
                   subTitle=scanner.nextLine();
                   bollywoodFilm.addSubtitle(subTitle);

                   System.out.println("Would you like to add more? Press (y) to add more else press(n).");
                   ch=scanner.next().charAt(0);
                   scanner.nextLine();

               }while(ch!='n');

               System.out.println("Enter second language");

               do
               {
                   secondLanguage=scanner.nextLine();
                   bollywoodFilm.addSecondLanguage(secondLanguage);

                   System.out.println("Would you like to add more? /n Press (y) to add more else press(n).");
                   ch=scanner.next().charAt(0);
                   	scanner.nextLine();
               }while(ch!='n');

               System.out.println("Enter song name");

               do
               {
                   song=scanner.nextLine();
                   bollywoodFilm.addSong(song);

                   System.out.println("Would you like to add more? /n Press (y) to add more else press(n).");
                   ch=scanner.next().charAt(0);
                   scanner.nextLine();

               }while(ch!='n');
               
               films[index]=bollywoodFilm;              
               break;

           case 4:
               
               System.out.println("All Movie Details");
               for (int i = 0; i < index; i++)
               {
                   System.out.println(films[i]);
               }
               break;
           case 5:
               
               System.out.println("Program terminated. /n Have a wonderful day!");
               System.exit(0);

           }
          
          
           
           index=index+1;

       }while(true);
       
   }

  
   
   private static int menu()
   {

       Scanner scanner=new Scanner(System.in);
       System.out.println("Press 1 to enter detail of English Film!");
       System.out.println("Press 2 to enter detail of Foreign Film!");
       System.out.println("Press 3 to enter detail of Bollywood Film");
       System.out.println("Press 4 to get the entered movies with details");
       System.out.println("Press 5 to terminate the program. ");

       System.out.println("Enter your choice .");
       int choice=scanner.nextInt();

       return choice;

   }
}