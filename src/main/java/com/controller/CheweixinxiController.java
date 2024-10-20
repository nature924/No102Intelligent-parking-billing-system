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

import com.entity.CheweixinxiEntity;
import com.entity.view.CheweixinxiView;

import com.service.CheweixinxiService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;
import java.io.IOException;

/**
 * 车位信息
 * 后端接口
 * @author 
 * @email 
 * @date 2023-05-17 16:29:22
 */
@RestController
@RequestMapping("/cheweixinxi")
public class CheweixinxiController {
    @Autowired
    private CheweixinxiService cheweixinxiService;


    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,CheweixinxiEntity cheweixinxi,
		HttpServletRequest request){
        EntityWrapper<CheweixinxiEntity> ew = new EntityWrapper<CheweixinxiEntity>();

		PageUtils page = cheweixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, cheweixinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,CheweixinxiEntity cheweixinxi, 
		HttpServletRequest request){
        EntityWrapper<CheweixinxiEntity> ew = new EntityWrapper<CheweixinxiEntity>();

		PageUtils page = cheweixinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, cheweixinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( CheweixinxiEntity cheweixinxi){
       	EntityWrapper<CheweixinxiEntity> ew = new EntityWrapper<CheweixinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( cheweixinxi, "cheweixinxi")); 
        return R.ok().put("data", cheweixinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(CheweixinxiEntity cheweixinxi){
        EntityWrapper< CheweixinxiEntity> ew = new EntityWrapper< CheweixinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( cheweixinxi, "cheweixinxi")); 
		CheweixinxiView cheweixinxiView =  cheweixinxiService.selectView(ew);
		return R.ok("查询车位信息成功").put("data", cheweixinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        CheweixinxiEntity cheweixinxi = cheweixinxiService.selectById(id);
        return R.ok().put("data", cheweixinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        CheweixinxiEntity cheweixinxi = cheweixinxiService.selectById(id);
        return R.ok().put("data", cheweixinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody CheweixinxiEntity cheweixinxi, HttpServletRequest request){
    	cheweixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(cheweixinxi);
        cheweixinxiService.insert(cheweixinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody CheweixinxiEntity cheweixinxi, HttpServletRequest request){
    	cheweixinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(cheweixinxi);
        cheweixinxiService.insert(cheweixinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody CheweixinxiEntity cheweixinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(cheweixinxi);
        cheweixinxiService.updateById(cheweixinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        cheweixinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	









}
