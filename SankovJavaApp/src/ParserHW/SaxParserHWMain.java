package ParserHW;

import java.io.IOException;
import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class SaxParserHWMain {
	

	public static void main(String[] args) {
		try {
			XMLReader reader = XMLReaderFactory.createXMLReader();
			SaxParserHW handler = new SaxParserHW();
			reader.setContentHandler(handler);
			reader.parse("File.xml");
		} catch (SAXException e) {
			System.err.print("ошибка SAX парсера " + e);
		} catch (IOException e) {
			System.err.print("ошибка I/О потока " + e);
		}
	}

}
