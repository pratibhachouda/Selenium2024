package day10;

public class ExeStringBuffer {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		sb.append("hello");
		sb.append(" ");
		sb.append("Beautiful");
      String message = sb.toString();
      System.out.println(message);
      System.out.println(sb.toString());
      System.out.println(sb.insert(2, '!'));
      System.out.println(sb.insert(6, '@'));
	}
	

}
