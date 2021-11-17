package com.xworkz.newspaper.starter;

import com.xworkz.newspaper.parent.NewsPaper;

public class NewsPaperStarter {

	public static void main(String[] args) {
		NewsPaper news =new NewsPaper();
		news.setName("The Times Of India");
        news.setLang("English");
        news.setSince(1838);

        NewsPaper news1 =new NewsPaper();
		news1.setName("The Times Of India");
        news1.setLang("English");
        news1.setSince(1838);

        if (news== news1)
        {
    		System.out.println("both are pointing to same memory location");
    	}
        
    	boolean same =news.equals(null);
    	System.out.println(same);
    	}

}
