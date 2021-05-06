package at.ac.tuwien.big.msm.cmgba.graphml;

import java.io.File;
import java.io.IOException;

public class Main10_Adoxx_Arci3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// TODO Auto-generated method stub

		// EPackage.Registry.INSTANCE.put(ArchimatePackage.eNS_URI,
		// ArchimatePackage.eINSTANCE);

		File modelFile = new File("AdoxxInstances/ArchiV2/adoxx5_team_smajevic.xml");

		ADOxxInstance2GraphML_Grouping adoxx2Graphml = new ADOxxInstance2GraphML_Grouping(modelFile);

		adoxx2Graphml.convert();
		GraphML graphml = adoxx2Graphml.getGraphml();

		GraphMLModelExporter modelExporter = new GraphMLModelExporter(graphml);

		try {
			modelExporter.exportGraph("GraphMLXMLOutput/output_test11_AdoxxXML_ArchiExample.graphml");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

}
