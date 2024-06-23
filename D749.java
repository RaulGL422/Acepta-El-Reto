import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D749 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            int c = scanner.nextInt();
            int f = scanner.nextInt();
            int h = scanner.nextInt();
            
            if (c == 0 && f == 0 && h == 0) {
                break;
            }
            
            Set<Integer> holes = new HashSet<>();
            
            // Read holes (missing intersections)
            for (int i = 0; i < h; i++) {
                int x = scanner.nextInt();
                int y = scanner.nextInt();
                int index = x * (f + 1) + y; // Calculate index based on (x, y)
                holes.add(index);
            }
            
            // Calculate the number of buildings
            int buildings = countBuildings(c, f, holes);
            
            // Output the result for the current test case
            System.out.println(buildings);
        }
        
        scanner.close();
    }
    
    public static int countBuildings(int c, int f, Set<Integer> holes) {
        int buildings = 0;
        
        // Iterate over all possible pairs of intersections (x1, y1) and (x2, y2)
        for (int x1 = 1; x1 <= c; x1++) {
            for (int y1 = 1; y1 <= f; y1++) {
                if (holes.contains(x1 * (f + 1) + y1)) {
                    continue; // Skip if the intersection (x1, y1) is missing
                }
                for (int x2 = x1; x2 <= c; x2++) {
                    for (int y2 = 1; y2 <= f; y2++) {
                        if (holes.contains(x2 * (f + 1) + y2)) {
                            continue; // Skip if the intersection (x2, y2) is missing
                        }
                        // Check if the two pillars (x1, y1) and (x2, y2) can form a building
                        if (x1 != x2 && y1 != y2 && !holes.contains(x1 * (f + 1) + y2) && !holes.contains(x2 * (f + 1) + y1)) {
                            buildings++;
                        }
                    }
                }
            }
        }
        
        return buildings;
    }
}