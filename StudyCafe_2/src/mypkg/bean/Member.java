package mypkg.bean;

public class Member {
	private String id;// 아이디
	private String password;// 패스워드
	private String pwquestion;// 비밀번호 질문
	private String pwanswer; // 비밀번호 답변
	private String name; // 회원 이름
	private String birth; // 생년월일
	private String gender; // 성별
	private String phone; // 휴대폰 번호
	private String email01; // 이메일 앞 주소
	private String email02; // 이메일 뒷 주소
	private String visit; // 방문 목적
	private String agreement; // 개인정보 동의
	private String remark; // 비고

	// 매개변수 없는 생성자, getter , setter , toString 구현
	public Member() {
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPwquestion() {
		return pwquestion;
	}

	public void setPwquestion(String pwquestion) {
		this.pwquestion = pwquestion;
	}

	public String getPwanswer() {
		return pwanswer;
	}

	public void setPwanswer(String pwanswer) {
		this.pwanswer = pwanswer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail01() {
		return email01;
	}

	public void setEmail01(String email01) {
		this.email01 = email01;
	}

	public String getEmail02() {
		return email02;
	}

	public void setEmail02(String email02) {
		this.email02 = email02;
	}

	public String getVisit() {
		return visit;
	}

	public void setVisit(String visit) {
		this.visit = visit;
	}

	public String getAgreement() {
		return agreement;
	}

	public void setAgreement(String agreement) {
		this.agreement = agreement;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Member [id=" + id + ", password=" + password + ", pwquestion=" + pwquestion + ", pwanswer=" + pwanswer
				+ ", name=" + name + ", birth=" + birth + ", gender=" + gender + ", phone=" + phone + ", email01="
				+ email01 + ", email02=" + email02 + ", visit=" + visit + ", agreement=" + agreement + ", remark="
				+ remark + "]";
	}

}
