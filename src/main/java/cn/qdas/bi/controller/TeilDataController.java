package cn.qdas.bi.controller;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.qdas.bi.bean.Teil;
import cn.qdas.bi.service.ITeilDataService;

@Controller
@RequestMapping("/teil")
public class TeilDataController {
	@Resource
	ITeilDataService teilDataService;
	@RequestMapping("initTeil")
	public String initTeilPage() {
		return "bi/td/teilMeasureData";
	}
	@RequestMapping("initTeilDataPage")
	public String initTeilDataPage() {
		return "bi/td/teilData";
	}
	@RequestMapping("getTeilData")
	@ResponseBody
	public Map getTeilData(Teil teil) {
		Map map=teilDataService.getAllTeil(teil);
		return map;
	}
	@RequestMapping("initMerkmalPage")
	public String initMerkmalPage(Model model,Teil teil) {
		model.addAttribute("teilId", teil.getTeilId());
		return "bi/td/merkmalData";
	}
	@RequestMapping("getMerkmalData")
	@ResponseBody
	public Map getMerkmalData(Teil teil) {
		Map map = teilDataService.getAllMerkmal(teil);
		return map;
	}
	@RequestMapping("initWertevarPage")
	public String initWertevarPage(Model model,Teil teil) {
		model.addAttribute("teilId", teil.getTeilId());
		model.addAttribute("merkmalId", teil.getMerkmalId());
		return "bi/td/wertevarData";
	}
	@RequestMapping("getWertevarData")
	@ResponseBody
	public Map getWertevarData(Teil teil) {
		Map map = teilDataService.getAllWertevar(teil);
		return map;
	}
}
