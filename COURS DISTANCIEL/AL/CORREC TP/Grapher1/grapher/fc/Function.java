 package grapher.fc;

import static java.lang.Math.*;


public interface Function {
	String toString();
	double y(double x);
	
	public static final Function COS = new Function() {
		public String toString()  { return "cos(x)"; }
		public double y(double x) { return  cos(x); }
	};

	public static final Function SIN = new Function() {
		public String toString()  { return "sin(x)"; }
		public double y(double x) { return  sin(x); }
	};

}
