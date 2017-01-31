package com.main;

public class HelloWorld {
	
	private String defaultEngSong = "ABC SONG";
	private String defaultSong = "Eason Song is stylish";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("what's your name ? "+inputByUser());
		System.out.print("testomg "+dataPatch());
	}
	
	public static String inputByUser(){
		return "i am jason tsang";
	}
	
	public static String dataPatch(){
		return "data patcing ...";
	}

}
