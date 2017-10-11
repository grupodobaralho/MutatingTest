package mainPackage;

import java.util.*;

public class Longest {

	private static int dec_num, rem, j;
	private static int bin_num[] = new int[100];
	private static Scanner scan = new Scanner(System.in);
	private static String binary_str = "";

	public static void main(String[] args) {

		System.out.print("Input a Decimal Number : ");
		dec_num = scan.nextInt();
		System.out.print("Binary number is: ");
		System.out.print(getBinary(dec_num));
		System.out.print("\nLength of the longest sequence: " + getLengthLongSeq(binary_str));

	}

	public static String getBinary(int dec_num) {
		//Aterei este i para dentro, pq ele era global, daí alterava nos outros testes e afetava o resultado.
		int i = 1;
		int quot = dec_num;
		if(dec_num <= 0) {			
			return "erro";		
		}
		while (quot != 0) {
			bin_num[i++] = quot % 2;
			quot = quot / 2;
		}
		
		for (j = i - 1; j > 0; j--) {
			binary_str = binary_str + bin_num[j];
		}
		return binary_str;
	}

	public static int getLengthLongSeq(String binary_str){
		int i;
		if(binary_str.isEmpty()) { 
			return -1;
		}
		i = binary_str.length() - 1;
		while (binary_str.charAt(i) == '0') {
			i--;
			//Caso a string receba somente 1 0 (o numero zero) ela irá retornar -1, já q não aceita zeros.
			if(i < 0) {return -1;}
		}
		int length = 0;
		int ctr = 0;
		for (; i >= 0; i--) {
			if (binary_str.charAt(i) == '1') {
				length = Math.max(length, ctr);
				ctr = 0;
			} else if(binary_str.charAt(i) == '0'){
				ctr++;
			}
			else {
				return -1;
			}
		}
		return length = Math.max(length, ctr);		
	}
}
