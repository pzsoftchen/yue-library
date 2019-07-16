package ai.yue.library.template.controller.redbag;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;

/**
 * @author  孙金川
 * @version 创建时间：2018年5月14日
 */
@RestController
@RequestMapping("/redbag")
public class RedbagController {

	@GetMapping("/get")
	public Result<?> get() {

		return ResultInfo.success();
	}
	
}