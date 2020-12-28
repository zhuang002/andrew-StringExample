import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		
		String s3=s1+s2;
		System.out.println(s3);
		
		//char String.charAt(index); int String.length();
		System.out.println(s3.charAt(2));
		System.out.println(s3.charAt(5));
		for (int i=0;i<s3.length();i++) {
			System.out.print(s3.charAt(i)+",");
		}
		System.out.println();
		
		// String[] String.split(separator);
		String[] words=s3.split(" ");
		for (String word:words) {
			System.out.print(word+",");
		}
		System.out.println();
		
		//String[] String.split(regex);
		words=s3.split("\\s|\\.");
		for (String word:words) {
			System.out.print(word+",");
		}
		System.out.println();
		System.out.println();
		
		//substring
		String s=s3.substring(5);
		System.out.println(s);
		
		s=s3.substring(5,10);
		System.out.println(s);
		System.out.println();
		
		// find a substring in a string
		int index=s3.indexOf("teacher");
		System.out.println(index);
		
		index=s3.indexOf(" a ");
		System.out.println(index);
		
		index=s3.lastIndexOf(" a ");
		System.out.println(index);
		
		index=s3.indexOf("animal");
		System.out.println(index);
		
		index=0;
		while (index>=0) {
			index=s3.indexOf(" a ", index);
			System.out.println(index+",");
			if (index<0) break;
			index=index+3;
		}
		System.out.println();
		
		
		//int String.compareTo(s)
		s1="abc def";
		s2="abc deg";
		
		int comp=s1.compareTo(s2);
		if (comp==0) {
			s="equals";
		} else if (comp<0) {
			s="is less than";
		} else {
			s="is larger than";
		}
		System.out.println("s1 "+s+" s2");
		
		
		s1="abc def";
		s2="AbC DEf";
		if (s1.equals(s2)) {
			System.out.println("s1 equals to s2");
		} else {
			System.out.println("s1 does not equal to s2");
		}
		
		if (s1.equalsIgnoreCase(s2)) {
			System.out.println("s1 equals to s2 ignore case");
		} else {
			System.out.println("s1 does not equal to s2 ignore case");
		}
		
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toLowerCase());
		
		s=s3.replaceAll(" a ", "-A-");
		System.out.println(s);
		
		s="   abc  bcd   	";
		System.out.println(s.trim());
	
	}

}
