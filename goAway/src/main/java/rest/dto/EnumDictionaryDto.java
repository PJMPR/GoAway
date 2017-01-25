package rest.dto;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class EnumDictionaryDto {

		
		private int id;
		private int intKey;
		private String stringKey;
		private String value;
		private String enumerationName;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
}

