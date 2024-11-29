// The "TestAthena" class.
import java.awt.*;
import hsa.Console;


public class TheUnsaidTales
{
    // Name - Athena Jafari Parsa
    //Date - 3/31/2021
    //Class - IC3U1
    //Topic - CPT
    static Console c;

    //I'll make Genre a static array to use it in different methods.

    static String[] Genre = {" ", "Science fiction", "Horror", "Drama", "Suspense", "Action & adventure", "Romance"};

    //The string arrays below, will save the name of the stories in each genre.
    static String[] Sciencefiction = {" ", "Better than a Galaxy", "The Howls of the Night"};

    static String[] horror = {" ", "Sumar", "The Howls of the Night"};

    static String[] drama = {" ", "Filippa", "Better than a Galaxy"};

    static String[] suspense = {" ", "The Road"};

    static String[] action = {" ", "3 Weeks in Wilderness", "The Road"};

    static String[] romance = {" ", "Filippa", "Better than a Galaxy", };

    //This char will be used later in a loop  to be able to change the genre if the user doesn't like the randomized one.

    static char randomGenre = ' ';

    //FnameB and LnameB strings will be used in one of the stories (Better than a Galaxy) to choose a name for the main character.
    static String FnameB = " ";
    static String LnameB = " ";

    public static void main (String[] args) throws InterruptedException
    {
	c = new Console ();
       TheHowlsoftheNight();
	//Setting the color of the background
	c.setColor (Color.black);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Times New Roman", Font.PLAIN, 50));
	c.setColor (Color.white);

	//Displaying the name of the program letter by letter

	Thread.sleep (2000);
	c.drawString ("T", 100, 200);
	Thread.sleep (100);
	c.drawString ("h", 129, 200);
	Thread.sleep (100);
	c.drawString ("e", 155, 200);

	Thread.sleep (150);
	c.drawString ("U", 212, 200);
	Thread.sleep (100);
	c.drawString ("n", 247, 200);
	Thread.sleep (100);
	c.drawString ("s", 273, 200);
	Thread.sleep (100);
	c.drawString ("a", 293, 200);
	Thread.sleep (100);
	c.drawString ("i", 317, 200);
	Thread.sleep (100);
	c.drawString ("d", 332, 200);

	Thread.sleep (150);
	c.drawString ("T", 380, 200);
	Thread.sleep (100);
	c.drawString ("a", 405, 200);
	Thread.sleep (100);
	c.drawString ("l", 428, 200);
	Thread.sleep (100);
	c.drawString ("e", 439, 200);
	Thread.sleep (100);
	c.drawString ("s", 459, 200);

	Thread.sleep (2000);
	menu ();
    }


    //This method is for the options in the main menu

    public static void menu () throws InterruptedException
    {

	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.black);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Comic Sans MS", Font.PLAIN, 40));
	c.setColor (Color.blue);

	//Displaying the options

	//Displaying option 1

	Thread.sleep (100);
	c.drawString ("P", 50, 150);
	Thread.sleep (100);
	c.drawString ("r", 70, 150);
	Thread.sleep (100);
	c.drawString ("e", 90, 150);
	Thread.sleep (100);
	c.drawString ("s", 110, 150);
	Thread.sleep (100);
	c.drawString ("s", 130, 150);

	Thread.sleep (100);
	c.drawString ("1", 170, 150);

	Thread.sleep (100);
	c.drawString ("t", 210, 150);
	Thread.sleep (100);
	c.drawString ("o", 230, 150);

	Thread.sleep (100);
	c.drawString ("s", 270, 150);
	Thread.sleep (100);
	c.drawString ("e", 290, 150);
	Thread.sleep (100);
	c.drawString ("l", 315, 150);
	Thread.sleep (100);
	c.drawString ("e", 330, 150);
	Thread.sleep (100);
	c.drawString ("c", 350, 150);
	Thread.sleep (100);
	c.drawString ("t", 370, 150);

	Thread.sleep (100);
	c.drawString ("a", 410, 150);

	Thread.sleep (100);
	c.drawString ("s", 450, 150);
	Thread.sleep (100);
	c.drawString ("t", 470, 150);
	Thread.sleep (100);
	c.drawString ("o", 490, 150);
	Thread.sleep (100);
	c.drawString ("r", 510, 150);
	Thread.sleep (100);
	c.drawString ("y", 530, 150);

	//Displaying option 2

	Thread.sleep (100);
	c.drawString ("P", 50, 280);
	Thread.sleep (100);
	c.drawString ("r", 70, 280);
	Thread.sleep (100);
	c.drawString ("e", 90, 280);
	Thread.sleep (100);
	c.drawString ("s", 110, 280);
	Thread.sleep (100);
	c.drawString ("s", 130, 280);

	Thread.sleep (100);
	c.drawString ("2", 170, 280);

	Thread.sleep (100);
	c.drawString ("t", 210, 280);
	Thread.sleep (100);
	c.drawString ("o", 230, 280);

	Thread.sleep (100);
	c.drawString ("p", 270, 280);
	Thread.sleep (100);
	c.drawString ("l", 290, 280);
	Thread.sleep (100);
	c.drawString ("a", 306, 280);
	Thread.sleep (100);
	c.drawString ("y", 330, 280);

	Thread.sleep (100);
	c.drawString ("a", 360, 280);

	Thread.sleep (100);
	c.drawString ("r", 400, 280);
	Thread.sleep (100);
	c.drawString ("a", 420, 280);
	Thread.sleep (100);
	c.drawString ("n", 440, 280);
	Thread.sleep (100);
	c.drawString ("d", 460, 280);
	Thread.sleep (100);
	c.drawString ("o", 480, 280);
	Thread.sleep (100);
	c.drawString ("m", 500, 280);

	Thread.sleep (100);
	c.drawString ("s", 540, 280);
	Thread.sleep (100);
	c.drawString ("t", 560, 280);
	Thread.sleep (100);
	c.drawString ("o", 580, 280);
	Thread.sleep (100);
	c.drawString ("r", 600, 280);
	Thread.sleep (100);
	c.drawString ("y", 620, 280);
	//Getting the choice of the user

	char choice = c.getChar ();



