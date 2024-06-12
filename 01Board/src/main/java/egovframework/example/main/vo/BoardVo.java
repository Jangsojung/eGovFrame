package egovframework.example.main.vo;

import java.util.Date;

public class BoardVo {
	private int BOARD_NO;
	private String BOARD_TITLE;
	private String BOARD_CONTENTS;
	private String BOARD_WRITER;
	private Date BOARD_WRITEDATE;
	
	public int getBOARD_NO() {
		return BOARD_NO;
	}
	public void setBOARD_NO(int bOARD_NO) {
		BOARD_NO = bOARD_NO;
	}
	public String getBOARD_TITLE() {
		return BOARD_TITLE;
	}
	public void setBOARD_TITLE(String bOARD_TITLE) {
		BOARD_TITLE = bOARD_TITLE;
	}
	public String getBOARD_CONTENTS() {
		return BOARD_CONTENTS;
	}
	public void setBOARD_CONTENTS(String bOARD_CONTENTS) {
		BOARD_CONTENTS = bOARD_CONTENTS;
	}
	public String getBOARD_WRITER() {
		return BOARD_WRITER;
	}
	public void setBOARD_WRITER(String bOARD_WRITER) {
		BOARD_WRITER = bOARD_WRITER;
	}
	public Date getBOARD_WRITEDATE() {
		return BOARD_WRITEDATE;
	}
	public void setBOARD_WRITEDATE(Date bOARD_WRITEDATE) {
		BOARD_WRITEDATE = bOARD_WRITEDATE;
	}
}
