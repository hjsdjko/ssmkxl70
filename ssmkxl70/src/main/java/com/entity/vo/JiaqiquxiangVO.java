package com.entity.vo;

import com.entity.JiaqiquxiangEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 假期去向
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-27 00:24:19
 */
public class JiaqiquxiangVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 性别
	 */
	
	private String xingbie;
		
	/**
	 * 专业
	 */
	
	private String zhuanye;
		
	/**
	 * 班级
	 */
	
	private String banji;
		
	/**
	 * 年级
	 */
	
	private String nianji;
		
	/**
	 * 假期计划
	 */
	
	private String jiaqijihua;
		
	/**
	 * 计划离校时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jihualixiaoshijian;
		
	/**
	 * 计划回校时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jihuahuixiaoshijian;
		
	/**
	 * 交通工具
	 */
	
	private String jiaotonggongju;
		
	/**
	 * 家庭地址
	 */
	
	private String jiatingdizhi;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
				
	
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
	 * 设置：性别
	 */
	 
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
				
	
	/**
	 * 设置：专业
	 */
	 
	public void setZhuanye(String zhuanye) {
		this.zhuanye = zhuanye;
	}
	
	/**
	 * 获取：专业
	 */
	public String getZhuanye() {
		return zhuanye;
	}
				
	
	/**
	 * 设置：班级
	 */
	 
	public void setBanji(String banji) {
		this.banji = banji;
	}
	
	/**
	 * 获取：班级
	 */
	public String getBanji() {
		return banji;
	}
				
	
	/**
	 * 设置：年级
	 */
	 
	public void setNianji(String nianji) {
		this.nianji = nianji;
	}
	
	/**
	 * 获取：年级
	 */
	public String getNianji() {
		return nianji;
	}
				
	
	/**
	 * 设置：假期计划
	 */
	 
	public void setJiaqijihua(String jiaqijihua) {
		this.jiaqijihua = jiaqijihua;
	}
	
	/**
	 * 获取：假期计划
	 */
	public String getJiaqijihua() {
		return jiaqijihua;
	}
				
	
	/**
	 * 设置：计划离校时间
	 */
	 
	public void setJihualixiaoshijian(Date jihualixiaoshijian) {
		this.jihualixiaoshijian = jihualixiaoshijian;
	}
	
	/**
	 * 获取：计划离校时间
	 */
	public Date getJihualixiaoshijian() {
		return jihualixiaoshijian;
	}
				
	
	/**
	 * 设置：计划回校时间
	 */
	 
	public void setJihuahuixiaoshijian(Date jihuahuixiaoshijian) {
		this.jihuahuixiaoshijian = jihuahuixiaoshijian;
	}
	
	/**
	 * 获取：计划回校时间
	 */
	public Date getJihuahuixiaoshijian() {
		return jihuahuixiaoshijian;
	}
				
	
	/**
	 * 设置：交通工具
	 */
	 
	public void setJiaotonggongju(String jiaotonggongju) {
		this.jiaotonggongju = jiaotonggongju;
	}
	
	/**
	 * 获取：交通工具
	 */
	public String getJiaotonggongju() {
		return jiaotonggongju;
	}
				
	
	/**
	 * 设置：家庭地址
	 */
	 
	public void setJiatingdizhi(String jiatingdizhi) {
		this.jiatingdizhi = jiatingdizhi;
	}
	
	/**
	 * 获取：家庭地址
	 */
	public String getJiatingdizhi() {
		return jiatingdizhi;
	}
				
	
	/**
	 * 设置：用户id
	 */
	 
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	/**
	 * 获取：用户id
	 */
	public Long getUserid() {
		return userid;
	}
			
}
