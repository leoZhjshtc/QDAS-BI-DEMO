/**
 * 
 */
package cn.qdas.core.V11Webservice;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.xml.rpc.ServiceException;
import javax.xml.rpc.holders.DoubleHolder;
import javax.xml.rpc.holders.IntHolder;
import javax.xml.rpc.holders.StringHolder;

import org.apache.axis.types.UnsignedByte;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.Node;


/**
 * @author leo.Zhou 周钧
 * 2019年7月19日
 */
public class V11WebServiceClient {
	public static Map getGraphic(String teilId,String merkmalId,String startTime,String endTime) throws RemoteException, ServiceException, DocumentException {
		IQdas_Web_ServiceserviceLocator iqws=new IQdas_Web_ServiceserviceLocator();
		IQdas_Web_Service client=iqws.getIQdas_Web_ServicePort();
		String searchDate="";
		if(startTime==null||"".equals(startTime)) {
			searchDate="WVDATZEIT<'"+endTime+"'";
		}else {
			searchDate="WVDATZEIT>'"+startTime+"' and WVDATZEIT<'"+endTime+"'";
		}
		IntHolder webConnectResult=new IntHolder();
		IntHolder webConnectHandle=new IntHolder();
		client.webConnect(20, 44, "SuperUser", "superuser", "0.0.0.0", webConnectResult, webConnectHandle);
		int sessionHandle=webConnectHandle.value;
//		int sessionHandle=client.quickWebConnect();
		IntHolder createQueryResult=new IntHolder();
		IntHolder queryHandle=new IntHolder();
		client.createQuery(sessionHandle, createQueryResult, queryHandle);
		IntHolder filterResult1=new IntHolder();
		IntHolder filterHandle1=new IntHolder();
		client.createFilterFromSQL(sessionHandle, "TETEIL="+teilId, filterResult1, filterHandle1);
		int addFilterToQuery1=client.addFilterToQuery(sessionHandle, queryHandle.value, filterHandle1.value, new UnsignedByte(0), 0, 0);
		IntHolder filterResult2=new IntHolder();
		IntHolder filterHandle2=new IntHolder();
		client.createFilterFromSQL(sessionHandle, "MEMERKMAL="+merkmalId, filterResult2, filterHandle2);
		int addFilterToQuery2=client.addFilterToQuery(sessionHandle, queryHandle.value, filterHandle2.value, new UnsignedByte(1), 0, 0);

		IntHolder filterResult3=new IntHolder();
		IntHolder filterHandle3=new IntHolder();
		client.createFilterFromSQL(sessionHandle, searchDate, filterResult3, filterHandle3);
		int addFilterToQuery3= client.addFilterToQuery(sessionHandle, queryHandle.value, filterHandle3.value, new UnsignedByte(2), 0, 0);
		String part_Char_List="";
		int executeQuery =client.executeQuery(sessionHandle, queryHandle.value, part_Char_List);
		int evaluateAllChars= client.evaluateAllChars(sessionHandle);
		
		StringHolder graphicStr1=new StringHolder();
		IntHolder getGraphicResult1=new IntHolder();
		client.getGraphic(sessionHandle, 3100, 1, 1, 650, 350, getGraphicResult1, graphicStr1);
		StringHolder graphicStr2=new StringHolder();
		IntHolder getGraphicResult2=new IntHolder();
		client.getGraphic(sessionHandle, 3300, 1, 1, 650, 350, getGraphicResult2, graphicStr2);
		StringHolder graphicStr3=new StringHolder();
		IntHolder getGraphicResult3=new IntHolder();
		client.getGraphic(sessionHandle, 6103, 1, 1, 510, 730, getGraphicResult3, graphicStr3);
		StringHolder graphicStr4=new StringHolder();
		IntHolder getGraphicResult4=new IntHolder();
		client.getGraphic(sessionHandle, 5203, 1, 1, 510, 730, getGraphicResult4, graphicStr4);
		
		String imagexml1=graphicStr1.value;
		Document doc1=DocumentHelper.parseText(imagexml1);
		Element rootele1=doc1.getRootElement();
		Node imgNode1=rootele1.selectSingleNode("Image");
		
		String imagexml2=graphicStr2.value;
		Document doc2=DocumentHelper.parseText(imagexml2);
		Element rootele2=doc2.getRootElement();
		Node imgNode2=rootele2.selectSingleNode("Image");
		
		String imagexml3=graphicStr3.value;
		Document doc3=DocumentHelper.parseText(imagexml3);
		Element rootele3=doc3.getRootElement();
		Node imgNode3=rootele3.selectSingleNode("Image");
		
		String imagexml4=graphicStr4.value;
		Document doc4=DocumentHelper.parseText(imagexml4);
		Element rootele4=doc4.getRootElement();
		Node imgNode4=rootele4.selectSingleNode("Image");
		
		Map imgMap=new HashMap<String ,Object>();
		imgMap.put("dzt", imgNode1.getText());
		imgMap.put("zft", imgNode2.getText());
		imgMap.put("kzt", imgNode3.getText());
		imgMap.put("bg3", imgNode4.getText());
		int aa =client.freeFilter(sessionHandle, filterHandle1.value);
		int bb =client.freeFilter(sessionHandle, filterHandle2.value);
		int ee =client.freeFilter(sessionHandle, filterHandle3.value);
		int cc =client.freeQuery(sessionHandle, queryHandle.value);
		int dd =client.clientDisconnect(sessionHandle);
		return imgMap;
	}
	public static Map getGraphicAndCpk(String teilId,String merkmalId,String startTime,String endTime) throws RemoteException, ServiceException, DocumentException {
		Map webMap=getKey();
		IQdas_Web_ServiceserviceLocator iqws=new IQdas_Web_ServiceserviceLocator(webMap.get("url").toString());
		IQdas_Web_Service client=iqws.getIQdas_Web_ServicePort();
		String searchDate="";
		if(startTime==null||"".equals(startTime)) {
			searchDate="WVDATZEIT<'"+endTime+"'";
		}else {
			searchDate="WVDATZEIT>'"+startTime+"' and WVDATZEIT<'"+endTime+"'";
		}
		IntHolder webConnectResult=new IntHolder();
		IntHolder webConnectHandle=new IntHolder();
		client.webConnect(20, 44, webMap.get("user").toString(), webMap.get("password").toString(), "0.0.0.0", webConnectResult, webConnectHandle);
		int sessionHandle=webConnectHandle.value;
//		int sessionHandle=client.quickWebConnect();
		IntHolder createQueryResult=new IntHolder();
		IntHolder queryHandle=new IntHolder();
		client.createQuery(sessionHandle, createQueryResult, queryHandle);
		IntHolder filterResult1=new IntHolder();
		IntHolder filterHandle1=new IntHolder();
		client.createFilterFromSQL(sessionHandle, "TETEIL="+teilId, filterResult1, filterHandle1);
		int addFilterToQuery1=client.addFilterToQuery(sessionHandle, queryHandle.value, filterHandle1.value, new UnsignedByte(0), 0, 0);
		IntHolder filterResult2=new IntHolder();
		IntHolder filterHandle2=new IntHolder();
		client.createFilterFromSQL(sessionHandle, "MEMERKMAL="+merkmalId, filterResult2, filterHandle2);
		int addFilterToQuery2=client.addFilterToQuery(sessionHandle, queryHandle.value, filterHandle2.value, new UnsignedByte(1), 0, 0);

		IntHolder filterResult3=new IntHolder();
		IntHolder filterHandle3=new IntHolder();
		client.createFilterFromSQL(sessionHandle, searchDate, filterResult3, filterHandle3);
		int addFilterToQuery3= client.addFilterToQuery(sessionHandle, queryHandle.value, filterHandle3.value, new UnsignedByte(2), 0, 0);
		String part_Char_List="";
		int executeQuery =client.executeQuery(sessionHandle, queryHandle.value, part_Char_List);
		int evaluateAllChars= client.evaluateAllChars(sessionHandle);
		
		
		int evaluateChar=client.evaluateChar(sessionHandle, 1, 1, true, 0, 0);
		
		IntHolder result1=new IntHolder();
		StringHolder statResult_str1=new StringHolder();
		DoubleHolder statResult_dbl=new DoubleHolder();
		client.getStatResult(sessionHandle, 5210, 1, 1, new UnsignedByte(0), result1, statResult_str1, statResult_dbl);
		IntHolder result2=new IntHolder();
		StringHolder statResult_str2=new StringHolder();
		DoubleHolder statResult_db2=new DoubleHolder();
		client.getStatResult(sessionHandle, 5220, 1, 1, new UnsignedByte(0), result2, statResult_str2, statResult_db2);

		
		
		StringHolder graphicStr1=new StringHolder();
		IntHolder getGraphicResult1=new IntHolder();
		client.getGraphic(sessionHandle, 3100, 1, 1, 650, 350, getGraphicResult1, graphicStr1);
		StringHolder graphicStr2=new StringHolder();
		IntHolder getGraphicResult2=new IntHolder();
		client.getGraphic(sessionHandle, 3300, 1, 1, 650, 350, getGraphicResult2, graphicStr2);
		StringHolder graphicStr3=new StringHolder();
		IntHolder getGraphicResult3=new IntHolder();
		client.getGraphic(sessionHandle, 6103, 1, 1, 650, 350, getGraphicResult3, graphicStr3);
		StringHolder graphicStr4=new StringHolder();
		IntHolder getGraphicResult4=new IntHolder();
		client.getGraphic(sessionHandle, 5203, 1, 1, 510, 730, getGraphicResult4, graphicStr4);
		
		String imagexml1=graphicStr1.value;
		Document doc1=DocumentHelper.parseText(imagexml1);
		Element rootele1=doc1.getRootElement();
		Node imgNode1=rootele1.selectSingleNode("Image");
		
		String imagexml2=graphicStr2.value;
		Document doc2=DocumentHelper.parseText(imagexml2);
		Element rootele2=doc2.getRootElement();
		Node imgNode2=rootele2.selectSingleNode("Image");
		
		String imagexml3=graphicStr3.value;
		Document doc3=DocumentHelper.parseText(imagexml3);
		Element rootele3=doc3.getRootElement();
		Node imgNode3=rootele3.selectSingleNode("Image");
		
		String imagexml4=graphicStr4.value;
		Document doc4=DocumentHelper.parseText(imagexml4);
		Element rootele4=doc4.getRootElement();
		Node imgNode4=rootele4.selectSingleNode("Image");
		
		Map imgMap=new HashMap<String ,Object>();
		imgMap.put("dzt", imgNode1.getText());
		imgMap.put("zft", imgNode2.getText());
		imgMap.put("kzt", imgNode3.getText());
		imgMap.put("bg3", imgNode4.getText());
		imgMap.put("cp", statResult_str1.value);
		imgMap.put("cpk", statResult_str2.value);
		int aa =client.freeFilter(sessionHandle, filterHandle1.value);
		int bb =client.freeFilter(sessionHandle, filterHandle2.value);
		int ee =client.freeFilter(sessionHandle, filterHandle3.value);
		int cc =client.freeQuery(sessionHandle, queryHandle.value);
		int dd =client.clientDisconnect(sessionHandle);
		return imgMap;
	}
	public static Map getKey() {
		Map map=new HashMap<String, Object>();
		Properties prop = new Properties();
		try {
			prop.load(V11WebServiceClient.class.getResourceAsStream("/jdbc.properties"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		map.put("user", prop.getProperty("webservice.user"));
		map.put("url", prop.getProperty("webservice.url"));
		map.put("password", prop.getProperty("webservice.password"));
		return map;
	}
	
}
