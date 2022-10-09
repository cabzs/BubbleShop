package dto;

public class Reqna {
	private int reQnaId;
	private int qnaId;
	private String memberId;
	private String reQnaContent;
	
	public Reqna(int reQnaId, int qnaId, String memberId, String reQnaContent) {
		super();
		this.reQnaId = reQnaId;
		this.qnaId = qnaId;
		this.memberId = memberId;
		this.reQnaContent = reQnaContent;
	}

	public int getReQnaId() {
		return reQnaId;
	}

	public void setReQnaId(int reQnaId) {
		this.reQnaId = reQnaId;
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

	public String getReQnaContent() {
		return reQnaContent;
	}

	public void setReQnaContent(String reQnaContent) {
		this.reQnaContent = reQnaContent;
	}
	
	

}
