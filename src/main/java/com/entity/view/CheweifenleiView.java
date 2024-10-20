package com.entity.view;

import com.entity.CheweifenleiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 车位分类
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-05-17 16:29:22
 */
@TableName("cheweifenlei")
public class CheweifenleiView  extends CheweifenleiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CheweifenleiView(){
	}
 
 	public CheweifenleiView(CheweifenleiEntity cheweifenleiEntity){
 	try {
			BeanUtils.copyProperties(this, cheweifenleiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