	if (choice == '1')
	{
	    genre ();
	}
	if (choice == '2')
	{
	    randomStory ();
	}
    }


    //This method is for showing the user the genres s/he can choose

    public static void genre () throws InterruptedException
    {

	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.cyan);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Times New Roman", Font.BOLD, 20));
	c.setColor (Color.black);

	//Displaying the genres in a table
	Thread.sleep (500);
	c.drawString ("Select your genre and enter the number of it.", 50, 100);
	Thread.sleep (2000);
	c.drawString ("___________________________________________________", 50, 150);
	Thread.sleep (400);
	c.drawString ("/                                             /                                                      /  ", 44, 170);
	Thread.sleep (400);
	c.drawString ("/ 1. Science Fiction               / 2. Horror                                     / ", 38, 190);
	Thread.sleep (400);
	c.drawString ("/______________________/___________________________/ ", 32, 210);
	Thread.sleep (400);
	c.drawString ("Enter 0 to go back to the main menu.", 10, 380);

	//Letting the user choose his/her genre after 5 seconds
	char choiceGenre = c.getChar ();
	if (choiceGenre == '0')
	{
	    menu ();
	}
	if (choiceGenre == '1')
	{
	    SelectSciFi ();
	}
	if (choiceGenre == '2')
	{
	    TheHowlsoftheNight();

    } }


    //This method is for getting a random genre and story

    public static void randomStory () throws InterruptedException
    { String[] Random={"Better than a Galaxy","The Howls of the Night"};
	while (true)
	{
	    //Clearing the previous screen to set a new one
	    c.clear ();

	    //Setting the color of the new background
	    c.setColor (Color.orange);
	    c.fillRect (1, 1, 1000, 1000);

	    //Setting the text font, size and color
	    c.setFont (new Font ("Arial", Font.BOLD, 40));
	    c.setColor (Color.red);

	    //Generating a random number
	    int random = (int) (2 * Math.random () + 1);

	    //Displaying what genre has been randomized letter by letter

	    //I'm also using a while loop to make sure the user likes the randomized genre.


	    Thread.sleep (300);
	    c.drawString ("Y", 50, 100);
	    Thread.sleep (100);
	    c.drawString ("o", 70, 100);
	    Thread.sleep (100);
	    c.drawString ("u", 95, 100);

	    Thread.sleep (100);
	    c.drawString ("w", 130, 100);
	    Thread.sleep (100);
	    c.drawString ("i", 160, 100);
	    Thread.sleep (100);
	    c.drawString ("l", 170, 100);
	    Thread.sleep (100);
	    c.drawString ("l", 180, 100);

	    Thread.sleep (200);
	    c.drawString ("p", 210, 100);
	    Thread.sleep (100);
	    c.drawString ("l", 235, 100);
	    Thread.sleep (100);
	    c.drawString ("a", 247, 100);
	    Thread.sleep (100);
	    c.drawString ("y", 270, 100);

	    if (random==1){
	    Thread.sleep (1500);
	    c.drawString ("Better than a Galaxy", 303, 100);}

    if (random==2){
	    Thread.sleep (1500);
	    c.drawString ("The Howls of the Night", 303, 100);}
	    //Asking the user if s/he likes the randomized genre

	    String ask= "Would you like to play that story?";

	    for (int i = 0 ; i < ask.length () ; i++)
	    {
		Thread.sleep (70);
		c.drawString (ask.substring (i, i + 1), 19 * i, 250);
	    }

	    c.drawString ("Press 1 if yes, press 2 if no.", 50, 380);
	    Thread.sleep (1000);
	    c.drawString ("Press 3 to go back to main menu.", 50, 450);

	    randomGenre = c.getChar ();

	    if (randomGenre == '3')
	    {
		menu ();
	    }
	    if (randomGenre == '1')
	    {
		if (random == 1)
		{
		    BetterthanaGalaxy();
		}
		if (random == 2)
		{
		    TheHowlsoftheNight();
		}
	       
	    }
	}

    }





    //SELECTED METHODS:

    //SCIENCE FICTION

    //This method is for letting the user select a science fiction story.
    public static void SelectSciFi () throws InterruptedException
    {
	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.blue);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Times New Roman", Font.BOLD, 20));
	c.setColor (Color.white);

	//Displaying the stories in a table
	Thread.sleep (500);
	c.drawString ("You chose science fiction.", 50, 50);
	Thread.sleep (1000);
	c.drawString ("Select your story and enter the number of it.", 50, 100);
	Thread.sleep (2000);
	c.drawString ("___________________________________________________", 50, 150);
	Thread.sleep (400);
	c.drawString ("/                                             /                                                      /  ", 44, 170);
	Thread.sleep (400);
	c.drawString ("/ 1. Better than a Galaxy    /2. The Howls of the Night           / ", 38, 190);
	Thread.sleep (400);
	c.drawString ("/                                             /                                                      /  ", 32, 210);
	Thread.sleep (400);
	c.drawString ("/______________________/___________________________/ ", 26, 230);
	Thread.sleep (800);
	c.drawString ("Press 9 to choose another genre.", 10, 325);
	Thread.sleep (1000);
	c.drawString ("Press 0 to go back to the main menu.", 10, 395);

	//Letting the user choose his/her stories
	char choiceStory = c.getChar ();
	if (choiceStory == '0')
	{
	    menu ();
	}
	if (choiceStory == '1')
	{
	    BetterthanaGalaxy ();
	}
	if (choiceStory == '2')
	{
	    TheHowlsoftheNight ();
	}
	if (choiceStory == '9')
	{
	    genre ();
	}
    }


    //HORROR

    //This method is for letting the user select a horror story.
   /* public static void SelectHorror () throws InterruptedException
    {
	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.black);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("MS PGothic", Font.PLAIN, 26));
	c.setColor (Color.red);

	//Displaying the stories in a table
	Thread.sleep (500);
	c.drawString ("You chose horror.", 50, 50);
	Thread.sleep (1000);
	c.drawString ("Select your story and enter the number of it.", 50, 100);
	Thread.sleep (2000);
	c.drawString ("_________________________________________________________", 50, 170);
	Thread.sleep (400);
	c.drawString ("/                 /                                    /  ", 44, 190);
	Thread.sleep (400);
	c.drawString ("/ 1. Sumar    / 2. The Howls of the Night/ ", 38, 210);
	Thread.sleep (400);
	c.drawString ("/________________/____________________________________/ ", 32, 230);
	Thread.sleep (800);
	c.drawString ("Press 9 to choose another genre.", 10, 320);
	Thread.sleep (1000);
	c.drawString ("Press 0 to go back to the main menu.", 10, 400);

	//Letting the user choose his/her story after 5 seconds
	char choiceGenre = c.getChar ();
	if (choiceGenre == '0')
	{
	    menu ();
	}
	if (choiceGenre == '1')
	{
	    Sumar ();
	}
	if (choiceGenre == '2')
	{
	    TheHowlsoftheNight ();
	}
	if (choiceGenre == '9')
	{
	    genre ();
	}
    }


    //DRAMA

    //This method is for letting the user select a drama story.
    public static void SelectDrama () throws InterruptedException
    {
	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.gray);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Sylfaen", Font.PLAIN, 26));
	c.setColor (Color.white);

	//Displaying the stories in a table
	Thread.sleep (500);
	c.drawString ("You chose drama.", 50, 50);
	Thread.sleep (1000);
	c.drawString ("Select your story and enter the number of it.", 50, 115);
	Thread.sleep (2000);
	c.drawString ("__________________________________", 50, 170);
	Thread.sleep (400);
	c.drawString ("/                    /                                         / ", 44, 190);
	Thread.sleep (400);
	c.drawString ("/ 1. Filippa     / 2. Better than a Galaxy    / ", 38, 210);
	Thread.sleep (400);
	c.drawString ("/___________/______________________/ ", 32, 230);
	Thread.sleep (800);
	c.drawString ("Press 9 to choose another genre.", 10, 310);
	Thread.sleep (1000);
	c.drawString ("Press 0 to go back to the main menu.", 10, 390);

	//Letting the user choose his/her story after 5 seconds
	char choiceStory = c.getChar ();
	if (choiceStory == '0')
	{
	    menu ();
	}
	if (choiceStory == '1')
	{
	    Filippa ();
	}
	if (choiceStory == '2')
	{
	    BetterthanaGalaxy ();
	}
	if (choiceStory == '9')
	{
	    genre ();
	}
    }


    //SUSPENSE

    //This method is for showing the user the name of the suspense story as there's only one option.
    public static void SelectSuspense () throws InterruptedException
    {
    }


    //ACTION & ADVENTURE

    //This method is for letting the user select an action & adventure story.
    public static void SelectAction () throws InterruptedException
    {

	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.black);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Courier New", Font.BOLD, 24));
	c.setColor (Color.green);

	//Displaying the stories in a table
	Thread.sleep (500);
	c.drawString ("You chose action & adventure.", 20, 50);
	Thread.sleep (1000);
	c.drawString ("Select your story and enter the number of it.", 20, 110);
	Thread.sleep (2000);
	c.drawString ("_________________________________________", 20, 170);
	Thread.sleep (400);
	c.drawString ("/                          /             / ", 14, 190);
	Thread.sleep (400);
	c.drawString ("/ 1. 3 Weeks in Wilderness / 2. The Road / ", 8, 210);
	Thread.sleep (400);
	c.drawString ("/__________________________/_____________/ ", 2, 230);
	Thread.sleep (800);
	c.drawString ("Press 9 to choose another genre.", 10, 320);
	Thread.sleep (1000);
	c.drawString ("Press 0 to go back to the main menu.", 10, 400);

	//Letting the user choose his/her story after 5 seconds
	char choiceStory = c.getChar ();
	if (choiceStory == '0')
	{
	    menu ();
	}
	if (choiceStory == '1')
	{
	    ThreeWeeksinWilderness ();
	}
	if (choiceStory == '2')
	{
	    TheRoad ();
	}
	if (choiceStory == '9')
	{
	    genre ();
	}
    }


    //ROMANCE

    //This method is for letting the user select a romance story.
    public static void SelectRomance () throws InterruptedException
    {
	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.pink);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Corbel", Font.PLAIN, 26));
	c.setColor (Color.gray);

	//Displaying the stories in a table
	Thread.sleep (500);
	c.drawString ("You chose romance.", 50, 60);
	Thread.sleep (1000);
	c.drawString ("Select your story and enter the number of it.", 50, 115);
	Thread.sleep (2000);
	c.drawString ("________________________________________", 50, 170);
	Thread.sleep (400);
	c.drawString ("/                                                     /                                                / ", 44, 190);
	Thread.sleep (400);
	c.drawString ("/ 1. Filippa                                /2. Better than a Galaxy / ", 38, 210);
	Thread.sleep (400);
	c.drawString ("/                                                    /                                                  / ", 32, 230);
	Thread.sleep (400);
	c.drawString ("/____________________/____________________/ ", 26, 250);
	Thread.sleep (800);
	c.drawString ("Press 9 to choose another genre.", 10, 343);
	Thread.sleep (1000);
	c.drawString ("Enter the number 0 to go back to the main menu.", 10, 415);

	//Letting the user choose his/her story after 5 seconds
	char choiceStory = c.getChar ();
	if (choiceStory == '0')
	{
	    menu ();
	}
	if (choiceStory == '1')
	{
	    Filippa ();
	}
	if (choiceStory == '2')
	{
	    BetterthanaGalaxy ();
	}
	if (choiceStory == '9')
	{
	    genre ();
	}
    } */




    //RANDOM STORY METHODS:

    //The methods below are used in case the user has chosen the randomized mode.

    //This method is for randomizing a story in science fiction genre.
    public static void RandomSciFi () throws InterruptedException
    {
	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.blue);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Times New Roman", Font.PLAIN, 30));
	c.setColor (Color.white);

	Thread.sleep (1000);
	c.drawString ("Press 1 to select your science fiction story.", 30, 150);
	Thread.sleep (1900);
	c.drawString ("Press 2 to play a random science fiction story.", 30, 250);
	Thread.sleep (1900);
	c.drawString ("Press 3 to go back to the main menu.", 30, 350);
	char choice = c.getChar ();
	if (choice == '1')
	{
	    SelectSciFi ();
	}
	if (choice == '2')
	{
	    //Randomizing a science fiction story:

	    //I'm also using a while loop to make sure the user likes the randomized story.
	    while (true)
	    {
		//Clearing the previous screen to set a new one
		c.clear ();

		//Setting the color of the new background
		c.setColor (Color.blue);
		c.fillRect (1, 1, 1000, 1000);

		//Setting the text font, size and color
		c.setFont (new Font ("Times New Roman", Font.PLAIN, 30));
		c.setColor (Color.white);

		//Generating a random number
		int random = (int) (2 * Math.random () + 1);

		//Displaying what story has been randomized
		Thread.sleep (1000);
		c.drawString ("You'll", 30, 130);
		Thread.sleep (1500);
		c.drawString ("play", 115, 130);
		Thread.sleep (2000);
		c.drawString (Sciencefiction [random] + ".", 170, 130);

		Thread.sleep (1000);
		c.drawString ("Would you like to play " + Sciencefiction [random] + "?", 30, 230);

		Thread.sleep (2500);
		c.drawString ("Press 1 if yes, press 2 if no.", 30, 310);

		Thread.sleep (1900);
		c.drawString ("Press 3 to go back to the main menu.", 30, 395);

		char Choice = c.getChar ();
		if (Choice == '1')
		{
		    if (random == 1)
		    {
			BetterthanaGalaxy ();
		    }
		    if (random == 2)
		    {
			TheHowlsoftheNight ();
		    }
		}
		if (Choice == '3')
		{
		    menu ();
		}

	    }
	}
    }

