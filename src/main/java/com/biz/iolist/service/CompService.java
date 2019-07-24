package com.biz.iolist.service;

import java.util.List;

import com.biz.iolist.model.CompVO;

public interface CompService {

	
	public List<CompVO> selectAll();
	
	
	public CompVO findByCCode(String c_code);
	
	
	public List<CompVO> findByCName(String c_name);
	
	
	public List<CompVO> findByCTel(String c_tel);
}
