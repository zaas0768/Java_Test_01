
public class TotalClass {
	public void makeValue(double StaValue, double enValue) {
		double sta = StaValue;
		double en = enValue;
		double sumTotal = 0;
		double aveTotal = 0;
		
		for (double i = sta; i <= en; i++) {
			sumTotal = sumTotal + i;
			aveTotal = en / sta;
		}
		System.out.println("총합은 : " + sumTotal + " 입니다.");
		System.out.println("총평균은 : " + aveTotal + " 입니다.");
	}
}
