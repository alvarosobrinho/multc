package br.com.multicare.cda;

import java.util.ArrayList;

public class ClinicalDocument {
		private ArrayList<section> sections = new ArrayList<section>();
		public ArrayList<section> getSections() {
			return sections;
		}

		public void addSections(section section) {
			this.sections.add(section);
		}
}
