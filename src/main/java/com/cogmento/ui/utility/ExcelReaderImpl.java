package com.cogmento.ui.utility;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.cogmento.ui.iHelper.IExcelReader;

public class ExcelReaderImpl implements IExcelReader {
	XSSFSheet sheet;

	void ExcelReaderImpl(String excelPath, String sheetName) {

		try {

			XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(excelPath));
			sheet = workbook.getSheet(sheetName);
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	Object getSpecificSheetData(int rows, int columns) {
		XSSFCell cell = sheet.getRow(rows).getCell(columns);

		if (cell.getCellType() == XSSFCell.CELL_TYPE_STRING) {
			return cell.getStringCellValue();
		} else if (cell.getCellType() == XSSFCell.CELL_TYPE_NUMERIC) {
			return cell.getRawValue();
		} else if (cell.getCellType() == XSSFCell.CELL_TYPE_BOOLEAN) {
			return cell.getBooleanCellValue();
		} else if (cell.getCellType() == XSSFCell.CELL_TYPE_FORMULA) {
			return cell.getCellFormula();
		} else if (cell.getCellType() == XSSFCell.CELL_TYPE_BLANK) {
			return " ";
		} else {
			return null;
		}
	}

	@Override
	public Object[][] getAllSheetData() {

		int totalRows = sheet.getLastRowNum();
		int totalColumns = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[totalRows][totalColumns];

		for (int i = 1; i <= totalRows; i++) {
			for (int j = 0; j < totalColumns; j++) {

				data[i - 1][j] = getSpecificSheetData(i, j);
			}
		}
		return data;
	}

	@Override
	public Object[][] getAllSheetData(int startRow, int endRow) {

		int totalRows = endRow - startRow;
		int totalColumns = sheet.getRow(0).getLastCellNum();

		Object[][] data = new Object[totalRows][totalColumns];

		int k = 0;
		for (int i = endRow; i < totalRows; i++) {
			for (int j = 0; j < totalColumns; j++) {

				data[k][j] = getSpecificSheetData(i, j);
			}
		}
		return data;
	}

	@Override
	public Object[][] getAllSheetData(int startRow, int startColumn, int endRow, int endColumn) {

		int totalRows = endRow - startRow;
		int totalColumns = endColumn - startColumn;

		Object[][] data = new Object[totalRows][totalColumns];

		int k = 0;
		for (int i = startRow; i < endRow; i++) {
			int l = 0;
			for (int j = startColumn; j < endColumn; j++) {

				data[k][l] = getSpecificSheetData(i, j);
			}
		}
		return data;
	}

}
