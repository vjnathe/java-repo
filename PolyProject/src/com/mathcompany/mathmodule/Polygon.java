package com.mathcompany.mathmodule;

/**
 * @author Vijayraj Nathe Class design for Tringle Properties. Its Implement
 *         Polygonable Functionality.
 */
class Tringle implements Polygonable {

	private int noOfSides;
	private float sides[];

	public Tringle(int noOfSides, float sides[]) {

		this.noOfSides = noOfSides;
		this.sides = new float[noOfSides];

		for (int i = 0; i < noOfSides; i++)
			this.sides[i] = sides[i];
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mathcompany.mathmodule.Polygonable#getSides() method to
	 * accessing no of sides.
	 */
	public int getSides() {

		return this.noOfSides;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mathcompany.mathmodule.Polygonable#calculateInnerAngle() method
	 * to calculate angle.
	 */
	public int calculateInnerAngle() {

		return (180 * (noOfSides - 2));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mathcompany.mathmodule.Polygonable#calcPerimeter() Method for
	 * Calculation Perimeter.
	 */
	public float calcPerimeter() {

		float peri = 0.0f;
		for (int i = 0; i < noOfSides; i++)
			peri += sides[i];
		return peri;

	}
}

/**
 * @author Vijayraj Nathe Class design for Quadrilateral Properties. Its
 *         Implement Polygonable Functionality.
 */
class Quadrilateral implements Polygonable {

	private int noOfSides;
	private float sides[];

	public Quadrilateral(int noOfSides, float sides[]) {

		this.noOfSides = noOfSides;
		this.sides = new float[noOfSides];

		for (int i = 0; i < noOfSides; i++)
			this.sides[i] = sides[i];
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mathcompany.mathmodule.Polygonable#getSides() method to
	 * accessing no of sides.
	 */
	public int getSides() {

		return this.noOfSides;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mathcompany.mathmodule.Polygonable#calculateInnerAngle() method
	 * to calculate angle.
	 */
	public int calculateInnerAngle() {

		return (180 * (noOfSides - 2));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mathcompany.mathmodule.Polygonable#calcPerimeter() Method for
	 * Calculation Perimeter.
	 */
	public float calcPerimeter() {

		float peri = 0.0f;
		for (int i = 0; i < noOfSides; i++)
			peri += sides[i];
		return peri;

	}
}

/**
 * @author Vijayraj Nathe Class design for Pentagone Properties. Its Implement
 *         Polygonable Functionality.
 */
class Pentagone implements Polygonable {

	private int noOfSides;
	private float sides[];

	public Pentagone(int noOfSides, float sides[]) {

		this.noOfSides = noOfSides;
		this.sides = new float[noOfSides];

		for (int i = 0; i < noOfSides; i++)
			this.sides[i] = sides[i];
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mathcompany.mathmodule.Polygonable#getSides() method to
	 * accessing no of sides.
	 */
	public int getSides() {

		return this.noOfSides;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mathcompany.mathmodule.Polygonable#calculateInnerAngle() method
	 * to calculate angle.
	 */
	public int calculateInnerAngle() {

		return (180 * (noOfSides - 2));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mathcompany.mathmodule.Polygonable#calcPerimeter() Method for
	 * Calculation Perimeter.
	 */
	public float calcPerimeter() {

		float peri = 0.0f;
		for (int i = 0; i < noOfSides; i++)
			peri += sides[i];
		return peri;

	}
}

/**
 * @author Vijayraj Nathe Class design for Hexagone Properties. Its Implement
 *         Polygonable Functionality.
 */
class Hexagone implements Polygonable {

	private int noOfSides;
	private float sides[];

	public Hexagone(int noOfSides, float sides[]) {

		this.noOfSides = noOfSides;
		this.sides = new float[noOfSides];

		for (int i = 0; i < noOfSides; i++)
			this.sides[i] = sides[i];
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mathcompany.mathmodule.Polygonable#getSides() method to
	 * accessing no of sides.
	 */
	public int getSides() {
		return this.noOfSides;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mathcompany.mathmodule.Polygonable#calculateInnerAngle() method
	 * to calculate angle.
	 */
	public int calculateInnerAngle() {

		return (180 * (noOfSides - 2));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mathcompany.mathmodule.Polygonable#calcPerimeter() Method for
	 * Calculation Perimeter.
	 */
	public float calcPerimeter() {

		float peri = 0.0f;
		for (int i = 0; i < noOfSides; i++)
			peri += sides[i];
		return peri;

	}
}

/**
 * @author Vijayraj Nathe Class design for Heptagon Properties. Its Implement
 *         Polygonable Functionality.
 */
class Heptagon implements Polygonable {

	private int noOfSides;
	private float sides[];

	public Heptagon(int noOfSides, float sides[]) {

		this.noOfSides = noOfSides;
		this.sides = new float[noOfSides];

		for (int i = 0; i < noOfSides; i++)
			this.sides[i] = sides[i];
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mathcompany.mathmodule.Polygonable#getSides() method to
	 * accessing no of sides.
	 */
	public int getSides() {

		return this.noOfSides;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mathcompany.mathmodule.Polygonable#calculateInnerAngle() method
	 * to calculate angle.
	 */
	public int calculateInnerAngle() {

		return (180 * (noOfSides - 2));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mathcompany.mathmodule.Polygonable#calcPerimeter() Method for
	 * Calculation Perimeter.
	 */
	public float calcPerimeter() {

		float peri = 0.0f;

		for (int i = 0; i < noOfSides; i++)
			peri += sides[i];
		return peri;

	}
}

/**
 * @author Vijayraj Nathe Class design for Octagon Properties. Its Implement
 *         Polygonable Functionality.
 */
class Octagon implements Polygonable {

	private int noOfSides;
	private float sides[];

	public Octagon(int noOfSides, float sides[]) {

		this.noOfSides = noOfSides;
		this.sides = new float[noOfSides];

		for (int i = 0; i < noOfSides; i++)
			this.sides[i] = sides[i];
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mathcompany.mathmodule.Polygonable#getSides() method to
	 * accessing no of sides.
	 */
	public int getSides() {

		return this.noOfSides;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mathcompany.mathmodule.Polygonable#calculateInnerAngle() method
	 * to calculate angle.
	 */
	public int calculateInnerAngle() {

		return (180 * (noOfSides - 2));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mathcompany.mathmodule.Polygonable#calcPerimeter() Method for
	 * Calculation Perimeter.
	 */
	public float calcPerimeter() {

		float peri = 0.0f;
		for (int i = 0; i < noOfSides; i++)
			peri += sides[i];
		return peri;

	}
}

/**
 * @author Vijayraj Nathe Class design for Decagon Properties. Its Implement
 *         Polygonable Functionality.
 */
class Decagon implements Polygonable {

	private int noOfSides;
	private float sides[];

	public Decagon(int noOfSides, float sides[]) {

		this.noOfSides = noOfSides;
		this.sides = new float[noOfSides];

		for (int i = 0; i < noOfSides; i++)
			this.sides[i] = sides[i];
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mathcompany.mathmodule.Polygonable#getSides() method to
	 * accessing no of sides.
	 */
	public int getSides() {

		return this.noOfSides;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mathcompany.mathmodule.Polygonable#calculateInnerAngle() method
	 * to calculate angle.
	 */
	public int calculateInnerAngle() {

		return (180 * (noOfSides - 2));

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.mathcompany.mathmodule.Polygonable#calcPerimeter() Method for
	 * Calculation Perimeter.
	 */
	public float calcPerimeter() {

		float peri = 0.0f;
		for (int i = 0; i < noOfSides; i++)
			peri += sides[i];
		return peri;

	}
}

/**
 * @author Vijayraj Nathe Class design for main function.
 */
public class Polygon {

	/**
	 * main method starting point for execution.
	 */
	public static void main(String[] args) {

		Polygonable ref;
		ref = new Tringle(3, new float[] { 10.2f, 20.5f, 30.0f });
		System.out.println("Polygon with " + ref.getSides()
				+ " Sides Having Inner Angle:=" + ref.calculateInnerAngle()
				+ " And Perimeter:=" + ref.calcPerimeter());
		ref = new Quadrilateral(4, new float[] { 10.2f, 20.5f, 30.0f, 2.5f });
		System.out.println("Polygon with " + ref.getSides()
				+ " Sides Having Inner Angle:=" + ref.calculateInnerAngle()
				+ " And Perimeter:=" + ref.calcPerimeter());
		ref = new Pentagone(5, new float[] { 10.2f, 20.5f, 30.0f, 2.5f, 12.2f });
		System.out.println("Polygon with " + ref.getSides()
				+ " Sides Having Inner Angle:=" + ref.calculateInnerAngle()
				+ " And Perimeter:=" + ref.calcPerimeter());
		ref = new Hexagone(6, new float[] { 10.2f, 20.5f, 30.0f, 2.5f, 12.2f,
				14.2f });
		System.out.println("Polygon with " + ref.getSides()
				+ " Sides Having Inner Angle:=" + ref.calculateInnerAngle()
				+ " And Perimeter:=" + ref.calcPerimeter());
		ref = new Heptagon(7, new float[] { 10.2f, 20.5f, 30.0f, 2.5f, 12.2f,
				14.2f, 1.5f });
		System.out.println("Polygon with " + ref.getSides()
				+ " Sides Having Inner Angle:=" + ref.calculateInnerAngle()
				+ " And Perimeter:=" + ref.calcPerimeter());
		ref = new Octagon(8, new float[] { 10.2f, 20.5f, 30.0f, 2.5f, 12.2f,
				14.2f, 1.5f, 20.3f });
		System.out.println("Polygon with " + ref.getSides()
				+ " Sides Having Inner Angle:=" + ref.calculateInnerAngle()
				+ " And Perimeter:=" + ref.calcPerimeter());
		ref = new Decagon(10, new float[] { 10.2f, 20.5f, 30.0f, 2.5f, 12.2f,
				14.2f, 1.5f, 20.3f, 4.8f, 5.0f });
		System.out.println("Polygon with " + ref.getSides()
				+ " Sides Having Inner Angle:=" + ref.calculateInnerAngle()
				+ " And Perimeter:=" + ref.calcPerimeter());
	}

}
