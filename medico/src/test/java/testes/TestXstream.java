package testes;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import classtest.PacienteTest;

public class TestXstream {
	public static void main(String[] args){
		PacienteTest paciente = new PacienteTest();
		
		paciente.setNome("paci");
		paciente.addDoenca("diabates");
		paciente.addDoenca("hipertensão");
		XStream stream = new XStream(new DomDriver());
		stream.alias("pacientetest", PacienteTest.class);
		System.out.println(stream.toXML(paciente));
	}
}
