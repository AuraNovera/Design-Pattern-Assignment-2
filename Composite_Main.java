
public class Composite_Main {
	public static void main(String[] args)
	{
		Shape square = new Leaf("square");
		Shape rectangle = new Leaf("rectangle");
		Shape triangle = new Leaf("triangle");
		Shape line = new Leaf("line");
		Shape cylinder = new Leaf("cylinder");
		Shape circle = new Leaf("circle");
		Shape circle = new Leaf("oval");
		
		Composite house = new Composite("house");
		Composite tree = new Composite("tree");
		Composite water_source = new Composite("water_source");
		
		Composite village = new Composite("village");
		
		house.addShape(square);
		house.addShape(rectangle);
		house.addShape(triangle);
		house.addShape(line);
		
		tree.addShape(line);
		tree.addShape(oval);
		tree.addShape(circle);
		
		water_source.addShape(circle);
		water_source.addShape(cylinder);
		
		village.addShape(house);
		village.addShape(tree);
		village.addShape(water_source);
		village.showShapeType();		
	}

}