/*
    //This method is for randomizing a story in horror genre.
    public static void RandomHorror () throws InterruptedException
    {
	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.black);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("MS PGothic", Font.PLAIN, 33));
	c.setColor (Color.red);

	Thread.sleep (1000);
	c.drawString ("Press 1 to select your horror story.", 30, 150);
	Thread.sleep (1900);
	c.drawString ("Press 2 to play a random horror story.", 30, 250);
	Thread.sleep (1900);
	c.drawString ("Press 3 to go back to the main menu.", 30, 350);
	char choice = c.getChar ();
	if (choice == '1')
	{
	    SelectHorror ();
	}
	if (choice == '2')
	{
	    //Randomizing a horror story:

	    //I'm also using a while loop to make sure the user likes the randomized story.
	    while (true)
	    {

		//Clearing the previous screen to set a new one
		c.clear ();

		//Setting the color of the new background
		c.setColor (Color.black);
		c.fillRect (1, 1, 1000, 1000);

		//Setting the text font, size and color
		c.setFont (new Font ("MS PGothic", Font.PLAIN, 33));
		c.setColor (Color.red);

		//Generating a random number
		int random = (int) (2 * Math.random () + 1);

		//Displaying what story has been randomized
		Thread.sleep (1000);
		c.drawString ("You'll", 30, 130);
		Thread.sleep (1500);
		c.drawString ("play", 125, 130);
		Thread.sleep (2000);
		c.drawString (horror [random] + ".", 195, 130);

		Thread.sleep (1000);
		c.drawString ("Would you like to play " + horror [random] + "?", 30, 230);

		Thread.sleep (2500);
		c.drawString ("Press 1 if yes, press 2 if no.", 30, 310);

		Thread.sleep (1900);
		c.drawString ("Press 3 to go back to the main menu.", 30, 395);

		char Choice = c.getChar ();
		if (Choice == '1')
		{
		    if (random == 1)
		    {
			Sumar ();
		    }
		    if (random == 2)
		    {
			TheHowlsoftheNight ();
		    }
		}
		if (Choice == '3')
		{
		    menu ();
		}

	    }
	}
    }


    //This method is for randomizing a story in drama genre.
    public static void RandomDrama () throws InterruptedException
    {

	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.gray);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Sylfaen", Font.PLAIN, 30));
	c.setColor (Color.white);

	Thread.sleep (1000);
	c.drawString ("Press 1 to select your drama story.", 30, 150);
	Thread.sleep (1900);
	c.drawString ("Press 2 to play a random drama story.", 30, 250);
	Thread.sleep (1900);
	c.drawString ("Press 3 to go back to the main menu.", 30, 350);
	char choice = c.getChar ();
	if (choice == '1')
	{
	    SelectDrama ();
	}
	if (choice == '2')
	{
	    //Randomizing a drama story:

	    //I'm also using a while loop to make sure the user likes the randomized story.
	    while (true)
	    {
		//Clearing the previous screen to set a new one
		c.clear ();

		//Setting the color of the new background
		c.setColor (Color.gray);
		c.fillRect (1, 1, 1000, 1000);

		//Setting the text font, size and color
		c.setFont (new Font ("Sylfaen", Font.PLAIN, 30));
		c.setColor (Color.white);

		//Generating a random number
		int random = (int) (2 * Math.random () + 1);

		//Displaying what story has been randomized
		Thread.sleep (1000);
		c.drawString ("You'll", 30, 130);
		Thread.sleep (1500);
		c.drawString ("play", 125, 130);
		Thread.sleep (2000);
		c.drawString (drama [random] + ".", 195, 130);

		Thread.sleep (1000);
		c.drawString ("Would you like to play " + drama [random] + "?", 30, 230);

		Thread.sleep (2500);
		c.drawString ("Press 1 if yes, press 2 if no.", 30, 310);

		Thread.sleep (1900);
		c.drawString ("Press 3 to go back to the main menu.", 30, 395);

		char Choice = c.getChar ();
		if (Choice == '1')
		{
		    if (random == 1)
		    {
			Filippa ();
		    }
		    if (random == 2)
		    {
			BetterthanaGalaxy ();
		    }
		}
		if (Choice == '3')
		{
		    menu ();
		}

	    }
	}
    }


    //Suspense genre, only has one story, so randomStory method will directly lead the user to the story if that genre has been randomized.

    //This method is for randomizing a story in action & adventure genre.
    public static void RandomAction () throws InterruptedException
    {

	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.black);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Courier New", Font.BOLD, 20));
	c.setColor (Color.green);

	Thread.sleep (1000);
	c.drawString ("Press 1 to select your action and adventure story.", 30, 150);
	Thread.sleep (1900);
	c.drawString ("Press 2 to play a random action and adventure story.", 30, 250);
	Thread.sleep (1900);
	c.drawString ("Press 3 to go back to the main menu.", 30, 350);
	char choice = c.getChar ();
	if (choice == '1')
	{
	    SelectAction ();
	}
	if (choice == '2')
	{
	    //Randomizing an action & adventure story:

	    //I'm also using a while loop to make sure the user likes the randomized story.
	    while (true)
	    {
		//Clearing the previous screen to set a new one
		c.clear ();

		//Setting the color of the new background
		c.setColor (Color.black);
		c.fillRect (1, 1, 1000, 1000);

		//Setting the text font, size and color
		c.setFont (new Font ("Courier New", Font.BOLD, 20));
		c.setColor (Color.green);

		//Generating a random number
		int random = (int) (2 * Math.random () + 1);

		//Displaying what story has been randomized
		Thread.sleep (1000);
		c.drawString ("You'll", 30, 130);
		Thread.sleep (1500);
		c.drawString ("play", 125, 130);
		Thread.sleep (2000);
		c.drawString (action [random] + ".", 195, 130);

		Thread.sleep (1000);
		c.drawString ("Would you like to play " + action [random] + "?", 30, 230);

		Thread.sleep (2500);
		c.drawString ("Press 1 if yes, press 2 if no.", 30, 310);

		Thread.sleep (1900);
		c.drawString ("Press 3 to go back to the main menu.", 30, 395);

		char Choice = c.getChar ();
		if (Choice == '1')
		{
		    if (random == 1)
		    {
			ThreeWeeksinWilderness ();
		    }
		    if (random == 2)
		    {
			TheRoad ();
		    }
		}
		if (Choice == '3')
		{
		    menu ();
		}

	    }
	}
    }


    //This method is for randomizing a story in romance genre.
    public static void RandomRomance () throws InterruptedException
    {

	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.pink);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Corbel", Font.PLAIN, 35));
	c.setColor (Color.gray);


	Thread.sleep (1000);
	c.drawString ("Press 1 to select your romance story.", 30, 150);
	Thread.sleep (1900);
	c.drawString ("Press 2 to play a random romance story.", 30, 250);
	Thread.sleep (1900);
	c.drawString ("Press 3 to go back to the main menu.", 30, 350);
	char choice = c.getChar ();
	if (choice == '1')
	{
	    SelectRomance ();
	}
	if (choice == '2')
	{
	    //Randomizing a romance story:

	    //I'm also using a while loop to make sure the user likes the randomized story.
	    while (true)
	    {

		//Clearing the previous screen to set a new one
		c.clear ();

		//Setting the color of the new background
		c.setColor (Color.pink);
		c.fillRect (1, 1, 1000, 1000);

		//Setting the text font, size and color
		c.setFont (new Font ("Corbel", Font.PLAIN, 35));
		c.setColor (Color.gray);

		//Generating a random number
		int random = (int) (2 * Math.random () + 1);

		//Displaying what story has been randomized
		Thread.sleep (1000);
		c.drawString ("You'll", 30, 130);
		Thread.sleep (1500);
		c.drawString ("play", 130, 130);
		Thread.sleep (2000);
		c.drawString (romance [random] + ".", 200, 130);

		Thread.sleep (1000);
		c.drawString ("Would you like to play " + romance [random] + "?", 30, 230);

		Thread.sleep (2500);
		c.drawString ("Press 1 if yes, press 2 if no.", 30, 310);

		Thread.sleep (1900);
		c.drawString ("Press 3 to go back to the main menu.", 30, 395);

		char Choice = c.getChar ();
		if (Choice == '1')
		{
		    if (random == 1)
		    {
			Filippa ();
		    }
		    if (random == 2)
		    {
			BetterthanaGalaxy ();
		    }
		}
		if (Choice == '3')
		{
		    menu ();
		}

	    }
	}
    }
*/

    //STORIES

    //SCIENCE FICTION

    public static void BetterthanaGalaxy () throws InterruptedException
    {
	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 40));
	c.setColor (Color.black);

	//Displaying the name of the story letter by letter

	Thread.sleep (500);
	c.drawString ("B", 65, 200);
	Thread.sleep (100);
	c.drawString ("e", 90, 200);
	Thread.sleep (100);
	c.drawString ("t", 110, 200);
	Thread.sleep (150);
	c.drawString ("t", 130, 200);
	Thread.sleep (100);
	c.drawString ("e", 150, 200);
	Thread.sleep (100);
	c.drawString ("r", 170, 200);

	Thread.sleep (100);
	c.drawString ("t", 225, 200);
	Thread.sleep (100);
	c.drawString ("h", 245, 200);
	Thread.sleep (100);
	c.drawString ("a", 265, 200);
	Thread.sleep (150);
	c.drawString ("n", 285, 200);

	Thread.sleep (100);
	c.drawString ("a", 340, 200);

	Thread.sleep (100);
	c.drawString ("G", 395, 200);
	Thread.sleep (100);
	c.drawString ("a", 420, 200);
	Thread.sleep (100);
	c.drawString ("l", 440, 200);
	Thread.sleep (100);
	c.drawString ("a", 450, 200);
	Thread.sleep (100);
	c.drawString ("x", 470, 200);
	Thread.sleep (100);
	c.drawString ("y", 490, 200);

	Thread.sleep (1500);

	//Setting the new text font, size and color

	c.setFont (new Font ("Consolas", Font.PLAIN, 25));
	c.setColor (Color.gray);

	//Displaying the genres after 5 seconds

	c.drawString ("Science fiction,", 65, 280);
	Thread.sleep (1000);
	c.drawString (" Drama,", 290, 280);
	Thread.sleep (1000);
	c.drawString (" Romance", 385, 280);

	Thread.sleep (2000);

	//Setting the new text font, size and color

	c.setFont (new Font ("Cambria", Font.PLAIN, 25));
	c.setColor (Color.black);

	c.drawString ("Would you like to play this story?", 65, 380);
	Thread.sleep (900);
	c.drawString ("Press 1 if yes, press 2 if no.", 65, 440);

	char choice = c.getChar ();
	if (choice == '1')
	{
	}
	if (choice == '2')
	{
	    menu ();
	}


	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 33));
	c.setColor (Color.black);

	//Displaying the story letter by letter

	//An explanation of the name of the strings: P means page. L means line. So P1L1 means line 1, page 1.


	//PAGE 1


	String P1L1 = " Have you ever heard stories of alien";

	Thread.sleep (1000);
	for (int i = 0 ; i < P1L1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P1L1.substring (i, i + 1), 17 * i, 60);
	}

	String P1L2 = "abduction? ";

	for (int i = 0 ; i < P1L2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P1L2.substring (i, i + 1), 17 * i, 120);
	}
	//Adding a delay to the end of the sentances
	Thread.sleep (400);
	String P1L3 = "Probably a lot. But I bet you haven't";

	for (int i = 0 ; i < P1L3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P1L3.substring (i, i + 1), 17 * i, 190);
	}

	String P1L4 = "heard this one.";

	for (int i = 0 ; i < P1L4.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P1L4.substring (i, i + 1), 17 * i, 250);
	}

	Thread.sleep (300);
	String P1L5 = "This is the story of a boy RAISED by ";

	for (int i = 0 ; i < P1L5.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P1L5.substring (i, i + 1), 17 * i, 310);
	}

	String P1L6 = "them . You m ay wonder w hy.";

	for (int i = 0 ; i < P1L6.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P1L6.substring (i, i + 1), 17 * i, 370);
	}

	Thread.sleep (300);
	String P1L7 = "Then listen up.";

	for (int i = 0 ; i < P1L7.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P1L7.substring (i, i + 1), 17 * i, 430);
	}

	Thread.sleep (250);
	String P1L8 = "Cuz you're gonna play this story.";

	for (int i = 0 ; i < P1L8.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P1L8.substring (i, i + 1), 17 * i, 480);
	}
	Thread.sleep (2500);

	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Courier New", Font.PLAIN, 60));
	c.setColor (Color.black);

	String chapter = "     Chapter 1";

	for (int i = 0 ; i < chapter.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (chapter.substring (i, i + 1), 33 * i, 210);
	}
	Thread.sleep (3000);

	//PAGE 2

	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 29));
	c.setColor (Color.black);

	String P2L1 = "In a cold shivery night, ";

	Thread.sleep (1000);
	for (int i = 0 ; i < P2L1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P2L1.substring (i, i + 1), 14 * i, 60);
	}

	String P2L2 = "there was a baby.";

	for (int i = 0 ; i < P2L2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P2L2.substring (i, i + 1), 17 * i, 120);
	}
	//Adding a delay to the end of the sentances
	Thread.sleep (1000);
	String P2L3 = "An orphan, left in a box like basket.";

	for (int i = 0 ; i < P2L3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P2L3.substring (i, i + 1), 17 * i, 190);
	}

	String P2L4 = "Waiting to be found to be brought to a";

	Thread.sleep (900);
	for (int i = 0 ; i < P2L4.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P2L4.substring (i, i + 1), 17 * i, 250);
	}

	String P2L5 = "public orphange to probably 'spend'1/4";

	for (int i = 0 ; i < P2L5.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P2L5.substring (i, i + 1), 17 * i, 310);
	}

	String P2L6 = "of his life time there until he became";

	for (int i = 0 ; i < P2L6.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P2L6.substring (i, i + 1), 17 * i, 370);
	}

	String P2L7 = "an adult.But only in case he was lucky ";

	for (int i = 0 ; i < P2L7.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P2L7.substring (i, i + 1), 17 * i, 430);
	}

	String P2L8 = "enough not to freeze out.";

	for (int i = 0 ; i < P2L8.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P2L8.substring (i, i + 1), 17 * i, 480);
	}
	Thread.sleep (2500);

	//PAGE 3


	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 29));
	c.setColor (Color.black);

	String P3L1 = "He was crying. But then,";

	Thread.sleep (1000);
	for (int i = 0 ; i < P3L1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P3L1.substring (i, i + 1), 14 * i, 60);
	}

	Thread.sleep (200);
	String P3L2 = "all of a sudden,";

	for (int i = 0 ; i < P3L2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P3L2.substring (i, i + 1), 17 * i, 120);
	}

	Thread.sleep (700);
	String P3L3 = "some colorful lights surrounded him.";

	for (int i = 0 ; i < P3L3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P3L3.substring (i, i + 1), 17 * i, 190);
	}

	String P3L4 = "He kept crying.";

	Thread.sleep (900);
	for (int i = 0 ; i < P3L4.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P3L4.substring (i, i + 1), 17 * i, 250);
	}

	Thread.sleep (500);
	String P3L5 = "Some force started pulling him upwards.";

	for (int i = 0 ; i < P3L5.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P3L5.substring (i, i + 1), 17 * i, 310);
	}
	Thread.sleep (600);
	String P3L6 = "What was going on?";

	for (int i = 0 ; i < P3L6.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P3L6.substring (i, i + 1), 17 * i, 370);
	}

	Thread.sleep (600);
	String P3L7 = "They were extressial beings or in othe";

	for (int i = 0 ; i < P3L7.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P3L7.substring (i, i + 1), 17 * i, 430);
	}

	String P3L8 = "r words,    aliens";

	for (int i = 0 ; i < P3L8.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P3L8.substring (i, i + 1), 17 * i, 480);
	}
	Thread.sleep (2500);


	//PAGE 4

	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 29));
	c.setColor (Color.black);

	String P4L1 = "Were some experiments to be done?";

	Thread.sleep (1000);
	for (int i = 0 ; i < P4L1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P4L1.substring (i, i + 1), 18 * i, 60);
	}

	Thread.sleep (200);
	String P4L2 = "Did they have a plan for him?";

	for (int i = 0 ; i < P4L2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P4L2.substring (i, i + 1), 18 * i, 120);
	}

	Thread.sleep (400);
	String P4L3 = "Sort of.";

	for (int i = 0 ; i < P4L3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P4L3.substring (i, i + 1), 17 * i, 190);
	}

	String P4L4 = "The experiment was to see the abilities";

	Thread.sleep (900);
	for (int i = 0 ; i < P4L4.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P4L4.substring (i, i + 1), 17 * i, 250);
	}

	Thread.sleep (500);
	String P4L5 = "of a human grown in a place far from";

	for (int i = 0 ; i < P4L5.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P4L5.substring (i, i + 1), 17 * i, 310);
	}
	Thread.sleep (600);
	String P4L6 = "his own kind in learning what an alien ";

	for (int i = 0 ; i < P4L6.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P4L6.substring (i, i + 1), 17 * i, 370);
	}

	Thread.sleep (600);
	String P4L7 = "would learn and to see the differences ";

	for (int i = 0 ; i < P4L7.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P4L7.substring (i, i + 1), 17 * i, 430);
	}

	String P4L8 = "living in  an adverse place could make.";

	for (int i = 0 ; i < P4L8.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P4L8.substring (i, i + 1), 17 * i, 480);
	}
	Thread.sleep (2500);


	//PAGE 5

	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 29));
	c.setColor (Color.black);

	String P5L1 = "So he grew up there. Not show ing a";

	for (int i = 0 ; i < P5L1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P5L1.substring (i, i + 1), 18 * i, 60);
	}

	String P5L2 = "single sign of lack of ability.";

	for (int i = 0 ; i < P5L2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P5L2.substring (i, i + 1), 18 * i, 120);
	}

	Thread.sleep (400);
	String P5L3 = "Far from his ow n kind, but still";

	for (int i = 0 ; i < P5L3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P5L3.substring (i, i + 1), 17 * i, 190);
	}

	String P5L4 = "brilliant. He didn't see a lot of";

	for (int i = 0 ; i < P5L4.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P5L4.substring (i, i + 1), 17 * i, 250);
	}

	String P5L5 = "emotions, but was still motivated.";

	for (int i = 0 ; i < P5L5.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P5L5.substring (i, i + 1), 17 * i, 310);
	}

	Thread.sleep (600);
	String P5L6 = "Now, you're going to help him w ith";

	for (int i = 0 ; i < P5L6.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P5L6.substring (i, i + 1), 17 * i, 370);
	}

	String P5L7 = "on e of the experim ents to help him show";

	for (int i = 0 ; i < P5L7.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P5L7.substring (i, i + 1), 15 * i, 430);
	}

	String P5L8 = "them the human ability in solving problems.";

	for (int i = 0 ; i < P5L8.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P5L8.substring (i, i + 1), 15 * i, 480);
	}
	Thread.sleep (2500);


	//PAGE 6

	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 23));
	c.setColor (Color.black);

	String P6L1 = "Before m entioning the eperim ent, there's";

	for (int i = 0 ; i < P6L1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P6L1.substring (i, i + 1), 15 * i, 60);
	}

	String P6L2 = "som e inform ation that you need to know.";

	for (int i = 0 ; i < P6L2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P6L2.substring (i, i + 1), 15 * i, 120);
	}

	Thread.sleep (600);
	String P6L3 = "Firstly, the boy doesn't have a nam e.";

	for (int i = 0 ; i < P6L3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P6L3.substring (i, i + 1), 17 * i, 190);
	}

	Thread.sleep (600);
	String P6L4 = "He gets called by telepathy whenever";

	for (int i = 0 ; i < P6L4.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P6L4.substring (i, i + 1), 17 * i, 250);
	}

	String P6L5 = "needed. He's pretty good at recieving";

	for (int i = 0 ; i < P6L5.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P6L5.substring (i, i + 1), 17 * i, 310);
	}

	String P6L6 = "telepathic m essages. But he can barely";

	for (int i = 0 ; i < P6L6.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P6L6.substring (i, i + 1), 17 * i, 370);
	}

	String P6L7 = "respond or start a connection. So he's";

	for (int i = 0 ; i < P6L7.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P6L7.substring (i, i + 1), 15 * i, 430);
	}

	String P6L8 = "invented his own sign language with symbols.";

	for (int i = 0 ; i < P6L8.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P6L8.substring (i, i + 1), 15 * i, 480);
	}
	Thread.sleep (2500);

	//PAGE 7

	//There will be some games in this page.
	BGameIntro ();





    }


    //This method is for the games in Better than a Galaxy

    public static void BGameIntro () throws InterruptedException
    { //Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 23));
	c.setColor (Color.black);

	String P7L1 = "Here are som e exam ples of it:";

	for (int i = 0 ; i < P7L1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P7L1.substring (i, i + 1), 15 * i, 60);
	}

	Thread.sleep (500);
	String P7L2 = "o = Driving the space ship";

	for (int i = 0 ; i < P7L2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P7L2.substring (i, i + 1), 15 * i, 120);
	}

	Thread.sleep (500);
	String P7L3 = "|_| = A place where you do a specific thing.";

	for (int i = 0 ; i < P7L3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P7L3.substring (i, i + 1), 15 * i, 180);
	}

	Thread.sleep (500);
	String P7L4 = "# = has faced/has som e trouble";

	for (int i = 0 ; i < P7L4.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P7L4.substring (i, i + 1), 15 * i, 240);
	}

	Thread.sleep (500);
	String P7L5 = "* = of the";

	for (int i = 0 ; i < P7L5.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P7L5.substring (i, i + 1), 15 * i, 300);
	}

	Thread.sleep (500);
	String P7L6 = "'' = How to";

	for (int i = 0 ; i < P7L6.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P7L6.substring (i, i + 1), 15 * i, 360);
	}

	Thread.sleep (500);
	String P7L7 = "^ = it";

	for (int i = 0 ; i < P7L7.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P7L7.substring (i, i + 1), 15 * i, 420);
	}

	Thread.sleep (500);
	String P7L8 = "@ ! = fix";

	for (int i = 0 ; i < P7L8.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P7L8.substring (i, i + 1), 15 * i, 480);
	}
	Thread.sleep (5000);
	BGame ();
    }


    public static void BGame () throws InterruptedException
    {
	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 23));
	c.setColor (Color.black);

	String B1 = "Could you translate the following sentance?";

	for (int i = 0 ; i < B1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (B1.substring (i, i + 1), 15 * i, 60);
	}

	String B2 = "You can enter / to see the sym bols again.";

	for (int i = 0 ; i < B2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (B2.substring (i, i + 1), 15 * i, 120);
	}

	String B3 = "No need for dots, question marks,";

	for (int i = 0 ; i < B3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (B3.substring (i, i + 1), 15 * i, 180);
	}

	String B4 = "capital letters and spaces.";

	for (int i = 0 ; i < B4.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (B4.substring (i, i + 1), 15 * i, 240);
	}

	Thread.sleep (300);
	String B5 = "Press enter after the answer. The sentence is:";

	for (int i = 0 ; i < B5.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (B5.substring (i, i + 1), 15 * i, 300);
	}

	Thread.sleep (1000);
	String B6 = "Driving the space ship has faced";

	for (int i = 0 ; i < B6.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (B6.substring (i, i + 1), 15 * i, 360);
	}

	String B7 = "some trouble. How to fix it?";

	for (int i = 0 ; i < B7.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (B7.substring (i, i + 1), 15 * i, 420);
	}
	String answer = " ";
	do
	{
	    answer = c.readString ();
	    if (answer.equals ("/"))
	    {
		BGameIntro ();
	    }
	    if (answer.equals ("o#''@!^"))
	    {
		String B8 = "Correct. You passed the test.";

		for (int i = 0 ; i < B8.length () ; i++)
		{
		    Thread.sleep (70);
		    c.drawString (B8.substring (i, i + 1), 15 * i, 490);
		}
		Thread.sleep (1000);
	    }

	    if (!answer.equals ("o#''@!^"))
	    {
		String B9 = "Incorrect. Try again.";

		for (int i = 0 ; i < B9.length () ; i++)
		{
		    Thread.sleep (70);
		    c.drawString (B9.substring (i, i + 1), 15 * i, 460);
		}
	    }

	}
	while (!answer.equals ("o#''@!^"));

    }


    //This method is for the 2nd part of Better than a Galaxy

    public static void BetterthanaGalaxy2 () throws InterruptedException
    {

	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Courier New", Font.PLAIN, 60));
	c.setColor (Color.black);

	String chapter = "     Chapter 2";

	for (int i = 0 ; i < chapter.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (chapter.substring (i, i + 1), 33 * i, 210);
	}
	Thread.sleep (3000);

	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 30));
	c.setColor (Color.black);

	//Displaying the rest of the story letter by letter


	//PAGE 8


	String P8L1 = "Some years passed. The second part of";

	Thread.sleep (1000);
	for (int i = 0 ; i < P8L1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P8L1.substring (i, i + 1), 17 * i, 60);
	}

	String P8L2 = "the experiment was gonna start. This";

	for (int i = 0 ; i < P8L2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P8L2.substring (i, i + 1), 17 * i, 120);
	}

	String P8L3 = "time, he had to be sent to earth again";

	for (int i = 0 ; i < P8L3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P8L3.substring (i, i + 1), 17 * i, 190);
	}

	String P8L4 = "to see how he'd behave in an environment";

	for (int i = 0 ; i < P8L4.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P8L4.substring (i, i + 1), 17 * i, 250);
	}

	String P8L5 = "next to his own kind, what problems he'd";

	for (int i = 0 ; i < P8L5.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P8L5.substring (i, i + 1), 17 * i, 310);
	}

	String P8L6 = "face, etc. Firstly, he needs a fake I.D.";

	for (int i = 0 ; i < P8L6.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P8L6.substring (i, i + 1), 17 * i, 370);
	}

	Thread.sleep (400);
	String P8L7 = "Could you help him in creating a fake";

	for (int i = 0 ; i < P8L7.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P8L7.substring (i, i + 1), 17 * i, 430);
	}

	String P8L8 = "identity? What should his first name be?";

	for (int i = 0 ; i < P8L8.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P8L8.substring (i, i + 1), 17 * i, 480);
	}
	Thread.sleep (2500);


	//PAGE 9

	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 30));
	c.setColor (Color.black);



	String P9L1 = "Type his first name then press enter.";

	Thread.sleep (1000);
	for (int i = 0 ; i < P9L1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P9L1.substring (i, i + 1), 17 * i, 60);
	}
	FnameB = c.readString ();

	String P9L2 = "Now, type his last name and press enter.";

	for (int i = 0 ; i < P9L2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P9L2.substring (i, i + 1), 17 * i, 120);
	}
	LnameB = c.readString ();

	Thread.sleep (500);
	c.drawString (FnameB + " " + LnameB + ".", 10, 190);

	String P9L3 = "               A great combination!";

	for (int i = 0 ; i < P9L3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P9L3.substring (i, i + 1), 17 * i, 190);
	}

	Thread.sleep (1000);
	String P9L4 = "After choosing his fake ID, he collected";

	for (int i = 0 ; i < P9L4.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P9L4.substring (i, i + 1), 17 * i, 250);
	}

	String P9L5 = "some information about other humans.";

	for (int i = 0 ; i < P9L5.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P9L5.substring (i, i + 1), 17 * i, 310);
	}

	String P9L6 = "About the cultures, how to behave,";

	for (int i = 0 ; i < P9L6.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P9L6.substring (i, i + 1), 17 * i, 370);
	}

	String P9L7 = "how to read and write, geography, etc.";

	for (int i = 0 ; i < P9L7.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P9L7.substring (i, i + 1), 17 * i, 430);
	}

	Thread.sleep (600);
	String P9L8 = "Till he was ready to transport to Earth.";

	for (int i = 0 ; i < P9L8.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P9L8.substring (i, i + 1), 17 * i, 480);
	}
	Thread.sleep (2500);

	//PAGE 10

	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 30));
	c.setColor (Color.black);


	c.drawString (FnameB, 10, 60);
	String P10L1 = "       learned a lot of different things";

	for (int i = 0 ; i < P10L1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P10L1.substring (i, i + 1), 17 * i, 60);
	}


	String P10L2 = "and practiced. He had an odd feeling";

	for (int i = 0 ; i < P10L2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P10L2.substring (i, i + 1), 17 * i, 120);
	}

	String P10L3 = "which he'd never had before.";

	for (int i = 0 ; i < P10L3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P10L3.substring (i, i + 1), 17 * i, 190);
	}

	Thread.sleep (1000);
	String P10L4 = "Now he knew a lot about living on";

	for (int i = 0 ; i < P10L4.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P10L4.substring (i, i + 1), 17 * i, 250);
	}

	String P10L5 = "Earth and other people. But still had";

	for (int i = 0 ; i < P10L5.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P10L5.substring (i, i + 1), 17 * i, 310);
	}

	String P10L6 = "no idea how living there was like.";

	for (int i = 0 ; i < P10L6.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P10L6.substring (i, i + 1), 17 * i, 370);
	}

	Thread.sleep (2000);
	String P10L7 = "That day arrived. He stood on the";

	for (int i = 0 ; i < P10L7.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P10L7.substring (i, i + 1), 17 * i, 430);
	}

	String P10L8 = "entrance on the floor of the space ship.";

	for (int i = 0 ; i < P10L8.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P10L8.substring (i, i + 1), 17 * i, 480);
	}
	Thread.sleep (2500);


	//PAGE 11

	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 30));
	c.setColor (Color.black);

	String P11L1 = "It opened and the same force that once";

	Thread.sleep (1000);
	for (int i = 0 ; i < P11L1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P11L1.substring (i, i + 1), 17 * i, 60);
	}

	String P11L2 = "had pulled him upwards from the Earth,";

	for (int i = 0 ; i < P11L2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P11L2.substring (i, i + 1), 17 * i, 120);
	}

	Thread.sleep (500);
	String P11L3 = "slowly pushed him down.";

	for (int i = 0 ; i < P11L3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P11L3.substring (i, i + 1), 17 * i, 190);
	}

	Thread.sleep (1000);
	String P11L4 = "Everything was new to him, the sights";

	for (int i = 0 ; i < P11L4.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P11L4.substring (i, i + 1), 17 * i, 250);
	}

	String P11L5 = "the smells, anything. He saw other";

	for (int i = 0 ; i < P11L5.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P11L5.substring (i, i + 1), 17 * i, 310);
	}

	String P11L6 = "people. He was curious about them all.";

	for (int i = 0 ; i < P11L6.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P11L6.substring (i, i + 1), 17 * i, 370);
	}

	Thread.sleep (300);
	String P11L7 = "But for some reason, never talked to";

	for (int i = 0 ; i < P11L7.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P11L7.substring (i, i + 1), 17 * i, 430);
	}

	String P11L8 = "any of them. Until one day.";

	for (int i = 0 ; i < P11L8.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P11L8.substring (i, i + 1), 17 * i, 480);
	}
	Thread.sleep (2500);


	//PAGE 12

	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 30));
	c.setColor (Color.black);

	String P12L1 = " Until one day, after collecting some";

	for (int i = 0 ; i < P12L1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P12L1.substring (i, i + 1), 17 * i, 60);
	}

	String P12L2 = "more information, he decieded to give";

	for (int i = 0 ; i < P12L2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P12L2.substring (i, i + 1), 17 * i, 120);
	}

	String P12L3 = "himself a break. He was told that";

	for (int i = 0 ; i < P12L3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P12L3.substring (i, i + 1), 17 * i, 190);
	}

	String P12L4 = "the purpose of the experiment was to";

	for (int i = 0 ; i < P12L4.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P12L4.substring (i, i + 1), 17 * i, 250);
	}

	String P12L5 = "collect information about other people.";

	for (int i = 0 ; i < P12L5.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P12L5.substring (i, i + 1), 17 * i, 310);
	}

	Thread.sleep (1000);
	String P12L6 = "He went to a park near the 'house'";

	for (int i = 0 ; i < P12L6.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P12L6.substring (i, i + 1), 17 * i, 370);
	}

	String P12L7 = "he'd rented. (He did his personal";

	for (int i = 0 ; i < P12L7.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P12L7.substring (i, i + 1), 17 * i, 430);
	}

	String P12L8 = "things in a big invisible capsule.)";

	for (int i = 0 ; i < P12L8.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P12L8.substring (i, i + 1), 17 * i, 480);
	}
	Thread.sleep (2500);


	//PAGE 13

	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 30));
	c.setColor (Color.black);

	String P13L1 = "He went to the park.Sat on a bench,";

	for (int i = 0 ; i < P13L1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P13L1.substring (i, i + 1), 17 * i, 60);
	}

	String P13L2 = "listened to the birds singing.It was";

	for (int i = 0 ; i < P13L2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P13L2.substring (i, i + 1), 17 * i, 120);
	}

	String P13L3 = "a sunny day and the air seemed fresh.";

	for (int i = 0 ; i < P13L3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P13L3.substring (i, i + 1), 17 * i, 190);
	}

	String P13L4 = "He was enjoying the view. Suddenly, he";

	for (int i = 0 ; i < P13L4.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P13L4.substring (i, i + 1), 17 * i, 250);
	}

	String P13L5 = "heard foot steps coming towards him.";

	for (int i = 0 ; i < P13L5.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P13L5.substring (i, i + 1), 17 * i, 310);
	}

	Thread.sleep (1000);
	String P13L6 = "'Do you mind if I sit next to you?'";

	for (int i = 0 ; i < P13L6.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P13L6.substring (i, i + 1), 17 * i, 370);
	}

	Thread.sleep (1000);
	String P13L7 = "said a girl with short brunette hair";

	for (int i = 0 ; i < P13L7.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P13L7.substring (i, i + 1), 17 * i, 430);
	}

	String P13L8 = "holding a half-painted canvas in herhand.";

	for (int i = 0 ; i < P13L8.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P13L8.substring (i, i + 1), 17 * i, 480);
	}
	Thread.sleep (2500);


	//PAGE 14

	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 30));
	c.setColor (Color.black);

	String P14L1 = "He had to act normal. 'Yea, sure.'";

	for (int i = 0 ; i < P14L1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P14L1.substring (i, i + 1), 17 * i, 60);
	}

	String P14L2 = "he said. The girl took out some";

	for (int i = 0 ; i < P14L2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P14L2.substring (i, i + 1), 17 * i, 120);
	}

	String P14L3 = "painting tools and started painting";

	for (int i = 0 ; i < P14L3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P14L3.substring (i, i + 1), 17 * i, 190);
	}

	String P14L4 = "on the incomplete canvas. He took a";

	for (int i = 0 ; i < P14L4.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P14L4.substring (i, i + 1), 17 * i, 250);
	}

	String P14L5 = "look at the painting and got curious";

	for (int i = 0 ; i < P14L5.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P14L5.substring (i, i + 1), 17 * i, 310);
	}

	String P14L6 = "about it. 'What are you drawing?'";

	for (int i = 0 ; i < P14L6.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P14L6.substring (i, i + 1), 17 * i, 370);
	}

	String P14L7 = "asked ";

	for (int i = 0 ; i < P14L7.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P14L7.substring (i, i + 1), 17 * i, 430);
	}

	c.drawString (FnameB, 100, 430);

	String P14L8 = "-Impressionism";

	for (int i = 0 ; i < P14L8.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P14L8.substring (i, i + 1), 17 * i, 480);
	}
	Thread.sleep (2500);

	//PAGE 15

	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 30));
	c.setColor (Color.black);

	String P15L1 = "-W hat?";

	for (int i = 0 ; i < P15L1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P15L1.substring (i, i + 1), 17 * i, 60);
	}

	Thread.sleep (1000);
	String P15L2 = "-Impressionism. That's my style.";

	for (int i = 0 ; i < P15L2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P15L2.substring (i, i + 1), 17 * i, 120);
	}

	Thread.sleep (1000);
	String P15L3 = "-Quite realistic! It did impress me.";

	for (int i = 0 ; i < P15L3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P15L3.substring (i, i + 1), 17 * i, 190);
	}

	Thread.sleep (500);
	String P15L4 = "-Haha yea. Not many artists choose";

	for (int i = 0 ; i < P15L4.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P15L4.substring (i, i + 1), 17 * i, 250);
	}

	String P15L5 = "impressionism as their style any more.";

	for (int i = 0 ; i < P15L5.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P15L5.substring (i, i + 1), 17 * i, 310);
	}

	Thread.sleep (1000);
	String P15L6 = "-I know. It was common in 19th century";

	for (int i = 0 ; i < P15L6.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P15L6.substring (i, i + 1), 17 * i, 370);
	}

	String P15L7 = "among French painters.";

	for (int i = 0 ; i < P15L7.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P15L7.substring (i, i + 1), 17 * i, 430);
	}

	Thread.sleep (1000);
	String P15L8 = "-Interesting. Are you an artist too?";

	for (int i = 0 ; i < P15L8.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P15L8.substring (i, i + 1), 17 * i, 480);
	}
	Thread.sleep (2500);

	//PAGE 16

	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 30));
	c.setColor (Color.black);

	String P16L1 = "-Nope.I've never even tried.";

	for (int i = 0 ; i < P16L1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P16L1.substring (i, i + 1), 17 * i, 60);
	}

	Thread.sleep (800);
	String P16L2 = "-You must be kidding m e! Not even";

	for (int i = 0 ; i < P16L2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P16L2.substring (i, i + 1), 17 * i, 120);
	}

	String P16L3 = "as a kid?";

	for (int i = 0 ; i < P16L3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P16L3.substring (i, i + 1), 17 * i, 190);
	}

	Thread.sleep (500);
	String P16L4 = "-No.";

	for (int i = 0 ; i < P16L4.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P16L4.substring (i, i + 1), 17 * i, 250);
	}

	Thread.sleep (1000);
	String P16L5 = "-No way. W hat were your favorite";

	for (int i = 0 ; i < P16L5.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P16L5.substring (i, i + 1), 17 * i, 310);
	}

	String P16L6 = "activities then?";

	for (int i = 0 ; i < P16L6.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P16L6.substring (i, i + 1), 17 * i, 370);
	}

	Thread.sleep (1000);
	String P16L7 = "-Umm.. Actually I had more serious";

	for (int i = 0 ; i < P16L7.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P16L7.substring (i, i + 1), 17 * i, 430);
	}

	String P16L8 = "things to do.";

	for (int i = 0 ; i < P16L8.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P16L8.substring (i, i + 1), 17 * i, 480);
	}
	Thread.sleep (2500);

	//PAGE 17

	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 30));
	c.setColor (Color.black);

	String P17L1 = "-No offence but that's weird.Haven't you";

	for (int i = 0 ; i < P17L1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P17L1.substring (i, i + 1), 17 * i, 60);
	}

	String P17L2 = "gone to school before?";

	for (int i = 0 ; i < P17L2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P17L2.substring (i, i + 1), 17 * i, 120);
	}

	Thread.sleep (1000);
	String P17L3 = "-Umm no I was home schooled.";

	for (int i = 0 ; i < P17L3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P17L3.substring (i, i + 1), 17 * i, 190);
	}

	Thread.sleep (500);
	String P17L4 = "-Whatever.I gotta go.It was nice talking";

	for (int i = 0 ; i < P17L4.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P17L4.substring (i, i + 1), 17 * i, 250);
	}

	String P17L5 = "to you. By the way,do you live here?";

	for (int i = 0 ; i < P17L5.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P17L5.substring (i, i + 1), 17 * i, 310);
	}

	String P17L6 = "I come here almost everyday to draw,";

	for (int i = 0 ; i < P17L6.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P17L6.substring (i, i + 1), 17 * i, 370);
	}

	String P17L7 = "But I'd never seen you before.";

	for (int i = 0 ; i < P17L7.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P17L7.substring (i, i + 1), 17 * i, 430);
	}

	Thread.sleep (1000);
	String P17L8 = "-Yeah I've just moved here.";

	for (int i = 0 ; i < P17L8.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P17L8.substring (i, i + 1), 17 * i, 480);
	}
	Thread.sleep (2500);

	//PAGE 18

	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 30));
	c.setColor (Color.black);

	String P18L1 = "-Oh cool. W hat's your nam e?";

	for (int i = 0 ; i < P18L1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P18L1.substring (i, i + 1), 17 * i, 60);
	}

	Thread.sleep (1000);
	String P18L2 = "-I'm ";

	for (int i = 0 ; i < P18L2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P18L2.substring (i, i + 1), 17 * i, 120);
	}
	c.drawString (FnameB, 100, 120);


	Thread.sleep (1000);
	String P18L3 = "-I'm  Am ara. It was nice to meet you.";

	for (int i = 0 ; i < P18L3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P18L3.substring (i, i + 1), 17 * i, 190);
	}

	Thread.sleep (500);
	String P18L4 = "-It was nice to meet you too.And";

	for (int i = 0 ; i < P18L4.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P18L4.substring (i, i + 1), 17 * i, 250);
	}

	String P18L5 = "by the way, you have a beautiful name!";

	for (int i = 0 ; i < P18L5.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P18L5.substring (i, i + 1), 17 * i, 310);
	}

	String P18L6 = "W hat's the meaning?";

	for (int i = 0 ; i < P18L6.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P18L6.substring (i, i + 1), 17 * i, 370);
	}

	Thread.sleep (1000);
	String P18L7 = "-Actually it has a lot of meanings but";

	for (int i = 0 ; i < P18L7.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P18L7.substring (i, i + 1), 17 * i, 430);
	}

	String P18L8 = "my favorite is the Latin one which is everlasting.";

	for (int i = 0 ; i < P18L8.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P18L8.substring (i, i + 1), 17 * i, 480);
	}
	Thread.sleep (2500);


	//PAGE 19

	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 30));
	c.setColor (Color.black);

	String P19L1 = "everlasting.";

	for (int i = 0 ; i < P19L1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P19L1.substring (i, i + 1), 17 * i, 60);
	}

	Thread.sleep (1000);
	String P19L2 = "-That's great.";

	for (int i = 0 ; i < P19L2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P19L2.substring (i, i + 1), 17 * i, 120);
	}


	Thread.sleep (1000);
	String P19L3 = "-Thanks. So see you later ";

	for (int i = 0 ; i < P19L3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P19L3.substring (i, i + 1), 17 * i, 190);
	}

	c.drawString (FnameB, 450, 190);

	Thread.sleep (500);
	String P19L4 = "-Bye!";

	for (int i = 0 ; i < P19L4.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P19L4.substring (i, i + 1), 17 * i, 250);
	}

	Thread.sleep (2000);

	c.drawString (FnameB, 0, 310);
	String P19L5 = "      felt different. He had met a";

	for (int i = 0 ; i < P19L5.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P19L5.substring (i, i + 1), 17 * i, 310);
	}

	String P19L6 = "person for the first time in his life.";

	for (int i = 0 ; i < P19L6.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P19L6.substring (i, i + 1), 17 * i, 370);
	}

	Thread.sleep (1000);
	String P19L7 = "He had to take some tests everyday.The";

	for (int i = 0 ; i < P19L7.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P19L7.substring (i, i + 1), 17 * i, 430);
	}

	String P19L8 = "results got better that day! ";

	for (int i = 0 ; i < P19L8.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P19L8.substring (i, i + 1), 17 * i, 480);
	}
	Thread.sleep (2500);

	//PAGE 20

	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 30));
	c.setColor (Color.black);

	String P20L1 = "He didn't know why. But for som e";

	for (int i = 0 ; i < P20L1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P20L1.substring (i, i + 1), 17 * i, 60);
	}

	String P20L2 = "reason, he wanted to see Am ara again.";

	for (int i = 0 ; i < P20L2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P20L2.substring (i, i + 1), 17 * i, 120);
	}


	Thread.sleep (1000);
	String P20L3 = "He had read about love.But it";

	for (int i = 0 ; i < P20L3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P20L3.substring (i, i + 1), 17 * i, 190);
	}

	String P20L4 = "hadn't m ade sense to him.He knew";

	for (int i = 0 ; i < P20L4.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P20L4.substring (i, i + 1), 17 * i, 250);
	}

	String P20L5 = "what affection was,but wasn't sure";

	for (int i = 0 ; i < P20L5.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P20L5.substring (i, i + 1), 17 * i, 310);
	}

	String P20L6 = "if it was similar to love.";

	for (int i = 0 ; i < P20L6.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P20L6.substring (i, i + 1), 17 * i, 370);
	}

	Thread.sleep (1000);
	String P20L7 = "'No no'he pondered,'it's not love.I'm";

	for (int i = 0 ; i < P20L7.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P20L7.substring (i, i + 1), 17 * i, 430);
	}

	String P20L8 = "just...excited to be on earth again.'";

	for (int i = 0 ; i < P20L8.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P20L8.substring (i, i + 1), 17 * i, 480);
	}
	Thread.sleep (2500);

	//PAGE 21

	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 30));
	c.setColor (Color.black);

	String P21L1 = "That day passed. He went to the park";

	for (int i = 0 ; i < P21L1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P21L1.substring (i, i + 1), 17 * i, 60);
	}

	String P21L2 = "again. He saw Am ara painting on a";

	for (int i = 0 ; i < P21L2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P21L2.substring (i, i + 1), 17 * i, 120);
	}


	String P21L3 = "bigger canvas but it was the same sketch.";

	for (int i = 0 ; i < P21L3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P21L3.substring (i, i + 1), 17 * i, 190);
	}

	Thread.sleep (1000);
	String P21L4 = "He went closer and said hi.";

	for (int i = 0 ; i < P21L4.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P21L4.substring (i, i + 1), 17 * i, 250);
	}

	Thread.sleep (1000);
	String P21L5 = "-Hi ";

	for (int i = 0 ; i < P21L5.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P21L5.substring (i, i + 1), 17 * i, 310);
	}
	c.drawString (FnameB + "!", 50, 310);

	Thread.sleep (1000);

	String P21L6 = "-I see that you're drawing the same";

	for (int i = 0 ; i < P21L6.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P21L6.substring (i, i + 1), 17 * i, 370);
	}

	String P21L7 = "thing you were yesterday!";

	for (int i = 0 ; i < P21L7.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P21L7.substring (i, i + 1), 17 * i, 430);
	}

	Thread.sleep (1000);
	String P21L8 = "-Yea that was the initial version.";

	for (int i = 0 ; i < P21L8.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P21L8.substring (i, i + 1), 17 * i, 480);
	}
	Thread.sleep (2500);




	//PAGE 22


	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 30));
	c.setColor (Color.black);

	String P23L1 = "-Beautiful.You're really good at this!";

	for (int i = 0 ; i < P23L1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P23L1.substring (i, i + 1), 17 * i, 60);
	}

	Thread.sleep (1000);
	String P23L2 = "-Thanks. W ait, I have an idea.";

	for (int i = 0 ; i < P23L2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P23L2.substring (i, i + 1), 17 * i, 120);
	}

	Thread.sleep (500);
	String P23L3 = "-W hat?";

	for (int i = 0 ; i < P23L3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P23L3.substring (i, i + 1), 17 * i, 190);
	}

	Thread.sleep (1000);
	String P23L4 = "-W hat if I teach you how to draw ?";

	for (int i = 0 ; i < P23L4.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P23L4.substring (i, i + 1), 17 * i, 250);
	}

	Thread.sleep (1000);
	String P23L5 = "-That'd be great.But wouldn't it take";

	for (int i = 0 ; i < P23L5.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P23L5.substring (i, i + 1), 17 * i, 310);
	}


	String P23L6 = "a very long tim e?";

	for (int i = 0 ; i < P23L6.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P23L6.substring (i, i + 1), 17 * i, 370);
	}

	Thread.sleep (1000);
	String P23L7 = "-W ell, practice m akes perfect!You in?";

	for (int i = 0 ; i < P23L7.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P23L7.substring (i, i + 1), 17 * i, 430);
	}

	Thread.sleep (1000);
	String P23L8 = "-Yes I am";

	for (int i = 0 ; i < P23L8.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P23L8.substring (i, i + 1), 17 * i, 480);
	}
	Thread.sleep (2500);

	//PAGE 24


	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 30));
	c.setColor (Color.black);

	String P24L1 = "They got closer as tim e went by.";

	for (int i = 0 ; i < P24L1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P24L1.substring (i, i + 1), 17 * i, 60);
	}

	Thread.sleep (1000);
	String P24L2 = "He m et Am ara's friends and m ade";

	for (int i = 0 ; i < P24L2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P24L2.substring (i, i + 1), 17 * i, 120);
	}

	String P24L3 = "new friends. Until he realized";

	for (int i = 0 ; i < P24L3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P24L3.substring (i, i + 1), 17 * i, 190);
	}

	String P24L4 = "that he had a different feeling";

	for (int i = 0 ; i < P24L4.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P24L4.substring (i, i + 1), 17 * i, 250);
	}

	String P24L5 = "for Am ara. Different from the";

	for (int i = 0 ; i < P24L5.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P24L5.substring (i, i + 1), 17 * i, 310);
	}


	String P24L6 = "other people he knew. So he";

	for (int i = 0 ; i < P24L6.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P24L6.substring (i, i + 1), 17 * i, 370);
	}

	String P24L7 = "decieded to express it to her.";

	for (int i = 0 ; i < P24L7.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P24L7.substring (i, i + 1), 17 * i, 430);
	}

	Thread.sleep (1000);
	String P24L8 = "You choose how he should do that.";

	for (int i = 0 ; i < P24L8.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P24L8.substring (i, i + 1), 17 * i, 480);
	}
	Thread.sleep (2500); 

	//PAGE 25


	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 30));
	c.setColor (Color.black);

	String P25L1 = "1.draw her portray and send it to her";

	for (int i = 0 ; i < P25L1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P25L1.substring (i, i + 1), 17 * i, 60);
	}

	String P25L2 = "w ith a love letter.";

	for (int i = 0 ; i < P25L2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P25L2.substring (i, i + 1), 17 * i, 120);
	}

	Thread.sleep (1000);

	String P25L3 = "2. Take her on a date.";

	for (int i = 0 ; i < P25L3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P25L3.substring (i, i + 1), 17 * i, 190);
	}

	Thread.sleep (1000);
	 String P25L4 = "Enter the num ber of your choice";

	for (int i = 0 ; i < P25L4.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P25L4.substring (i, i + 1), 17 * i, 250);
	}

	char choice = c.getChar ();
	//CHOICE 1
	if (choice == '1')
	{ //Clearing the previous screen to set a new one
	    c.clear ();

	    //Setting the color of the new background
	    c.setColor (Color.white);
	    c.fillRect (1, 1, 1000, 1000);

	    //Setting the text font, size and color
	    c.setFont (new Font ("Cambria", Font.PLAIN, 30));
	    c.setColor (Color.black);

	    //In these if statements, the strings starting with choice1 mean they belong to the first choice.
	    //choice2 means they belong to the 2nd choice. The next number will be for the number of the line.
	    //For instance, choice13 means the string for the first choice appearing in the 3rd line.
	    String choice1 = "He tried his best and drew the best";

	    for (int i = 0 ; i < choice1.length () ; i++)
	    {
		Thread.sleep (70);
		c.drawString (choice1.substring (i, i + 1), 17 * i, 60);
	    }

	    String choice12 = "im age he had of Am ara.";

	    for (int i = 0 ; i < choice12.length () ; i++)
	    {
		Thread.sleep (70);
		c.drawString (choice12.substring (i, i + 1), 17 * i, 120);
	    }

	    Thread.sleep (1000);

	    String choice13 = "Then, he w rote her a love letter";

	    for (int i = 0 ; i < choice13.length () ; i++)
	    {
		Thread.sleep (70);
		c.drawString (choice13.substring (i, i + 1), 17 * i, 190);
	    }


	    String choice14 = "expressing the feeling he had for her.";

	    for (int i = 0 ; i < choice14.length () ; i++)
	    {
		Thread.sleep (70);
		c.drawString (choice14.substring (i, i + 1), 17 * i, 250);
	    }

	    Thread.sleep (1000);
	    String P25L5 = "Then he sent it to her. She loved it!";

	    for (int i = 0 ; i < P25L5.length () ; i++)
	    {
		Thread.sleep (70);
		c.drawString (P25L5.substring (i, i + 1), 17 * i, 310);
	    }

Thread.sleep(1000);
	    String P25L6 = "She called and told him that she";

	    for (int i = 0 ; i < P25L6.length () ; i++)
	    {
		Thread.sleep (70);
		c.drawString (P25L6.substring (i, i + 1), 17 * i, 370);
	    }

	    String P25L7 = "felt the same about him.";

	    for (int i = 0 ; i < P25L7.length () ; i++)
	    {
		Thread.sleep (70);
		c.drawString (P25L7.substring (i, i + 1), 17 * i, 430);
	    }

	    Thread.sleep (2500);
	}


	//CHOICE 2
	//Taking her on a date


	if (choice == '2')
	{ //Clearing the previous screen to set a new one
	    c.clear ();

	    //Setting the color of the new background
	    c.setColor (Color.white);
	    c.fillRect (1, 1, 1000, 1000);

	    //Setting the text font, size and color
	    c.setFont (new Font ("Cambria", Font.PLAIN, 30));
	    c.setColor (Color.black);

	    String choice21 = "W here should he take Am ara?";

	    for (int i = 0 ; i < choice21.length () ; i++)
	    {
		Thread.sleep (70);
		c.drawString (choice21.substring (i, i + 1), 17 * i, 60);
	    }

	    String choice22 = "1. to a restaurant for dinner";

	    for (int i = 0 ; i < choice22.length () ; i++)
	    {
		Thread.sleep (70);
		c.drawString (choice22.substring (i, i + 1), 17 * i, 120);
	    }

	    Thread.sleep (1000);

	    String choice23 = "2. to have a picnic with him";

	    for (int i = 0 ; i < choice23.length () ; i++)
	    {
		Thread.sleep (70);
		c.drawString (choice23.substring (i, i + 1), 17 * i, 190);
	    }

	    Thread.sleep (1000);
	    String choice24 = "Enter the number of your choice.";


	    for (int i = 0 ; i < choice24.length () ; i++)
	    {
		Thread.sleep (70);
		c.drawString (choice24.substring (i, i + 1), 17 * i, 250);
	    }
	    choice = c.getChar ();

	    //restaurant
	    if (choice == '1')
	    {

		//Clearing the previous screen to set a new one
		c.clear ();

		//Setting the color of the new background
		c.setColor (Color.white);
		c.fillRect (1, 1, 1000, 1000);

		//Setting the text font, size and color
		c.setFont (new Font ("Cambria", Font.PLAIN, 30));
		c.setColor (Color.black);

		String choice25 = "He called her and told her that";

		for (int i = 0 ; i < choice25.length () ; i++)
		{
		    Thread.sleep (70);
		    c.drawString (choice25.substring (i, i + 1), 17 * i, 60);
		}


		String choice26 = "he wanted to take her on a date.";

		for (int i = 0 ; i < choice26.length () ; i++)
		{
		    Thread.sleep (70);
		    c.drawString (choice26.substring (i, i + 1), 17 * i, 120);
		}

		String choice27 = "Am ara sounded doughtful at first,";

		for (int i = 0 ; i < choice27.length () ; i++)
		{
		    Thread.sleep (70);
		    c.drawString (choice27.substring (i, i + 1), 17 * i, 190);
		}

		Thread.sleep (500);
		String choice28 = "but then agreed.";

		for (int i = 0 ; i < choice28.length () ; i++)
		{
		    Thread.sleep (70);
		    c.drawString (choice28.substring (i, i + 1), 17 * i, 250);


		}
		Thread.sleep (1000);
		String choice29 = "They had a good time and it came";

		for (int i = 0 ; i < choice29.length () ; i++)
		{
		    Thread.sleep (70);
		    c.drawString (choice29.substring (i, i + 1), 17 * i, 310);
		}

		String choice210 = "out that they both felt the same!";

		for (int i = 0 ; i < choice210.length () ; i++)
		{
		    Thread.sleep (70);
		    c.drawString (choice210.substring (i, i + 1), 17 * i, 370);
		}
	    }
	    //Picnic
	    if (choice == '2')
	    { //Clearing the previous screen to set a new one
		c.clear ();

		//Setting the color of the new background
		c.setColor (Color.white);
		c.fillRect (1, 1, 1000, 1000);

		//Setting the text font, size and color
		c.setFont (new Font ("Cambria", Font.PLAIN, 30));
		c.setColor (Color.black);
		String choice25 = "He called her and told her that";

		for (int i = 0 ; i < choice25.length () ; i++)
		{
		    Thread.sleep (70);
		    c.drawString (choice25.substring (i, i + 1), 17 * i, 60);
		}
		Thread.sleep (2500);
		String choice26 = "he wanted to take her on a date.";

		for (int i = 0 ; i < choice26.length () ; i++)
		{
		    Thread.sleep (70);
		    c.drawString (choice26.substring (i, i + 1), 17 * i, 120);
		}

		String choice27 = "Am ara sounded doughtful at first,";

		for (int i = 0 ; i < choice27.length () ; i++)
		{
		    Thread.sleep (70);
		    c.drawString (choice27.substring (i, i + 1), 17 * i, 190);
		}

		Thread.sleep (500);
		String choice28 = "but then agreed.";

		for (int i = 0 ; i < choice28.length () ; i++)
		{
		    Thread.sleep (70);
		    c.drawString (choice28.substring (i, i + 1), 17 * i, 250);


		}
		Thread.sleep (1000);
		String choice29 = "They had a good time and it came";

		for (int i = 0 ; i < choice29.length () ; i++)
		{
		    Thread.sleep (70);
		    c.drawString (choice29.substring (i, i + 1), 17 * i, 310);
		}

		String choice210 = "out that they both felt the same!";

		for (int i = 0 ; i < choice210.length () ; i++)
		{
		    Thread.sleep (70);
		    c.drawString (choice210.substring (i, i + 1), 17 * i, 370);
		}
	    }
	}
	
