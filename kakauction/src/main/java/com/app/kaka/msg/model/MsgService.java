package com.app.kaka.msg.model;

import java.util.List;
import java.util.Map;

import com.app.kaka.common.MsgSearchVO;
import com.app.kaka.member.model.MemberVO;
import com.app.kaka.report.model.ReportVO;

public interface MsgService {
	public int sendMessage(MemberVO memVo, ReportVO reportVo, MsgVO msgVo);
	public List<Map<String, Object>> selectByMemberId(MsgSearchVO searchVo);
	public int selectTotalCount(MsgSearchVO searchVo);
	public int newMessage(String memberId);
	public MsgVO selectByMsgNo(int msgNo);
}
