package com.cogmento.ui.iHelper;

public interface IExcelReader {

	Object[][] getAllSheetData();

	Object[][] getAllSheetData(int startRow, int endRow);

	Object[][] getAllSheetData(int startRow,int startColumn, int endRow, int endColumn);
}