//PAGE 26


	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 30));
	c.setColor (Color.black);
	
	c.drawString(FnameB, 0,60);

	String P26L1 = "       had loved earth. He'd learned";

	for (int i = 0 ; i < P26L1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P26L1.substring (i, i + 1), 17 * i, 60);
	}

	String P26L2 = "and experienced a lot of new things.";

	for (int i = 0 ; i < P26L2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P26L2.substring (i, i + 1), 17 * i, 120);
	}
	
	Thread.sleep(1000);

	String P26L3 = "He felt as if it was his home though";

	for (int i = 0 ; i < P26L3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P26L3.substring (i, i + 1), 17 * i, 190);
	}

	String P26L4 = "not a long time had passed. Things";

	for (int i = 0 ; i < P26L4.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P26L4.substring (i, i + 1), 17 * i, 250);
	}

	String P26L5 = "seemed to be going on perfectly. Until,";

	for (int i = 0 ; i < P26L5.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P26L5.substring (i, i + 1), 17 * i, 310);
	}

Thread.sleep(1000);
	String P26L6 = "he got a message that the experiment";

	for (int i = 0 ; i < P26L6.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P26L6.substring (i, i + 1), 17 * i, 370);
	}

	String P26L7 = "had finished and he recieved a location";

	for (int i = 0 ; i < P26L7.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P26L7.substring (i, i + 1), 17 * i, 430);
	}

	String P26L8 = "in the sign language he'd invented before.";

	for (int i = 0 ; i < P26L8.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P26L8.substring (i, i + 1), 17 * i, 480);
	}
	Thread.sleep (2500);

