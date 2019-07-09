package blockchain;

public class transcation {
	public int id;
	public String source;
	public String destinataion;
	public int value;
	
public transcation(int id, String source, String destinataion, int value) {
		
		this.id = id;
		this.source = source;
		this.destinataion = destinataion;
		this.value = value;
	}

	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestinataion() {
		return destinataion;
	}
	public void setDestinataion(String destinataion) {
		this.destinataion = destinataion;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	


}
