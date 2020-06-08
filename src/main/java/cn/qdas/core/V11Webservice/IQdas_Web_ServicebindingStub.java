/**
 * IQdas_Web_ServicebindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package cn.qdas.core.V11Webservice;

public class IQdas_Web_ServicebindingStub extends org.apache.axis.client.Stub implements IQdas_Web_Service {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[149];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
        _initOperationDesc8();
        _initOperationDesc9();
        _initOperationDesc10();
        _initOperationDesc11();
        _initOperationDesc12();
        _initOperationDesc13();
        _initOperationDesc14();
        _initOperationDesc15();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDistribution");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "DistgroupNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "DistNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Input1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Input2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Input3"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Input4"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Input5"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Input6"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Input7"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Width"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Height"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Width2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Height2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "OutputFormat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicStr2"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SessionCount");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WebConnect");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ModuleID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "LanguageID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UserID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UserPwd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ClientAddress"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QuickWebConnect");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Handle"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("InterActiveWebConnect");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ClientAddress"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WebDisconnect");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ClientDisconnect");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OpenFile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "filename"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaveToFile");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Filename"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStatResult");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ResultKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Part_Nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Char_Nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bTransformation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"), org.apache.axis.types.UnsignedByte.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "StatResult_str"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "StatResult_dbl"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetStatResultEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ResultKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ResultSubKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Part_Nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Char_Nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Group_Nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "OutputType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "TransformationType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reserve1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reserve2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "StatResult_str1"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "StatResult_str2"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "StatResult_str3"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "StatResult_str4"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "StatResult_str5"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "OutputCount"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "StatResult_dbl1"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "StatResult_dbl2"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "StatResult_dbl3"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "StatResult_dbl4"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "StatResult_dbl5"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetSingleValueEx");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Part_Nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Char_Nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ResultKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ResultSubKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reserved1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "reserved2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "OutputType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Transformation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Sorted"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Value_sp_nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gc_n"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gc_r"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gc_k"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "gc_l"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result_str"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result_dbl"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"), double.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EvaluateAllChars");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("EvaluateChar");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Part_Nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Char_Nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SPCEvaluation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Reserve1"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Reserve2"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaveToDB");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaveChangesToDB");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetModule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Module"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetLanguage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Language"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetEvaluationStrategy");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Study"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "StratNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("QsstatVersion");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "VersionNr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetGlobalInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Part_Nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Char_Nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Op_Code"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ret"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetGraphicPages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicSubNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValueNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfValues_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValueNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfValues_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfColumns"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfRows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Width"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Height"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ConfigID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfPages"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "BlocksPerPage_X"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "BlocksPerPage_Y"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetGraphic");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Graphic_Nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Part_Nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Char_Nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Width"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Height"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetGraphic2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Graphic_Nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicSubNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Part_Nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Char_Nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Width"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Height"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GrafiktransferInfo"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetGraphicExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicSubNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValueNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfValues_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValueNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfValues_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Width"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Height"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfColumns"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfRows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ConfigID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "OutputFormat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetGraphicExt2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicSubNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValueNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfValues_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValueNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfValues_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNr_MarkStart"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNr_MarkStart"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNr_MarkStart"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValueNr_MarkStart"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNr_MarkEnd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNr_MarkEnd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNr_MarkEnd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValueNr_MarkEnd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfColumns"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfRows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Width"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Height"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ConfigID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PageBlockStart_X"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PageBlockStart_Y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "OutputFormat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfBlocksInPage_X"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfBlocksInPage_Y"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetGraphicExt3");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicSubNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValueNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfValues_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValueNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfValues_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle_Mark"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNr_MarkStart"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNr_MarkStart"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNr_MarkStart"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValueNr_MarkStart"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNr_MarkEnd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNr_MarkEnd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNr_MarkEnd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValueNr_MarkEnd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfColumns"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfRows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Width"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Height"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ConfigID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PageBlockStart_X"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PageBlockStart_Y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "OutputFormat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfBlocksInPage_X"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfBlocksInPage_Y"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetGraphicExt4");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicSubNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValueNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfValues_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValueNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfValues_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Width"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Height"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfColumns"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfRows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ConfigID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "OutputFormat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetGraphicAndInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicSubNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValueNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfValues_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValueNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfValues_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle_Mark"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNr_MarkStart"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNr_MarkStart"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNr_MarkStart"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValueNr_MarkStart"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNr_MarkEnd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNr_MarkEnd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNr_MarkEnd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValueNr_MarkEnd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfColumns"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfRows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Width"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Height"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ConfigID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PageBlockStart_X"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PageBlockStart_Y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "OutputFormat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ControlCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfBlocksInPage_X"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfBlocksInPage_Y"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GrafiktransferInfo"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDataPositionByCoordExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraficNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraficSubNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValueNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfValues_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValueNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfValues_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfColumns"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfRows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GetPositionOnly"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"), org.apache.axis.types.UnsignedByte.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Width"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Height"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ConfigID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "OutputFormat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "X"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Y"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ChildHandle"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNrOut_x"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNrOut_x"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNrOut_x"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValueNrOut_x"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNrOut_y"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNrOut_y"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNrOut_y"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValueNrOut_y"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDataPositionByCoordExt3");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraficNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraficSubNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValueNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfValues_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValueNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfValues_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfColumns"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfRows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GetPositionOnly"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"), org.apache.axis.types.UnsignedByte.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Width"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Height"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ConfigID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "OutputFormat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PageBlockStartX"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PageBlockStartY"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "X"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Y"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ChildHandle"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNrOut_x"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNrOut_x"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNrOut_x"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValueNrOut_x"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValueNrArt_out_x"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "AusgabepunktFeldArtOut"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "AusgabepunktFeldOut"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"), long.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "AusgabepunktOut"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "AusgabepunktSukeyOut"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNrOut_y"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNrOut_y"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNrOut_y"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValueNrOut_y"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfPageBlocksX"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfPageBlocksY"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "XmlInfoStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetGraphArray");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicSubNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValueNr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfValues_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValueNr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfValues_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfColumns"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfRows"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SingleImageWidth"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SingleImageHeight"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ConfigID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PageBlockStart_X"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PageBlockStart_Y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "OutputFormat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfBlocksInPage_X"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfBlocksInPage_Y"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicArrayXml"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAllInteractiveGraphics");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "OutputFormat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicArrayXml"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetReportExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PrintReport"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Part_Nr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Char_Nr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Value_Nr_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfValues_x"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Part_Nr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Char_Nr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Value_Nr_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfValues_y"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "page_nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Width"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Height"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Config_id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "OutputFormat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ReportStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetReportPages");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PrintReport"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NrOfPages"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetPartInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FieldNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Part_Nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Char_Nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "KFieldValue"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetCharInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FieldNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Part_Nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Char_Nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "KFieldValue"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetValueInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "KField"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Part_Nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Char_Nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Value_Nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "bTransformation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"), org.apache.axis.types.UnsignedByte.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Value"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetKey");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ValueNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SubKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Data"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharRange"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFirstChildNode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNo_Parent"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNo_Parent"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNo_Parent"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNo"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNo"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNo"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNextSiblingNode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNo_Current"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNo_Current"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNo_Current"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNo"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNo"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNo"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetQSStatText");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "TextGroup"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "TextKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "TextSubKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SingularPlural"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Text"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetProperty");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Prop_Key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Prop_Value"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFirstLanguage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "language_str"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "language_shortStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "language"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFirstLanguageExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QDasTool"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QDasID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Modul"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "language_str"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "language_shortStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "language"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNextLanguage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "language_str"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "language_shortStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "language"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFirstModule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Module"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ModuleName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNextModule");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Module"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ModuleName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFirstModuleExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QDasTool"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QDasID"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Module"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ModuleName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNextModuleExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QDASTool"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QDASId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Module"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ModuleName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFirstGraphic");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Module"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicNr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNextGraphic");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Module"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicNr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SkipGraphic");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Module"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Num"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicNr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetGraphicName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Module"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicNr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetGraphicNameExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicSubKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicAddKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicLongName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicShortName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFirstReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Report_Nr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Report_Name"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Report_Filename"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNextReport");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Report_Nr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Report_Name"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Report_Filename"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetReportName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Report_Nr"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Report_Name"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Report_Filename"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReportFileName2Name");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Report_FileName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Report_Name"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFirstEvaluationStrategy");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Modul"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Study"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "StratNr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "StratName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNextEvaluationStrategy");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Modul"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Study"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "StratNr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "StratName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetDefaultEvaluationStrategy");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Modul"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "StratNr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "StratName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFirstQueryName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNextQueryName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryName"), org.apache.axis.description.ParameterDesc.INOUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LoadQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryHandle"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LoadQueryExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryHandle"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Part_Char_List"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LoadQueryExt2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "DefaultOptions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "DefaultSort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryHandle"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Part_Char_List"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[66] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryHandle"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[67] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateQueryExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "DefaultOptions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "DefaultSort"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryHandle"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[68] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateQueryFromXML");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryXMLString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryHandle"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[69] = oper;

    }

    private static void _initOperationDesc8(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddFilterToQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FilterHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryLevel"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"), org.apache.axis.types.UnsignedByte.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Part_Key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Char_Key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[70] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddFilterToQueryExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FilterHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryLevel"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"), org.apache.axis.types.UnsignedByte.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Part_Key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Char_Key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ReplaceMode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"), org.apache.axis.types.UnsignedByte.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[71] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddUserGroupFilterToQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[72] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddSortToQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SortKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Direction"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"), org.apache.axis.types.UnsignedByte.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[73] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AddPartCharacteristicListToQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Part_Char_List"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[74] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetQueryProperty");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PropertyKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PropertyValue"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[75] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaveQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[76] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ExecuteQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Part_Char_List"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[77] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ExecuteQuery_Ext");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Part_Char_List"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ReadWrite"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "LoadValues"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[78] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFirstPartQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "KFieldList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "KResultList"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[79] = oper;

    }

    private static void _initOperationDesc9(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNextPartQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "KResultList"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[80] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SkipPartQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Num"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "KResultList"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[81] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFirstCharQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Part_Key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "KFieldList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "KResultList"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[82] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNextCharQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "KResultList"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[83] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SkipCharQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Num"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "KResultList"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[84] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFirstValueQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Part_Key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Char_Key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "KFieldList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "KResultList"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[85] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNextValueQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "KResultList"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[86] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SkipValueQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Num"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "KResultList"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[87] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FreeQuery");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[88] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFirstFilterName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FilterName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[89] = oper;

    }

    private static void _initOperationDesc10(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNextFilterName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FilterName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[90] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFirstFilterNameExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FilterLevel"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FilterIdent"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FilterName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[91] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNextFilterNameExt");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FilterLevel"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FilterIdent"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FilterName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[92] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LoadFilter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FilterName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FilterHandle"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[93] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LoadFilterByID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FilterIdent"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FilterName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FilterHandle"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[94] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateFilterFromFilters");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Operator"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"), org.apache.axis.types.UnsignedByte.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SourceFilters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FilterHandle"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[95] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateFilter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "k_r_key"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"), org.apache.axis.types.UnsignedByte.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ausgabepunkt"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Condition"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CompOp"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedByte"), org.apache.axis.types.UnsignedByte.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FilterHandle"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[96] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateFilterFromSQL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FilterString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FilterHandle"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[97] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaveFilter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FilterName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FilterHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[98] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FreeFilter");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FilterHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[99] = oper;

    }

    private static void _initOperationDesc11(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateDirectSQL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SQLHandle"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[100] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ExecuteDirectSQL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SQLHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SQLString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FieldList"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[101] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFirstDirectSQLRow");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SQLHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pdf"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ResultList"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[102] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNextDirectSQLRow");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SQLHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pdf"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ResultList"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[103] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FreeDirectSQL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SQLHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[104] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFirstCatalog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CatalogKey"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ColumnKeyList"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SubCatalogs"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CatalogName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[105] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNextCatalog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CatalogKey"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ColumnKeyList"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SubCatalogs"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CatalogName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[106] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFirstSubCatalog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CatalogKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SubCatalog"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SubCatalogName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[107] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNextSubCatalog");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CatalogKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SubCatalog"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SubCatalogName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[108] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFirstCatalogEntry");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CatalogKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SubCatalog"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ColKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "EntryKey"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "OutStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[109] = oper;

    }

    private static void _initOperationDesc12(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNextCatalogEntry");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ColKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "EntryKey"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "OutStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[110] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAnotherColumn");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ColKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "EntryKey"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "OutStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[111] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFirstCatalogEntryComplete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CatalogKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SubCatalog"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "EntryKey"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NumberStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NameStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "String3"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "String4"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "String5"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "String6"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "String7"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "String8"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[112] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNextCatalogEntryComplete");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "EntryKey"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NumberStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NameStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "String3"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "String4"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "String5"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "String6"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "String7"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "String8"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[113] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFirstCatalogEntryComplete_Ext");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CatalogKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SubCatalog"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "EntryKey"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NumberStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NameStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "String3"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "String4"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "String5"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "String6"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "String7"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "String8"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "String9"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "String10"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Comment"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "State"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"), org.apache.axis.types.UnsignedInt.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[114] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNextCatalogEntryComplete_Ext");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "EntryKey"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NumberStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NameStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "String3"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "String4"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "String5"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "String6"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "String7"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "String8"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "String9"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "String10"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Comment"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "State"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedInt"), org.apache.axis.types.UnsignedInt.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[115] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RecentSerNo_First");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SerialNo"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[116] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("RecentSerNo_Next");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "SerialNo"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[117] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFirstUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UserName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[118] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNextUser");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "UserName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[119] = oper;

    }

    private static void _initOperationDesc13(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetLTTree");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "LTTree_XMLStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[120] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetLTEnvironment");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "LTModule"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "LTStrategy"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "LTAufteilung"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[121] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoAction");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Fkt_group"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Fkt_nummer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Fkt_sub_nummer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Fkt_zus_nummer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Key_info_out"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[122] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DoAction_Ext");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Fkt_group"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Fkt_nummer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Fkt_sub_nummer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Fkt_zus_nummer"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Parameters"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Key_info_out"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[123] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetQMLasString");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ParameterXML"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QMLResult"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[124] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetGridInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GridKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GridSubKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ParamXml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GridInfoXml"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[125] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetGridInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GridKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GridSubKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ParamXml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GridInfoXml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[126] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetAlarmStatusforKField");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "KField"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "KFieldContent"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "AlarmState"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[127] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CreateReportingJob");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ReportingHandle"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[128] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FreeReportingJob");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ReportingHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[129] = oper;

    }

    private static void _initOperationDesc14(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFirstReportingJobName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "JobId"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "JobName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "JobState"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[130] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNextReportingJobName");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "JobId"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "JobName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "JobState"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[131] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LoadReportingJob");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "JobName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "JobHandle"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[132] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LoadReportingJobByID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "JobId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "JobName"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "JobHandle"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[133] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetReportingJobProperties");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "JobHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ReportingJobInfoXml"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[134] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetReportingJobProperties");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "JobHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PropertyKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ReportingJobInfoXml"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[135] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SaveReportingJob");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "JobName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "JobHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[136] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("SetReportingJobState");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "JobHandle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "JobState"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[137] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("DeleteReportingJobByID");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "JobId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[138] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetProcessManagerTree");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "TreeType"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "StartNodeGuid"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "MaxNodeLevel"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "TreeAsJson"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[139] = oper;

    }

    private static void _initOperationDesc15(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetNodeBenchmark");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicSubKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "BenchmModule"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "BenchmEvalStrat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NodeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "DivBySubNodes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "TimeUnit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "DateTimeStart"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "DateTimeEnd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartSumField"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Width"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Height"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "OutputFormat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GraphicStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GrafiktransferInfo"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[140] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LoadDataOfNode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NodeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "LoadProcessChars"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "QueryOptions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "DateTimeStart"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "DateTimeEnd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FilterConditions"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "LoadedDataInfoXml"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[141] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LoadOeeDataOfNode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NodeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "TimeUnit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "DateTimeStart"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "DateTimeEnd"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "LoadedDataInfoXml"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[142] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LoadReportOfNode");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "NodeId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ReportModule"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ReportEvalStrat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "TimeUnit"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "DateTimeStart"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"), java.util.Calendar.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ReportName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ReportStr"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[143] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReloadRawValues");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Handle"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "PartNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "GroupNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "CharNo"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Evaluate"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[144] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProductLicenceFree");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ProductKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "LicenceIsFree"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[145] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ProductLicenceFreeCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ProductKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "Result"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "LicenceCount"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "FreeLicCount"), org.apache.axis.description.ParameterDesc.OUT, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[146] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("OccupyProductLicence");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ProductKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[147] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ReleaseProductLicence");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ProductKey"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[148] = oper;

    }

    public IQdas_Web_ServicebindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public IQdas_Web_ServicebindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public IQdas_Web_ServicebindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                String key = (String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            return _call;
        }
        catch (Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public void getDistribution(int handle, int distgroupNr, int distNr, String input1, String input2, String input3, String input4, String input5, String input6, String input7, int width, int height, int width2, int height2, int outputFormat, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder graphicStr, javax.xml.rpc.holders.StringHolder graphicStr2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetDistribution");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetDistribution"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(distgroupNr), new Integer(distNr), input1, input2, input3, input4, input5, input6, input7, new Integer(width), new Integer(height), new Integer(width2), new Integer(height2), new Integer(outputFormat)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                graphicStr.value = (String) _output.get(new javax.xml.namespace.QName("", "GraphicStr"));
            } catch (Exception _exception) {
                graphicStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GraphicStr")), String.class);
            }
            try {
                graphicStr2.value = (String) _output.get(new javax.xml.namespace.QName("", "GraphicStr2"));
            } catch (Exception _exception) {
                graphicStr2.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GraphicStr2")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int sessionCount() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#SessionCount");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "SessionCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void webConnect(int moduleID, int languageID, String userID, String userPwd, String clientAddress, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder handle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#WebConnect");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "WebConnect"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(moduleID), new Integer(languageID), userID, userPwd, clientAddress});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                handle.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Handle"))).intValue();
            } catch (Exception _exception) {
                handle.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Handle")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int quickWebConnect() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#QuickWebConnect");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "QuickWebConnect"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void interActiveWebConnect(String clientAddress, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder handle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#InterActiveWebConnect");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "InterActiveWebConnect"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {clientAddress});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                handle.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Handle"))).intValue();
            } catch (Exception _exception) {
                handle.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Handle")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int webDisconnect(int handle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#WebDisconnect");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "WebDisconnect"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int clientDisconnect(int handle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#ClientDisconnect");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "ClientDisconnect"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int openFile(int handle, String filename) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#OpenFile");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "OpenFile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), filename});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int saveToFile(int handle, String filename) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#SaveToFile");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "SaveToFile"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), filename});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getStatResult(int handle, int resultKey, int part_Nr, int char_Nr, org.apache.axis.types.UnsignedByte bTransformation, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder statResult_str, javax.xml.rpc.holders.DoubleHolder statResult_dbl) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetStatResult");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetStatResult"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(resultKey), new Integer(part_Nr), new Integer(char_Nr), bTransformation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                statResult_str.value = (String) _output.get(new javax.xml.namespace.QName("", "StatResult_str"));
            } catch (Exception _exception) {
                statResult_str.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "StatResult_str")), String.class);
            }
            try {
                statResult_dbl.value = ((Double) _output.get(new javax.xml.namespace.QName("", "StatResult_dbl"))).doubleValue();
            } catch (Exception _exception) {
                statResult_dbl.value = ((Double) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "StatResult_dbl")), double.class)).doubleValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getStatResultEx(int handle, int resultKey, int resultSubKey, int part_Nr, int char_Nr, int group_Nr, int outputType, int transformationType, int reserve1, int reserve2, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder statResult_str1, javax.xml.rpc.holders.StringHolder statResult_str2, javax.xml.rpc.holders.StringHolder statResult_str3, javax.xml.rpc.holders.StringHolder statResult_str4, javax.xml.rpc.holders.StringHolder statResult_str5, javax.xml.rpc.holders.IntHolder outputCount, javax.xml.rpc.holders.DoubleHolder statResult_dbl1, javax.xml.rpc.holders.DoubleHolder statResult_dbl2, javax.xml.rpc.holders.DoubleHolder statResult_dbl3, javax.xml.rpc.holders.DoubleHolder statResult_dbl4, javax.xml.rpc.holders.DoubleHolder statResult_dbl5) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetStatResultEx");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetStatResultEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(resultKey), new Integer(resultSubKey), new Integer(part_Nr), new Integer(char_Nr), new Integer(group_Nr), new Integer(outputType), new Integer(transformationType), new Integer(reserve1), new Integer(reserve2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                statResult_str1.value = (String) _output.get(new javax.xml.namespace.QName("", "StatResult_str1"));
            } catch (Exception _exception) {
                statResult_str1.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "StatResult_str1")), String.class);
            }
            try {
                statResult_str2.value = (String) _output.get(new javax.xml.namespace.QName("", "StatResult_str2"));
            } catch (Exception _exception) {
                statResult_str2.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "StatResult_str2")), String.class);
            }
            try {
                statResult_str3.value = (String) _output.get(new javax.xml.namespace.QName("", "StatResult_str3"));
            } catch (Exception _exception) {
                statResult_str3.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "StatResult_str3")), String.class);
            }
            try {
                statResult_str4.value = (String) _output.get(new javax.xml.namespace.QName("", "StatResult_str4"));
            } catch (Exception _exception) {
                statResult_str4.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "StatResult_str4")), String.class);
            }
            try {
                statResult_str5.value = (String) _output.get(new javax.xml.namespace.QName("", "StatResult_str5"));
            } catch (Exception _exception) {
                statResult_str5.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "StatResult_str5")), String.class);
            }
            try {
                outputCount.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "OutputCount"))).intValue();
            } catch (Exception _exception) {
                outputCount.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "OutputCount")), int.class)).intValue();
            }
            try {
                statResult_dbl1.value = ((Double) _output.get(new javax.xml.namespace.QName("", "StatResult_dbl1"))).doubleValue();
            } catch (Exception _exception) {
                statResult_dbl1.value = ((Double) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "StatResult_dbl1")), double.class)).doubleValue();
            }
            try {
                statResult_dbl2.value = ((Double) _output.get(new javax.xml.namespace.QName("", "StatResult_dbl2"))).doubleValue();
            } catch (Exception _exception) {
                statResult_dbl2.value = ((Double) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "StatResult_dbl2")), double.class)).doubleValue();
            }
            try {
                statResult_dbl3.value = ((Double) _output.get(new javax.xml.namespace.QName("", "StatResult_dbl3"))).doubleValue();
            } catch (Exception _exception) {
                statResult_dbl3.value = ((Double) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "StatResult_dbl3")), double.class)).doubleValue();
            }
            try {
                statResult_dbl4.value = ((Double) _output.get(new javax.xml.namespace.QName("", "StatResult_dbl4"))).doubleValue();
            } catch (Exception _exception) {
                statResult_dbl4.value = ((Double) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "StatResult_dbl4")), double.class)).doubleValue();
            }
            try {
                statResult_dbl5.value = ((Double) _output.get(new javax.xml.namespace.QName("", "StatResult_dbl5"))).doubleValue();
            } catch (Exception _exception) {
                statResult_dbl5.value = ((Double) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "StatResult_dbl5")), double.class)).doubleValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getSingleValueEx(int handle, int part_Nr, int char_Nr, int resultKey, int resultSubKey, int reserved1, int reserved2, int outputType, boolean transformation, boolean sorted, int value_sp_nr, int gc_n, int gc_r, int gc_k, int gc_l, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder result_str, javax.xml.rpc.holders.DoubleHolder result_dbl) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetSingleValueEx");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetSingleValueEx"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(part_Nr), new Integer(char_Nr), new Integer(resultKey), new Integer(resultSubKey), new Integer(reserved1), new Integer(reserved2), new Integer(outputType), new Boolean(transformation), new Boolean(sorted), new Integer(value_sp_nr), new Integer(gc_n), new Integer(gc_r), new Integer(gc_k), new Integer(gc_l)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                result_str.value = (String) _output.get(new javax.xml.namespace.QName("", "Result_str"));
            } catch (Exception _exception) {
                result_str.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result_str")), String.class);
            }
            try {
                result_dbl.value = ((Double) _output.get(new javax.xml.namespace.QName("", "Result_dbl"))).doubleValue();
            } catch (Exception _exception) {
                result_dbl.value = ((Double) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result_dbl")), double.class)).doubleValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int evaluateAllChars(int handle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#EvaluateAllChars");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "EvaluateAllChars"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int evaluateChar(int handle, int part_Nr, int char_Nr, boolean SPCEvaluation, int reserve1, int reserve2) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#EvaluateChar");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "EvaluateChar"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(part_Nr), new Integer(char_Nr), new Boolean(SPCEvaluation), new Integer(reserve1), new Integer(reserve2)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int saveToDB(int handle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#SaveToDB");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "SaveToDB"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int saveChangesToDB(int handle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#SaveChangesToDB");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "SaveChangesToDB"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int setModule(int handle, int module) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#SetModule");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "SetModule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(module)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int setLanguage(int handle, int language) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#SetLanguage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "SetLanguage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(language)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int setEvaluationStrategy(int handle, int study, int stratNr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#SetEvaluationStrategy");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "SetEvaluationStrategy"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(study), new Integer(stratNr)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void qsstatVersion(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder versionNr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#QsstatVersion");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "QsstatVersion"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                versionNr.value = (String) _output.get(new javax.xml.namespace.QName("", "VersionNr"));
            } catch (Exception _exception) {
                versionNr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "VersionNr")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getGlobalInfo(int handle, int part_Nr, int char_Nr, int op_Code, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder ret) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetGlobalInfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetGlobalInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(part_Nr), new Integer(char_Nr), new Integer(op_Code)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                ret.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "ret"))).intValue();
            } catch (Exception _exception) {
                ret.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ret")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getGraphicPages(int handle, int graphicNr, int graphicSubNr, int partNr_x, int groupNr_x, int charNr_x, int valueNr_x, int nrOfValues_x, int partNr_y, int groupNr_y, int charNr_y, int valueNr_y, int nrOfValues_y, int nrOfColumns, int nrOfRows, int width, int height, int configID, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder nrOfPages, javax.xml.rpc.holders.IntHolder blocksPerPage_X, javax.xml.rpc.holders.IntHolder blocksPerPage_Y) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetGraphicPages");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetGraphicPages"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(graphicNr), new Integer(graphicSubNr), new Integer(partNr_x), new Integer(groupNr_x), new Integer(charNr_x), new Integer(valueNr_x), new Integer(nrOfValues_x), new Integer(partNr_y), new Integer(groupNr_y), new Integer(charNr_y), new Integer(valueNr_y), new Integer(nrOfValues_y), new Integer(nrOfColumns), new Integer(nrOfRows), new Integer(width), new Integer(height), new Integer(configID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                nrOfPages.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "NrOfPages"))).intValue();
            } catch (Exception _exception) {
                nrOfPages.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "NrOfPages")), int.class)).intValue();
            }
            try {
                blocksPerPage_X.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "BlocksPerPage_X"))).intValue();
            } catch (Exception _exception) {
                blocksPerPage_X.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "BlocksPerPage_X")), int.class)).intValue();
            }
            try {
                blocksPerPage_Y.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "BlocksPerPage_Y"))).intValue();
            } catch (Exception _exception) {
                blocksPerPage_Y.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "BlocksPerPage_Y")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getGraphic(int handle, int graphic_Nr, int part_Nr, int char_Nr, int width, int height, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder graphicStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetGraphic");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetGraphic"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(graphic_Nr), new Integer(part_Nr), new Integer(char_Nr), new Integer(width), new Integer(height)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                graphicStr.value = (String) _output.get(new javax.xml.namespace.QName("", "GraphicStr"));
            } catch (Exception _exception) {
                graphicStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GraphicStr")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getGraphic2(int handle, int graphic_Nr, int graphicSubNr, int part_Nr, int char_Nr, int width, int height, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder graphicStr, javax.xml.rpc.holders.StringHolder grafiktransferInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetGraphic2");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetGraphic2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(graphic_Nr), new Integer(graphicSubNr), new Integer(part_Nr), new Integer(char_Nr), new Integer(width), new Integer(height)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                graphicStr.value = (String) _output.get(new javax.xml.namespace.QName("", "GraphicStr"));
            } catch (Exception _exception) {
                graphicStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GraphicStr")), String.class);
            }
            try {
                grafiktransferInfo.value = (String) _output.get(new javax.xml.namespace.QName("", "GrafiktransferInfo"));
            } catch (Exception _exception) {
                grafiktransferInfo.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GrafiktransferInfo")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getGraphicExt(int handle, int graphicNr, int graphicSubNr, int partNr_x, int charNr_x, int valueNr_x, int nrOfValues_x, int groupNr_x, int partNr_y, int charNr_y, int valueNr_y, int nrOfValues_y, int groupNr_y, int width, int height, int nrOfColumns, int nrOfRows, int configID, int outputFormat, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder graphicStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetGraphicExt");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetGraphicExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(graphicNr), new Integer(graphicSubNr), new Integer(partNr_x), new Integer(charNr_x), new Integer(valueNr_x), new Integer(nrOfValues_x), new Integer(groupNr_x), new Integer(partNr_y), new Integer(charNr_y), new Integer(valueNr_y), new Integer(nrOfValues_y), new Integer(groupNr_y), new Integer(width), new Integer(height), new Integer(nrOfColumns), new Integer(nrOfRows), new Integer(configID), new Integer(outputFormat)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                graphicStr.value = (String) _output.get(new javax.xml.namespace.QName("", "GraphicStr"));
            } catch (Exception _exception) {
                graphicStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GraphicStr")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getGraphicExt2(int handle, int graphicNr, int graphicSubNr, int partNr_x, int groupNr_x, int charNr_x, int valueNr_x, int nrOfValues_x, int partNr_y, int groupNr_y, int charNr_y, int valueNr_y, int nrOfValues_y, int partNr_MarkStart, int groupNr_MarkStart, int charNr_MarkStart, int valueNr_MarkStart, int partNr_MarkEnd, int groupNr_MarkEnd, int charNr_MarkEnd, int valueNr_MarkEnd, int nrOfColumns, int nrOfRows, int width, int height, int configID, int pageBlockStart_X, int pageBlockStart_Y, int outputFormat, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder nrOfBlocksInPage_X, javax.xml.rpc.holders.IntHolder nrOfBlocksInPage_Y, javax.xml.rpc.holders.StringHolder graphicStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetGraphicExt2");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetGraphicExt2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(graphicNr), new Integer(graphicSubNr), new Integer(partNr_x), new Integer(groupNr_x), new Integer(charNr_x), new Integer(valueNr_x), new Integer(nrOfValues_x), new Integer(partNr_y), new Integer(groupNr_y), new Integer(charNr_y), new Integer(valueNr_y), new Integer(nrOfValues_y), new Integer(partNr_MarkStart), new Integer(groupNr_MarkStart), new Integer(charNr_MarkStart), new Integer(valueNr_MarkStart), new Integer(partNr_MarkEnd), new Integer(groupNr_MarkEnd), new Integer(charNr_MarkEnd), new Integer(valueNr_MarkEnd), new Integer(nrOfColumns), new Integer(nrOfRows), new Integer(width), new Integer(height), new Integer(configID), new Integer(pageBlockStart_X), new Integer(pageBlockStart_Y), new Integer(outputFormat)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                nrOfBlocksInPage_X.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "NrOfBlocksInPage_X"))).intValue();
            } catch (Exception _exception) {
                nrOfBlocksInPage_X.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "NrOfBlocksInPage_X")), int.class)).intValue();
            }
            try {
                nrOfBlocksInPage_Y.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "NrOfBlocksInPage_Y"))).intValue();
            } catch (Exception _exception) {
                nrOfBlocksInPage_Y.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "NrOfBlocksInPage_Y")), int.class)).intValue();
            }
            try {
                graphicStr.value = (String) _output.get(new javax.xml.namespace.QName("", "GraphicStr"));
            } catch (Exception _exception) {
                graphicStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GraphicStr")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getGraphicExt3(int handle, int graphicNr, int graphicSubNr, String partNr_x, String groupNr_x, String charNr_x, String valueNr_x, String nrOfValues_x, String partNr_y, String groupNr_y, String charNr_y, String valueNr_y, String nrOfValues_y, int handle_Mark, int partNr_MarkStart, int groupNr_MarkStart, int charNr_MarkStart, int valueNr_MarkStart, int partNr_MarkEnd, int groupNr_MarkEnd, int charNr_MarkEnd, int valueNr_MarkEnd, int nrOfColumns, int nrOfRows, int width, int height, int configID, int pageBlockStart_X, int pageBlockStart_Y, int outputFormat, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder nrOfBlocksInPage_X, javax.xml.rpc.holders.IntHolder nrOfBlocksInPage_Y, javax.xml.rpc.holders.StringHolder graphicStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetGraphicExt3");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetGraphicExt3"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(graphicNr), new Integer(graphicSubNr), partNr_x, groupNr_x, charNr_x, valueNr_x, nrOfValues_x, partNr_y, groupNr_y, charNr_y, valueNr_y, nrOfValues_y, new Integer(handle_Mark), new Integer(partNr_MarkStart), new Integer(groupNr_MarkStart), new Integer(charNr_MarkStart), new Integer(valueNr_MarkStart), new Integer(partNr_MarkEnd), new Integer(groupNr_MarkEnd), new Integer(charNr_MarkEnd), new Integer(valueNr_MarkEnd), new Integer(nrOfColumns), new Integer(nrOfRows), new Integer(width), new Integer(height), new Integer(configID), new Integer(pageBlockStart_X), new Integer(pageBlockStart_Y), new Integer(outputFormat)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                nrOfBlocksInPage_X.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "NrOfBlocksInPage_X"))).intValue();
            } catch (Exception _exception) {
                nrOfBlocksInPage_X.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "NrOfBlocksInPage_X")), int.class)).intValue();
            }
            try {
                nrOfBlocksInPage_Y.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "NrOfBlocksInPage_Y"))).intValue();
            } catch (Exception _exception) {
                nrOfBlocksInPage_Y.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "NrOfBlocksInPage_Y")), int.class)).intValue();
            }
            try {
                graphicStr.value = (String) _output.get(new javax.xml.namespace.QName("", "GraphicStr"));
            } catch (Exception _exception) {
                graphicStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GraphicStr")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getGraphicExt4(int handle, int graphicNr, int graphicSubNr, int partNr_x, int charNr_x, int valueNr_x, int nrOfValues_x, int groupNr_x, int partNr_y, int charNr_y, int valueNr_y, int nrOfValues_y, int groupNr_y, int width, int height, int nrOfColumns, int nrOfRows, int configID, int outputFormat, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder graphicStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetGraphicExt4");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetGraphicExt4"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(graphicNr), new Integer(graphicSubNr), new Integer(partNr_x), new Integer(charNr_x), new Integer(valueNr_x), new Integer(nrOfValues_x), new Integer(groupNr_x), new Integer(partNr_y), new Integer(charNr_y), new Integer(valueNr_y), new Integer(nrOfValues_y), new Integer(groupNr_y), new Integer(width), new Integer(height), new Integer(nrOfColumns), new Integer(nrOfRows), new Integer(configID), new Integer(outputFormat)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                graphicStr.value = (String) _output.get(new javax.xml.namespace.QName("", "GraphicStr"));
            } catch (Exception _exception) {
                graphicStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GraphicStr")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getGraphicAndInfo(int handle, int graphicNr, int graphicSubNr, String partNr_x, String groupNr_x, String charNr_x, String valueNr_x, String nrOfValues_x, String partNr_y, String groupNr_y, String charNr_y, String valueNr_y, String nrOfValues_y, int handle_Mark, int partNr_MarkStart, int groupNr_MarkStart, int charNr_MarkStart, int valueNr_MarkStart, int partNr_MarkEnd, int groupNr_MarkEnd, int charNr_MarkEnd, int valueNr_MarkEnd, int nrOfColumns, int nrOfRows, int width, int height, int configID, int pageBlockStart_X, int pageBlockStart_Y, int outputFormat, int controlCode, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder nrOfBlocksInPage_X, javax.xml.rpc.holders.IntHolder nrOfBlocksInPage_Y, javax.xml.rpc.holders.StringHolder graphicStr, javax.xml.rpc.holders.StringHolder grafiktransferInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetGraphicAndInfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetGraphicAndInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(graphicNr), new Integer(graphicSubNr), partNr_x, groupNr_x, charNr_x, valueNr_x, nrOfValues_x, partNr_y, groupNr_y, charNr_y, valueNr_y, nrOfValues_y, new Integer(handle_Mark), new Integer(partNr_MarkStart), new Integer(groupNr_MarkStart), new Integer(charNr_MarkStart), new Integer(valueNr_MarkStart), new Integer(partNr_MarkEnd), new Integer(groupNr_MarkEnd), new Integer(charNr_MarkEnd), new Integer(valueNr_MarkEnd), new Integer(nrOfColumns), new Integer(nrOfRows), new Integer(width), new Integer(height), new Integer(configID), new Integer(pageBlockStart_X), new Integer(pageBlockStart_Y), new Integer(outputFormat), new Integer(controlCode)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                nrOfBlocksInPage_X.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "NrOfBlocksInPage_X"))).intValue();
            } catch (Exception _exception) {
                nrOfBlocksInPage_X.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "NrOfBlocksInPage_X")), int.class)).intValue();
            }
            try {
                nrOfBlocksInPage_Y.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "NrOfBlocksInPage_Y"))).intValue();
            } catch (Exception _exception) {
                nrOfBlocksInPage_Y.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "NrOfBlocksInPage_Y")), int.class)).intValue();
            }
            try {
                graphicStr.value = (String) _output.get(new javax.xml.namespace.QName("", "GraphicStr"));
            } catch (Exception _exception) {
                graphicStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GraphicStr")), String.class);
            }
            try {
                grafiktransferInfo.value = (String) _output.get(new javax.xml.namespace.QName("", "GrafiktransferInfo"));
            } catch (Exception _exception) {
                grafiktransferInfo.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GrafiktransferInfo")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getDataPositionByCoordExt(int handle, int graficNr, int graficSubNr, int partNr_x, int charNr_x, int valueNr_x, int nrOfValues_x, int groupNr_x, int partNr_y, int charNr_y, int valueNr_y, int nrOfValues_y, int groupNr_y, int nrOfColumns, int nrOfRows, org.apache.axis.types.UnsignedByte getPositionOnly, int width, int height, int configID, int outputFormat, javax.xml.rpc.holders.IntHolder x, javax.xml.rpc.holders.IntHolder y, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder childHandle, javax.xml.rpc.holders.IntHolder partNrOut_x, javax.xml.rpc.holders.IntHolder groupNrOut_x, javax.xml.rpc.holders.IntHolder charNrOut_x, javax.xml.rpc.holders.IntHolder valueNrOut_x, javax.xml.rpc.holders.IntHolder partNrOut_y, javax.xml.rpc.holders.IntHolder groupNrOut_y, javax.xml.rpc.holders.IntHolder charNrOut_y, javax.xml.rpc.holders.IntHolder valueNrOut_y, javax.xml.rpc.holders.StringHolder graphicStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetDataPositionByCoordExt");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetDataPositionByCoordExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(graficNr), new Integer(graficSubNr), new Integer(partNr_x), new Integer(charNr_x), new Integer(valueNr_x), new Integer(nrOfValues_x), new Integer(groupNr_x), new Integer(partNr_y), new Integer(charNr_y), new Integer(valueNr_y), new Integer(nrOfValues_y), new Integer(groupNr_y), new Integer(nrOfColumns), new Integer(nrOfRows), getPositionOnly, new Integer(width), new Integer(height), new Integer(configID), new Integer(outputFormat), new Integer(x.value), new Integer(y.value)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                x.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "X"))).intValue();
            } catch (Exception _exception) {
                x.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "X")), int.class)).intValue();
            }
            try {
                y.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Y"))).intValue();
            } catch (Exception _exception) {
                y.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Y")), int.class)).intValue();
            }
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                childHandle.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "ChildHandle"))).intValue();
            } catch (Exception _exception) {
                childHandle.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ChildHandle")), int.class)).intValue();
            }
            try {
                partNrOut_x.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "PartNrOut_x"))).intValue();
            } catch (Exception _exception) {
                partNrOut_x.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "PartNrOut_x")), int.class)).intValue();
            }
            try {
                groupNrOut_x.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "GroupNrOut_x"))).intValue();
            } catch (Exception _exception) {
                groupNrOut_x.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GroupNrOut_x")), int.class)).intValue();
            }
            try {
                charNrOut_x.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "CharNrOut_x"))).intValue();
            } catch (Exception _exception) {
                charNrOut_x.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "CharNrOut_x")), int.class)).intValue();
            }
            try {
                valueNrOut_x.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "ValueNrOut_x"))).intValue();
            } catch (Exception _exception) {
                valueNrOut_x.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ValueNrOut_x")), int.class)).intValue();
            }
            try {
                partNrOut_y.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "PartNrOut_y"))).intValue();
            } catch (Exception _exception) {
                partNrOut_y.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "PartNrOut_y")), int.class)).intValue();
            }
            try {
                groupNrOut_y.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "GroupNrOut_y"))).intValue();
            } catch (Exception _exception) {
                groupNrOut_y.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GroupNrOut_y")), int.class)).intValue();
            }
            try {
                charNrOut_y.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "CharNrOut_y"))).intValue();
            } catch (Exception _exception) {
                charNrOut_y.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "CharNrOut_y")), int.class)).intValue();
            }
            try {
                valueNrOut_y.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "ValueNrOut_y"))).intValue();
            } catch (Exception _exception) {
                valueNrOut_y.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ValueNrOut_y")), int.class)).intValue();
            }
            try {
                graphicStr.value = (String) _output.get(new javax.xml.namespace.QName("", "GraphicStr"));
            } catch (Exception _exception) {
                graphicStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GraphicStr")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getDataPositionByCoordExt3(int handle, int graficNr, int graficSubNr, int partNr_x, int charNr_x, int valueNr_x, int nrOfValues_x, int groupNr_x, int partNr_y, int charNr_y, int valueNr_y, int nrOfValues_y, int groupNr_y, int nrOfColumns, int nrOfRows, org.apache.axis.types.UnsignedByte getPositionOnly, int width, int height, int configID, int outputFormat, int pageBlockStartX, int pageBlockStartY, javax.xml.rpc.holders.IntHolder x, javax.xml.rpc.holders.IntHolder y, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder childHandle, javax.xml.rpc.holders.IntHolder partNrOut_x, javax.xml.rpc.holders.IntHolder groupNrOut_x, javax.xml.rpc.holders.IntHolder charNrOut_x, javax.xml.rpc.holders.IntHolder valueNrOut_x, javax.xml.rpc.holders.IntHolder valueNrArt_out_x, javax.xml.rpc.holders.IntHolder ausgabepunktFeldArtOut, javax.xml.rpc.holders.LongHolder ausgabepunktFeldOut, javax.xml.rpc.holders.IntHolder ausgabepunktOut, javax.xml.rpc.holders.IntHolder ausgabepunktSukeyOut, javax.xml.rpc.holders.IntHolder partNrOut_y, javax.xml.rpc.holders.IntHolder groupNrOut_y, javax.xml.rpc.holders.IntHolder charNrOut_y, javax.xml.rpc.holders.IntHolder valueNrOut_y, javax.xml.rpc.holders.IntHolder nrOfPageBlocksX, javax.xml.rpc.holders.IntHolder nrOfPageBlocksY, javax.xml.rpc.holders.StringHolder xmlInfoStr, javax.xml.rpc.holders.StringHolder graphicStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetDataPositionByCoordExt3");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetDataPositionByCoordExt3"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(graficNr), new Integer(graficSubNr), new Integer(partNr_x), new Integer(charNr_x), new Integer(valueNr_x), new Integer(nrOfValues_x), new Integer(groupNr_x), new Integer(partNr_y), new Integer(charNr_y), new Integer(valueNr_y), new Integer(nrOfValues_y), new Integer(groupNr_y), new Integer(nrOfColumns), new Integer(nrOfRows), getPositionOnly, new Integer(width), new Integer(height), new Integer(configID), new Integer(outputFormat), new Integer(pageBlockStartX), new Integer(pageBlockStartY), new Integer(x.value), new Integer(y.value)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                x.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "X"))).intValue();
            } catch (Exception _exception) {
                x.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "X")), int.class)).intValue();
            }
            try {
                y.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Y"))).intValue();
            } catch (Exception _exception) {
                y.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Y")), int.class)).intValue();
            }
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                childHandle.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "ChildHandle"))).intValue();
            } catch (Exception _exception) {
                childHandle.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ChildHandle")), int.class)).intValue();
            }
            try {
                partNrOut_x.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "PartNrOut_x"))).intValue();
            } catch (Exception _exception) {
                partNrOut_x.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "PartNrOut_x")), int.class)).intValue();
            }
            try {
                groupNrOut_x.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "GroupNrOut_x"))).intValue();
            } catch (Exception _exception) {
                groupNrOut_x.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GroupNrOut_x")), int.class)).intValue();
            }
            try {
                charNrOut_x.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "CharNrOut_x"))).intValue();
            } catch (Exception _exception) {
                charNrOut_x.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "CharNrOut_x")), int.class)).intValue();
            }
            try {
                valueNrOut_x.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "ValueNrOut_x"))).intValue();
            } catch (Exception _exception) {
                valueNrOut_x.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ValueNrOut_x")), int.class)).intValue();
            }
            try {
                valueNrArt_out_x.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "ValueNrArt_out_x"))).intValue();
            } catch (Exception _exception) {
                valueNrArt_out_x.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ValueNrArt_out_x")), int.class)).intValue();
            }
            try {
                ausgabepunktFeldArtOut.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "AusgabepunktFeldArtOut"))).intValue();
            } catch (Exception _exception) {
                ausgabepunktFeldArtOut.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "AusgabepunktFeldArtOut")), int.class)).intValue();
            }
            try {
                ausgabepunktFeldOut.value = ((Long) _output.get(new javax.xml.namespace.QName("", "AusgabepunktFeldOut"))).longValue();
            } catch (Exception _exception) {
                ausgabepunktFeldOut.value = ((Long) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "AusgabepunktFeldOut")), long.class)).longValue();
            }
            try {
                ausgabepunktOut.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "AusgabepunktOut"))).intValue();
            } catch (Exception _exception) {
                ausgabepunktOut.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "AusgabepunktOut")), int.class)).intValue();
            }
            try {
                ausgabepunktSukeyOut.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "AusgabepunktSukeyOut"))).intValue();
            } catch (Exception _exception) {
                ausgabepunktSukeyOut.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "AusgabepunktSukeyOut")), int.class)).intValue();
            }
            try {
                partNrOut_y.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "PartNrOut_y"))).intValue();
            } catch (Exception _exception) {
                partNrOut_y.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "PartNrOut_y")), int.class)).intValue();
            }
            try {
                groupNrOut_y.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "GroupNrOut_y"))).intValue();
            } catch (Exception _exception) {
                groupNrOut_y.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GroupNrOut_y")), int.class)).intValue();
            }
            try {
                charNrOut_y.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "CharNrOut_y"))).intValue();
            } catch (Exception _exception) {
                charNrOut_y.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "CharNrOut_y")), int.class)).intValue();
            }
            try {
                valueNrOut_y.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "ValueNrOut_y"))).intValue();
            } catch (Exception _exception) {
                valueNrOut_y.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ValueNrOut_y")), int.class)).intValue();
            }
            try {
                nrOfPageBlocksX.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "NrOfPageBlocksX"))).intValue();
            } catch (Exception _exception) {
                nrOfPageBlocksX.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "NrOfPageBlocksX")), int.class)).intValue();
            }
            try {
                nrOfPageBlocksY.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "NrOfPageBlocksY"))).intValue();
            } catch (Exception _exception) {
                nrOfPageBlocksY.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "NrOfPageBlocksY")), int.class)).intValue();
            }
            try {
                xmlInfoStr.value = (String) _output.get(new javax.xml.namespace.QName("", "XmlInfoStr"));
            } catch (Exception _exception) {
                xmlInfoStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "XmlInfoStr")), String.class);
            }
            try {
                graphicStr.value = (String) _output.get(new javax.xml.namespace.QName("", "GraphicStr"));
            } catch (Exception _exception) {
                graphicStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GraphicStr")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getGraphArray(int handle, int graphicNr, int graphicSubNr, String partNr_x, String groupNr_x, String charNr_x, String valueNr_x, String nrOfValues_x, String partNr_y, String groupNr_y, String charNr_y, String valueNr_y, String nrOfValues_y, int nrOfColumns, int nrOfRows, int singleImageWidth, int singleImageHeight, int configID, int pageBlockStart_X, int pageBlockStart_Y, int outputFormat, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder nrOfBlocksInPage_X, javax.xml.rpc.holders.IntHolder nrOfBlocksInPage_Y, javax.xml.rpc.holders.StringHolder graphicArrayXml) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetGraphArray");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetGraphArray"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(graphicNr), new Integer(graphicSubNr), partNr_x, groupNr_x, charNr_x, valueNr_x, nrOfValues_x, partNr_y, groupNr_y, charNr_y, valueNr_y, nrOfValues_y, new Integer(nrOfColumns), new Integer(nrOfRows), new Integer(singleImageWidth), new Integer(singleImageHeight), new Integer(configID), new Integer(pageBlockStart_X), new Integer(pageBlockStart_Y), new Integer(outputFormat)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                nrOfBlocksInPage_X.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "NrOfBlocksInPage_X"))).intValue();
            } catch (Exception _exception) {
                nrOfBlocksInPage_X.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "NrOfBlocksInPage_X")), int.class)).intValue();
            }
            try {
                nrOfBlocksInPage_Y.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "NrOfBlocksInPage_Y"))).intValue();
            } catch (Exception _exception) {
                nrOfBlocksInPage_Y.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "NrOfBlocksInPage_Y")), int.class)).intValue();
            }
            try {
                graphicArrayXml.value = (String) _output.get(new javax.xml.namespace.QName("", "GraphicArrayXml"));
            } catch (Exception _exception) {
                graphicArrayXml.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GraphicArrayXml")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getAllInteractiveGraphics(int handle, int outputFormat, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder graphicArrayXml) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetAllInteractiveGraphics");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetAllInteractiveGraphics"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(outputFormat)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                graphicArrayXml.value = (String) _output.get(new javax.xml.namespace.QName("", "GraphicArrayXml"));
            } catch (Exception _exception) {
                graphicArrayXml.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GraphicArrayXml")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getReportExt(int handle, String printReport, int part_Nr_x, int char_Nr_x, int value_Nr_x, int nrOfValues_x, int part_Nr_y, int char_Nr_y, int value_Nr_y, int nrOfValues_y, int page_nr, int width, int height, int config_id, int outputFormat, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder reportStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetReportExt");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetReportExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), printReport, new Integer(part_Nr_x), new Integer(char_Nr_x), new Integer(value_Nr_x), new Integer(nrOfValues_x), new Integer(part_Nr_y), new Integer(char_Nr_y), new Integer(value_Nr_y), new Integer(nrOfValues_y), new Integer(page_nr), new Integer(width), new Integer(height), new Integer(config_id), new Integer(outputFormat)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                reportStr.value = (String) _output.get(new javax.xml.namespace.QName("", "ReportStr"));
            } catch (Exception _exception) {
                reportStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ReportStr")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getReportPages(int handle, String printReport, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder nrOfPages) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetReportPages");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetReportPages"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), printReport});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                nrOfPages.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "NrOfPages"))).intValue();
            } catch (Exception _exception) {
                nrOfPages.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "NrOfPages")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getPartInfo(int handle, int fieldNr, int part_Nr, int char_Nr, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder KFieldValue) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetPartInfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetPartInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(fieldNr), new Integer(part_Nr), new Integer(char_Nr)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                KFieldValue.value = (String) _output.get(new javax.xml.namespace.QName("", "KFieldValue"));
            } catch (Exception _exception) {
                KFieldValue.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "KFieldValue")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getCharInfo(int handle, int fieldNr, int part_Nr, int char_Nr, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder KFieldValue) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetCharInfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetCharInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(fieldNr), new Integer(part_Nr), new Integer(char_Nr)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                KFieldValue.value = (String) _output.get(new javax.xml.namespace.QName("", "KFieldValue"));
            } catch (Exception _exception) {
                KFieldValue.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "KFieldValue")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getValueInfo(int handle, int KField, int part_Nr, int char_Nr, int value_Nr, org.apache.axis.types.UnsignedByte bTransformation, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder value) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetValueInfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetValueInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(KField), new Integer(part_Nr), new Integer(char_Nr), new Integer(value_Nr), bTransformation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                value.value = (String) _output.get(new javax.xml.namespace.QName("", "Value"));
            } catch (Exception _exception) {
                value.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Value")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int setKey(int handle, int partNr, int charNr, int groupNr, int valueNr, int key, int subKey, String data, int charRange) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#SetKey");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "SetKey"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(partNr), new Integer(charNr), new Integer(groupNr), new Integer(valueNr), new Integer(key), new Integer(subKey), data, new Integer(charRange)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getFirstChildNode(int handle, int partNo_Parent, int groupNo_Parent, int charNo_Parent, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder partNo, javax.xml.rpc.holders.IntHolder groupNo, javax.xml.rpc.holders.IntHolder charNo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetFirstChildNode");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetFirstChildNode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(partNo_Parent), new Integer(groupNo_Parent), new Integer(charNo_Parent)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                partNo.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "PartNo"))).intValue();
            } catch (Exception _exception) {
                partNo.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "PartNo")), int.class)).intValue();
            }
            try {
                groupNo.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "GroupNo"))).intValue();
            } catch (Exception _exception) {
                groupNo.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GroupNo")), int.class)).intValue();
            }
            try {
                charNo.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "CharNo"))).intValue();
            } catch (Exception _exception) {
                charNo.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "CharNo")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getNextSiblingNode(int handle, int partNo_Current, int groupNo_Current, int charNo_Current, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder partNo, javax.xml.rpc.holders.IntHolder groupNo, javax.xml.rpc.holders.IntHolder charNo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetNextSiblingNode");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetNextSiblingNode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(partNo_Current), new Integer(groupNo_Current), new Integer(charNo_Current)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                partNo.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "PartNo"))).intValue();
            } catch (Exception _exception) {
                partNo.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "PartNo")), int.class)).intValue();
            }
            try {
                groupNo.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "GroupNo"))).intValue();
            } catch (Exception _exception) {
                groupNo.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GroupNo")), int.class)).intValue();
            }
            try {
                charNo.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "CharNo"))).intValue();
            } catch (Exception _exception) {
                charNo.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "CharNo")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getQSStatText(int handle, int textGroup, int textKey, int textSubKey, int singularPlural, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder text) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetQSStatText");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetQSStatText"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(textGroup), new Integer(textKey), new Integer(textSubKey), new Integer(singularPlural)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                text.value = (String) _output.get(new javax.xml.namespace.QName("", "Text"));
            } catch (Exception _exception) {
                text.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Text")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int setProperty(int handle, int prop_Key, String prop_Value) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#SetProperty");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "SetProperty"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(prop_Key), prop_Value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getFirstLanguage(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder language_str, javax.xml.rpc.holders.StringHolder language_shortStr, javax.xml.rpc.holders.IntHolder language) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetFirstLanguage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetFirstLanguage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                language_str.value = (String) _output.get(new javax.xml.namespace.QName("", "language_str"));
            } catch (Exception _exception) {
                language_str.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "language_str")), String.class);
            }
            try {
                language_shortStr.value = (String) _output.get(new javax.xml.namespace.QName("", "language_shortStr"));
            } catch (Exception _exception) {
                language_shortStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "language_shortStr")), String.class);
            }
            try {
                language.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "language"))).intValue();
            } catch (Exception _exception) {
                language.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "language")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getFirstLanguageExt(int QDasTool, int QDasID, int modul, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder language_str, javax.xml.rpc.holders.StringHolder language_shortStr, javax.xml.rpc.holders.IntHolder language) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetFirstLanguageExt");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetFirstLanguageExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(QDasTool), new Integer(QDasID), new Integer(modul)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                language_str.value = (String) _output.get(new javax.xml.namespace.QName("", "language_str"));
            } catch (Exception _exception) {
                language_str.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "language_str")), String.class);
            }
            try {
                language_shortStr.value = (String) _output.get(new javax.xml.namespace.QName("", "language_shortStr"));
            } catch (Exception _exception) {
                language_shortStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "language_shortStr")), String.class);
            }
            try {
                language.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "language"))).intValue();
            } catch (Exception _exception) {
                language.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "language")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getNextLanguage(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder language_str, javax.xml.rpc.holders.StringHolder language_shortStr, javax.xml.rpc.holders.IntHolder language) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetNextLanguage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetNextLanguage"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                language_str.value = (String) _output.get(new javax.xml.namespace.QName("", "language_str"));
            } catch (Exception _exception) {
                language_str.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "language_str")), String.class);
            }
            try {
                language_shortStr.value = (String) _output.get(new javax.xml.namespace.QName("", "language_shortStr"));
            } catch (Exception _exception) {
                language_shortStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "language_shortStr")), String.class);
            }
            try {
                language.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "language"))).intValue();
            } catch (Exception _exception) {
                language.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "language")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getFirstModule(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder module, javax.xml.rpc.holders.StringHolder moduleName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetFirstModule");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetFirstModule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                module.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Module"))).intValue();
            } catch (Exception _exception) {
                module.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Module")), int.class)).intValue();
            }
            try {
                moduleName.value = (String) _output.get(new javax.xml.namespace.QName("", "ModuleName"));
            } catch (Exception _exception) {
                moduleName.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ModuleName")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getNextModule(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder module, javax.xml.rpc.holders.StringHolder moduleName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetNextModule");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetNextModule"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                module.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Module"))).intValue();
            } catch (Exception _exception) {
                module.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Module")), int.class)).intValue();
            }
            try {
                moduleName.value = (String) _output.get(new javax.xml.namespace.QName("", "ModuleName"));
            } catch (Exception _exception) {
                moduleName.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ModuleName")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getFirstModuleExt(int QDasTool, int QDasID, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder module, javax.xml.rpc.holders.StringHolder moduleName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetFirstModuleExt");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetFirstModuleExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(QDasTool), new Integer(QDasID)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                module.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Module"))).intValue();
            } catch (Exception _exception) {
                module.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Module")), int.class)).intValue();
            }
            try {
                moduleName.value = (String) _output.get(new javax.xml.namespace.QName("", "ModuleName"));
            } catch (Exception _exception) {
                moduleName.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ModuleName")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getNextModuleExt(int QDASTool, int QDASId, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder module, javax.xml.rpc.holders.StringHolder moduleName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetNextModuleExt");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetNextModuleExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(QDASTool), new Integer(QDASId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                module.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Module"))).intValue();
            } catch (Exception _exception) {
                module.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Module")), int.class)).intValue();
            }
            try {
                moduleName.value = (String) _output.get(new javax.xml.namespace.QName("", "ModuleName"));
            } catch (Exception _exception) {
                moduleName.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ModuleName")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getFirstGraphic(int handle, int module, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder graphicNr, javax.xml.rpc.holders.StringHolder graphicName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetFirstGraphic");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetFirstGraphic"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(module)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                graphicNr.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "GraphicNr"))).intValue();
            } catch (Exception _exception) {
                graphicNr.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GraphicNr")), int.class)).intValue();
            }
            try {
                graphicName.value = (String) _output.get(new javax.xml.namespace.QName("", "GraphicName"));
            } catch (Exception _exception) {
                graphicName.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GraphicName")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getNextGraphic(int handle, int module, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder graphicNr, javax.xml.rpc.holders.StringHolder graphicName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetNextGraphic");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetNextGraphic"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(module)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                graphicNr.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "GraphicNr"))).intValue();
            } catch (Exception _exception) {
                graphicNr.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GraphicNr")), int.class)).intValue();
            }
            try {
                graphicName.value = (String) _output.get(new javax.xml.namespace.QName("", "GraphicName"));
            } catch (Exception _exception) {
                graphicName.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GraphicName")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void skipGraphic(int handle, int module, int num, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder graphicNr, javax.xml.rpc.holders.StringHolder graphicName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#SkipGraphic");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "SkipGraphic"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(module), new Integer(num)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                graphicNr.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "GraphicNr"))).intValue();
            } catch (Exception _exception) {
                graphicNr.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GraphicNr")), int.class)).intValue();
            }
            try {
                graphicName.value = (String) _output.get(new javax.xml.namespace.QName("", "GraphicName"));
            } catch (Exception _exception) {
                graphicName.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GraphicName")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getGraphicName(int handle, int module, int graphicNr, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder graphicName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetGraphicName");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetGraphicName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(module), new Integer(graphicNr)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                graphicName.value = (String) _output.get(new javax.xml.namespace.QName("", "GraphicName"));
            } catch (Exception _exception) {
                graphicName.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GraphicName")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getGraphicNameExt(int handle, int graphicKey, int graphicSubKey, int graphicAddKey, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder graphicLongName, javax.xml.rpc.holders.StringHolder graphicShortName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetGraphicNameExt");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetGraphicNameExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(graphicKey), new Integer(graphicSubKey), new Integer(graphicAddKey)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                graphicLongName.value = (String) _output.get(new javax.xml.namespace.QName("", "GraphicLongName"));
            } catch (Exception _exception) {
                graphicLongName.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GraphicLongName")), String.class);
            }
            try {
                graphicShortName.value = (String) _output.get(new javax.xml.namespace.QName("", "GraphicShortName"));
            } catch (Exception _exception) {
                graphicShortName.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GraphicShortName")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getFirstReport(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder report_Nr, javax.xml.rpc.holders.StringHolder report_Name, javax.xml.rpc.holders.StringHolder report_Filename) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetFirstReport");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetFirstReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                report_Nr.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Report_Nr"))).intValue();
            } catch (Exception _exception) {
                report_Nr.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Report_Nr")), int.class)).intValue();
            }
            try {
                report_Name.value = (String) _output.get(new javax.xml.namespace.QName("", "Report_Name"));
            } catch (Exception _exception) {
                report_Name.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Report_Name")), String.class);
            }
            try {
                report_Filename.value = (String) _output.get(new javax.xml.namespace.QName("", "Report_Filename"));
            } catch (Exception _exception) {
                report_Filename.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Report_Filename")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getNextReport(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder report_Nr, javax.xml.rpc.holders.StringHolder report_Name, javax.xml.rpc.holders.StringHolder report_Filename) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetNextReport");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetNextReport"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                report_Nr.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Report_Nr"))).intValue();
            } catch (Exception _exception) {
                report_Nr.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Report_Nr")), int.class)).intValue();
            }
            try {
                report_Name.value = (String) _output.get(new javax.xml.namespace.QName("", "Report_Name"));
            } catch (Exception _exception) {
                report_Name.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Report_Name")), String.class);
            }
            try {
                report_Filename.value = (String) _output.get(new javax.xml.namespace.QName("", "Report_Filename"));
            } catch (Exception _exception) {
                report_Filename.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Report_Filename")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getReportName(int handle, int report_Nr, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder report_Name, javax.xml.rpc.holders.StringHolder report_Filename) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetReportName");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetReportName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(report_Nr)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                report_Name.value = (String) _output.get(new javax.xml.namespace.QName("", "Report_Name"));
            } catch (Exception _exception) {
                report_Name.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Report_Name")), String.class);
            }
            try {
                report_Filename.value = (String) _output.get(new javax.xml.namespace.QName("", "Report_Filename"));
            } catch (Exception _exception) {
                report_Filename.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Report_Filename")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void reportFileName2Name(int handle, String report_FileName, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder report_Name) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#ReportFileName2Name");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "ReportFileName2Name"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), report_FileName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                report_Name.value = (String) _output.get(new javax.xml.namespace.QName("", "Report_Name"));
            } catch (Exception _exception) {
                report_Name.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Report_Name")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getFirstEvaluationStrategy(int handle, int modul, int study, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder stratNr, javax.xml.rpc.holders.StringHolder stratName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetFirstEvaluationStrategy");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetFirstEvaluationStrategy"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(modul), new Integer(study)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                stratNr.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "StratNr"))).intValue();
            } catch (Exception _exception) {
                stratNr.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "StratNr")), int.class)).intValue();
            }
            try {
                stratName.value = (String) _output.get(new javax.xml.namespace.QName("", "StratName"));
            } catch (Exception _exception) {
                stratName.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "StratName")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getNextEvaluationStrategy(int handle, int modul, int study, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder stratNr, javax.xml.rpc.holders.StringHolder stratName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetNextEvaluationStrategy");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetNextEvaluationStrategy"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(modul), new Integer(study)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                stratNr.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "StratNr"))).intValue();
            } catch (Exception _exception) {
                stratNr.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "StratNr")), int.class)).intValue();
            }
            try {
                stratName.value = (String) _output.get(new javax.xml.namespace.QName("", "StratName"));
            } catch (Exception _exception) {
                stratName.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "StratName")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getDefaultEvaluationStrategy(int handle, int modul, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder stratNr, javax.xml.rpc.holders.StringHolder stratName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetDefaultEvaluationStrategy");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetDefaultEvaluationStrategy"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(modul)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                stratNr.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "StratNr"))).intValue();
            } catch (Exception _exception) {
                stratNr.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "StratNr")), int.class)).intValue();
            }
            try {
                stratName.value = (String) _output.get(new javax.xml.namespace.QName("", "StratName"));
            } catch (Exception _exception) {
                stratName.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "StratName")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getFirstQueryName(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder queryName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetFirstQueryName");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetFirstQueryName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                queryName.value = (String) _output.get(new javax.xml.namespace.QName("", "QueryName"));
            } catch (Exception _exception) {
                queryName.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "QueryName")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int getNextQueryName(int handle, javax.xml.rpc.holders.StringHolder queryName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetNextQueryName");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetNextQueryName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), queryName.value});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                queryName.value = (String) _output.get(new javax.xml.namespace.QName("", "QueryName"));
            } catch (Exception _exception) {
                queryName.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "QueryName")), String.class);
            }
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void loadQuery(int handle, String queryName, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder queryHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#LoadQuery");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "LoadQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), queryName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                queryHandle.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "QueryHandle"))).intValue();
            } catch (Exception _exception) {
                queryHandle.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "QueryHandle")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void loadQueryExt(int handle, String queryName, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder queryHandle, javax.xml.rpc.holders.StringHolder part_Char_List) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#LoadQueryExt");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "LoadQueryExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), queryName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                queryHandle.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "QueryHandle"))).intValue();
            } catch (Exception _exception) {
                queryHandle.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "QueryHandle")), int.class)).intValue();
            }
            try {
                part_Char_List.value = (String) _output.get(new javax.xml.namespace.QName("", "Part_Char_List"));
            } catch (Exception _exception) {
                part_Char_List.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Part_Char_List")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void loadQueryExt2(int handle, String queryName, boolean defaultOptions, boolean defaultSort, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder queryHandle, javax.xml.rpc.holders.StringHolder part_Char_List) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#LoadQueryExt2");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "LoadQueryExt2"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), queryName, new Boolean(defaultOptions), new Boolean(defaultSort)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                queryHandle.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "QueryHandle"))).intValue();
            } catch (Exception _exception) {
                queryHandle.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "QueryHandle")), int.class)).intValue();
            }
            try {
                part_Char_List.value = (String) _output.get(new javax.xml.namespace.QName("", "Part_Char_List"));
            } catch (Exception _exception) {
                part_Char_List.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Part_Char_List")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void createQuery(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder queryHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[67]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#CreateQuery");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "CreateQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                queryHandle.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "QueryHandle"))).intValue();
            } catch (Exception _exception) {
                queryHandle.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "QueryHandle")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void createQueryExt(int handle, boolean defaultOptions, boolean defaultSort, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder queryHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[68]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#CreateQueryExt");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "CreateQueryExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Boolean(defaultOptions), new Boolean(defaultSort)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                queryHandle.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "QueryHandle"))).intValue();
            } catch (Exception _exception) {
                queryHandle.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "QueryHandle")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void createQueryFromXML(int handle, String queryXMLString, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder queryHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[69]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#CreateQueryFromXML");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "CreateQueryFromXML"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), queryXMLString});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                queryHandle.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "QueryHandle"))).intValue();
            } catch (Exception _exception) {
                queryHandle.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "QueryHandle")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int addFilterToQuery(int handle, int queryHandle, int filterHandle, org.apache.axis.types.UnsignedByte queryLevel, int part_Key, int char_Key) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[70]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#AddFilterToQuery");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "AddFilterToQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(queryHandle), new Integer(filterHandle), queryLevel, new Integer(part_Key), new Integer(char_Key)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int addFilterToQueryExt(int handle, int queryHandle, int filterHandle, org.apache.axis.types.UnsignedByte queryLevel, int part_Key, int char_Key, org.apache.axis.types.UnsignedByte replaceMode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[71]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#AddFilterToQueryExt");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "AddFilterToQueryExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(queryHandle), new Integer(filterHandle), queryLevel, new Integer(part_Key), new Integer(char_Key), replaceMode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int addUserGroupFilterToQuery(int handle, int queryHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[72]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#AddUserGroupFilterToQuery");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "AddUserGroupFilterToQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(queryHandle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int addSortToQuery(int handle, int queryHandle, int sortKey, org.apache.axis.types.UnsignedByte direction) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[73]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#AddSortToQuery");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "AddSortToQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(queryHandle), new Integer(sortKey), direction});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int addPartCharacteristicListToQuery(int handle, int queryHandle, String part_Char_List) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[74]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#AddPartCharacteristicListToQuery");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "AddPartCharacteristicListToQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(queryHandle), part_Char_List});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int setQueryProperty(int handle, int queryHandle, int propertyKey, String propertyValue) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[75]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#SetQueryProperty");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "SetQueryProperty"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(queryHandle), new Integer(propertyKey), propertyValue});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int saveQuery(int handle, String queryName, int queryHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[76]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#SaveQuery");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "SaveQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), queryName, new Integer(queryHandle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int executeQuery(int handle, int queryHandle, String part_Char_List) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[77]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#ExecuteQuery");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "ExecuteQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(queryHandle), part_Char_List});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int executeQuery_Ext(int handle, int queryHandle, String part_Char_List, boolean readWrite, boolean loadValues) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[78]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#ExecuteQuery_Ext");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "ExecuteQuery_Ext"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(queryHandle), part_Char_List, new Boolean(readWrite), new Boolean(loadValues)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getFirstPartQuery(int handle, int queryHandle, String KFieldList, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder KResultList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[79]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetFirstPartQuery");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetFirstPartQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(queryHandle), KFieldList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                KResultList.value = (String) _output.get(new javax.xml.namespace.QName("", "KResultList"));
            } catch (Exception _exception) {
                KResultList.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "KResultList")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getNextPartQuery(int handle, int queryHandle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder KResultList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[80]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetNextPartQuery");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetNextPartQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(queryHandle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                KResultList.value = (String) _output.get(new javax.xml.namespace.QName("", "KResultList"));
            } catch (Exception _exception) {
                KResultList.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "KResultList")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void skipPartQuery(int handle, int queryHandle, int num, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder KResultList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[81]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#SkipPartQuery");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "SkipPartQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(queryHandle), new Integer(num)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                KResultList.value = (String) _output.get(new javax.xml.namespace.QName("", "KResultList"));
            } catch (Exception _exception) {
                KResultList.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "KResultList")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getFirstCharQuery(int handle, int queryHandle, int part_Key, String KFieldList, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder KResultList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[82]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetFirstCharQuery");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetFirstCharQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(queryHandle), new Integer(part_Key), KFieldList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                KResultList.value = (String) _output.get(new javax.xml.namespace.QName("", "KResultList"));
            } catch (Exception _exception) {
                KResultList.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "KResultList")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getNextCharQuery(int handle, int queryHandle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder KResultList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[83]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetNextCharQuery");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetNextCharQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(queryHandle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                KResultList.value = (String) _output.get(new javax.xml.namespace.QName("", "KResultList"));
            } catch (Exception _exception) {
                KResultList.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "KResultList")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void skipCharQuery(int handle, int queryHandle, int num, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder KResultList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[84]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#SkipCharQuery");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "SkipCharQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(queryHandle), new Integer(num)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                KResultList.value = (String) _output.get(new javax.xml.namespace.QName("", "KResultList"));
            } catch (Exception _exception) {
                KResultList.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "KResultList")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getFirstValueQuery(int handle, int queryHandle, int part_Key, int char_Key, String KFieldList, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder KResultList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[85]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetFirstValueQuery");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetFirstValueQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(queryHandle), new Integer(part_Key), new Integer(char_Key), KFieldList});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                KResultList.value = (String) _output.get(new javax.xml.namespace.QName("", "KResultList"));
            } catch (Exception _exception) {
                KResultList.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "KResultList")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getNextValueQuery(int handle, int queryHandle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder KResultList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[86]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetNextValueQuery");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetNextValueQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(queryHandle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                KResultList.value = (String) _output.get(new javax.xml.namespace.QName("", "KResultList"));
            } catch (Exception _exception) {
                KResultList.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "KResultList")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void skipValueQuery(int handle, int queryHandle, int num, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder KResultList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[87]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#SkipValueQuery");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "SkipValueQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(queryHandle), new Integer(num)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                KResultList.value = (String) _output.get(new javax.xml.namespace.QName("", "KResultList"));
            } catch (Exception _exception) {
                KResultList.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "KResultList")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int freeQuery(int handle, int queryHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[88]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#FreeQuery");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "FreeQuery"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(queryHandle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getFirstFilterName(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder filterName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[89]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetFirstFilterName");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetFirstFilterName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                filterName.value = (String) _output.get(new javax.xml.namespace.QName("", "FilterName"));
            } catch (Exception _exception) {
                filterName.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "FilterName")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getNextFilterName(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder filterName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[90]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetNextFilterName");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetNextFilterName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                filterName.value = (String) _output.get(new javax.xml.namespace.QName("", "FilterName"));
            } catch (Exception _exception) {
                filterName.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "FilterName")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getFirstFilterNameExt(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder filterLevel, javax.xml.rpc.holders.IntHolder filterIdent, javax.xml.rpc.holders.StringHolder filterName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[91]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetFirstFilterNameExt");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetFirstFilterNameExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                filterLevel.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "FilterLevel"))).intValue();
            } catch (Exception _exception) {
                filterLevel.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "FilterLevel")), int.class)).intValue();
            }
            try {
                filterIdent.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "FilterIdent"))).intValue();
            } catch (Exception _exception) {
                filterIdent.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "FilterIdent")), int.class)).intValue();
            }
            try {
                filterName.value = (String) _output.get(new javax.xml.namespace.QName("", "FilterName"));
            } catch (Exception _exception) {
                filterName.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "FilterName")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getNextFilterNameExt(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder filterLevel, javax.xml.rpc.holders.IntHolder filterIdent, javax.xml.rpc.holders.StringHolder filterName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[92]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetNextFilterNameExt");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetNextFilterNameExt"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                filterLevel.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "FilterLevel"))).intValue();
            } catch (Exception _exception) {
                filterLevel.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "FilterLevel")), int.class)).intValue();
            }
            try {
                filterIdent.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "FilterIdent"))).intValue();
            } catch (Exception _exception) {
                filterIdent.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "FilterIdent")), int.class)).intValue();
            }
            try {
                filterName.value = (String) _output.get(new javax.xml.namespace.QName("", "FilterName"));
            } catch (Exception _exception) {
                filterName.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "FilterName")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void loadFilter(int handle, String filterName, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder filterHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[93]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#LoadFilter");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "LoadFilter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), filterName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                filterHandle.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "FilterHandle"))).intValue();
            } catch (Exception _exception) {
                filterHandle.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "FilterHandle")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void loadFilterByID(int handle, int filterIdent, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder filterName, javax.xml.rpc.holders.IntHolder filterHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[94]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#LoadFilterByID");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "LoadFilterByID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(filterIdent)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                filterName.value = (String) _output.get(new javax.xml.namespace.QName("", "FilterName"));
            } catch (Exception _exception) {
                filterName.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "FilterName")), String.class);
            }
            try {
                filterHandle.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "FilterHandle"))).intValue();
            } catch (Exception _exception) {
                filterHandle.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "FilterHandle")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void createFilterFromFilters(int handle, org.apache.axis.types.UnsignedByte operator, String sourceFilters, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder filterHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[95]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#CreateFilterFromFilters");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "CreateFilterFromFilters"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), operator, sourceFilters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                filterHandle.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "FilterHandle"))).intValue();
            } catch (Exception _exception) {
                filterHandle.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "FilterHandle")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void createFilter(int handle, org.apache.axis.types.UnsignedByte k_r_key, int ausgabepunkt, String condition, org.apache.axis.types.UnsignedByte compOp, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder filterHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[96]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#CreateFilter");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "CreateFilter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), k_r_key, new Integer(ausgabepunkt), condition, compOp});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                filterHandle.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "FilterHandle"))).intValue();
            } catch (Exception _exception) {
                filterHandle.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "FilterHandle")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void createFilterFromSQL(int handle, String filterString, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder filterHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[97]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#CreateFilterFromSQL");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "CreateFilterFromSQL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), filterString});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                filterHandle.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "FilterHandle"))).intValue();
            } catch (Exception _exception) {
                filterHandle.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "FilterHandle")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int saveFilter(int handle, String filterName, int filterHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[98]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#SaveFilter");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "SaveFilter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), filterName, new Integer(filterHandle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int freeFilter(int handle, int filterHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[99]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#FreeFilter");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "FreeFilter"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(filterHandle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void createDirectSQL(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder SQLHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[100]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#CreateDirectSQL");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "CreateDirectSQL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                SQLHandle.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "SQLHandle"))).intValue();
            } catch (Exception _exception) {
                SQLHandle.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "SQLHandle")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void executeDirectSQL(int handle, int SQLHandle, String SQLString, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder fieldList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[101]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#ExecuteDirectSQL");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "ExecuteDirectSQL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(SQLHandle), SQLString});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                fieldList.value = (String) _output.get(new javax.xml.namespace.QName("", "FieldList"));
            } catch (Exception _exception) {
                fieldList.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "FieldList")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getFirstDirectSQLRow(int handle, int SQLHandle, boolean pdf, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder resultList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[102]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetFirstDirectSQLRow");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetFirstDirectSQLRow"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(SQLHandle), new Boolean(pdf)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                resultList.value = (String) _output.get(new javax.xml.namespace.QName("", "ResultList"));
            } catch (Exception _exception) {
                resultList.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ResultList")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getNextDirectSQLRow(int handle, int SQLHandle, boolean pdf, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder resultList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[103]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetNextDirectSQLRow");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetNextDirectSQLRow"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(SQLHandle), new Boolean(pdf)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                resultList.value = (String) _output.get(new javax.xml.namespace.QName("", "ResultList"));
            } catch (Exception _exception) {
                resultList.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ResultList")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int freeDirectSQL(int handle, int SQLHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[104]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#FreeDirectSQL");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "FreeDirectSQL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(SQLHandle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getFirstCatalog(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder catalogKey, javax.xml.rpc.holders.StringHolder columnKeyList, javax.xml.rpc.holders.IntHolder subCatalogs, javax.xml.rpc.holders.StringHolder catalogName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[105]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetFirstCatalog");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetFirstCatalog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                catalogKey.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "CatalogKey"))).intValue();
            } catch (Exception _exception) {
                catalogKey.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "CatalogKey")), int.class)).intValue();
            }
            try {
                columnKeyList.value = (String) _output.get(new javax.xml.namespace.QName("", "ColumnKeyList"));
            } catch (Exception _exception) {
                columnKeyList.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ColumnKeyList")), String.class);
            }
            try {
                subCatalogs.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "SubCatalogs"))).intValue();
            } catch (Exception _exception) {
                subCatalogs.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "SubCatalogs")), int.class)).intValue();
            }
            try {
                catalogName.value = (String) _output.get(new javax.xml.namespace.QName("", "CatalogName"));
            } catch (Exception _exception) {
                catalogName.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "CatalogName")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getNextCatalog(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder catalogKey, javax.xml.rpc.holders.StringHolder columnKeyList, javax.xml.rpc.holders.IntHolder subCatalogs, javax.xml.rpc.holders.StringHolder catalogName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[106]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetNextCatalog");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetNextCatalog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                catalogKey.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "CatalogKey"))).intValue();
            } catch (Exception _exception) {
                catalogKey.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "CatalogKey")), int.class)).intValue();
            }
            try {
                columnKeyList.value = (String) _output.get(new javax.xml.namespace.QName("", "ColumnKeyList"));
            } catch (Exception _exception) {
                columnKeyList.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ColumnKeyList")), String.class);
            }
            try {
                subCatalogs.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "SubCatalogs"))).intValue();
            } catch (Exception _exception) {
                subCatalogs.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "SubCatalogs")), int.class)).intValue();
            }
            try {
                catalogName.value = (String) _output.get(new javax.xml.namespace.QName("", "CatalogName"));
            } catch (Exception _exception) {
                catalogName.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "CatalogName")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getFirstSubCatalog(int handle, int catalogKey, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder subCatalog, javax.xml.rpc.holders.StringHolder subCatalogName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[107]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetFirstSubCatalog");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetFirstSubCatalog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(catalogKey)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                subCatalog.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "SubCatalog"))).intValue();
            } catch (Exception _exception) {
                subCatalog.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "SubCatalog")), int.class)).intValue();
            }
            try {
                subCatalogName.value = (String) _output.get(new javax.xml.namespace.QName("", "SubCatalogName"));
            } catch (Exception _exception) {
                subCatalogName.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "SubCatalogName")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getNextSubCatalog(int handle, int catalogKey, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder subCatalog, javax.xml.rpc.holders.StringHolder subCatalogName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[108]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetNextSubCatalog");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetNextSubCatalog"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(catalogKey)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                subCatalog.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "SubCatalog"))).intValue();
            } catch (Exception _exception) {
                subCatalog.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "SubCatalog")), int.class)).intValue();
            }
            try {
                subCatalogName.value = (String) _output.get(new javax.xml.namespace.QName("", "SubCatalogName"));
            } catch (Exception _exception) {
                subCatalogName.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "SubCatalogName")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getFirstCatalogEntry(int handle, int catalogKey, int subCatalog, int colKey, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder entryKey, javax.xml.rpc.holders.StringHolder outStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[109]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetFirstCatalogEntry");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetFirstCatalogEntry"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(catalogKey), new Integer(subCatalog), new Integer(colKey)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                entryKey.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "EntryKey"))).intValue();
            } catch (Exception _exception) {
                entryKey.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "EntryKey")), int.class)).intValue();
            }
            try {
                outStr.value = (String) _output.get(new javax.xml.namespace.QName("", "OutStr"));
            } catch (Exception _exception) {
                outStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "OutStr")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getNextCatalogEntry(int handle, int colKey, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder entryKey, javax.xml.rpc.holders.StringHolder outStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[110]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetNextCatalogEntry");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetNextCatalogEntry"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(colKey)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                entryKey.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "EntryKey"))).intValue();
            } catch (Exception _exception) {
                entryKey.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "EntryKey")), int.class)).intValue();
            }
            try {
                outStr.value = (String) _output.get(new javax.xml.namespace.QName("", "OutStr"));
            } catch (Exception _exception) {
                outStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "OutStr")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getAnotherColumn(int handle, int colKey, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder entryKey, javax.xml.rpc.holders.StringHolder outStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[111]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetAnotherColumn");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetAnotherColumn"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(colKey)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                entryKey.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "EntryKey"))).intValue();
            } catch (Exception _exception) {
                entryKey.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "EntryKey")), int.class)).intValue();
            }
            try {
                outStr.value = (String) _output.get(new javax.xml.namespace.QName("", "OutStr"));
            } catch (Exception _exception) {
                outStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "OutStr")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getFirstCatalogEntryComplete(int handle, int catalogKey, int subCatalog, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder entryKey, javax.xml.rpc.holders.StringHolder numberStr, javax.xml.rpc.holders.StringHolder nameStr, javax.xml.rpc.holders.StringHolder string3, javax.xml.rpc.holders.StringHolder string4, javax.xml.rpc.holders.StringHolder string5, javax.xml.rpc.holders.StringHolder string6, javax.xml.rpc.holders.StringHolder string7, javax.xml.rpc.holders.StringHolder string8) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[112]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetFirstCatalogEntryComplete");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetFirstCatalogEntryComplete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(catalogKey), new Integer(subCatalog)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                entryKey.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "EntryKey"))).intValue();
            } catch (Exception _exception) {
                entryKey.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "EntryKey")), int.class)).intValue();
            }
            try {
                numberStr.value = (String) _output.get(new javax.xml.namespace.QName("", "NumberStr"));
            } catch (Exception _exception) {
                numberStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "NumberStr")), String.class);
            }
            try {
                nameStr.value = (String) _output.get(new javax.xml.namespace.QName("", "NameStr"));
            } catch (Exception _exception) {
                nameStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "NameStr")), String.class);
            }
            try {
                string3.value = (String) _output.get(new javax.xml.namespace.QName("", "String3"));
            } catch (Exception _exception) {
                string3.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "String3")), String.class);
            }
            try {
                string4.value = (String) _output.get(new javax.xml.namespace.QName("", "String4"));
            } catch (Exception _exception) {
                string4.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "String4")), String.class);
            }
            try {
                string5.value = (String) _output.get(new javax.xml.namespace.QName("", "String5"));
            } catch (Exception _exception) {
                string5.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "String5")), String.class);
            }
            try {
                string6.value = (String) _output.get(new javax.xml.namespace.QName("", "String6"));
            } catch (Exception _exception) {
                string6.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "String6")), String.class);
            }
            try {
                string7.value = (String) _output.get(new javax.xml.namespace.QName("", "String7"));
            } catch (Exception _exception) {
                string7.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "String7")), String.class);
            }
            try {
                string8.value = (String) _output.get(new javax.xml.namespace.QName("", "String8"));
            } catch (Exception _exception) {
                string8.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "String8")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getNextCatalogEntryComplete(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder entryKey, javax.xml.rpc.holders.StringHolder numberStr, javax.xml.rpc.holders.StringHolder nameStr, javax.xml.rpc.holders.StringHolder string3, javax.xml.rpc.holders.StringHolder string4, javax.xml.rpc.holders.StringHolder string5, javax.xml.rpc.holders.StringHolder string6, javax.xml.rpc.holders.StringHolder string7, javax.xml.rpc.holders.StringHolder string8) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[113]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetNextCatalogEntryComplete");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetNextCatalogEntryComplete"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                entryKey.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "EntryKey"))).intValue();
            } catch (Exception _exception) {
                entryKey.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "EntryKey")), int.class)).intValue();
            }
            try {
                numberStr.value = (String) _output.get(new javax.xml.namespace.QName("", "NumberStr"));
            } catch (Exception _exception) {
                numberStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "NumberStr")), String.class);
            }
            try {
                nameStr.value = (String) _output.get(new javax.xml.namespace.QName("", "NameStr"));
            } catch (Exception _exception) {
                nameStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "NameStr")), String.class);
            }
            try {
                string3.value = (String) _output.get(new javax.xml.namespace.QName("", "String3"));
            } catch (Exception _exception) {
                string3.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "String3")), String.class);
            }
            try {
                string4.value = (String) _output.get(new javax.xml.namespace.QName("", "String4"));
            } catch (Exception _exception) {
                string4.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "String4")), String.class);
            }
            try {
                string5.value = (String) _output.get(new javax.xml.namespace.QName("", "String5"));
            } catch (Exception _exception) {
                string5.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "String5")), String.class);
            }
            try {
                string6.value = (String) _output.get(new javax.xml.namespace.QName("", "String6"));
            } catch (Exception _exception) {
                string6.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "String6")), String.class);
            }
            try {
                string7.value = (String) _output.get(new javax.xml.namespace.QName("", "String7"));
            } catch (Exception _exception) {
                string7.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "String7")), String.class);
            }
            try {
                string8.value = (String) _output.get(new javax.xml.namespace.QName("", "String8"));
            } catch (Exception _exception) {
                string8.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "String8")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getFirstCatalogEntryComplete_Ext(int handle, int catalogKey, int subCatalog, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder entryKey, javax.xml.rpc.holders.StringHolder numberStr, javax.xml.rpc.holders.StringHolder nameStr, javax.xml.rpc.holders.StringHolder string3, javax.xml.rpc.holders.StringHolder string4, javax.xml.rpc.holders.StringHolder string5, javax.xml.rpc.holders.StringHolder string6, javax.xml.rpc.holders.StringHolder string7, javax.xml.rpc.holders.StringHolder string8, javax.xml.rpc.holders.StringHolder string9, javax.xml.rpc.holders.StringHolder string10, javax.xml.rpc.holders.StringHolder comment, org.apache.axis.holders.UnsignedIntHolder state) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[114]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetFirstCatalogEntryComplete_Ext");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetFirstCatalogEntryComplete_Ext"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(catalogKey), new Integer(subCatalog)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                entryKey.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "EntryKey"))).intValue();
            } catch (Exception _exception) {
                entryKey.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "EntryKey")), int.class)).intValue();
            }
            try {
                numberStr.value = (String) _output.get(new javax.xml.namespace.QName("", "NumberStr"));
            } catch (Exception _exception) {
                numberStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "NumberStr")), String.class);
            }
            try {
                nameStr.value = (String) _output.get(new javax.xml.namespace.QName("", "NameStr"));
            } catch (Exception _exception) {
                nameStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "NameStr")), String.class);
            }
            try {
                string3.value = (String) _output.get(new javax.xml.namespace.QName("", "String3"));
            } catch (Exception _exception) {
                string3.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "String3")), String.class);
            }
            try {
                string4.value = (String) _output.get(new javax.xml.namespace.QName("", "String4"));
            } catch (Exception _exception) {
                string4.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "String4")), String.class);
            }
            try {
                string5.value = (String) _output.get(new javax.xml.namespace.QName("", "String5"));
            } catch (Exception _exception) {
                string5.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "String5")), String.class);
            }
            try {
                string6.value = (String) _output.get(new javax.xml.namespace.QName("", "String6"));
            } catch (Exception _exception) {
                string6.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "String6")), String.class);
            }
            try {
                string7.value = (String) _output.get(new javax.xml.namespace.QName("", "String7"));
            } catch (Exception _exception) {
                string7.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "String7")), String.class);
            }
            try {
                string8.value = (String) _output.get(new javax.xml.namespace.QName("", "String8"));
            } catch (Exception _exception) {
                string8.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "String8")), String.class);
            }
            try {
                string9.value = (String) _output.get(new javax.xml.namespace.QName("", "String9"));
            } catch (Exception _exception) {
                string9.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "String9")), String.class);
            }
            try {
                string10.value = (String) _output.get(new javax.xml.namespace.QName("", "String10"));
            } catch (Exception _exception) {
                string10.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "String10")), String.class);
            }
            try {
                comment.value = (String) _output.get(new javax.xml.namespace.QName("", "Comment"));
            } catch (Exception _exception) {
                comment.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Comment")), String.class);
            }
            try {
                state.value = (org.apache.axis.types.UnsignedInt) _output.get(new javax.xml.namespace.QName("", "State"));
            } catch (Exception _exception) {
                state.value = (org.apache.axis.types.UnsignedInt) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "State")), org.apache.axis.types.UnsignedInt.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getNextCatalogEntryComplete_Ext(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder entryKey, javax.xml.rpc.holders.StringHolder numberStr, javax.xml.rpc.holders.StringHolder nameStr, javax.xml.rpc.holders.StringHolder string3, javax.xml.rpc.holders.StringHolder string4, javax.xml.rpc.holders.StringHolder string5, javax.xml.rpc.holders.StringHolder string6, javax.xml.rpc.holders.StringHolder string7, javax.xml.rpc.holders.StringHolder string8, javax.xml.rpc.holders.StringHolder string9, javax.xml.rpc.holders.StringHolder string10, javax.xml.rpc.holders.StringHolder comment, org.apache.axis.holders.UnsignedIntHolder state) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[115]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetNextCatalogEntryComplete_Ext");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetNextCatalogEntryComplete_Ext"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                entryKey.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "EntryKey"))).intValue();
            } catch (Exception _exception) {
                entryKey.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "EntryKey")), int.class)).intValue();
            }
            try {
                numberStr.value = (String) _output.get(new javax.xml.namespace.QName("", "NumberStr"));
            } catch (Exception _exception) {
                numberStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "NumberStr")), String.class);
            }
            try {
                nameStr.value = (String) _output.get(new javax.xml.namespace.QName("", "NameStr"));
            } catch (Exception _exception) {
                nameStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "NameStr")), String.class);
            }
            try {
                string3.value = (String) _output.get(new javax.xml.namespace.QName("", "String3"));
            } catch (Exception _exception) {
                string3.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "String3")), String.class);
            }
            try {
                string4.value = (String) _output.get(new javax.xml.namespace.QName("", "String4"));
            } catch (Exception _exception) {
                string4.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "String4")), String.class);
            }
            try {
                string5.value = (String) _output.get(new javax.xml.namespace.QName("", "String5"));
            } catch (Exception _exception) {
                string5.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "String5")), String.class);
            }
            try {
                string6.value = (String) _output.get(new javax.xml.namespace.QName("", "String6"));
            } catch (Exception _exception) {
                string6.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "String6")), String.class);
            }
            try {
                string7.value = (String) _output.get(new javax.xml.namespace.QName("", "String7"));
            } catch (Exception _exception) {
                string7.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "String7")), String.class);
            }
            try {
                string8.value = (String) _output.get(new javax.xml.namespace.QName("", "String8"));
            } catch (Exception _exception) {
                string8.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "String8")), String.class);
            }
            try {
                string9.value = (String) _output.get(new javax.xml.namespace.QName("", "String9"));
            } catch (Exception _exception) {
                string9.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "String9")), String.class);
            }
            try {
                string10.value = (String) _output.get(new javax.xml.namespace.QName("", "String10"));
            } catch (Exception _exception) {
                string10.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "String10")), String.class);
            }
            try {
                comment.value = (String) _output.get(new javax.xml.namespace.QName("", "Comment"));
            } catch (Exception _exception) {
                comment.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Comment")), String.class);
            }
            try {
                state.value = (org.apache.axis.types.UnsignedInt) _output.get(new javax.xml.namespace.QName("", "State"));
            } catch (Exception _exception) {
                state.value = (org.apache.axis.types.UnsignedInt) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "State")), org.apache.axis.types.UnsignedInt.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void recentSerNo_First(int handle, int partKey, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder serialNo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[116]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#RecentSerNo_First");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "RecentSerNo_First"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(partKey)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                serialNo.value = (String) _output.get(new javax.xml.namespace.QName("", "SerialNo"));
            } catch (Exception _exception) {
                serialNo.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "SerialNo")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void recentSerNo_Next(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder serialNo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[117]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#RecentSerNo_Next");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "RecentSerNo_Next"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                serialNo.value = (String) _output.get(new javax.xml.namespace.QName("", "SerialNo"));
            } catch (Exception _exception) {
                serialNo.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "SerialNo")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getFirstUser(javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder userName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[118]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetFirstUser");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetFirstUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                userName.value = (String) _output.get(new javax.xml.namespace.QName("", "UserName"));
            } catch (Exception _exception) {
                userName.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "UserName")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getNextUser(javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder userName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[119]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetNextUser");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetNextUser"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                userName.value = (String) _output.get(new javax.xml.namespace.QName("", "UserName"));
            } catch (Exception _exception) {
                userName.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "UserName")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getLTTree(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder LTTree_XMLStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[120]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetLTTree");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetLTTree"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                LTTree_XMLStr.value = (String) _output.get(new javax.xml.namespace.QName("", "LTTree_XMLStr"));
            } catch (Exception _exception) {
                LTTree_XMLStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "LTTree_XMLStr")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int setLTEnvironment(int handle, int LTModule, int LTStrategy, String LTAufteilung) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[121]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#SetLTEnvironment");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "SetLTEnvironment"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(LTModule), new Integer(LTStrategy), LTAufteilung});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doAction(int handle, int fkt_group, int fkt_nummer, int fkt_sub_nummer, int fkt_zus_nummer, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder key_info_out) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[122]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#DoAction");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "DoAction"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(fkt_group), new Integer(fkt_nummer), new Integer(fkt_sub_nummer), new Integer(fkt_zus_nummer)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                key_info_out.value = (String) _output.get(new javax.xml.namespace.QName("", "Key_info_out"));
            } catch (Exception _exception) {
                key_info_out.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Key_info_out")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void doAction_Ext(int handle, int fkt_group, int fkt_nummer, int fkt_sub_nummer, int fkt_zus_nummer, String parameters, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder key_info_out) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[123]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#DoAction_Ext");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "DoAction_Ext"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(fkt_group), new Integer(fkt_nummer), new Integer(fkt_sub_nummer), new Integer(fkt_zus_nummer), parameters});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                key_info_out.value = (String) _output.get(new javax.xml.namespace.QName("", "Key_info_out"));
            } catch (Exception _exception) {
                key_info_out.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Key_info_out")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getQMLasString(int handle, String parameterXML, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder QMLResult) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[124]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetQMLasString");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetQMLasString"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), parameterXML});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                QMLResult.value = (String) _output.get(new javax.xml.namespace.QName("", "QMLResult"));
            } catch (Exception _exception) {
                QMLResult.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "QMLResult")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getGridInfo(int handle, int gridKey, int gridSubKey, String paramXml, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder gridInfoXml) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[125]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetGridInfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetGridInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(gridKey), new Integer(gridSubKey), paramXml});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                gridInfoXml.value = (String) _output.get(new javax.xml.namespace.QName("", "GridInfoXml"));
            } catch (Exception _exception) {
                gridInfoXml.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GridInfoXml")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int setGridInfo(int handle, int gridKey, int gridSubKey, String paramXml, String gridInfoXml) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[126]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#SetGridInfo");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "SetGridInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(gridKey), new Integer(gridSubKey), paramXml, gridInfoXml});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getAlarmStatusforKField(int handle, int KField, String KFieldContent, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder alarmState) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[127]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetAlarmStatusforKField");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetAlarmStatusforKField"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(KField), KFieldContent});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                alarmState.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "AlarmState"))).intValue();
            } catch (Exception _exception) {
                alarmState.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "AlarmState")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void createReportingJob(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder reportingHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[128]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#CreateReportingJob");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "CreateReportingJob"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                reportingHandle.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "ReportingHandle"))).intValue();
            } catch (Exception _exception) {
                reportingHandle.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ReportingHandle")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int freeReportingJob(int handle, int reportingHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[129]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#FreeReportingJob");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "FreeReportingJob"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(reportingHandle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getFirstReportingJobName(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder jobId, javax.xml.rpc.holders.StringHolder jobName, javax.xml.rpc.holders.IntHolder jobState) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[130]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetFirstReportingJobName");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetFirstReportingJobName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                jobId.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "JobId"))).intValue();
            } catch (Exception _exception) {
                jobId.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "JobId")), int.class)).intValue();
            }
            try {
                jobName.value = (String) _output.get(new javax.xml.namespace.QName("", "JobName"));
            } catch (Exception _exception) {
                jobName.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "JobName")), String.class);
            }
            try {
                jobState.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "JobState"))).intValue();
            } catch (Exception _exception) {
                jobState.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "JobState")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getNextReportingJobName(int handle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder jobId, javax.xml.rpc.holders.StringHolder jobName, javax.xml.rpc.holders.IntHolder jobState) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[131]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetNextReportingJobName");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetNextReportingJobName"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                jobId.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "JobId"))).intValue();
            } catch (Exception _exception) {
                jobId.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "JobId")), int.class)).intValue();
            }
            try {
                jobName.value = (String) _output.get(new javax.xml.namespace.QName("", "JobName"));
            } catch (Exception _exception) {
                jobName.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "JobName")), String.class);
            }
            try {
                jobState.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "JobState"))).intValue();
            } catch (Exception _exception) {
                jobState.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "JobState")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void loadReportingJob(int handle, String jobName, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder jobHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[132]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#LoadReportingJob");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "LoadReportingJob"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), jobName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                jobHandle.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "JobHandle"))).intValue();
            } catch (Exception _exception) {
                jobHandle.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "JobHandle")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void loadReportingJobByID(int handle, int jobId, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder jobName, javax.xml.rpc.holders.IntHolder jobHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[133]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#LoadReportingJobByID");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "LoadReportingJobByID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(jobId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                jobName.value = (String) _output.get(new javax.xml.namespace.QName("", "JobName"));
            } catch (Exception _exception) {
                jobName.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "JobName")), String.class);
            }
            try {
                jobHandle.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "JobHandle"))).intValue();
            } catch (Exception _exception) {
                jobHandle.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "JobHandle")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getReportingJobProperties(int handle, int jobHandle, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder reportingJobInfoXml) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[134]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetReportingJobProperties");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetReportingJobProperties"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(jobHandle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                reportingJobInfoXml.value = (String) _output.get(new javax.xml.namespace.QName("", "ReportingJobInfoXml"));
            } catch (Exception _exception) {
                reportingJobInfoXml.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ReportingJobInfoXml")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int setReportingJobProperties(int handle, int jobHandle, int propertyKey, String reportingJobInfoXml) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[135]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#SetReportingJobProperties");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "SetReportingJobProperties"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(jobHandle), new Integer(propertyKey), reportingJobInfoXml});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int saveReportingJob(int handle, String jobName, int jobHandle) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[136]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#SaveReportingJob");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "SaveReportingJob"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), jobName, new Integer(jobHandle)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int setReportingJobState(int handle, int jobHandle, int jobState) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[137]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#SetReportingJobState");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "SetReportingJobState"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(jobHandle), new Integer(jobState)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int deleteReportingJobByID(int handle, int jobId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[138]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#DeleteReportingJobByID");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "DeleteReportingJobByID"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(jobId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getProcessManagerTree(int handle, int treeType, String startNodeGuid, int maxNodeLevel, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder treeAsJson) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[139]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetProcessManagerTree");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetProcessManagerTree"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(treeType), startNodeGuid, new Integer(maxNodeLevel)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                treeAsJson.value = (String) _output.get(new javax.xml.namespace.QName("", "TreeAsJson"));
            } catch (Exception _exception) {
                treeAsJson.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "TreeAsJson")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void getNodeBenchmark(int handle, int graphicKey, int graphicSubKey, int benchmModule, int benchmEvalStrat, String nodeId, boolean divBySubNodes, int timeUnit, java.util.Calendar dateTimeStart, java.util.Calendar dateTimeEnd, int partSumField, int width, int height, int outputFormat, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder graphicStr, javax.xml.rpc.holders.StringHolder grafiktransferInfo) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[140]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#GetNodeBenchmark");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "GetNodeBenchmark"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(graphicKey), new Integer(graphicSubKey), new Integer(benchmModule), new Integer(benchmEvalStrat), nodeId, new Boolean(divBySubNodes), new Integer(timeUnit), dateTimeStart, dateTimeEnd, new Integer(partSumField), new Integer(width), new Integer(height), new Integer(outputFormat)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                graphicStr.value = (String) _output.get(new javax.xml.namespace.QName("", "GraphicStr"));
            } catch (Exception _exception) {
                graphicStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GraphicStr")), String.class);
            }
            try {
                grafiktransferInfo.value = (String) _output.get(new javax.xml.namespace.QName("", "GrafiktransferInfo"));
            } catch (Exception _exception) {
                grafiktransferInfo.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "GrafiktransferInfo")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void loadDataOfNode(int handle, String nodeId, boolean loadProcessChars, String queryOptions, java.util.Calendar dateTimeStart, java.util.Calendar dateTimeEnd, String filterConditions, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder loadedDataInfoXml) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[141]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#LoadDataOfNode");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "LoadDataOfNode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), nodeId, new Boolean(loadProcessChars), queryOptions, dateTimeStart, dateTimeEnd, filterConditions});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                loadedDataInfoXml.value = (String) _output.get(new javax.xml.namespace.QName("", "LoadedDataInfoXml"));
            } catch (Exception _exception) {
                loadedDataInfoXml.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "LoadedDataInfoXml")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void loadOeeDataOfNode(int handle, String nodeId, int timeUnit, java.util.Calendar dateTimeStart, java.util.Calendar dateTimeEnd, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder loadedDataInfoXml) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[142]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#LoadOeeDataOfNode");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "LoadOeeDataOfNode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), nodeId, new Integer(timeUnit), dateTimeStart, dateTimeEnd});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                loadedDataInfoXml.value = (String) _output.get(new javax.xml.namespace.QName("", "LoadedDataInfoXml"));
            } catch (Exception _exception) {
                loadedDataInfoXml.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "LoadedDataInfoXml")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void loadReportOfNode(int handle, String nodeId, int reportModule, int reportEvalStrat, int timeUnit, java.util.Calendar dateTimeStart, String reportName, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.StringHolder reportStr) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[143]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#LoadReportOfNode");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "LoadReportOfNode"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), nodeId, new Integer(reportModule), new Integer(reportEvalStrat), new Integer(timeUnit), dateTimeStart, reportName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                reportStr.value = (String) _output.get(new javax.xml.namespace.QName("", "ReportStr"));
            } catch (Exception _exception) {
                reportStr.value = (String) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "ReportStr")), String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int reloadRawValues(int handle, int partNo, int groupNo, int charNo, boolean evaluate) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[144]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#ReloadRawValues");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "ReloadRawValues"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(handle), new Integer(partNo), new Integer(groupNo), new Integer(charNo), new Boolean(evaluate)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void productLicenceFree(int productKey, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.BooleanHolder licenceIsFree) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[145]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#ProductLicenceFree");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "ProductLicenceFree"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(productKey)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                licenceIsFree.value = ((Boolean) _output.get(new javax.xml.namespace.QName("", "LicenceIsFree"))).booleanValue();
            } catch (Exception _exception) {
                licenceIsFree.value = ((Boolean) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "LicenceIsFree")), boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public void productLicenceFreeCount(int productKey, javax.xml.rpc.holders.IntHolder result, javax.xml.rpc.holders.IntHolder licenceCount, javax.xml.rpc.holders.IntHolder freeLicCount) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[146]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#ProductLicenceFreeCount");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "ProductLicenceFreeCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(productKey)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            java.util.Map _output;
            _output = _call.getOutputParams();
            try {
                result.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "Result"))).intValue();
            } catch (Exception _exception) {
                result.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "Result")), int.class)).intValue();
            }
            try {
                licenceCount.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "LicenceCount"))).intValue();
            } catch (Exception _exception) {
                licenceCount.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "LicenceCount")), int.class)).intValue();
            }
            try {
                freeLicCount.value = ((Integer) _output.get(new javax.xml.namespace.QName("", "FreeLicCount"))).intValue();
            } catch (Exception _exception) {
                freeLicCount.value = ((Integer) org.apache.axis.utils.JavaUtils.convert(_output.get(new javax.xml.namespace.QName("", "FreeLicCount")), int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int occupyProductLicence(int productKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[147]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#OccupyProductLicence");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "OccupyProductLicence"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(productKey)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int releaseProductLicence(int productKey) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[148]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service#ReleaseProductLicence");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("urn:Qdas_Web_ServiceIntf-IQdas_Web_Service", "ReleaseProductLicence"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        Object _resp = _call.invoke(new Object[] {new Integer(productKey)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((Integer) _resp).intValue();
            } catch (Exception _exception) {
                return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
