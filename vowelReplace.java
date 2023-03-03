package JAVAEASYEG;
class vowelReplace {
public static void main (String[]args) {
	String s1="saveetha school of engineering";
	System.out.print("the given string is:" +s1);
	s1=s1.replaceAll("[aeiou]"," ");
	System.out.println("\n the consonants of string is:" +s1);
}
}
