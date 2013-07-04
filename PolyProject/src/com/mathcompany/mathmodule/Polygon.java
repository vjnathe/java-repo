package com.mathcompany.mathmodule;

class Tringle implements Polygonable  {
	
  private int noOfSides;
  private float sides[];
  
  public Tringle(int noOfSides,float sides[])  {
	  
    this.noOfSides=noOfSides;
    this.sides=new float[noOfSides];
    
    for(int i=0;i<noOfSides;i++)
    this.sides[i]=sides[i];	
  }
  
  public int getSides()  {
	  
    return this.noOfSides;
  }
  
  public int calculateInnerAngle()  {
	  
    return (180*(noOfSides-2));
  }
  public float calcPerimeter() {
	  
	float peri=0.0f;
	for(int i=0;i<noOfSides;i++)
	peri+=sides[i];	
	return peri;
	
  }
}

class Quadrilateral implements Polygonable  {
  
  private int noOfSides; 
  private float sides[];
  
  public Quadrilateral(int noOfSides,float sides[])  {
	  
    this.noOfSides=noOfSides;
    this.sides=new float[noOfSides];
    
    for(int i=0;i<noOfSides;i++)
    this.sides[i]=sides[i];
  }
  
  public int getSides()  {
	  
    return this.noOfSides;
  }
  
  public int calculateInnerAngle()  {
	  
    return (180*(noOfSides-2));
  }
  
  public float calcPerimeter() {
	  
	    float peri=0.0f;
		for(int i=0;i<noOfSides;i++)
		peri+=sides[i];	
		return peri;
		
	  }
}

class Pentagone implements Polygonable  {
  
private int noOfSides; 
private float sides[];

  public Pentagone(int noOfSides,float sides[])  {
	  
    this.noOfSides=noOfSides;
   this.sides=new float[noOfSides];
    
    for(int i=0;i<noOfSides;i++)
    this.sides[i]=sides[i];     
  }
  
  public int getSides()  {
	  
    return this.noOfSides;
  }
  
  public int calculateInnerAngle()  {
	  
    return (180*(noOfSides-2));
  }
  
  public float calcPerimeter() {
	  
	    float peri=0.0f;
		for(int i=0;i<noOfSides;i++)
		peri+=sides[i];	
		return peri;
		
	  }
}

class Hexagone implements Polygonable  {
	
  private int noOfSides; 
  private float sides[];
  
  public Hexagone(int noOfSides,float sides[])  {
	  
    this.noOfSides=noOfSides;
    this.sides=new float[noOfSides];
    
    for(int i=0;i<noOfSides;i++)
    this.sides[i]=sides[i];
  }
  
  public int getSides()  {
    return this.noOfSides;
  }
  
  public int calculateInnerAngle()  {
	  
    return (180*(noOfSides-2));
  }
  
  public float calcPerimeter() {
	  
	    float peri=0.0f;
		for(int i=0;i<noOfSides;i++)
		peri+=sides[i];	
		return peri;
		
	  }
}

class Heptagon implements Polygonable  {
	
  private int noOfSides; 
  private float sides[];
  
  public Heptagon(int noOfSides,float sides[])  {

	  this.noOfSides=noOfSides;
	  this.sides=new float[noOfSides];
	    
	    for(int i=0;i<noOfSides;i++)
	    this.sides[i]=sides[i];
  }
  
  public int getSides()  {
	  
    return this.noOfSides;
  }
  
  public int calculateInnerAngle()  {
	  
    return (180*(noOfSides-2));
  }
  
  public float calcPerimeter() {
	  
	    float peri=0.0f;
	    
		for(int i=0;i<noOfSides;i++)
		peri+=sides[i];	
		return peri;
		
	  }
}

class Octagon implements Polygonable  {
	
  private int noOfSides; 
  private float sides[];
  
  public Octagon(int noOfSides,float sides[])  {
	  
    this.noOfSides=noOfSides;
    this.sides=new float[noOfSides];
    
    for(int i=0;i<noOfSides;i++)
    this.sides[i]=sides[i];
  }
  
  public int getSides()  {
	  
    return this.noOfSides;
  }
  
  public int calculateInnerAngle()  {
	  
    return (180*(noOfSides-2));
  }
  
  public float calcPerimeter() {
	  
	    float peri=0.0f;
		for(int i=0;i<noOfSides;i++)
		peri+=sides[i];	
		return peri;
		
	  }
}

class Decagon implements Polygonable  {
	
  private int noOfSides; 
  private float sides[];
  
  public Decagon(int noOfSides,float sides[])  {
	  
    this.noOfSides=noOfSides;
    this.sides=new float[noOfSides];
    
    for(int i=0;i<noOfSides;i++)
    this.sides[i]=sides[i];
  }
  
  public int getSides()  {
	   
    return this.noOfSides;
  }
  
  public int calculateInnerAngle()  {
	  
    return (180*(noOfSides-2));
    
  }
  
  public float calcPerimeter() {
	  
	    float peri=0.0f;
		for(int i=0;i<noOfSides;i++)
		peri+=sides[i];	
		return peri;
		
	  }
}

public class Polygon {

	public static void main(String[] args) {
		
		   Polygonable ref;
	       ref=new Tringle(3,new float[]{10.2f,20.5f,30.0f});
	       System.out.println("Polygon with "+ref.getSides()+" Sides Having Inner Angle:="+ref.calculateInnerAngle()+" And Perimeter:="+ref.calcPerimeter());
	       ref=new Quadrilateral(4,new float[]{10.2f,20.5f,30.0f,2.5f});
	       System.out.println("Polygon with "+ref.getSides()+" Sides Having Inner Angle:="+ref.calculateInnerAngle()+" And Perimeter:="+ref.calcPerimeter());
	       ref=new Pentagone(5,new float[]{10.2f,20.5f,30.0f,2.5f,12.2f});
	       System.out.println("Polygon with "+ref.getSides()+" Sides Having Inner Angle:="+ref.calculateInnerAngle()+" And Perimeter:="+ref.calcPerimeter());
	       ref=new Hexagone(6,new float[]{10.2f,20.5f,30.0f,2.5f,12.2f,14.2f});
	       System.out.println("Polygon with "+ref.getSides()+" Sides Having Inner Angle:="+ref.calculateInnerAngle()+" And Perimeter:="+ref.calcPerimeter());
	       ref=new Heptagon(7,new float[]{10.2f,20.5f,30.0f,2.5f,12.2f,14.2f,1.5f});
	       System.out.println("Polygon with "+ref.getSides()+" Sides Having Inner Angle:="+ref.calculateInnerAngle()+" And Perimeter:="+ref.calcPerimeter());
	       ref=new Octagon(8,new float[]{10.2f,20.5f,30.0f,2.5f,12.2f,14.2f,1.5f,20.3f});
	       System.out.println("Polygon with "+ref.getSides()+" Sides Having Inner Angle:="+ref.calculateInnerAngle()+" And Perimeter:="+ref.calcPerimeter());
	       ref=new Decagon(10,new float[]{10.2f,20.5f,30.0f,2.5f,12.2f,14.2f,1.5f,20.3f,4.8f,5.0f});
	       System.out.println("Polygon with "+ref.getSides()+" Sides Having Inner Angle:="+ref.calculateInnerAngle()+" And Perimeter:="+ref.calcPerimeter());
	}

}