//PAGE 27


	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 30));
	c.setColor (Color.black);
	
	c.drawString(FnameB, 0,60);

	String P27L1 = "       now had the location where";

	for (int i = 0 ; i < P27L1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P27L1.substring (i, i + 1), 17 * i, 60);
	}

	String P27L2 = "he could meet them again.But he didn't";

	for (int i = 0 ; i < P27L2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P27L2.substring (i, i + 1), 17 * i, 120);
	}


	String P27L3 = "want to leave.So he decieded to go see";

	for (int i = 0 ; i < P27L3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P27L3.substring (i, i + 1), 17 * i, 190);
	}

	String P27L4 = "them personally to tell them that he";

	for (int i = 0 ; i < P27L4.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P27L4.substring (i, i + 1), 17 * i, 250);
	}

	String P27L5 = "wanted to stay.";

	for (int i = 0 ; i < P27L5.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P27L5.substring (i, i + 1), 17 * i, 310);
	}

Thread.sleep(1000);
	String P27L6 = "But little did he know that Am ara was";

	for (int i = 0 ; i < P27L6.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P27L6.substring (i, i + 1), 17 * i, 370);
	}

	String P27L7 = "near that location.";

	for (int i = 0 ; i < P27L7.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P27L7.substring (i, i + 1), 17 * i, 430);
	}

	Thread.sleep(1000);
	String P27L8 = "He arrived and told them what he wanted.";

	for (int i = 0 ; i < P27L8.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P27L8.substring (i, i + 1), 17 * i, 480);
	}
	Thread.sleep (2500);
	
	//PAGE 28


	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 25));
	c.setColor (Color.black);
	
	c.drawString(FnameB, 0,60);

	String P28L1 = "     w ent there and told it to them.";

	for (int i = 0 ; i < P28L1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P28L1.substring (i, i + 1), 15 * i, 60);
	}
	
	Thread.sleep(1000);

	String P28L2 = "Their response was that it wasn't";

	for (int i = 0 ; i < P28L2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P28L2.substring (i, i + 1), 15 * i, 120);
	}


	String P28L3 = "possible to continue living on earth with";

	for (int i = 0 ; i < P28L3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P28L3.substring (i, i + 1), 15 * i, 190);
	}

	String P28L4 = "the knowledge he had.And he wouldn't be able";

	for (int i = 0 ; i < P28L4.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P28L4.substring (i, i + 1), 15 * i, 250);
	}

	String P28L5 = "to have a normal life.But he didn't want to";

	for (int i = 0 ; i < P28L5.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P28L5.substring (i, i + 1), 15 * i, 310);
	}

	String P28L6 = "go back so he started giving different reasons";

	for (int i = 0 ; i < P28L6.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P28L6.substring (i, i + 1), 15 * i, 370);
	}

	String P28L7 = "to them.Suddenly, Am ara,who thought he was";

	for (int i = 0 ; i < P28L7.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P28L7.substring (i, i + 1), 15 * i, 430);
	}

	String P28L8 = "alone,came to surprise him.";

	for (int i = 0 ; i < P28L8.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P28L8.substring (i, i + 1), 15 * i, 480);
	}
	Thread.sleep (2500);
	
	  //PAGE 29


	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 25));
	c.setColor (Color.black);

	String P29L1 = "Am ara couldn't believe what she saw.";

	for (int i = 0 ; i < P29L1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P29L1.substring (i, i + 1), 15 * i, 60);
	}
	
	Thread.sleep(1000);

	String P29L2 = "She was speechless.";

	for (int i = 0 ; i < P29L2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P29L2.substring (i, i + 1), 15 * i, 120);
	}
	Thread.sleep(1000);
	c.drawString(FnameB,280, 120);


	String P29L3 = "                        tried to explain";

	for (int i = 0 ; i < P29L3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P29L3.substring (i, i + 1), 15 * i, 120);
	}

	String P29L4 = "but the aliens stopped him and told him with";

	for (int i = 0 ; i < P29L4.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P29L4.substring (i, i + 1), 15 * i, 190);
	}

	String P29L5 = "telepathy that now he'd definitely have to";

	for (int i = 0 ; i < P29L5.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P29L5.substring (i, i + 1), 15 * i, 250);
	}

	String P29L6 = "go with them plus,now that she'd seen them,";

	for (int i = 0 ; i < P29L6.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P29L6.substring (i, i + 1), 15 * i, 310);
	}
	
	Thread.sleep(1000);

	String P29L7 = "she'd tell others about them so she had to";

	for (int i = 0 ; i < P29L7.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P29L7.substring (i, i + 1), 15 * i, 370);
	}

	String P29L8 = "forget him and everything related to him.";

	for (int i = 0 ; i < P29L8.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P29L8.substring (i, i + 1), 15 * i, 430);
	}
	Thread.sleep(1000);
	String P29L9 = "That upsetted him so much that he ccouldn't";

	for (int i = 0 ; i < P29L9.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P29L9.substring (i, i + 1), 15 * i, 490);
	}
	Thread.sleep (2500);
	
	  //PAGE 30


	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 25));
	c.setColor (Color.black);

	String P30L1 = "control his anger and told them in human";

	for (int i = 0 ; i < P30L1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P30L1.substring (i, i + 1), 15 * i, 60);
	}
	
	Thread.sleep(1000);

	String P30L2 = "language in a furious way to leave.";

	for (int i = 0 ; i < P30L2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P30L2.substring (i, i + 1), 15 * i, 120);
	}
	Thread.sleep(2000);


	String P30L3 = "The aliens told him to calm down and this";

	for (int i = 0 ; i < P30L3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P30L3.substring (i, i + 1), 15 * i, 190);
	}

	String P30L4 = "was another part of the experiment and he'd";

	for (int i = 0 ; i < P30L4.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P30L4.substring (i, i + 1), 15 * i, 250);
	}

	String P30L5 = "be able to continue living on earth.So all";

	for (int i = 0 ; i < P30L5.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P30L5.substring (i, i + 1), 15 * i, 310);
	}

	String P30L6 = "Am ara's and his memories about aliens would";

	for (int i = 0 ; i < P30L6.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P30L6.substring (i, i + 1), 15 * i, 370);
	}


	String P30L7 = "forgotten.Also the knowledge which he won't need.";

	for (int i = 0 ; i < P30L7.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P30L7.substring (i, i + 1), 15 * i, 430);
	}

	String P30L8 = "His memories would be replaced with fake normal ones.";

	for (int i = 0 ; i < P30L8.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P30L8.substring (i, i + 1), 15 * i, 460);
	}
	Thread.sleep(1000);
	String P30L9 = "So he and Am ara would have a normal life together.";

	for (int i = 0 ; i < P30L9.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P30L9.substring (i, i + 1), 15 * i, 490);
	}
	Thread.sleep (2500);
	
	 //PAGE 31


	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.PLAIN, 25));
	c.setColor (Color.black);

	String P31L1 = "Losing many parts of the knowledge he'd";

	for (int i = 0 ; i < P31L1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P31L1.substring (i, i + 1), 15 * i, 60);
	}


	String P31L2 = "learned so far didn't sound perfect,";

	for (int i = 0 ; i < P31L2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P31L2.substring (i, i + 1), 15 * i, 120);
	}
	Thread.sleep(1000);


	String P31L3 = "But he agreed.They did the same thing they";

	for (int i = 0 ; i < P31L3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P31L3.substring (i, i + 1), 15 * i, 190);
	}

	String P31L4 = "told him.";

	for (int i = 0 ; i < P31L4.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P31L4.substring (i, i + 1), 15 * i, 250);
	}

