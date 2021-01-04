
public class Leaf implements Shape {
	String ShapeType;
	
	public Leaf(String ShapeType) {
		super();
		this.ShapeType = ShapeType;
	}

	public void showShapeType() {
		System.out.println(ShapeType);
	}

}
