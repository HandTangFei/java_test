package com.hand;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        int count = 0;
        int[] sushu = new int[100];
        for (int i = 101; i < 201; i++) {
			for (int j = 2; j < i/2+1; j++) {
				if (i%j == 0){
					sushu[count]=i;
					count++;
					break;
				}
			}
		}
        System.out.print("101-200间总共有"+count+"个素数，分别是：");
        for (int i = 0; i < count; i++) {
            System.out.print(sushu[i]+"，");
		}
    }
}
