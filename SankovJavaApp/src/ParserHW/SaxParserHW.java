package ParserHW;


import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class SaxParserHW extends DefaultHandler {
		String tagName;
		Point newPoint ;
		public static int count=0;
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attrs) throws SAXException{
		tagName = localName;
		if (localName.equals("pointList")){
			System.out.println(localName);
		}
		if (localName.equals("point")){
			newPoint = new Point();
			count++;
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException{
		if (tagName.equals("x")){
			newPoint.setX(new Integer(new String(ch, start, length)));
		}
		
		if (tagName.equals("y")){
			newPoint.setY(new Integer(new String(ch, start, length)));
		}
		
		if (tagName.equals("unit")){
			newPoint.setUnit(new String(ch, start, length));
		}
	}
	
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException{
		if(localName.equals("point")){
			System.out.println(newPoint.toString());
			newPoint = null;
		}
		tagName = "";
	}
}