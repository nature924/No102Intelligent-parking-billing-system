package com.dao;

import com.entity.CheweifenleiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CheweifenleiVO;
import com.entity.view.CheweifenleiView;


/**
 * 车位分类
 * 
 * @author 
 * @email 
 * @date 2023-05-17 16:29:22
 */
public interface CheweifenleiDao extends BaseMapper<CheweifenleiEntity> {
	
	List<CheweifenleiVO> selectListVO(@Param("ew") Wrapper<CheweifenleiEntity> wrapper);
	
	CheweifenleiVO selectVO(@Param("ew") Wrapper<CheweifenleiEntity> wrapper);
	
	List<CheweifenleiView> selectListView(@Param("ew") Wrapper<CheweifenleiEntity> wrapper);

	List<CheweifenleiView> selectListView(Pagination page,@Param("ew") Wrapper<CheweifenleiEntity> wrapper);
	
	CheweifenleiView selectView(@Param("ew") Wrapper<CheweifenleiEntity> wrapper);
	

}
