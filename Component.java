public abstract class Component {

	public String open(String tagName) {
		return("<" + tagName + ">");
	} 

	public String close(String tagName) {
		return("</" + tagName + ">");
	}
	
	public String inputName(String name, String type) {
		return("<input type = \"" + type + "\"/>"); 
	
	}
}

