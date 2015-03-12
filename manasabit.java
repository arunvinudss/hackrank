import java.io.*;
import java.util.*;

public class Solution {
	
	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(new BufferedReader(new InputStreamReader(System.in), 256 << 10));
			int testsNumber = scanner.nextInt();
			for (int t = 0; t < testsNumber; t++) {
				int n = scanner.nextInt();
				int a = scanner.nextInt();
                int b = scanner.nextInt();
                BitSet possible = new BitSet();
                possible.set(0);
                for (int i = 1; i < n; i++) {
                    BitSet next = new BitSet();
                    for (int j = possible.nextSetBit(0); j != -1; j = possible.nextSetBit(j+1)) {
                        next.set(j+a);
                        next.set(j+b);
                    }
                    possible = next;
                }
                for (int j = possible.nextSetBit(0); j != -1; j = possible.nextSetBit(j+1)) {
                    System.out.print(j + " ");
                }
                System.out.println();
			}
		}
		catch (RuntimeException rte) {
			throw rte;
		}
		catch (Exception e) {
			System.err.println("Error:" + e.getMessage());
		}
	}
}

