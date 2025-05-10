/*
    The Laire Project - 2025
    This piece of code belongs to The Laire Project.
    (Original programmer: Mertbikoss - Mert Coşkun)
*/

package Laire.Misc;
import java.util.Random;

public class Hex {
    Random random = new Random();
	private String aa = "";
	public String generate(long length) {
		StringBuilder sb = new StringBuilder();
		int a = 0;
		while(a<length) {
			int b = random.nextInt(1, 16);
			switch (b) {
			case 1: aa = "0"; break;
			case 2: aa = "1"; break;
			case 3: aa = "2"; break;
			case 4: aa = "3"; break;
			case 5: aa = "4"; break;
			case 6: aa = "5"; break;
			case 7: aa = "6"; break;
			case 8: aa = "7"; break;
			case 9: aa = "8"; break;
			case 10: aa = "9"; break;
			case 11: aa = "A"; break;
			case 12: aa = "B"; break;
			case 13: aa = "C"; break;
			case 14: aa = "D"; break;
			case 15: aa = "E"; break;
			case 16: aa = "F"; break;
			}
			sb.append(aa);
			a++;
		}
		return sb.toString();
	}
}