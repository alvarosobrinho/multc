package br.com.multicare.cda;

import java.util.ArrayList;

//classes com a letra inicial em caixa baixa, são porque tem que se adaptar ao padrão cda.
public class section {
		
		private String caption;
		private text text;
		private ArrayList<item> list = new ArrayList<item>();
		public String getCaption() {
			return caption;
		}
		public void setCaption(String caption) {
			this.caption = caption;
		}
		public text getText() {
			return text;
		}
		public void setText(text text) {
			this.text = text;
		}
		public void addList(item novo){
			this.list.add(novo);
		}
		
}
