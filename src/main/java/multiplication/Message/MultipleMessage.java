package multiplication.Message;

public enum MultipleMessage {
	PLAYER("플레이어 정보를 확인해주세요"),
	NUMBER("숫자는 1이상 50이하 만 입력 가능합니다."),
	RANGE("범위는 1이상 50이하 만 입력 가능합니다.");

	private String errorMessage;

	MultipleMessage(String message) {
		this.errorMessage = message;
	}

	@Override
	public String toString(){
		return errorMessage;
	}
}



