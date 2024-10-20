package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChezilichangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChezilichangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChezilichangView;


/**
 * 车子离场
 *
 * @author 
 * @email 
 * @date 2023-05-17 16:29:22
 */
public interface ChezilichangService extends IService<ChezilichangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChezilichangVO> selectListVO(Wrapper<ChezilichangEntity> wrapper);
   	
   	ChezilichangVO selectVO(@Param("ew") Wrapper<ChezilichangEntity> wrapper);
   	
   	List<ChezilichangView> selectListView(Wrapper<ChezilichangEntity> wrapper);
   	
   	ChezilichangView selectView(@Param("ew") Wrapper<ChezilichangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChezilichangEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ChezilichangEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ChezilichangEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ChezilichangEntity> wrapper);



}

