package cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/ice")
public class MainController {


	@RequestMapping("/totiaozhuan")
	public ModelAndView totiaozhuan(String id, String userID, String pay_no, String pay_id, String price, String param,
			String status, String trade_no, String endTime, String trueID, String mode, String notify_count,
			String qr_user, String ok, String type, String money, String pay_time, String tag, String target,
			String codepay_server_time, String sign, ModelAndView md) {
		if (price.equals(money) && param.equals("ok")) {
			md.addObject("result", "ok");
		} else {
			md.addObject("result", "no");
		}
		return md;
	}
}
