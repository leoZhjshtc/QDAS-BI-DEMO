/**
 * 
 */
package cn.qdas.bi.controller;

import java.io.IOException;
import java.rmi.RemoteException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.xml.rpc.ServiceException;
import javax.xml.rpc.holders.DoubleHolder;
import javax.xml.rpc.holders.IntHolder;
import javax.xml.rpc.holders.StringHolder;

import cn.qdas.core.utils.StringUtils;
import org.apache.axis.types.UnsignedByte;

import cn.qdas.core.V11Webservice.IQdas_Web_Service;
import cn.qdas.core.V11Webservice.IQdas_Web_ServiceserviceLocator;
import cn.qdas.core.V11Webservice.V11WebServiceClient;

/**
 * @author leo.Zhou 周钧
 * 2019年11月19日
 */
public class Test {

	/**
	 * @param args
	 * @throws ServiceException 
	 * @throws RemoteException 
	 */
	public static void main(String[] args){
		Map map=gongc("-5","5", (float) 0.8);
		System.out.println(map);
	}
	public static Map gongc(String meugw,String meogw,float percentage){
		Map remap=new HashMap<String,Object>();
		if(!StringUtils.isBlank(meugw)&&StringUtils.isBlank(meogw)){
			if("0".equals(meugw)){
				remap.put("meugw","0");
			}else {
				remap.put("meugw",Float.parseFloat(meugw)*percentage);
			}
			remap.put("meogw",null);
			return remap;
		}else if(StringUtils.isBlank(meugw)&&!StringUtils.isBlank(meogw)){
			if("0".equals(meogw)){
				remap.put("meogw","0");
			}else {
				remap.put("meogw",Float.parseFloat(meogw)*percentage);
			}
			remap.put("meugw",null);
			return remap;
		}else if(!StringUtils.isBlank(meugw)&&!StringUtils.isBlank(meogw)){
			if("0".equals(meugw)){
				remap.put("meugw",meugw);
				remap.put("meogw",Float.parseFloat(meogw)*percentage);
				return remap;
			}else if("0".equals(meogw)){
				remap.put("meogw",meogw);
				remap.put("meugw",Float.parseFloat(meugw)*percentage);
				return remap;
			}else{
				float tolerance=Float.parseFloat(meogw)-Float.parseFloat(meugw);
				float newTolerance=((Float.parseFloat(meogw)-Float.parseFloat(meugw))*percentage-tolerance)/2;
				remap.put("meugw",Float.parseFloat(meugw)-newTolerance);
				remap.put("meogw",Float.parseFloat(meogw)+newTolerance);
				return remap;
			}
		}else{
			remap.put("meugw",meugw);
			remap.put("meogw",meogw);
		}
		return remap;
	}
	public static boolean test(boolean flag) {
		try {
			Map map=null;
			map.put("aaa","aa");
			System.out.println("成功");
			flag=true;
		}catch(Exception e){
//			e.printStackTrace();
			/*try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}*/
			flag=false;
		}
		return flag;
	}
	public static void webServiceTest() throws ServiceException, RemoteException {
		Map webMap=getKey();
		IQdas_Web_ServiceserviceLocator iqws=new IQdas_Web_ServiceserviceLocator(webMap.get("url").toString());
		IQdas_Web_Service client=iqws.getIQdas_Web_ServicePort();
		IntHolder webConnectResult=new IntHolder();
		IntHolder webConnectHandle=new IntHolder();
		client.webConnect(20, 44, webMap.get("user").toString(), webMap.get("password").toString(), "0.0.0.0", webConnectResult, webConnectHandle);
		int sessionHandle=webConnectHandle.value;
		int aaaaaaa;
		aaaaaaa=webConnectResult.value;
		System.out.println("webConnectResult======="+aaaaaaa);
		System.out.println("sessionHandle======="+sessionHandle);
		IntHolder createQueryResult=new IntHolder();
		IntHolder queryHandle=new IntHolder();
		client.createQuery(sessionHandle, createQueryResult, queryHandle);
		System.out.println("createQueryResult====="+createQueryResult.value);
		IntHolder filterResult1=new IntHolder();
		IntHolder filterHandle1=new IntHolder();
		client.createFilterFromSQL(sessionHandle, "TETEIL=6", filterResult1, filterHandle1);
		int addFilterToQuery1=client.addFilterToQuery(sessionHandle, queryHandle.value, filterHandle1.value, new UnsignedByte(0), 0, 0);
		System.out.println("addFilterToQuery1====="+addFilterToQuery1);
		IntHolder filterResult2=new IntHolder();
		IntHolder filterHandle2=new IntHolder();
		client.createFilterFromSQL(sessionHandle, "MEMERKMAL=60", filterResult2, filterHandle2);
		int addFilterToQuery2=client.addFilterToQuery(sessionHandle, queryHandle.value, filterHandle2.value, new UnsignedByte(1), 0, 0);
		System.out.println("addFilterToQuery2====="+addFilterToQuery2);
		IntHolder filterResult3=new IntHolder();
		IntHolder filterHandle3=new IntHolder();
		client.createFilterFromSQL(sessionHandle, "WVDATZEIT>'2018-10-01 00:00:00' AND WVDATZEIT<'2019-11-01 00:00:00'", filterResult3, filterHandle3);
		int addFilterToQuery3= client.addFilterToQuery(sessionHandle, queryHandle.value, filterHandle3.value, new UnsignedByte(2), 0, 0);
		System.out.println("addFilterToQuery3====="+addFilterToQuery3);
		String part_Char_List="";
		int executeQuery =client.executeQuery(sessionHandle, queryHandle.value, part_Char_List);
		System.out.println("executeQuery====="+executeQuery);
		int evaluateChar=client.evaluateChar(sessionHandle, 1, 1, true, 0, 0);
		//int evaluateAllChars= client.evaluateAllChars(sessionHandle);
		System.out.println("evaluateChar====="+evaluateChar);
		
		/*IntHolder result1=new IntHolder();
		StringHolder statResult_str1=new StringHolder();
		DoubleHolder statResult_dbl=new DoubleHolder();
		client.getStatResult(sessionHandle, 5210, 1, 1, new UnsignedByte(0), result1, statResult_str1, statResult_dbl);
		System.out.println("result1=========="+result1.value);
		System.out.println("statResult_dbl=========="+statResult_dbl.value);
		IntHolder result2=new IntHolder();
		StringHolder statResult_str2=new StringHolder();
		DoubleHolder statResult_db2=new DoubleHolder();
		client.getStatResult(sessionHandle, 5220, 1, 1, new UnsignedByte(0), result2, statResult_str2, statResult_db2);
		System.out.println("cp===="+statResult_str1.value);
		System.out.println("cpk===="+statResult_str2.value);
		System.out.println("cp2k===="+statResult_db2.value);*/
		
		IntHolder result1=new IntHolder();
		StringHolder statResult_str1=new StringHolder();
		DoubleHolder statResult_dbl=new DoubleHolder();
		client.getStatResult(sessionHandle, 8012, 1, 1, new UnsignedByte(0), result1, statResult_str1, statResult_dbl);
		System.out.println("result1=========="+result1.value);
		System.out.println("statResult_dbl=========="+statResult_dbl.value);
		IntHolder result2=new IntHolder();
		StringHolder statResult_str2=new StringHolder();
		DoubleHolder statResult_db2=new DoubleHolder();
		client.getStatResult(sessionHandle, 8013, 1, 1, new UnsignedByte(0), result2, statResult_str2, statResult_db2);
		System.out.println("cp===="+statResult_str1.value);
		System.out.println("cpk===="+statResult_str2.value);
		System.out.println("cp2k===="+statResult_db2.value);
		
		
		int aa =client.freeFilter(sessionHandle, filterHandle1.value);
		int bb =client.freeFilter(sessionHandle, filterHandle2.value);
		client.freeFilter(sessionHandle, filterHandle3.value);
		int cc =client.freeQuery(sessionHandle, queryHandle.value);
		int dd =client.clientDisconnect(sessionHandle);
		
	}
	public static Map getKey() {
		Map map=new HashMap<String, Object>();
		Properties prop = new Properties();
		try {
			prop.load(Test.class.getResourceAsStream("/jdbc.properties"));
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
