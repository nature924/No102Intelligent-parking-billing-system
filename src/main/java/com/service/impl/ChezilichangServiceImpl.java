package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ChezilichangDao;
import com.entity.ChezilichangEntity;
import com.service.ChezilichangService;
import com.entity.vo.ChezilichangVO;
import com.entity.view.ChezilichangView;

@Service("chezilichangService")
public class ChezilichangServiceImpl extends ServiceImpl<ChezilichangDao, ChezilichangEntity> implements ChezilichangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChezilichangEntity> page = this.selectPage(
                new Query<ChezilichangEntity>(params).getPage(),
                new EntityWrapper<ChezilichangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChezilichangEntity> wrapper) {
		  Page<ChezilichangView> page =new Query<ChezilichangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChezilichangVO> selectListVO(Wrapper<ChezilichangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChezilichangVO selectVO(Wrapper<ChezilichangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChezilichangView> selectListView(Wrapper<ChezilichangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChezilichangView selectView(Wrapper<ChezilichangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ChezilichangEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ChezilichangEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ChezilichangEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
