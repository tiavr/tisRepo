package fc;

import static java.lang.Math.*;


public interface Function {
	String toString();
	double y(double x);
	
	public static final Function COS = new Function() {
		public String toString()  {
			return "cos(x)";
		}
		public double y(double x) {
			return  cos(x);
		}
	};

	public static final Function SIN = new Function() {
		public String toString()  { return "sin(x)"; }
		public double y(double x) { return  sin(x); }
	};

	public static final Function TAN = new Function() {
		public String toString()  { return "tan(x)"; }
		public double y(double x) { return  tan(x); }
	};

	public static final Function EXP = new Function() {
		public String toString()  { return "exp(x)"; }
		public double y(double x) { return  exp(x); }
	};

	public static final Function LOG = new Function() {
		public String toString()  { return "log(x)"; }
		public double y(double x) { return  log(x); }
	};

}
