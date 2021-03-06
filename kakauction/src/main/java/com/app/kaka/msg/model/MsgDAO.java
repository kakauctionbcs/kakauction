package com.app.kaka.msg.model;

import java.util.List;
import java.util.Map;

import com.app.kaka.common.MsgSearchVO;

public interface MsgDAO {
	public int sendMessage(MsgVO msgVo);
	public List<Map<String, Object>> selectByMemberId(MsgSearchVO searchVo);
	public int selectTotalCount(MsgSearchVO searchVo);
	public int newMessage(String memberId);
	public MsgVO selectByMsgNo(int msgNo);
	public int updateMsgConfirm(int msgNo);
}
