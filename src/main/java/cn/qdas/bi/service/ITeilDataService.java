package cn.qdas.bi.service;

import java.util.Map;

import cn.qdas.bi.bean.Teil;

public interface ITeilDataService {
	Map getAllTeil(Teil teil);
	Map getAllMerkmal(Teil teil);
	Map getAllWertevar(Teil teil);
}
