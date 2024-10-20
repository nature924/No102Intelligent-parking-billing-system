package com.dao;

import com.entity.ChezijinchangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChezijinchangVO;
import com.entity.view.ChezijinchangView;


/**
 * 车子进场
 * 
 * @author 
 * @email 
 * @date 2023-05-17 16:29:22
 */
public interface ChezijinchangDao extends BaseMapper<ChezijinchangEntity> {
	
	List<ChezijinchangVO> selectListVO(@Param("ew") Wrapper<ChezijinchangEntity> wrapper);
	
	ChezijinchangVO selectVO(@Param("ew") Wrapper<ChezijinchangEntity> wrapper);
	
	List<ChezijinchangView> selectListView(@Param("ew") Wrapper<ChezijinchangEntity> wrapper);

	List<ChezijinchangView> selectListView(Pagination page,@Param("ew") Wrapper<ChezijinchangEntity> wrapper);
	
	ChezijinchangView selectView(@Param("ew") Wrapper<ChezijinchangEntity> wrapper);
	

}