Thread.sleep(1000);
	String P31L5 = "Am ara and";

	for (int i = 0 ; i < P31L5.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P31L5.substring (i, i + 1), 15 * i, 310);
	}
c.drawString(FnameB,173,310);
	String P31L6 = "                 lived happily together";

	for (int i = 0 ; i < P31L6.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P31L6.substring (i, i + 1), 15 * i, 310);
	}


	String P31L7 = "as normal people.The result of the";

	for (int i = 0 ; i < P31L7.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P31L7.substring (i, i + 1), 15 * i, 370);
	}

	String P31L8 = "experiment was that emotions make the";

	for (int i = 0 ; i < P31L8.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P31L8.substring (i, i + 1), 15 * i, 410);
	}
	
	String P31L9 = "actions more efficient but they're only";

	for (int i = 0 ; i < P31L9.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P31L9.substring (i, i + 1), 15 * i, 450);
	}
	
	String P31L10 = "suitable for living with others.";

	for (int i = 0 ; i < P31L10.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (P31L10.substring (i, i + 1), 15 * i, 490);
	}
	Thread.sleep (3000); 
	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Courier New", Font.PLAIN, 60));
	c.setColor (Color.black);

	String end = "      The End";

	for (int i = 0 ; i < end.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (end.substring (i, i + 1), 33 * i, 250);
	}
	Thread.sleep (3000); 
	//Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.white);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Arial", Font.PLAIN, 25));
	c.setColor (Color.black);

	String restart1 = "  W ould you like to play another story?";

	for (int i = 0 ; i < restart1.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (restart1.substring (i, i + 1), 15 * i, 200);
	}
	String restart2 = "  Press 1 if yes, press 2 if no.";

	for (int i = 0 ; i < restart2.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (restart2.substring (i, i + 1), 15 * i, 300);
	}
	char restart=c.getChar();
	//If the user enters 1, s/he'll be sent to the main method. If 2, s/he'll exit the program.
	if (restart=='1'){}
	//How to exit the program immediately.
	if (restart=='2'){c.close();}
	

    }


    
    
    public static void TheHowlsoftheNight () throws InterruptedException
    { 
    //Clearing the previous screen to set a new one
	c.clear ();

	//Setting the color of the new background
	c.setColor (Color.black);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("MS PGothic", Font.PLAIN, 40));
	c.setColor (Color.red);

	//Displaying the name of the story letter by letter

	Thread.sleep (500);
	c.drawString ("T", 65, 200);
	Thread.sleep (100);
	c.drawString ("h", 90, 200);
	Thread.sleep (100);
	c.drawString ("e", 110, 200);
	
	Thread.sleep (150);
	c.drawString ("H", 140, 200);
	Thread.sleep (100);
	c.drawString ("o", 163, 200);
	Thread.sleep (100);
	c.drawString ("w", 182, 200);
	Thread.sleep (100);
	c.drawString ("l", 210, 200);
	Thread.sleep (100);
	c.drawString ("s", 220, 200);
	
	Thread.sleep (100);
	c.drawString ("o", 260, 200);
	Thread.sleep (100);
	c.drawString ("f", 280, 200);
	
	Thread.sleep (150);
	c.drawString ("t", 324, 200);
	Thread.sleep (100);
	c.drawString ("h", 340, 200);
	Thread.sleep (100);
	c.drawString ("e", 360, 200);
	
	Thread.sleep (100);
	c.drawString ("N", 400, 200);
	Thread.sleep (100);
	c.drawString ("i", 423, 200);
	Thread.sleep (100);
	c.drawString ("g", 430, 200);
	Thread.sleep (100);
	c.drawString ("h", 450, 200);
	Thread.sleep (100);
	c.drawString ("t", 470, 200);

	Thread.sleep (1500);

	//Setting the new text font, size and color

	c.setFont (new Font ("MS PGothic", Font.PLAIN, 25));
	c.setColor (Color.red);

	//Displaying the genres after 5 seconds

	c.drawString ("Science fiction,", 65, 280);
	Thread.sleep (1000);
	c.drawString ("Horror", 250, 280);

	Thread.sleep (2000);

	//Setting the new text font, size and color

	c.drawString ("Would you like to play this story?", 65, 380);
	Thread.sleep (900);
	c.drawString ("Press 1 if yes, press 2 if no.", 65, 440);

	char choice = c.getChar ();
	if (choice == '1')
	{
	}
	if (choice == '2')
	{
	    menu ();
	}


	//Clearing the previous screen to set a new one
	c.clear ();
	
	 //Setting the color of the new background
	c.setColor (Color.black);
	c.fillRect (1, 1, 1000, 1000);

	//Setting the text font, size and color
	c.setFont (new Font ("Cambria", Font.BOLD, 33));
	c.setColor (Color.black);

	//Displaying the story letter by letter


	//PAGE 1
	
	String Story="Once upon a time, there were 5 mountaineer friends. 2 boys and 3 girls. Mason,  Leo, Cora, Harlow, and Narico. They'd been mounting for a long time as friends. They barely stayed the night in the mountains. It was summer and they'd found a nice place to go mountain climbing. The Villarrica volcano in Chile. They'd been to Chile before, but they'd never climbed an active volcano!";
	
	for (int i=0; i<Story.length();i++){c.print(Story.substring(i,i+1));
	Thread.sleep(70);}

	Thread.sleep(2000);
	String story=" Almost all of them had arrived at the airport. Everyone except Narico and Mason. 'Narico's still busy getting ready I guess.',said Cora. Harlow sighed and said, 'Then where's Mason?' Leo who was Mason's best friend answered,'He's gonna get some more professional mountaineering tools for us.' 'Oh really?'asked Harlow. 'He's joking Harlow.' said Cora";
	for (int i=0; i<story.length();i++){c.print(story.substring(i,i+1));
	Thread.sleep(70);}


       Thread.sleep(1000);
       String story0="'he's probably still sleeping.' Eventually, Narico and Mason arrived. Narico looked rushed and apologized for being late. So did Mason but he didn't look sorry. The flight was on time. The sky was clear and they arrived in Chile safely. They took a taxi to their hotel and decieded to rest that day.";
	for (int i=0; i<story0.length();i++){c.print(story0.substring(i,i+1));
	Thread.sleep(70);}
	
	Thread.sleep(2000);
       String story1="The next day, they were ready to go. They went with their tour. It was a warm sunny day. 'I hope nobody forgot to put on sunscreen.'said Narico. It was harder than they thought. But worth it. The nature was extremely beautiful. There were plants near the crater that non of them had ever seen before. Suddenly, Mason said,'Guys, what if we stayed the night here?','Nah, we're going back.'said Cora. 'Come on! We haven't come here to climb a single mountain and just leave!'said Leo. ";
       for (int i=0; i<story1.length();i++){c.print(story1.substring(i,i+1));
	Thread.sleep(70);}
	
	Thread.sleep(1000);
	String story2="Yea, that'd be great!'said Harlow. They finally agreed to spend the night there. It was so dark. No light could be seen nearby. They made a campfire and sat around it. Suddenly, they heard a shout-like animal sound from the distance. 'What was that?!' said Narico. All of them were too frightened to answer. 'It's just an animal. We're in the wild life anyway.' 'I hope so'said Leo. Cora said,'What else could it be Leo?!' Leo answered,'Have you ever heard about Rake?'";
	 for (int i=0; i<story2.length();i++){c.print(story2.substring(i,i+1));
	Thread.sleep(70);}
	
	Thread.sleep(3000); 
	
	//Clearing the previous screen to set a new one
	c.clear ();
	
	 //Setting the color of the new background
	c.setColor (Color.black);
	c.fillRect (1, 1, 1000, 1000);
	
	//PAGE 2
	
	String story3="'No what's that?'said Cora.'Its myths exist from the 16th century. It's a humanoid creature that's extremely violent and attackes humans.', 'And it eats them?'said Mason.'Probably, no victim has ever survived. No one knows where it comes from. It's so creepy and it walks on its 4 legs. But it's as if its knees are broken, cuz he crawls too. That sound, was really similar to its shoutings.' 'And how do you know what it sounds like?'asked Cora.'I've watched youtube videos of it. Most of them had this sound in the background.' 'Dude stop. I'm scared. It's not a good time for joking.'said Mason. 'I'm not joking. I'm just as scared as you are!'said Leo. All of a sudden, they heard the same sound but from a closer distance. 'Guys stop! I don't care what it is, but I have a feeling that it's gonna hurt us! Anyone has a weapon or something?' said Narico. 'Yea I brought one to hunt squirrels if I had the chance.' said Mason. 'You can't go alone Leo and I are coming with you to see what that is.'said Cora. 'What?! Nobody asked my opinion!'said Leo. Cora answered,'You obviously know more about this creature than we do.' 'That's not a reason! But whatever. I'm coming too.'said Leo. ";
	 for (int i=0; i<story3.length();i++){c.print(story3.substring(i,i+1));
	Thread.sleep(70);}
  
	Thread.sleep(1000);
	 String story4="You choose what they do next. ";
	 for (int i=0; i<story4.length();i++){c.print(story4.substring(i,i+1));
	Thread.sleep(70);}
	
	 String story5="1. Look for somewhere safe.(Like a cave.)                           2. Follow the sound to hunt it.";
	 for (int i=0; i<story5.length();i++){c.print(story5.substring(i,i+1));
	Thread.sleep(70);}
	int choice1=c.readInt();
	if (choice1==1){String choiceFirst="Mason, Cora and Leo started looking for a cave or somewhere to hide. But they couldn't find one."; for (int i=0; i<choiceFirst.length();i++){c.print(choiceFirst.substring(i,i+1));
	Thread.sleep(70);} Thread.sleep(1000);}
	String story6="They followed the sound. Cora had the flashlight so she led them. They got closer and closer to it and found it. It looked like the same thing Leo had talked about. They shot it. It shouted but nothing happened to it. It started walking fast on its two legs in a weird way was getting closer to them. Mason kept shooting until it fell down. They didn't even go to check what it was. They just ran away. They found others, went away and never went mountain climbing at night.";
	for (int i=0; i<story6.length();i++){c.print(story6.substring(i,i+1));
	Thread.sleep(70);}
	
	
	//Sorry if the story was boring I didn't have time to write a better one.
	
	Thread.sleep(1000);
	 String story7="Would you like to play another story?";
	 for (int i=0; i<story7.length();i++){c.print(story7.substring(i,i+1));
	Thread.sleep(70);}
	String restart3 = "        Press 1 if yes, press 2 if no.";

	for (int i = 0 ; i < restart3.length () ; i++)
	{
	    Thread.sleep (70);
	    c.drawString (restart3.substring (i, i + 1), 15 * i, 300);
	}
	int restart=c.readInt();
	//If the user enters 1, s/he'll be sent to the main method. If 2, s/he'll exit the program.
	if (restart==1){}
	//How to exit the program immediately.
	if (restart==2){c.close();}

    }

/*
    //HORROR

    public static void Sumar () throws InterruptedException
    {
    }


    //DRAMA

    public static void Filippa () throws InterruptedException
    {
    }


    //SUSPENSE

    public static void TheRoad () throws InterruptedException
    {
    }


    //ACTION & ADVENTURE

    public static void ThreeWeeksinWilderness () throws InterruptedException
    {
    }*/





}


