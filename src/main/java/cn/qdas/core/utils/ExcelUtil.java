/**
 * 
 */
package cn.qdas.core.utils;

import java.io.OutputStream;
import java.net.URLEncoder;

import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.IndexedColors;

/**
 * @author leo.Zhou 周钧
 * 2019年10月29日
 */
public class ExcelUtil {
	public static void exportExcelMcSearch(String fileName,String sheetName,String [] title,String[][]values,HttpServletResponse response ) throws Exception{
		HSSFWorkbook workbook=new HSSFWorkbook();
		HSSFSheet sheet1 = workbook.createSheet(sheetName);
		HSSFRow row1 = sheet1.createRow(0);
		HSSFCell cell = null;
		for(int i=0;i<title.length;i++) {
			cell=row1.createCell(i);
			cell.setCellValue(title[i]);
			cell.setCellStyle(getCellStyle(workbook));
		}
		for(int i=0;i<values.length;i++){
			 row1 = sheet1.createRow(i + 1);
	         for(int j=0;j<values[i].length;j++){
	               //将内容按顺序赋给对应的列对象
	            row1.createCell(j).setCellValue(values[i][j]);
	         }
	    }
		OutputStream os=response.getOutputStream();
		response.reset();
		response.setHeader("Content-disposition", "attachment;filename="+URLEncoder.encode(fileName, "UTF-8"));
		workbook.write(os);
		os.close();
	}

	private static HSSFCellStyle getCellStyle(HSSFWorkbook workbook) {
		HSSFFont font=workbook.createFont();
		font.setFontHeightInPoints((short) 10);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		font.setFontName("宋体");
		HSSFCellStyle style=workbook.createCellStyle();
		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBottomBorderColor(HSSFColor.BLACK.index);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setLeftBorderColor(HSSFColor.BLACK.index);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setRightBorderColor(HSSFColor.BLACK.index);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setTopBorderColor(HSSFColor.BLACK.index);
		style.setFont(font);
		style.setWrapText(false);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		
		return style;
	}

	private static HSSFCellStyle getColumTopStyle(HSSFWorkbook workbook) {
		HSSFFont font=workbook.createFont();
		font.setFontHeightInPoints((short) 11);
		font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
		font.setFontName("宋体");
		HSSFCellStyle style=workbook.createCellStyle();
		style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
		style.setBottomBorderColor(HSSFColor.BLACK.index);
		style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
		style.setLeftBorderColor(HSSFColor.BLACK.index);
		style.setBorderRight(HSSFCellStyle.BORDER_THIN);
		style.setRightBorderColor(HSSFColor.BLACK.index);
		style.setBorderTop(HSSFCellStyle.BORDER_THIN);
		style.setTopBorderColor(HSSFColor.BLACK.index);
		style.setFont(font);
		style.setWrapText(false);
		style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
		style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
		
		style.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex());
		style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
		return style;
	}
}
