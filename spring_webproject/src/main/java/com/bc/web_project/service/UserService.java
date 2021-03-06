package com.bc.web_project.service;

import java.util.Date;
import java.util.Map;

import com.bc.web_project.dto.LoginDTO;
import com.bc.web_project.vo.UserVo;

public interface UserService {
	public UserVo login(LoginDTO dto) throws Exception;
	public UserVo signup(UserVo userVo) throws Exception;
	public UserVo selectId(String id) throws Exception;
	public Map<String,Object> selectList(int page) throws Exception;
	public String searchPw(UserVo userVo) throws Exception;
	public void keepLogin(String id, String sessionId, Date next) throws Exception;
	public UserVo checkLoginBefore(String value);
}

