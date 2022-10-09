package dto;

import java.time.LocalDate;

public class Qna {
	private int qnaId;
	private String memberId;
	private String qnaTitle;
	private String qnaContent;
	private LocalDate qnaDate;
	
	public Qna(int qnaId, String memberId, String qnaTitle, String qnaContent, LocalDate qnaDate) {
		super();
		this.qnaId = qnaId;
		this.memberId = memberId;
		this.qnaTitle = qnaTitle;
		this.qnaContent = qnaContent;
		this.qnaDate = qnaDate;
	}

	public int getQnaId() {
		return qnaId;
	}

	public void setQnaId(int qnaId) {
		this.qnaId = qnaId;
	}

	public String getMemberId() {
		return memberId;
	}

	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}

	public String getQnaTitle() {
		return qnaTitle;
	}

	public void setQnaTitle(String qnaTitle) {
		this.qnaTitle = qnaTitle;
	}

	public String getQnaContent() {
		return qnaContent;
	}

	public void setQnaContent(String qnaContent) {
		this.qnaContent = qnaContent;
	}

	public LocalDate getQnaDate() {
		return qnaDate;
	}

	public void setQnaDate(LocalDate qnaDate) {
		this.qnaDate = qnaDate;
	}
	
	

}
