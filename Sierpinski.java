/** Draws ths Sierpinski Triangle fractal. */
public class Sierpinski {
	
	public static void main(String[] args) {
		sierpinski(Integer.parseInt(args[0]));
	}
	
	// Draws a Sierpinski triangle of depth n on the standard canvass.
	public static void sierpinski (int n) {
		double x1 = 0.0;
		double y1 = 0.0;
    	double x2 = 1.0;
		double y2 = 0.0;
		double x3 = 0.5;
    	double y3 = Math.sqrt(3) / 2.0;
		StdDraw.line(x1, y1, x2, y2);
		StdDraw.line(x2, y2, x3, y3);
		StdDraw.line(x3, y3, x1, y1);
		//// Replace this comment with your code
	sierpinski(n, x1, x2, x3, y1, y2, y3);
	} 

	// Does the actual drawing, recursively.
	private static void sierpinski(int n, double x1, double x2, double x3,
		                                 double y1, double y2, double y3) {
		if (n == 0) return;
		double x4 = (x1 + x2) / 2, x5 = (x1 + x3) / 2, x6 = (x2 + x3) / 2; 
		double y4 = (y1 + y2) / 2, y5 = (y1 + y3) / 2, y6 = (y2 + y3) / 2; 
		StdDraw.line(x4, y4, x5, y5);
		StdDraw.line(x5, y5, x6, y6);
		StdDraw.line(x6, y6, x4, y4);
		sierpinski(n - 1, x1, x4, x5, y1, y4, y5);
		sierpinski(n - 1, x4, x2, x6, y4, y2, y6);
		sierpinski(n - 1, x5, x6, x3, y5, y6, y3);
	}
}
