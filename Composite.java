import java.util.*;  
public class Composite implements Shape {
	String ShapeType;
	List<Shape> shapes= new ArrayList<>();
	
	public Composite(String ShapeType) {
		super();
		this.ShapeType = ShapeType;
	}
	public void addShape(Shape shape)
	{
		shapes.add(shape);
	}
	public void showShapeType() {
		System.out.println(ShapeType+" consists of: \n");
		for(Shape a : shapes)
		{
			a.showShapeType();
		}
		System.out.println("\n");
	}

}
