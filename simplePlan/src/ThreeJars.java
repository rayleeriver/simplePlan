
public class ThreeJars {
	private final int max1 = 8;
	private final int max2 = 5;
	private final int max3 = 3;
	int level1;
	int level2;
	private int level3;

	public ThreeJars(int level1, int level2, int level3) {
		this.level1 = level1;
		this.level2 = level2;
		this.level3 =level3;
	}

	private void level() {
		level3 = max3;
		level1 = level1-max3;

		level2= level3;
		level3 = level3 - max3;
		
		level3 = max3;
		level1 = level1-max3;
		
		level3 = level3 + level2 -max2;
		level2= level2 + (max3- level3);
		
		level1 += level2;
		level2 = 0;
		
		level2 = level3;
		level3 = 0;
		
		level3 = max3;
		level1 -= level3;
		
		level2 += level3;
		level3 = 0;
		
		System.out.println("level1: " + level1 + ", level2: " + level2 + ", level3: " + level3);
	}

	public static void main(String[] args) {
		ThreeJars threeJars = new ThreeJars(8, 0 ,0 );
		threeJars.level();
	}

}
