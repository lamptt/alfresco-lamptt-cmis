package com.someco.cmis.examples;

public class CmisChiChi extends CMISExampleBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String thumuc = "cmis:folder", hoso = "F:la:fo1", 
				hopso = "F:la:fo2", phong = "F:la:fo3";
		
		CmisChiChi chi = new CmisChiChi();
		//set connect
		chi.setServiceUrl("http://192.168.1.51:9092/alfresco/cmisatom");
		
		//set username and password
		chi.setUser("admin");
		chi.setPassword("123456");
		
		//create folder, phong, hopso and hoso
		chi.setFolderName("");
		chi.createTestFolder("1_Chitest", thumuc);
		
		chi.setFolderName("1_Chitest");
		chi.createTestFolder("Năm 2001", thumuc);
		chi.createTestFolder("Năm 2002", thumuc);
		chi.createTestFolder("Năm 2003", thumuc);
		chi.createTestFolder("Năm 2004", thumuc);
		chi.createTestFolder("Năm 2005", thumuc);
		
		chi.setFolderName("1_Chitest/Năm 2001");
		chi.createTestFolder("Phông 1.1", phong);
		chi.createTestFolder("Phông 1.2", phong);
		
		chi.setFolderName("1_Chitest/Năm 2002");
		chi.createTestFolder("Phông 2.1", phong);
		chi.createTestFolder("Phông 2.2", phong);
		
		chi.setFolderName("1_Chitest/Năm 2003");
		chi.createTestFolder("Phông 3.1", phong);
		chi.createTestFolder("Phông 3.2", phong);
		
		chi.setFolderName("1_Chitest/Năm 2004");
		chi.createTestFolder("Phông 4.1", phong);
		chi.createTestFolder("Phông 4.2", phong);
		
		chi.setFolderName("1_Chitest/Năm 2005");
		chi.createTestFolder("Phông 5.1", phong);
		chi.createTestFolder("Phông 5.2", phong);
		
		chi.setFolderName("1_Chitest/Năm 2001/Phông 1.1");
		chi.createTestFolder("Hộp số 1.1.1", hopso);
		chi.createTestFolder("Hộp số 1.1.2", hopso);
		
		chi.setFolderName("1_Chitest/Năm 2001/Phông 1.2");
		chi.createTestFolder("Hộp số 1.2.1", hopso);
		chi.createTestFolder("Hộp số 1.2.2", hopso);
		
		chi.setFolderName("1_Chitest/Năm 2002/Phông 2.1");
		chi.createTestFolder("Hộp số 2.1.1", hopso);
		chi.createTestFolder("Hộp số 2.1.2", hopso);
		
		chi.setFolderName("1_Chitest/Năm 2002/Phông 2.2");
		chi.createTestFolder("Hộp số 2.2.1", hopso);
		chi.createTestFolder("Hộp số 2.2.2", hopso);
		
		chi.setFolderName("1_Chitest/Năm 2003/Phông 3.1");
		chi.createTestFolder("Hộp số 3.1.1", hopso);
		chi.createTestFolder("Hộp số 3.1.2", hopso);
		
		chi.setFolderName("1_Chitest/Năm 2003/Phông 3.2");
		chi.createTestFolder("Hộp số 3.2.1", hopso);
		chi.createTestFolder("Hộp số 3.2.2", hopso);
		

		chi.setFolderName("1_Chitest/Năm 2004/Phông 4.1");
		chi.createTestFolder("Hộp số 4.1.1", hopso);
		chi.createTestFolder("Hộp số 4.1.2", hopso);
		
		chi.setFolderName("1_Chitest/Năm 2004/Phông 4.2");
		chi.createTestFolder("Hộp số 4.2.1", hopso);
		chi.createTestFolder("Hộp số 4.2.2", hopso);
		

		chi.setFolderName("1_Chitest/Năm 2005/Phông 5.1");
		chi.createTestFolder("Hộp số 5.1.1", hopso);
		chi.createTestFolder("Hộp số 5.1.2", hopso);
		
		chi.setFolderName("1_Chitest/Năm 2005/Phông 5.2");
		chi.createTestFolder("Hộp số 5.2.1", hopso);
		chi.createTestFolder("Hộp số 5.2.2", hopso);
		
		chi.setFolderName("1_Chitest/Năm 2001/Phông 1.1/Hộp số 1.1.1");
		chi.createTestFolder("Hộp số 1.1.1.1", hoso);
		chi.createTestFolder("Hộp số 1.2.1.1", hoso);
		
		chi.setFolderName("1_Chitest/Năm 2001/Phông 1.2/Hộp số 1.2.1");
		chi.createTestFolder("Hộp số 1.2.1.1", hoso);
		chi.createTestFolder("Hộp số 1.2.1.2", hoso);
		
		chi.setFolderName("1_Chitest/Năm 2002/Phông 2.1/Hộp số 2.1.1");
		chi.createTestFolder("Hộp số 2.1.1.1", hoso);
		chi.createTestFolder("Hộp số 2.2.1.1", hoso);
		
		chi.setFolderName("1_Chitest/Năm 2002/Phông 2.2/Hộp số 2.2.1");
		chi.createTestFolder("Hộp số 2.2.1.1", hoso);
		chi.createTestFolder("Hộp số 2.2.1.2", hoso);
		
		chi.setFolderName("1_Chitest/Năm 2003/Phông 3.1/Hộp số 3.1.1");
		chi.createTestFolder("Hộp số 3.1.1.1", hoso);
		chi.createTestFolder("Hộp số 3.2.1.1", hoso);
		
		chi.setFolderName("1_Chitest/Năm 2003/Phông 3.2/Hộp số 3.2.1");
		chi.createTestFolder("Hộp số 3.2.1.1", hoso);
		chi.createTestFolder("Hộp số 3.2.1.2", hoso);
		
		chi.setFolderName("1_Chitest/Năm 2004/Phông 4.1/Hộp số 4.1.1");
		chi.createTestFolder("Hộp số 4.1.1.1", hoso);
		chi.createTestFolder("Hộp số 4.2.1.1", hoso);
		
		chi.setFolderName("1_Chitest/Năm 2004/Phông 4.2/Hộp số 4.2.1");
		chi.createTestFolder("Hộp số 4.2.1.2", hoso);
		chi.createTestFolder("Hộp số 4.2.2.2", hoso);
		
		chi.setFolderName("1_Chitest/Năm 2005/Phông 5.1/Hộp số 5.1.1");
		chi.createTestFolder("Hộp số 5.1.1.1", hoso);
		chi.createTestFolder("Hộp số 5.2.1.1", hoso);
		
		chi.setFolderName("1_Chitest/Năm 2005/Phông 5.2/Hộp số 5.2.1");
		chi.createTestFolder("Hộp số 5.2.1.2", hoso);
		chi.createTestFolder("Hộp số 5.2.2.2", hoso);
		//end
		System.out.println("Done!");
	}

}
