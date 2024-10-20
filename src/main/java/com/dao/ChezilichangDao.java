package com.dao;

import com.entity.ChezilichangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ChezilichangVO;
import com.entity.view.ChezilichangView;


/**
 * 车子离场
 * 
 * @author 
 * @email 
 * @date 2023-05-17 16:29:22
 */
public interface ChezilichangDao extends BaseMapper<ChezilichangEntity> {
	
	List<ChezilichangVO> selectListVO(@Param("ew") Wrapper<ChezilichangEntity> wrapper);
	
	ChezilichangVO selectVO(@Param("ew") Wrapper<ChezilichangEntity> wrapper);
	
	List<ChezilichangView> selectListView(@Param("ew") Wrapper<ChezilichangEntity> wrapper);

	List<ChezilichangView> selectListView(Pagination page,@Param("ew") Wrapper<ChezilichangEntity> wrapper);
	
	ChezilichangView selectView(@Param("ew") Wrapper<ChezilichangEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChezilichangEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChezilichangEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ChezilichangEntity> wrapper);



}
