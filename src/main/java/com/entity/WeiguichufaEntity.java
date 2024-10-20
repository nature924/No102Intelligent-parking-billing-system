package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 违规处罚
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-05-17 16:29:22
 */
@TableName("weiguichufa")
public class WeiguichufaEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WeiguichufaEntity() {
		
	}
	
	public WeiguichufaEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 违规事项
	 */
					
	private String weiguishixiang;
	
	/**
	 * 违规备注
	 */
					
	private String weiguibeizhu;
	
	/**
	 * 处罚金额
	 */
					
	private Integer chufajine;
	
	/**
	 * 处罚时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 		
	private Date chufashijian;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 手机
	 */
					
	private String shouji;
	
	/**
	 * 头像
	 */
					
	private String touxiang;
	
	/**
	 * 是否支付
	 */
					
	private String ispay;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：违规事项
	 */
	public void setWeiguishixiang(String weiguishixiang) {
		this.weiguishixiang = weiguishixiang;
	}
	/**
	 * 获取：违规事项
	 */
	public String getWeiguishixiang() {
		return weiguishixiang;
	}
	/**
	 * 设置：违规备注
	 */
	public void setWeiguibeizhu(String weiguibeizhu) {
		this.weiguibeizhu = weiguibeizhu;
	}
	/**
	 * 获取：违规备注
	 */
	public String getWeiguibeizhu() {
		return weiguibeizhu;
	}
	/**
	 * 设置：处罚金额
	 */
	public void setChufajine(Integer chufajine) {
		this.chufajine = chufajine;
	}
	/**
	 * 获取：处罚金额
	 */
	public Integer getChufajine() {
		return chufajine;
	}
	/**
	 * 设置：处罚时间
	 */
	public void setChufashijian(Date chufashijian) {
		this.chufashijian = chufashijian;
	}
	/**
	 * 获取：处罚时间
	 */
	public Date getChufashijian() {
		return chufashijian;
	}
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：手机
	 */
	public void setShouji(String shouji) {
		this.shouji = shouji;
	}
	/**
	 * 获取：手机
	 */
	public String getShouji() {
		return shouji;
	}
	/**
	 * 设置：头像
	 */
	public void setTouxiang(String touxiang) {
		this.touxiang = touxiang;
	}
	/**
	 * 获取：头像
	 */
	public String getTouxiang() {
		return touxiang;
	}
	/**
	 * 设置：是否支付
	 */
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}

}
