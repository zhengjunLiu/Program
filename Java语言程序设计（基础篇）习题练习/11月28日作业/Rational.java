public  class Rational  implements Comparable {
  private long numerator;
  private long denominator;
  
  public Rational() {

      
  }
public Rational(long numerator) {
	 this.numerator = numerator;
	 denominator=1;
}
  public Rational(long numerator, long denominator) {
   
    this.numerator = numerator;
    this.denominator = denominator;
  }
  private long gcd(long n, long d) {
    long t1 = Math.abs(n);
    long t2 = Math.abs(d);
    long remainder = t1%t2;
    
    while (remainder != 0) {
      t1 = t2;
      t2 = remainder;
      remainder = t1%t2;
    }
    
    return t2;
  }
  public long getNumerator() {
    return numerator;
  }
 public long getDenominator() {
    return denominator;
  }
  public Rational add(Rational secondNewRational) {
    long n = numerator*secondNewRational.getDenominator() +
    		denominator*secondNewRational.getNumerator();
    long d = denominator*secondNewRational.getDenominator();
    return new Rational(n, d);
  }
  public Rational subtract(Rational secondNewRational) {
    long n = numerator*secondNewRational.getDenominator()
    - denominator*secondNewRational.getNumerator();
    long d = denominator*secondNewRational.getDenominator();
    return new Rational(n, d);
  }
  public Rational multiply(Rational secondNewRational) {
    long n = numerator*secondNewRational.getNumerator();
    long d = denominator*secondNewRational.getDenominator();
    return new Rational(n, d);
  }
  public Rational divide(Rational secondNewRational) {
    long n = numerator*secondNewRational.getDenominator();
    long d = denominator*secondNewRational.numerator;
    return new Rational(n, d);
  }
  public String toString() {
    if (denominator == 1)
      return numerator + "";
    else
      return numerator + "/" + denominator;
  }
 public boolean equals(Object parm1) {
   
    if ((this.subtract((Rational)(parm1))).getNumerator() == 0)
      return true;
    else
      return false;
  }
  public int intValue() {
  
    return (int)doubleValue();
  }
 public float floatValue() {
   
    return (float)doubleValue();
  }
  public double doubleValue() {
 
    return numerator*1.0/denominator;
  }
 public long longValue() {
 
    return (long)doubleValue();
  }
public int compareTo(Object o) {
   
    if ((this.subtract((Rational)o)).getNumerator() > 0)
      return 1;
    else if ((this.subtract((Rational)o)).getNumerator() < 0)
      return -1;
    else
      return 0;
  }
public  void gcd() {
	
	for (int k=1; k<=Math.min(numerator ,denominator);k++) {
		if (numerator%k==0&&denominator%k==0) {
			numerator=numerator/k;
			denominator=denominator/k;
		}
	
	}
	
}

public int compateTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
}

public static void main(String[] args) {
	Rational r1=new Rational(4,2);
	Rational r2=new Rational(2,3);
	r1.gcd();
	r2.gcd();
    System.out.println(r1+"+"+r2+" = "+r1.add(r2));
    System.out.println(r1+"-"+r2+" = "+r1.subtract(r2));
    System.out.println(r1+"*"+r2+" = "+r1.multiply(r2));
    System.out.println(r1+"/"+r2+" = "+r1.divide(r2));
    System.out.println(r2+"is "+r2.doubleValue());
}

}