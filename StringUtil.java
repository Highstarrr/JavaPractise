package practise02;
import java.util.Scanner;
public class StringUtil {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String a = in.nextLine();
		String b ="";
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i) == ' ') 
				//System.out.println("1");
				continue;
			b += a.charAt(i);
		}
		System.out.print(b);
	}
}

//import java.util.Scanner;
//public class StringUtil {
//    public static void main(String[] args) {
//        Scanner in =new Scanner(System.in);
//        //»ñÈ¡StringÖµ
//        String a=in.nextLine();
//        StringBuilder stringBuilder = new StringBuilder(a);
//        for (int i = 0; i < stringBuilder.length(); i++) {
//            if (stringBuilder.charAt(i)==' ') {
//                System.out.println(i);
//                stringBuilder.deleteCharAt(i);
//                i--;
//            }else {
//                stringBuilder.charAt(i);
//            }
//        }
//        System.out.println(stringBuilder.toString());
//    }
//}