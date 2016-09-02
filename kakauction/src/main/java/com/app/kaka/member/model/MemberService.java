package com.app.kaka.member.model;


public interface MemberService {
	//아이디 중복 확인 시 사용하는 상수
	//해당 아이디가 존재하는지 여부
	public static final int EXIST_ID=1; //해당아이디가 존재
	public static final int NONE_EXIST_ID=2;
	//=> 해당 아이디가 존재하지 않음
	
	//주민등록번호 확인
	public static final int EXIST_JUMIN=1;
	public static final int NONE_EXIST_JUMIN=2;
	
	//로그인 처리시 사용하는 상수	
	public static final int LOGIN_OK=1; //로그인 성공
	public static final int PWD_DISAGREE=2;//비밀번호 불일치
	public static final int ID_NONE=3; //해당아이디가 없는 경우
	
	public int insertMember(MemberVO memberVo);
	public int checkMemberId(String memberId);
	public int loginCheck(MemberVO memberVo);
	public MemberVO selectMemberByUserid(String memberId);
	public int updateMember(MemberVO memberVo);
	public int memberOut(String memberId);
	public int checkMemberJumin(String memberJumin);
}
