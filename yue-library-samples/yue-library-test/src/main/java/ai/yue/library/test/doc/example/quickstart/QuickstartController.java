package ai.yue.library.test.doc.example.quickstart;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONObject;

import ai.yue.library.base.view.Result;
import ai.yue.library.base.view.ResultInfo;

/**
 * @author	ylyue
 * @since	2020年8月16日
 */
@RestController
@RequestMapping("/quickstart")
public class QuickstartController {

	@GetMapping("/get")
	public Result<?> get(JSONObject paramJson) {
		return ResultInfo.success(paramJson);
	}
	
}
