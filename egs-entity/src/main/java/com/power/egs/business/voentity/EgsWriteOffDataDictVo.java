package com.power.egs.business.voentity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import com.power.platform.sys.entity.Dict;

/**
 * 冲销VO
 * @author wanghaitao
 * @version 2016-03-14
 */
public class EgsWriteOffDataDictVo implements Serializable{
	
	private static final long serialVersionUID = 1L;
	private List<Dict> dictlist=new ArrayList<Dict>();
	EgsWriteOffDataVo egsWriteOffDataVo=new EgsWriteOffDataVo();
	public List<Dict> getDictlist() {
		return dictlist;
	}
	public void setDictlist(List<Dict> dictlist) {
		this.dictlist = dictlist;
	}
	public EgsWriteOffDataVo getEgsWriteOffDataVo() {
		return egsWriteOffDataVo;
	}
	public void setEgsWriteOffDataVo(EgsWriteOffDataVo egsWriteOffDataVo) {
		this.egsWriteOffDataVo = egsWriteOffDataVo;
	}

}