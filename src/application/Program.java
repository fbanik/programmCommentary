package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		
		Comment c1 = new Comment("Have a Nice Trip!!!");
		Comment c2 = new Comment("Wow that's Awesomeee!!!");
		Post p1 = new Post(sdf1.parse("21/06/2018 13:05:44"), "Travelling to New Zealand", 
				"Im going to visit this wonderful country!!! ", 12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
		
		
		Comment d1 = new Comment("Guizao canta muito mal man");
		Comment d2 = new Comment("Nossa nem me fale");
		Post p2 = new Post(sdf1.parse("20/11/2019 20:40:44"), "Guizao Cantando!!!", 
				"Aiiii become so long ai quem fio you leng ", 12);
		p2.addComment(d1);
		p2.addComment(d2);
		
		System.out.println(p1);
		System.out.println(p2);
	}

}
