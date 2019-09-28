public class RepCalc {

	public RepCalc() {
	}
	
	public double UpperCalcKg(double weight) {
		return Math.round((weight * 1.1307) + 0.6998);		
	}
	
	public double LowerCalcKg(double weight) {
		return Math.round((weight * 1.0973) + 14.2546);
	}
	
	public double UpperCalcLbs(double weight) {
		weight = weight/2.2046;
		weight = ((weight * 1.1307) + 0.6998);		
		return Math.round(weight * 2.2046);
	}
	
	public double LowerCalcLbs(double weight) {
		weight = weight/2.2046;
		weight = ((weight * 1.0973) + 14.2546);
		return Math.round(weight * 2.2046);
	}
}
