package cn.qdas.bi.dao;

import java.util.List;

import cn.qdas.bi.bean.Teil;

public interface TeilDataMapper {
	List getAllTeil(Teil teil);
	List getAllMerkmal(Teil teil);
	List getAllWertevar(Teil teil);
}
