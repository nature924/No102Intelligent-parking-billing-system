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


import com.dao.CheweifenleiDao;
import com.entity.CheweifenleiEntity;
import com.service.CheweifenleiService;
import com.entity.vo.CheweifenleiVO;
import com.entity.view.CheweifenleiView;

@Service("cheweifenleiService")
public class CheweifenleiServiceImpl extends ServiceImpl<CheweifenleiDao, CheweifenleiEntity> implements CheweifenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CheweifenleiEntity> page = this.selectPage(
                new Query<CheweifenleiEntity>(params).getPage(),
                new EntityWrapper<CheweifenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CheweifenleiEntity> wrapper) {
		  Page<CheweifenleiView> page =new Query<CheweifenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CheweifenleiVO> selectListVO(Wrapper<CheweifenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CheweifenleiVO selectVO(Wrapper<CheweifenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CheweifenleiView> selectListView(Wrapper<CheweifenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CheweifenleiView selectView(Wrapper<CheweifenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
