package com.entity.view;

import com.entity.ChezijinchangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 车子进场
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-17 16:29:22
 */
@TableName("chezijinchang")
public class ChezijinchangView  extends ChezijinchangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChezijinchangView(){
	}
 
 	public ChezijinchangView(ChezijinchangEntity chezijinchangEntity){
 	try {
			BeanUtils.copyProperties(this, chezijinchangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
