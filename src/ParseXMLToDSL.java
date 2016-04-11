import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import java.io.File;

public class ParseXMLToDSL {
	private static String description;
	public static void main(String argv[]) {
		try {
			File fXmlFile = new File("jobs/SimpleFreestyleProject/config.xml");
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(fXmlFile);

			//optional, but recommended
			//read this - http://stackoverflow.com/questions/13786607/normalization-in-dom-parsing-with-java-how-does-it-work
			doc.getDocumentElement().normalize();

			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());

			NodeList list = doc.getElementsByTagName("description");
			Node node = list.item(0);
			System.out.println(node.getNodeName());
			System.out.println("Project description: " + node.getTextContent());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static String getDescription() {
		return description;
	}
	public static void setDescription(String description) {
		ParseXMLToDSL.description = description;
	}

}
