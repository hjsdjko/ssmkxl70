package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.YuanbulixiaoshenqingEntity;
import com.entity.view.YuanbulixiaoshenqingView;

import com.service.YuanbulixiaoshenqingService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;


/**
 * 院部离校申请
 * 后端接口
 * @author 
 * @email 
 * @date 2021-03-27 00:24:19
 */
@RestController
@RequestMapping("/yuanbulixiaoshenqing")
public class YuanbulixiaoshenqingController {
    @Autowired
    private YuanbulixiaoshenqingService yuanbulixiaoshenqingService;
    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,YuanbulixiaoshenqingEntity yuanbulixiaoshenqing, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			yuanbulixiaoshenqing.setXuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("fudaoyuan")) {
			yuanbulixiaoshenqing.setFudaoyuangonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yuanshuji")) {
			yuanbulixiaoshenqing.setYuanshujigonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YuanbulixiaoshenqingEntity> ew = new EntityWrapper<YuanbulixiaoshenqingEntity>();
		PageUtils page = yuanbulixiaoshenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuanbulixiaoshenqing), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,YuanbulixiaoshenqingEntity yuanbulixiaoshenqing, HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			yuanbulixiaoshenqing.setXuehao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("fudaoyuan")) {
			yuanbulixiaoshenqing.setFudaoyuangonghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yuanshuji")) {
			yuanbulixiaoshenqing.setYuanshujigonghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<YuanbulixiaoshenqingEntity> ew = new EntityWrapper<YuanbulixiaoshenqingEntity>();
		PageUtils page = yuanbulixiaoshenqingService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, yuanbulixiaoshenqing), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( YuanbulixiaoshenqingEntity yuanbulixiaoshenqing){
       	EntityWrapper<YuanbulixiaoshenqingEntity> ew = new EntityWrapper<YuanbulixiaoshenqingEntity>();
      	ew.allEq(MPUtil.allEQMapPre( yuanbulixiaoshenqing, "yuanbulixiaoshenqing")); 
        return R.ok().put("data", yuanbulixiaoshenqingService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(YuanbulixiaoshenqingEntity yuanbulixiaoshenqing){
        EntityWrapper< YuanbulixiaoshenqingEntity> ew = new EntityWrapper< YuanbulixiaoshenqingEntity>();
 		ew.allEq(MPUtil.allEQMapPre( yuanbulixiaoshenqing, "yuanbulixiaoshenqing")); 
		YuanbulixiaoshenqingView yuanbulixiaoshenqingView =  yuanbulixiaoshenqingService.selectView(ew);
		return R.ok("查询院部离校申请成功").put("data", yuanbulixiaoshenqingView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        YuanbulixiaoshenqingEntity yuanbulixiaoshenqing = yuanbulixiaoshenqingService.selectById(id);
        return R.ok().put("data", yuanbulixiaoshenqing);
    }

    /**
     * 前端详情
     */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        YuanbulixiaoshenqingEntity yuanbulixiaoshenqing = yuanbulixiaoshenqingService.selectById(id);
        return R.ok().put("data", yuanbulixiaoshenqing);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody YuanbulixiaoshenqingEntity yuanbulixiaoshenqing, HttpServletRequest request){
    	yuanbulixiaoshenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yuanbulixiaoshenqing);

        yuanbulixiaoshenqingService.insert(yuanbulixiaoshenqing);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody YuanbulixiaoshenqingEntity yuanbulixiaoshenqing, HttpServletRequest request){
    	yuanbulixiaoshenqing.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(yuanbulixiaoshenqing);
    	yuanbulixiaoshenqing.setUserid((Long)request.getSession().getAttribute("userId"));

        yuanbulixiaoshenqingService.insert(yuanbulixiaoshenqing);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody YuanbulixiaoshenqingEntity yuanbulixiaoshenqing, HttpServletRequest request){
        //ValidatorUtils.validateEntity(yuanbulixiaoshenqing);
        yuanbulixiaoshenqingService.updateById(yuanbulixiaoshenqing);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        yuanbulixiaoshenqingService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<YuanbulixiaoshenqingEntity> wrapper = new EntityWrapper<YuanbulixiaoshenqingEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			wrapper.eq("xuehao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("fudaoyuan")) {
			wrapper.eq("fudaoyuangonghao", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("yuanshuji")) {
			wrapper.eq("yuanshujigonghao", (String)request.getSession().getAttribute("username"));
		}

		int count = yuanbulixiaoshenqingService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	


}
