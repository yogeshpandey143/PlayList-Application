package songApplication;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Album album1 = new Album( "Alone","Alan Walker");
		
		album1.addSong("Song 1",5.2);
		album1.addSong("Song 2", 2);
		album1.addSong("Song 3", 2.1);
		album1.addSong("Song 4", 2.1);
		album1.addSong("Song 5", 2.3);
		album1.addSong("Song 6", 1.1);
		album1.addSong("Song 7", 3.1);
		album1.addSong("Song 8", 4.1);
		
		
		
		LinkedList<Song> myPlayList = new LinkedList<>();
		
		album1.addtoPlayList("Song 1", myPlayList);
		album1.addtoPlayList("Song 2", myPlayList);
		album1.addtoPlayList("Song 3", myPlayList);
		album1.addtoPlayList("Song 4", myPlayList);
		album1.addtoPlayList("Song 5", myPlayList);
		album1.addtoPlayList("Song 6", myPlayList);
		album1.addtoPlayList("Song 7", myPlayList);
		
		
		play(myPlayList);
		
		

	}
	
	
	public static void printList(LinkedList<Song> myPlayList)
	{
		ListIterator<Song> itr = myPlayList.listIterator();
		
//		itr.hasPrevious();
//		itr.hasNext();
//		itr.hashCode();
		
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
	return;
		
	}
	
	
	public static void showMenu()
	{
		
		System.out.print("0: Exit");
		System.out.print("1: print the menu");
		System.out.print("2: show all song in playlist");
		System.out.print("3: play next");
		System.out.print("4: play previous");
		
	}
	
	
	
	
	
	
	public static void play(LinkedList<Song> myPlayList)
	{
      Scanner sc = new Scanner(System.in);
      
		ListIterator<Song> itr = myPlayList.listIterator();
		
		if(!itr.hasNext())
		{
			System.out.println("no song!");
			return;
		}
		
		System.out.println("You are Listning " + itr.next());
		showMenu();
		
       boolean forward = true;
		while(true)
		{
			int option= sc.nextInt();
			
			switch(option)
			{
			case 0:
				System.out.println("thask for listning");
				break;
				
				
			case 1:
				showMenu();
				break;
				
				
			case 2:
				
			 printList(myPlayList);
			 break;
			 
			 
			 
			case 3:
				if(forward)
				{
					if(itr.hasNext())
					itr.next();
					
					else 
						System.out.println("No next Song!");
						
				}
				if(!itr.hasNext())
				{
					System.out.println("You have reached to the last !");
					
				}
				forward = true;
			break;
			
			
			case 4:
				
				if(forward)
				{
					if(itr.hasPrevious())
					{
						itr.previous();
					}
				}
				
				if(!itr.hasPrevious())
				{
					System.out.println("No previous");
				}
				
				else 
				{
					System.out.println("you are listning :" +itr.previous());
				}
				
				forward = false;
				break;
			
			}
		}
        
	}
	
	

	
	

}
