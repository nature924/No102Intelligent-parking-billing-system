package com.entity.view;

import com.entity.ChezilichangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 车子离场
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-17 16:29:22
 */
@TableName("chezilichang")
public class ChezilichangView  extends ChezilichangEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ChezilichangView(){
	}
 
 	public ChezilichangView(ChezilichangEntity chezilichangEntity){
 	try {
			BeanUtils.copyProperties(this, chezilichangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
