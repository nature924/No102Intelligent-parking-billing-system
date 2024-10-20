package com.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
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
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.ChezijinchangEntity;
import com.entity.view.ChezijinchangView;

import com.service.ChezijinchangService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 车子进场
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-17 16:29:22
 */
@RestController
@RequestMapping("/chezijinchang")
public class ChezijinchangController {
    @Autowired
    private ChezijinchangService chezijinchangService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ChezijinchangEntity chezijinchang,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			chezijinchang.setYonghuzhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ChezijinchangEntity> ew = new EntityWrapper<ChezijinchangEntity>();

		PageUtils page = chezijinchangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chezijinchang), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ChezijinchangEntity chezijinchang, 
		HttpServletRequest request){
        EntityWrapper<ChezijinchangEntity> ew = new EntityWrapper<ChezijinchangEntity>();

		PageUtils page = chezijinchangService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, chezijinchang), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ChezijinchangEntity chezijinchang){
       	EntityWrapper<ChezijinchangEntity> ew = new EntityWrapper<ChezijinchangEntity>();
      	ew.allEq(MPUtil.allEQMapPre( chezijinchang, "chezijinchang")); 
        return R.ok().put("data", chezijinchangService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ChezijinchangEntity chezijinchang){
        EntityWrapper< ChezijinchangEntity> ew = new EntityWrapper< ChezijinchangEntity>();
 		ew.allEq(MPUtil.allEQMapPre( chezijinchang, "chezijinchang")); 
		ChezijinchangView chezijinchangView =  chezijinchangService.selectView(ew);
		return R.ok("查询车子进场成功").put("data", chezijinchangView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ChezijinchangEntity chezijinchang = chezijinchangService.selectById(id);
        return R.ok().put("data", chezijinchang);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ChezijinchangEntity chezijinchang = chezijinchangService.selectById(id);
        return R.ok().put("data", chezijinchang);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ChezijinchangEntity chezijinchang, HttpServletRequest request){
    	chezijinchang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chezijinchang);
        chezijinchangService.insert(chezijinchang);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ChezijinchangEntity chezijinchang, HttpServletRequest request){
    	chezijinchang.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(chezijinchang);
        chezijinchangService.insert(chezijinchang);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ChezijinchangEntity chezijinchang, HttpServletRequest request){
        //ValidatorUtils.validateEntity(chezijinchang);
        chezijinchangService.updateById(chezijinchang);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        chezijinchangService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
