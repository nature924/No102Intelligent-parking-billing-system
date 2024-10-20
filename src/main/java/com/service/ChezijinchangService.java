package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ChezijinchangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ChezijinchangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ChezijinchangView;


/**
 * 车子进场
 *
 * @author 
 * @email 
 * @date 2023-05-17 16:29:22
 */
public interface ChezijinchangService extends IService<ChezijinchangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ChezijinchangVO> selectListVO(Wrapper<ChezijinchangEntity> wrapper);
   	
   	ChezijinchangVO selectVO(@Param("ew") Wrapper<ChezijinchangEntity> wrapper);
   	
   	List<ChezijinchangView> selectListView(Wrapper<ChezijinchangEntity> wrapper);
   	
   	ChezijinchangView selectView(@Param("ew") Wrapper<ChezijinchangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ChezijinchangEntity> wrapper);
   	

}

