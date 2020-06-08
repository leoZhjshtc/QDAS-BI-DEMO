package cn.qdas.core.V11Webservice;

public class IQdas_Web_ServiceProxy implements IQdas_Web_Service {
  private String _endpoint = null;
  private IQdas_Web_Service iQdas_Web_Service = null;
  
  public IQdas_Web_ServiceProxy() {
    _initIQdas_Web_ServiceProxy();
  }
  
  public IQdas_Web_ServiceProxy(String endpoint) {
    _endpoint = endpoint;
    _initIQdas_Web_ServiceProxy();
  }
  
  private void _initIQdas_Web_ServiceProxy() {
    try {
      iQdas_Web_Service = (new cn.qdas.core.V11Webservice.IQdas_Web_ServiceserviceLocator()).getIQdas_Web_ServicePort();
      if (iQdas_Web_Service != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)iQdas_Web_Service)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)iQdas_Web_Service)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (iQdas_Web_Service != null)
      ((javax.xml.rpc.Stub)iQdas_Web_Service)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public IQdas_Web_Service getIQdas_Web_Service() {
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service;
  }
  
  public void getDistribution(int handle, int distgroupNr, int distNr, String input1, String input2, String input3, String input4, String input5, String input6, String input7, int width, int height, int width2, int height2, int outputFormat, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder graphicStr, javax.xml.rpc.holders.StringHolder graphicStr2) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getDistribution(handle, distgroupNr, distNr, input1, input2, input3, input4, input5, input6, input7, width, height, width2, height2, outputFormat, result, graphicStr, graphicStr2);
  }
  
  public int sessionCount() throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.sessionCount();
  }
  
  public void webConnect(int moduleID, int languageID, String userID, String userPwd, String clientAddress, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder handle) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.webConnect(moduleID, languageID, userID, userPwd, clientAddress, result, handle);
  }
  
  public int quickWebConnect() throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.quickWebConnect();
  }
  
  public void interActiveWebConnect(String clientAddress, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder handle) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.interActiveWebConnect(clientAddress, result, handle);
  }
  
  public int webDisconnect(int handle) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.webDisconnect(handle);
  }
  
  public int clientDisconnect(int handle) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.clientDisconnect(handle);
  }
  
  public int openFile(int handle, String filename) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.openFile(handle, filename);
  }
  
  public int saveToFile(int handle, String filename) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.saveToFile(handle, filename);
  }
  
  public void getStatResult(int handle, int resultKey, int part_Nr, int char_Nr, org.apache.axis.types.UnsignedByte bTransformation, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder statResult_str, javax.xml.rpc.holders.DoubleHolder statResult_dbl) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getStatResult(handle, resultKey, part_Nr, char_Nr, bTransformation, result, statResult_str, statResult_dbl);
  }
  
  public void getStatResultEx(int handle, int resultKey, int resultSubKey, int part_Nr, int char_Nr, int group_Nr, int outputType, int transformationType, int reserve1, int reserve2, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder statResult_str1, javax.xml.rpc.holders.StringHolder statResult_str2, javax.xml.rpc.holders.StringHolder statResult_str3, javax.xml.rpc.holders.StringHolder statResult_str4, javax.xml.rpc.holders.StringHolder statResult_str5, javax.xml.rpc.holders.IntHolder outputCount, javax.xml.rpc.holders.DoubleHolder statResult_dbl1, javax.xml.rpc.holders.DoubleHolder statResult_dbl2, javax.xml.rpc.holders.DoubleHolder statResult_dbl3, javax.xml.rpc.holders.DoubleHolder statResult_dbl4, javax.xml.rpc.holders.DoubleHolder statResult_dbl5) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getStatResultEx(handle, resultKey, resultSubKey, part_Nr, char_Nr, group_Nr, outputType, transformationType, reserve1, reserve2, result, statResult_str1, statResult_str2, statResult_str3, statResult_str4, statResult_str5, outputCount, statResult_dbl1, statResult_dbl2, statResult_dbl3, statResult_dbl4, statResult_dbl5);
  }
  
  public void getSingleValueEx(int handle, int part_Nr, int char_Nr, int resultKey, int resultSubKey, int reserved1, int reserved2, int outputType, boolean transformation, boolean sorted, int value_sp_nr, int gc_n, int gc_r, int gc_k, int gc_l, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder result_str, javax.xml.rpc.holders.DoubleHolder result_dbl) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getSingleValueEx(handle, part_Nr, char_Nr, resultKey, resultSubKey, reserved1, reserved2, outputType, transformation, sorted, value_sp_nr, gc_n, gc_r, gc_k, gc_l, result, result_str, result_dbl);
  }
  
  public int evaluateAllChars(int handle) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.evaluateAllChars(handle);
  }
  
  public int evaluateChar(int handle, int part_Nr, int char_Nr, boolean SPCEvaluation, int reserve1, int reserve2) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.evaluateChar(handle, part_Nr, char_Nr, SPCEvaluation, reserve1, reserve2);
  }
  
  public int saveToDB(int handle) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.saveToDB(handle);
  }
  
  public int saveChangesToDB(int handle) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.saveChangesToDB(handle);
  }
  
  public int setModule(int handle, int module) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.setModule(handle, module);
  }
  
  public int setLanguage(int handle, int language) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.setLanguage(handle, language);
  }
  
  public int setEvaluationStrategy(int handle, int study, int stratNr) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.setEvaluationStrategy(handle, study, stratNr);
  }
  
  public void qsstatVersion(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder versionNr) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.qsstatVersion(handle, result, versionNr);
  }
  
  public void getGlobalInfo(int handle, int part_Nr, int char_Nr, int op_Code, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder ret) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getGlobalInfo(handle, part_Nr, char_Nr, op_Code, result, ret);
  }
  
  public void getGraphicPages(int handle, int graphicNr, int graphicSubNr, int partNr_x, int groupNr_x, int charNr_x, int valueNr_x, int nrOfValues_x, int partNr_y, int groupNr_y, int charNr_y, int valueNr_y, int nrOfValues_y, int nrOfColumns, int nrOfRows, int width, int height, int configID, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder nrOfPages, javax.xml.rpc.holders.IntHolder blocksPerPage_X, javax.xml.rpc.holders.IntHolder blocksPerPage_Y) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getGraphicPages(handle, graphicNr, graphicSubNr, partNr_x, groupNr_x, charNr_x, valueNr_x, nrOfValues_x, partNr_y, groupNr_y, charNr_y, valueNr_y, nrOfValues_y, nrOfColumns, nrOfRows, width, height, configID, result, nrOfPages, blocksPerPage_X, blocksPerPage_Y);
  }
  
  public void getGraphic(int handle, int graphic_Nr, int part_Nr, int char_Nr, int width, int height, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder graphicStr) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getGraphic(handle, graphic_Nr, part_Nr, char_Nr, width, height, result, graphicStr);
  }
  
  public void getGraphic2(int handle, int graphic_Nr, int graphicSubNr, int part_Nr, int char_Nr, int width, int height, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder graphicStr, javax.xml.rpc.holders.StringHolder grafiktransferInfo) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getGraphic2(handle, graphic_Nr, graphicSubNr, part_Nr, char_Nr, width, height, result, graphicStr, grafiktransferInfo);
  }
  
  public void getGraphicExt(int handle, int graphicNr, int graphicSubNr, int partNr_x, int charNr_x, int valueNr_x, int nrOfValues_x, int groupNr_x, int partNr_y, int charNr_y, int valueNr_y, int nrOfValues_y, int groupNr_y, int width, int height, int nrOfColumns, int nrOfRows, int configID, int outputFormat, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder graphicStr) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getGraphicExt(handle, graphicNr, graphicSubNr, partNr_x, charNr_x, valueNr_x, nrOfValues_x, groupNr_x, partNr_y, charNr_y, valueNr_y, nrOfValues_y, groupNr_y, width, height, nrOfColumns, nrOfRows, configID, outputFormat, result, graphicStr);
  }
  
  public void getGraphicExt2(int handle, int graphicNr, int graphicSubNr, int partNr_x, int groupNr_x, int charNr_x, int valueNr_x, int nrOfValues_x, int partNr_y, int groupNr_y, int charNr_y, int valueNr_y, int nrOfValues_y, int partNr_MarkStart, int groupNr_MarkStart, int charNr_MarkStart, int valueNr_MarkStart, int partNr_MarkEnd, int groupNr_MarkEnd, int charNr_MarkEnd, int valueNr_MarkEnd, int nrOfColumns, int nrOfRows, int width, int height, int configID, int pageBlockStart_X, int pageBlockStart_Y, int outputFormat, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder nrOfBlocksInPage_X, javax.xml.rpc.holders.IntHolder nrOfBlocksInPage_Y, javax.xml.rpc.holders.StringHolder graphicStr) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getGraphicExt2(handle, graphicNr, graphicSubNr, partNr_x, groupNr_x, charNr_x, valueNr_x, nrOfValues_x, partNr_y, groupNr_y, charNr_y, valueNr_y, nrOfValues_y, partNr_MarkStart, groupNr_MarkStart, charNr_MarkStart, valueNr_MarkStart, partNr_MarkEnd, groupNr_MarkEnd, charNr_MarkEnd, valueNr_MarkEnd, nrOfColumns, nrOfRows, width, height, configID, pageBlockStart_X, pageBlockStart_Y, outputFormat, result, nrOfBlocksInPage_X, nrOfBlocksInPage_Y, graphicStr);
  }
  
  public void getGraphicExt3(int handle, int graphicNr, int graphicSubNr, String partNr_x, String groupNr_x, String charNr_x, String valueNr_x, String nrOfValues_x, String partNr_y, String groupNr_y, String charNr_y, String valueNr_y, String nrOfValues_y, int handle_Mark, int partNr_MarkStart, int groupNr_MarkStart, int charNr_MarkStart, int valueNr_MarkStart, int partNr_MarkEnd, int groupNr_MarkEnd, int charNr_MarkEnd, int valueNr_MarkEnd, int nrOfColumns, int nrOfRows, int width, int height, int configID, int pageBlockStart_X, int pageBlockStart_Y, int outputFormat, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder nrOfBlocksInPage_X, javax.xml.rpc.holders.IntHolder nrOfBlocksInPage_Y, javax.xml.rpc.holders.StringHolder graphicStr) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getGraphicExt3(handle, graphicNr, graphicSubNr, partNr_x, groupNr_x, charNr_x, valueNr_x, nrOfValues_x, partNr_y, groupNr_y, charNr_y, valueNr_y, nrOfValues_y, handle_Mark, partNr_MarkStart, groupNr_MarkStart, charNr_MarkStart, valueNr_MarkStart, partNr_MarkEnd, groupNr_MarkEnd, charNr_MarkEnd, valueNr_MarkEnd, nrOfColumns, nrOfRows, width, height, configID, pageBlockStart_X, pageBlockStart_Y, outputFormat, result, nrOfBlocksInPage_X, nrOfBlocksInPage_Y, graphicStr);
  }
  
  public void getGraphicExt4(int handle, int graphicNr, int graphicSubNr, int partNr_x, int charNr_x, int valueNr_x, int nrOfValues_x, int groupNr_x, int partNr_y, int charNr_y, int valueNr_y, int nrOfValues_y, int groupNr_y, int width, int height, int nrOfColumns, int nrOfRows, int configID, int outputFormat, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder graphicStr) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getGraphicExt4(handle, graphicNr, graphicSubNr, partNr_x, charNr_x, valueNr_x, nrOfValues_x, groupNr_x, partNr_y, charNr_y, valueNr_y, nrOfValues_y, groupNr_y, width, height, nrOfColumns, nrOfRows, configID, outputFormat, result, graphicStr);
  }
  
  public void getGraphicAndInfo(int handle, int graphicNr, int graphicSubNr, String partNr_x, String groupNr_x, String charNr_x, String valueNr_x, String nrOfValues_x, String partNr_y, String groupNr_y, String charNr_y, String valueNr_y, String nrOfValues_y, int handle_Mark, int partNr_MarkStart, int groupNr_MarkStart, int charNr_MarkStart, int valueNr_MarkStart, int partNr_MarkEnd, int groupNr_MarkEnd, int charNr_MarkEnd, int valueNr_MarkEnd, int nrOfColumns, int nrOfRows, int width, int height, int configID, int pageBlockStart_X, int pageBlockStart_Y, int outputFormat, int controlCode, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder nrOfBlocksInPage_X, javax.xml.rpc.holders.IntHolder nrOfBlocksInPage_Y, javax.xml.rpc.holders.StringHolder graphicStr, javax.xml.rpc.holders.StringHolder grafiktransferInfo) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getGraphicAndInfo(handle, graphicNr, graphicSubNr, partNr_x, groupNr_x, charNr_x, valueNr_x, nrOfValues_x, partNr_y, groupNr_y, charNr_y, valueNr_y, nrOfValues_y, handle_Mark, partNr_MarkStart, groupNr_MarkStart, charNr_MarkStart, valueNr_MarkStart, partNr_MarkEnd, groupNr_MarkEnd, charNr_MarkEnd, valueNr_MarkEnd, nrOfColumns, nrOfRows, width, height, configID, pageBlockStart_X, pageBlockStart_Y, outputFormat, controlCode, result, nrOfBlocksInPage_X, nrOfBlocksInPage_Y, graphicStr, grafiktransferInfo);
  }
  
  public void getDataPositionByCoordExt(int handle, int graficNr, int graficSubNr, int partNr_x, int charNr_x, int valueNr_x, int nrOfValues_x, int groupNr_x, int partNr_y, int charNr_y, int valueNr_y, int nrOfValues_y, int groupNr_y, int nrOfColumns, int nrOfRows, org.apache.axis.types.UnsignedByte getPositionOnly, int width, int height, int configID, int outputFormat, javax.xml.rpc.holders.IntHolder x, javax.xml.rpc.holders.IntHolder y, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder childHandle, javax.xml.rpc.holders.IntHolder partNrOut_x, javax.xml.rpc.holders.IntHolder groupNrOut_x, javax.xml.rpc.holders.IntHolder charNrOut_x, javax.xml.rpc.holders.IntHolder valueNrOut_x, javax.xml.rpc.holders.IntHolder partNrOut_y, javax.xml.rpc.holders.IntHolder groupNrOut_y, javax.xml.rpc.holders.IntHolder charNrOut_y, javax.xml.rpc.holders.IntHolder valueNrOut_y, javax.xml.rpc.holders.StringHolder graphicStr) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getDataPositionByCoordExt(handle, graficNr, graficSubNr, partNr_x, charNr_x, valueNr_x, nrOfValues_x, groupNr_x, partNr_y, charNr_y, valueNr_y, nrOfValues_y, groupNr_y, nrOfColumns, nrOfRows, getPositionOnly, width, height, configID, outputFormat, x, y, result, childHandle, partNrOut_x, groupNrOut_x, charNrOut_x, valueNrOut_x, partNrOut_y, groupNrOut_y, charNrOut_y, valueNrOut_y, graphicStr);
  }
  
  public void getDataPositionByCoordExt3(int handle, int graficNr, int graficSubNr, int partNr_x, int charNr_x, int valueNr_x, int nrOfValues_x, int groupNr_x, int partNr_y, int charNr_y, int valueNr_y, int nrOfValues_y, int groupNr_y, int nrOfColumns, int nrOfRows, org.apache.axis.types.UnsignedByte getPositionOnly, int width, int height, int configID, int outputFormat, int pageBlockStartX, int pageBlockStartY, javax.xml.rpc.holders.IntHolder x, javax.xml.rpc.holders.IntHolder y, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder childHandle, javax.xml.rpc.holders.IntHolder partNrOut_x, javax.xml.rpc.holders.IntHolder groupNrOut_x, javax.xml.rpc.holders.IntHolder charNrOut_x, javax.xml.rpc.holders.IntHolder valueNrOut_x, javax.xml.rpc.holders.IntHolder valueNrArt_out_x, javax.xml.rpc.holders.IntHolder ausgabepunktFeldArtOut, javax.xml.rpc.holders.LongHolder ausgabepunktFeldOut, javax.xml.rpc.holders.IntHolder ausgabepunktOut, javax.xml.rpc.holders.IntHolder ausgabepunktSukeyOut, javax.xml.rpc.holders.IntHolder partNrOut_y, javax.xml.rpc.holders.IntHolder groupNrOut_y, javax.xml.rpc.holders.IntHolder charNrOut_y, javax.xml.rpc.holders.IntHolder valueNrOut_y, javax.xml.rpc.holders.IntHolder nrOfPageBlocksX, javax.xml.rpc.holders.IntHolder nrOfPageBlocksY, javax.xml.rpc.holders.StringHolder xmlInfoStr, javax.xml.rpc.holders.StringHolder graphicStr) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getDataPositionByCoordExt3(handle, graficNr, graficSubNr, partNr_x, charNr_x, valueNr_x, nrOfValues_x, groupNr_x, partNr_y, charNr_y, valueNr_y, nrOfValues_y, groupNr_y, nrOfColumns, nrOfRows, getPositionOnly, width, height, configID, outputFormat, pageBlockStartX, pageBlockStartY, x, y, result, childHandle, partNrOut_x, groupNrOut_x, charNrOut_x, valueNrOut_x, valueNrArt_out_x, ausgabepunktFeldArtOut, ausgabepunktFeldOut, ausgabepunktOut, ausgabepunktSukeyOut, partNrOut_y, groupNrOut_y, charNrOut_y, valueNrOut_y, nrOfPageBlocksX, nrOfPageBlocksY, xmlInfoStr, graphicStr);
  }
  
  public void getGraphArray(int handle, int graphicNr, int graphicSubNr, String partNr_x, String groupNr_x, String charNr_x, String valueNr_x, String nrOfValues_x, String partNr_y, String groupNr_y, String charNr_y, String valueNr_y, String nrOfValues_y, int nrOfColumns, int nrOfRows, int singleImageWidth, int singleImageHeight, int configID, int pageBlockStart_X, int pageBlockStart_Y, int outputFormat, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder nrOfBlocksInPage_X, javax.xml.rpc.holders.IntHolder nrOfBlocksInPage_Y, javax.xml.rpc.holders.StringHolder graphicArrayXml) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getGraphArray(handle, graphicNr, graphicSubNr, partNr_x, groupNr_x, charNr_x, valueNr_x, nrOfValues_x, partNr_y, groupNr_y, charNr_y, valueNr_y, nrOfValues_y, nrOfColumns, nrOfRows, singleImageWidth, singleImageHeight, configID, pageBlockStart_X, pageBlockStart_Y, outputFormat, result, nrOfBlocksInPage_X, nrOfBlocksInPage_Y, graphicArrayXml);
  }
  
  public void getAllInteractiveGraphics(int handle, int outputFormat, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder graphicArrayXml) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getAllInteractiveGraphics(handle, outputFormat, result, graphicArrayXml);
  }
  
  public void getReportExt(int handle, String printReport, int part_Nr_x, int char_Nr_x, int value_Nr_x, int nrOfValues_x, int part_Nr_y, int char_Nr_y, int value_Nr_y, int nrOfValues_y, int page_nr, int width, int height, int config_id, int outputFormat, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder reportStr) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getReportExt(handle, printReport, part_Nr_x, char_Nr_x, value_Nr_x, nrOfValues_x, part_Nr_y, char_Nr_y, value_Nr_y, nrOfValues_y, page_nr, width, height, config_id, outputFormat, result, reportStr);
  }
  
  public void getReportPages(int handle, String printReport, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder nrOfPages) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getReportPages(handle, printReport, result, nrOfPages);
  }
  
  public void getPartInfo(int handle, int fieldNr, int part_Nr, int char_Nr, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder KFieldValue) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getPartInfo(handle, fieldNr, part_Nr, char_Nr, result, KFieldValue);
  }
  
  public void getCharInfo(int handle, int fieldNr, int part_Nr, int char_Nr, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder KFieldValue) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getCharInfo(handle, fieldNr, part_Nr, char_Nr, result, KFieldValue);
  }
  
  public void getValueInfo(int handle, int KField, int part_Nr, int char_Nr, int value_Nr, org.apache.axis.types.UnsignedByte bTransformation, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder value) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getValueInfo(handle, KField, part_Nr, char_Nr, value_Nr, bTransformation, result, value);
  }
  
  public int setKey(int handle, int partNr, int charNr, int groupNr, int valueNr, int key, int subKey, String data, int charRange) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.setKey(handle, partNr, charNr, groupNr, valueNr, key, subKey, data, charRange);
  }
  
  public void getFirstChildNode(int handle, int partNo_Parent, int groupNo_Parent, int charNo_Parent, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder partNo, javax.xml.rpc.holders.IntHolder groupNo, javax.xml.rpc.holders.IntHolder charNo) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getFirstChildNode(handle, partNo_Parent, groupNo_Parent, charNo_Parent, result, partNo, groupNo, charNo);
  }
  
  public void getNextSiblingNode(int handle, int partNo_Current, int groupNo_Current, int charNo_Current, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder partNo, javax.xml.rpc.holders.IntHolder groupNo, javax.xml.rpc.holders.IntHolder charNo) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getNextSiblingNode(handle, partNo_Current, groupNo_Current, charNo_Current, result, partNo, groupNo, charNo);
  }
  
  public void getQSStatText(int handle, int textGroup, int textKey, int textSubKey, int singularPlural, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder text) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getQSStatText(handle, textGroup, textKey, textSubKey, singularPlural, result, text);
  }
  
  public int setProperty(int handle, int prop_Key, String prop_Value) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.setProperty(handle, prop_Key, prop_Value);
  }
  
  public void getFirstLanguage(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder language_str, javax.xml.rpc.holders.StringHolder language_shortStr, javax.xml.rpc.holders.IntHolder language) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getFirstLanguage(handle, result, language_str, language_shortStr, language);
  }
  
  public void getFirstLanguageExt(int QDasTool, int QDasID, int modul, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder language_str, javax.xml.rpc.holders.StringHolder language_shortStr, javax.xml.rpc.holders.IntHolder language) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getFirstLanguageExt(QDasTool, QDasID, modul, result, language_str, language_shortStr, language);
  }
  
  public void getNextLanguage(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder language_str, javax.xml.rpc.holders.StringHolder language_shortStr, javax.xml.rpc.holders.IntHolder language) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getNextLanguage(handle, result, language_str, language_shortStr, language);
  }
  
  public void getFirstModule(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder module, javax.xml.rpc.holders.StringHolder moduleName) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getFirstModule(handle, result, module, moduleName);
  }
  
  public void getNextModule(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder module, javax.xml.rpc.holders.StringHolder moduleName) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getNextModule(handle, result, module, moduleName);
  }
  
  public void getFirstModuleExt(int QDasTool, int QDasID, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder module, javax.xml.rpc.holders.StringHolder moduleName) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getFirstModuleExt(QDasTool, QDasID, result, module, moduleName);
  }
  
  public void getNextModuleExt(int QDASTool, int QDASId, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder module, javax.xml.rpc.holders.StringHolder moduleName) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getNextModuleExt(QDASTool, QDASId, result, module, moduleName);
  }
  
  public void getFirstGraphic(int handle, int module, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder graphicNr, javax.xml.rpc.holders.StringHolder graphicName) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getFirstGraphic(handle, module, result, graphicNr, graphicName);
  }
  
  public void getNextGraphic(int handle, int module, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder graphicNr, javax.xml.rpc.holders.StringHolder graphicName) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getNextGraphic(handle, module, result, graphicNr, graphicName);
  }
  
  public void skipGraphic(int handle, int module, int num, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder graphicNr, javax.xml.rpc.holders.StringHolder graphicName) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.skipGraphic(handle, module, num, result, graphicNr, graphicName);
  }
  
  public void getGraphicName(int handle, int module, int graphicNr, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder graphicName) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getGraphicName(handle, module, graphicNr, result, graphicName);
  }
  
  public void getGraphicNameExt(int handle, int graphicKey, int graphicSubKey, int graphicAddKey, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder graphicLongName, javax.xml.rpc.holders.StringHolder graphicShortName) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getGraphicNameExt(handle, graphicKey, graphicSubKey, graphicAddKey, result, graphicLongName, graphicShortName);
  }
  
  public void getFirstReport(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder report_Nr, javax.xml.rpc.holders.StringHolder report_Name, javax.xml.rpc.holders.StringHolder report_Filename) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getFirstReport(handle, result, report_Nr, report_Name, report_Filename);
  }
  
  public void getNextReport(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder report_Nr, javax.xml.rpc.holders.StringHolder report_Name, javax.xml.rpc.holders.StringHolder report_Filename) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getNextReport(handle, result, report_Nr, report_Name, report_Filename);
  }
  
  public void getReportName(int handle, int report_Nr, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder report_Name, javax.xml.rpc.holders.StringHolder report_Filename) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getReportName(handle, report_Nr, result, report_Name, report_Filename);
  }
  
  public void reportFileName2Name(int handle, String report_FileName, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder report_Name) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.reportFileName2Name(handle, report_FileName, result, report_Name);
  }
  
  public void getFirstEvaluationStrategy(int handle, int modul, int study, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder stratNr, javax.xml.rpc.holders.StringHolder stratName) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getFirstEvaluationStrategy(handle, modul, study, result, stratNr, stratName);
  }
  
  public void getNextEvaluationStrategy(int handle, int modul, int study, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder stratNr, javax.xml.rpc.holders.StringHolder stratName) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getNextEvaluationStrategy(handle, modul, study, result, stratNr, stratName);
  }
  
  public void getDefaultEvaluationStrategy(int handle, int modul, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder stratNr, javax.xml.rpc.holders.StringHolder stratName) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getDefaultEvaluationStrategy(handle, modul, result, stratNr, stratName);
  }
  
  public void getFirstQueryName(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder queryName) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getFirstQueryName(handle, result, queryName);
  }
  
  public int getNextQueryName(int handle, javax.xml.rpc.holders.StringHolder queryName) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.getNextQueryName(handle, queryName);
  }
  
  public void loadQuery(int handle, String queryName, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder queryHandle) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.loadQuery(handle, queryName, result, queryHandle);
  }
  
  public void loadQueryExt(int handle, String queryName, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder queryHandle, javax.xml.rpc.holders.StringHolder part_Char_List) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.loadQueryExt(handle, queryName, result, queryHandle, part_Char_List);
  }
  
  public void loadQueryExt2(int handle, String queryName, boolean defaultOptions, boolean defaultSort, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder queryHandle, javax.xml.rpc.holders.StringHolder part_Char_List) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.loadQueryExt2(handle, queryName, defaultOptions, defaultSort, result, queryHandle, part_Char_List);
  }
  
  public void createQuery(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder queryHandle) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.createQuery(handle, result, queryHandle);
  }
  
  public void createQueryExt(int handle, boolean defaultOptions, boolean defaultSort, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder queryHandle) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.createQueryExt(handle, defaultOptions, defaultSort, result, queryHandle);
  }
  
  public void createQueryFromXML(int handle, String queryXMLString, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder queryHandle) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.createQueryFromXML(handle, queryXMLString, result, queryHandle);
  }
  
  public int addFilterToQuery(int handle, int queryHandle, int filterHandle, org.apache.axis.types.UnsignedByte queryLevel, int part_Key, int char_Key) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.addFilterToQuery(handle, queryHandle, filterHandle, queryLevel, part_Key, char_Key);
  }
  
  public int addFilterToQueryExt(int handle, int queryHandle, int filterHandle, org.apache.axis.types.UnsignedByte queryLevel, int part_Key, int char_Key, org.apache.axis.types.UnsignedByte replaceMode) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.addFilterToQueryExt(handle, queryHandle, filterHandle, queryLevel, part_Key, char_Key, replaceMode);
  }
  
  public int addUserGroupFilterToQuery(int handle, int queryHandle) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.addUserGroupFilterToQuery(handle, queryHandle);
  }
  
  public int addSortToQuery(int handle, int queryHandle, int sortKey, org.apache.axis.types.UnsignedByte direction) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.addSortToQuery(handle, queryHandle, sortKey, direction);
  }
  
  public int addPartCharacteristicListToQuery(int handle, int queryHandle, String part_Char_List) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.addPartCharacteristicListToQuery(handle, queryHandle, part_Char_List);
  }
  
  public int setQueryProperty(int handle, int queryHandle, int propertyKey, String propertyValue) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.setQueryProperty(handle, queryHandle, propertyKey, propertyValue);
  }
  
  public int saveQuery(int handle, String queryName, int queryHandle) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.saveQuery(handle, queryName, queryHandle);
  }
  
  public int executeQuery(int handle, int queryHandle, String part_Char_List) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.executeQuery(handle, queryHandle, part_Char_List);
  }
  
  public int executeQuery_Ext(int handle, int queryHandle, String part_Char_List, boolean readWrite, boolean loadValues) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.executeQuery_Ext(handle, queryHandle, part_Char_List, readWrite, loadValues);
  }
  
  public void getFirstPartQuery(int handle, int queryHandle, String KFieldList, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder KResultList) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getFirstPartQuery(handle, queryHandle, KFieldList, result, KResultList);
  }
  
  public void getNextPartQuery(int handle, int queryHandle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder KResultList) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getNextPartQuery(handle, queryHandle, result, KResultList);
  }
  
  public void skipPartQuery(int handle, int queryHandle, int num, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder KResultList) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.skipPartQuery(handle, queryHandle, num, result, KResultList);
  }
  
  public void getFirstCharQuery(int handle, int queryHandle, int part_Key, String KFieldList, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder KResultList) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getFirstCharQuery(handle, queryHandle, part_Key, KFieldList, result, KResultList);
  }
  
  public void getNextCharQuery(int handle, int queryHandle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder KResultList) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getNextCharQuery(handle, queryHandle, result, KResultList);
  }
  
  public void skipCharQuery(int handle, int queryHandle, int num, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder KResultList) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.skipCharQuery(handle, queryHandle, num, result, KResultList);
  }
  
  public void getFirstValueQuery(int handle, int queryHandle, int part_Key, int char_Key, String KFieldList, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder KResultList) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getFirstValueQuery(handle, queryHandle, part_Key, char_Key, KFieldList, result, KResultList);
  }
  
  public void getNextValueQuery(int handle, int queryHandle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder KResultList) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getNextValueQuery(handle, queryHandle, result, KResultList);
  }
  
  public void skipValueQuery(int handle, int queryHandle, int num, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder KResultList) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.skipValueQuery(handle, queryHandle, num, result, KResultList);
  }
  
  public int freeQuery(int handle, int queryHandle) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.freeQuery(handle, queryHandle);
  }
  
  public void getFirstFilterName(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder filterName) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getFirstFilterName(handle, result, filterName);
  }
  
  public void getNextFilterName(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder filterName) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getNextFilterName(handle, result, filterName);
  }
  
  public void getFirstFilterNameExt(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder filterLevel, javax.xml.rpc.holders.IntHolder filterIdent, javax.xml.rpc.holders.StringHolder filterName) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getFirstFilterNameExt(handle, result, filterLevel, filterIdent, filterName);
  }
  
  public void getNextFilterNameExt(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder filterLevel, javax.xml.rpc.holders.IntHolder filterIdent, javax.xml.rpc.holders.StringHolder filterName) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getNextFilterNameExt(handle, result, filterLevel, filterIdent, filterName);
  }
  
  public void loadFilter(int handle, String filterName, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder filterHandle) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.loadFilter(handle, filterName, result, filterHandle);
  }
  
  public void loadFilterByID(int handle, int filterIdent, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder filterName, javax.xml.rpc.holders.IntHolder filterHandle) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.loadFilterByID(handle, filterIdent, result, filterName, filterHandle);
  }
  
  public void createFilterFromFilters(int handle, org.apache.axis.types.UnsignedByte operator, String sourceFilters, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder filterHandle) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.createFilterFromFilters(handle, operator, sourceFilters, result, filterHandle);
  }
  
  public void createFilter(int handle, org.apache.axis.types.UnsignedByte k_r_key, int ausgabepunkt, String condition, org.apache.axis.types.UnsignedByte compOp, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder filterHandle) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.createFilter(handle, k_r_key, ausgabepunkt, condition, compOp, result, filterHandle);
  }
  
  public void createFilterFromSQL(int handle, String filterString, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder filterHandle) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.createFilterFromSQL(handle, filterString, result, filterHandle);
  }
  
  public int saveFilter(int handle, String filterName, int filterHandle) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.saveFilter(handle, filterName, filterHandle);
  }
  
  public int freeFilter(int handle, int filterHandle) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.freeFilter(handle, filterHandle);
  }
  
  public void createDirectSQL(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder SQLHandle) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.createDirectSQL(handle, result, SQLHandle);
  }
  
  public void executeDirectSQL(int handle, int SQLHandle, String SQLString, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder fieldList) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.executeDirectSQL(handle, SQLHandle, SQLString, result, fieldList);
  }
  
  public void getFirstDirectSQLRow(int handle, int SQLHandle, boolean pdf, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder resultList) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getFirstDirectSQLRow(handle, SQLHandle, pdf, result, resultList);
  }
  
  public void getNextDirectSQLRow(int handle, int SQLHandle, boolean pdf, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder resultList) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getNextDirectSQLRow(handle, SQLHandle, pdf, result, resultList);
  }
  
  public int freeDirectSQL(int handle, int SQLHandle) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.freeDirectSQL(handle, SQLHandle);
  }
  
  public void getFirstCatalog(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder catalogKey, javax.xml.rpc.holders.StringHolder columnKeyList, javax.xml.rpc.holders.IntHolder subCatalogs, javax.xml.rpc.holders.StringHolder catalogName) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getFirstCatalog(handle, result, catalogKey, columnKeyList, subCatalogs, catalogName);
  }
  
  public void getNextCatalog(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder catalogKey, javax.xml.rpc.holders.StringHolder columnKeyList, javax.xml.rpc.holders.IntHolder subCatalogs, javax.xml.rpc.holders.StringHolder catalogName) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getNextCatalog(handle, result, catalogKey, columnKeyList, subCatalogs, catalogName);
  }
  
  public void getFirstSubCatalog(int handle, int catalogKey, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder subCatalog, javax.xml.rpc.holders.StringHolder subCatalogName) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getFirstSubCatalog(handle, catalogKey, result, subCatalog, subCatalogName);
  }
  
  public void getNextSubCatalog(int handle, int catalogKey, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder subCatalog, javax.xml.rpc.holders.StringHolder subCatalogName) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getNextSubCatalog(handle, catalogKey, result, subCatalog, subCatalogName);
  }
  
  public void getFirstCatalogEntry(int handle, int catalogKey, int subCatalog, int colKey, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder entryKey, javax.xml.rpc.holders.StringHolder outStr) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getFirstCatalogEntry(handle, catalogKey, subCatalog, colKey, result, entryKey, outStr);
  }
  
  public void getNextCatalogEntry(int handle, int colKey, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder entryKey, javax.xml.rpc.holders.StringHolder outStr) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getNextCatalogEntry(handle, colKey, result, entryKey, outStr);
  }
  
  public void getAnotherColumn(int handle, int colKey, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder entryKey, javax.xml.rpc.holders.StringHolder outStr) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getAnotherColumn(handle, colKey, result, entryKey, outStr);
  }
  
  public void getFirstCatalogEntryComplete(int handle, int catalogKey, int subCatalog, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder entryKey, javax.xml.rpc.holders.StringHolder numberStr, javax.xml.rpc.holders.StringHolder nameStr, javax.xml.rpc.holders.StringHolder string3, javax.xml.rpc.holders.StringHolder string4, javax.xml.rpc.holders.StringHolder string5, javax.xml.rpc.holders.StringHolder string6, javax.xml.rpc.holders.StringHolder string7, javax.xml.rpc.holders.StringHolder string8) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getFirstCatalogEntryComplete(handle, catalogKey, subCatalog, result, entryKey, numberStr, nameStr, string3, string4, string5, string6, string7, string8);
  }
  
  public void getNextCatalogEntryComplete(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder entryKey, javax.xml.rpc.holders.StringHolder numberStr, javax.xml.rpc.holders.StringHolder nameStr, javax.xml.rpc.holders.StringHolder string3, javax.xml.rpc.holders.StringHolder string4, javax.xml.rpc.holders.StringHolder string5, javax.xml.rpc.holders.StringHolder string6, javax.xml.rpc.holders.StringHolder string7, javax.xml.rpc.holders.StringHolder string8) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getNextCatalogEntryComplete(handle, result, entryKey, numberStr, nameStr, string3, string4, string5, string6, string7, string8);
  }
  
  public void getFirstCatalogEntryComplete_Ext(int handle, int catalogKey, int subCatalog, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder entryKey, javax.xml.rpc.holders.StringHolder numberStr, javax.xml.rpc.holders.StringHolder nameStr, javax.xml.rpc.holders.StringHolder string3, javax.xml.rpc.holders.StringHolder string4, javax.xml.rpc.holders.StringHolder string5, javax.xml.rpc.holders.StringHolder string6, javax.xml.rpc.holders.StringHolder string7, javax.xml.rpc.holders.StringHolder string8, javax.xml.rpc.holders.StringHolder string9, javax.xml.rpc.holders.StringHolder string10, javax.xml.rpc.holders.StringHolder comment, org.apache.axis.holders.UnsignedIntHolder state) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getFirstCatalogEntryComplete_Ext(handle, catalogKey, subCatalog, result, entryKey, numberStr, nameStr, string3, string4, string5, string6, string7, string8, string9, string10, comment, state);
  }
  
  public void getNextCatalogEntryComplete_Ext(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder entryKey, javax.xml.rpc.holders.StringHolder numberStr, javax.xml.rpc.holders.StringHolder nameStr, javax.xml.rpc.holders.StringHolder string3, javax.xml.rpc.holders.StringHolder string4, javax.xml.rpc.holders.StringHolder string5, javax.xml.rpc.holders.StringHolder string6, javax.xml.rpc.holders.StringHolder string7, javax.xml.rpc.holders.StringHolder string8, javax.xml.rpc.holders.StringHolder string9, javax.xml.rpc.holders.StringHolder string10, javax.xml.rpc.holders.StringHolder comment, org.apache.axis.holders.UnsignedIntHolder state) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getNextCatalogEntryComplete_Ext(handle, result, entryKey, numberStr, nameStr, string3, string4, string5, string6, string7, string8, string9, string10, comment, state);
  }
  
  public void recentSerNo_First(int handle, int partKey, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder serialNo) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.recentSerNo_First(handle, partKey, result, serialNo);
  }
  
  public void recentSerNo_Next(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder serialNo) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.recentSerNo_Next(handle, result, serialNo);
  }
  
  public void getFirstUser(javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder userName) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getFirstUser(result, userName);
  }
  
  public void getNextUser(javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder userName) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getNextUser(result, userName);
  }
  
  public void getLTTree(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder LTTree_XMLStr) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getLTTree(handle, result, LTTree_XMLStr);
  }
  
  public int setLTEnvironment(int handle, int LTModule, int LTStrategy, String LTAufteilung) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.setLTEnvironment(handle, LTModule, LTStrategy, LTAufteilung);
  }
  
  public void doAction(int handle, int fkt_group, int fkt_nummer, int fkt_sub_nummer, int fkt_zus_nummer, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder key_info_out) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.doAction(handle, fkt_group, fkt_nummer, fkt_sub_nummer, fkt_zus_nummer, result, key_info_out);
  }
  
  public void doAction_Ext(int handle, int fkt_group, int fkt_nummer, int fkt_sub_nummer, int fkt_zus_nummer, String parameters, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder key_info_out) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.doAction_Ext(handle, fkt_group, fkt_nummer, fkt_sub_nummer, fkt_zus_nummer, parameters, result, key_info_out);
  }
  
  public void getQMLasString(int handle, String parameterXML, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder QMLResult) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getQMLasString(handle, parameterXML, result, QMLResult);
  }
  
  public void getGridInfo(int handle, int gridKey, int gridSubKey, String paramXml, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder gridInfoXml) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getGridInfo(handle, gridKey, gridSubKey, paramXml, result, gridInfoXml);
  }
  
  public int setGridInfo(int handle, int gridKey, int gridSubKey, String paramXml, String gridInfoXml) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.setGridInfo(handle, gridKey, gridSubKey, paramXml, gridInfoXml);
  }
  
  public void getAlarmStatusforKField(int handle, int KField, String KFieldContent, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder alarmState) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getAlarmStatusforKField(handle, KField, KFieldContent, result, alarmState);
  }
  
  public void createReportingJob(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder reportingHandle) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.createReportingJob(handle, result, reportingHandle);
  }
  
  public int freeReportingJob(int handle, int reportingHandle) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.freeReportingJob(handle, reportingHandle);
  }
  
  public void getFirstReportingJobName(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder jobId, javax.xml.rpc.holders.StringHolder jobName, javax.xml.rpc.holders.IntHolder jobState) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getFirstReportingJobName(handle, result, jobId, jobName, jobState);
  }
  
  public void getNextReportingJobName(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder jobId, javax.xml.rpc.holders.StringHolder jobName, javax.xml.rpc.holders.IntHolder jobState) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getNextReportingJobName(handle, result, jobId, jobName, jobState);
  }
  
  public void loadReportingJob(int handle, String jobName, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder jobHandle) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.loadReportingJob(handle, jobName, result, jobHandle);
  }
  
  public void loadReportingJobByID(int handle, int jobId, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder jobName, javax.xml.rpc.holders.IntHolder jobHandle) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.loadReportingJobByID(handle, jobId, result, jobName, jobHandle);
  }
  
  public void getReportingJobProperties(int handle, int jobHandle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder reportingJobInfoXml) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getReportingJobProperties(handle, jobHandle, result, reportingJobInfoXml);
  }
  
  public int setReportingJobProperties(int handle, int jobHandle, int propertyKey, String reportingJobInfoXml) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.setReportingJobProperties(handle, jobHandle, propertyKey, reportingJobInfoXml);
  }
  
  public int saveReportingJob(int handle, String jobName, int jobHandle) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.saveReportingJob(handle, jobName, jobHandle);
  }
  
  public int setReportingJobState(int handle, int jobHandle, int jobState) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.setReportingJobState(handle, jobHandle, jobState);
  }
  
  public int deleteReportingJobByID(int handle, int jobId) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.deleteReportingJobByID(handle, jobId);
  }
  
  public void getProcessManagerTree(int handle, int treeType, String startNodeGuid, int maxNodeLevel, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder treeAsJson) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getProcessManagerTree(handle, treeType, startNodeGuid, maxNodeLevel, result, treeAsJson);
  }
  
  public void getNodeBenchmark(int handle, int graphicKey, int graphicSubKey, int benchmModule, int benchmEvalStrat, String nodeId, boolean divBySubNodes, int timeUnit, java.util.Calendar dateTimeStart, java.util.Calendar dateTimeEnd, int partSumField, int width, int height, int outputFormat, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder graphicStr, javax.xml.rpc.holders.StringHolder grafiktransferInfo) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.getNodeBenchmark(handle, graphicKey, graphicSubKey, benchmModule, benchmEvalStrat, nodeId, divBySubNodes, timeUnit, dateTimeStart, dateTimeEnd, partSumField, width, height, outputFormat, result, graphicStr, grafiktransferInfo);
  }
  
  public void loadDataOfNode(int handle, String nodeId, boolean loadProcessChars, String queryOptions, java.util.Calendar dateTimeStart, java.util.Calendar dateTimeEnd, String filterConditions, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder loadedDataInfoXml) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.loadDataOfNode(handle, nodeId, loadProcessChars, queryOptions, dateTimeStart, dateTimeEnd, filterConditions, result, loadedDataInfoXml);
  }
  
  public void loadOeeDataOfNode(int handle, String nodeId, int timeUnit, java.util.Calendar dateTimeStart, java.util.Calendar dateTimeEnd, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder loadedDataInfoXml) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.loadOeeDataOfNode(handle, nodeId, timeUnit, dateTimeStart, dateTimeEnd, result, loadedDataInfoXml);
  }
  
  public void loadReportOfNode(int handle, String nodeId, int reportModule, int reportEvalStrat, int timeUnit, java.util.Calendar dateTimeStart, String reportName, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder reportStr) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.loadReportOfNode(handle, nodeId, reportModule, reportEvalStrat, timeUnit, dateTimeStart, reportName, result, reportStr);
  }
  
  public int reloadRawValues(int handle, int partNo, int groupNo, int charNo, boolean evaluate) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.reloadRawValues(handle, partNo, groupNo, charNo, evaluate);
  }
  
  public void productLicenceFree(int productKey, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.BooleanHolder licenceIsFree) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.productLicenceFree(productKey, result, licenceIsFree);
  }
  
  public void productLicenceFreeCount(int productKey, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder licenceCount, javax.xml.rpc.holders.IntHolder freeLicCount) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    iQdas_Web_Service.productLicenceFreeCount(productKey, result, licenceCount, freeLicCount);
  }
  
  public int occupyProductLicence(int productKey) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.occupyProductLicence(productKey);
  }
  
  public int releaseProductLicence(int productKey) throws java.rmi.RemoteException{
    if (iQdas_Web_Service == null)
      _initIQdas_Web_ServiceProxy();
    return iQdas_Web_Service.releaseProductLicence(productKey);
  }
  
  
}