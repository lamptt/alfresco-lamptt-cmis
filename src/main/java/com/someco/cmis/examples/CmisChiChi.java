package com.someco.cmis.examples;

public class CmisChiChi extends CMISExampleBase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String thumuc = "cmis:folder", hoso = "F:la:fo1", 
				hopso = "F:la:fo2", phong = "F:la:fo3";
		
		CmisChiChi chi = new CmisChiChi();
		//set connect
		chi.setServiceUrl("http://192.168.1.51:8080/alfresco/cmisatom");
		
		//set username and password
		chi.setUser("admin");
		chi.setPassword("123456");
		
		//create folder, phong, hopso and hoso
		chi.setFolderName("1_Tài liệu số hóa");
		chi.createTestFolder("Năm 2001", thumuc);
		chi.createTestFolder("Năm 2002", thumuc);
		chi.createTestFolder("Năm 2003", thumuc);
		
		chi.setFolderName("1_Tài liệu số hóa/Năm 2001");
		chi.createTestFolder("Phông 11", phong);
		chi.createTestFolder("Phông 12", phong);
		
		chi.setFolderName("1_Tài liệu số hóa/Năm 2001/Phông 11");
		chi.createTestFolder("Hộp số 111", hopso);
		
		chi.setFolderName("1_Tài liệu số hóa/Năm 2001/Phông 11/Hộp số 111");
		chi.createTestFolder("Hồ sơ 1111", hoso);
		
		//end
		System.out.println("Done!");
	}

}
