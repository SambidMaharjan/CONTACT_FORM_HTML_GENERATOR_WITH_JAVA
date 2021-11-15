public class HtmlTag extends Component {

	public String html() {
		String tagName = "html";
		String htmlElements = head() + body() + "\n";
		return openAndCloseTag(tagName, htmlElements);
	}

	private String openAndCloseTag(String tagName, String mid) {
		return "\n" + open(tagName) + mid + close(tagName);
	}


	private String head() {
		String tagName = "head";
		return openAndCloseTag(tagName, title()+ "\n");	
	}

	private String title() {
		String tagName = "title";
		String text = "HTML Generator";
		return openAndCloseTag(tagName, text);
	}

	private String body() {
		String tagName = "body";
		String bodyElements = h1() + label("Name") + textArea() + labelGender() + dropDown("Male", "Female", "Others")  + labelRelationStatus() + input("yes", "radio") + label("Yes") + input("No", "radio") + label("No") +  button() + "\n"; 
		return openAndCloseTag(tagName, bodyElements);
	}

	private String h1() {
		String tagName = "h1";
		String text = "Contact Form";
		return openAndCloseTag(tagName, text);
	}

	private String label(String labelTitle) {
		String tagName = "label";
		String text = labelTitle;
		return openAndCloseTag(tagName, text) + "<br>";
	}

	private String textArea() {
		String tagName = "textarea";
		String text = "";
		return openAndCloseTag(tagName, text) + "<br>";
	}

	private String labelGender() {
		String tagName = "labelgender";
		String text = "Gender";
		return openAndCloseTag(tagName, text) + "<br>";
	}

	private String labelRelationStatus() {
		String tagName = "relationshipstatus";
		String text = "Are you single ?";
		return openAndCloseTag(tagName, text) + "<br>";
	}
	
	private String input(String name, String type) {
		return "\n" + inputName(name, type); 
		}

	private String dropDown(String option1, String option2, String option3) {
    
		return (
      "\n" +
      open("select") +
      open("option") +
      option1 +
      close("option") +
      "\n" +
      open("option") +
      option2 +
      close("option") +
      "\n" +
      open("option") +
      option3 +
      close("option") +
      "\n" +
      close("select") +
      "<br>"
    );
		
	}
	
	private String button() {
		String tagName = "button";
		String text = "Submit";
		return "\n" + open(tagName+" type = 'Submit'")+text+close(tagName);
	}
}

