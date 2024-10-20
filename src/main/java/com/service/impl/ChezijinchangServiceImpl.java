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


import com.dao.ChezijinchangDao;
import com.entity.ChezijinchangEntity;
import com.service.ChezijinchangService;
import com.entity.vo.ChezijinchangVO;
import com.entity.view.ChezijinchangView;

@Service("chezijinchangService")
public class ChezijinchangServiceImpl extends ServiceImpl<ChezijinchangDao, ChezijinchangEntity> implements ChezijinchangService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ChezijinchangEntity> page = this.selectPage(
                new Query<ChezijinchangEntity>(params).getPage(),
                new EntityWrapper<ChezijinchangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ChezijinchangEntity> wrapper) {
		  Page<ChezijinchangView> page =new Query<ChezijinchangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ChezijinchangVO> selectListVO(Wrapper<ChezijinchangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ChezijinchangVO selectVO(Wrapper<ChezijinchangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ChezijinchangView> selectListView(Wrapper<ChezijinchangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ChezijinchangView selectView(Wrapper<ChezijinchangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
