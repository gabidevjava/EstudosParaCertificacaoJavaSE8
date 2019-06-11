package main;

import java.util.ArrayList;
import java.util.List;

/*arr.length is 3,so outer loop executes 3 times.In 1 st execution,i=0. 
For 1 st execution of inner loop,i=0,j=0 and arr[0].length=3. 
Inner loop runs for two iterations and breaks after printing"1 2 ".
break;statement takes the control out of inner loop.
Control goes to step expression(i++)of outer loop,i becomes 1. 
Inner loop prints"4 5 "on to the console.
Outer loop executes one more time and inner loop prints"6 7 "on to the console.Hence output is"1 2 4 5 6 7 ".*/

public class Agora {

	public static void main(String[] args) throws Exception {
		String[][] arr = { { "1", "2", "3" }, { "4", "5" }, { "6", "7" } };

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				System.out.print(arr[i][j] + " ");

				if (arr[i][j].equals("2")) {
					break;
				}

			}
		}
	}

}
