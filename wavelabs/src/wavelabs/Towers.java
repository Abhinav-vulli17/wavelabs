package wavelabs;

public class Towers {
	
	    
	    public static int[] findBestCoordinate(int[][] towers, int radius) {
	        int maxQuality = 0;
	        int[] bestCoordinate = new int[2];
	        
	        for (int x = 0; x <= 25; x++) {
	            for (int y = 0; y <= 25; y++) {
	                int quality = 0;
	                
	                for (int[] tower : towers) {
	                    int xi = tower[0];
	                    int yi = tower[1];
	                    int qi = tower[2];
	                    
	                    double distance = Math.sqrt(Math.pow(x - xi, 2) + Math.pow(y - yi, 2));
	                    if (distance <= radius) {
	                        quality += Math.floor(qi / (1 + distance));
	                    }
	                }
	                
	                if (quality > maxQuality) {
	                    maxQuality = quality;
	                    bestCoordinate[0] = x;
	                    bestCoordinate[1] = y;
	                }
	            }
	        }
	        
	        return bestCoordinate;
	    }
	    
	    public static void main(String[] args) {
	        int[][] towers = {{1, 2, 5}, {2, 1, 7}, {3, 1, 9}};
	        int radius = 2;
	        
	        int[] result = findBestCoordinate(towers, radius);
	        
	        System.out.println("Output: [" + result[0] + ", " + result[1] + "]");
	    }
	}


