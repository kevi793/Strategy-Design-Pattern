
public class Animal {
	private String name;
	private float weight;
	private float height;
	
	private Flys flyingObject;
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setWeight(float weight){
		if(weight < 0){
			System.out.println("Weight cannot be negative");
		}
		else{
			this.weight = weight;
		}
	}
	
	public float getWeight(){
		return this.weight;
	}
	
	public void setHeight(float height){
		if(height < 0){
			System.out.println("Height cannot be negative");
		}
		else{
			this.height = height;
		}
	}
	
	public float getHeight(){
		return this.height;
	}
	
	public void setFlyingObject(Flys newFlyingObject){
		this.flyingObject = newFlyingObject;
	}
	
	public String tryToFly(){
		return flyingObject.fly();
	}
	
}
