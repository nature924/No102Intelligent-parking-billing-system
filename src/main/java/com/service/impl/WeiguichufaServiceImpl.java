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


import com.dao.WeiguichufaDao;
import com.entity.WeiguichufaEntity;
import com.service.WeiguichufaService;
import com.entity.vo.WeiguichufaVO;
import com.entity.view.WeiguichufaView;

@Service("weiguichufaService")
public class WeiguichufaServiceImpl extends ServiceImpl<WeiguichufaDao, WeiguichufaEntity> implements WeiguichufaService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WeiguichufaEntity> page = this.selectPage(
                new Query<WeiguichufaEntity>(params).getPage(),
                new EntityWrapper<WeiguichufaEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WeiguichufaEntity> wrapper) {
		  Page<WeiguichufaView> page =new Query<WeiguichufaView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WeiguichufaVO> selectListVO(Wrapper<WeiguichufaEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WeiguichufaVO selectVO(Wrapper<WeiguichufaEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WeiguichufaView> selectListView(Wrapper<WeiguichufaEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WeiguichufaView selectView(Wrapper<WeiguichufaEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<WeiguichufaEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<WeiguichufaEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<WeiguichufaEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
