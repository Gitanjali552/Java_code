class population {

	public static void main(String[] args) {

		int population1 = 175000;
		int population10 = 262500;

	//population Increase in 10 years
		int increase = 262500-175000;

	// % of increase
		int percent = 175000/100;

	//% of population increase in 10 yrs
		int percent10 = (increase/percent);

	//% of population increase in a yr
		int percent1 = percent10/10;

		System.out.println("Average percentage increase of population per year = "+ percent1);
	}

}


/*
output
D:\anudip>javac population.java

D:\anudip>java population
Average % increase of population per year = 5

D:\anudip>
*/