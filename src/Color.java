
public enum Color{
	White("white"),Black("black");

	private final String fieldName;
	
	private Color (String value){
		this.fieldName = value;		
	}
	
	public String getStringValue(){
		return this.fieldName;
	}

}
