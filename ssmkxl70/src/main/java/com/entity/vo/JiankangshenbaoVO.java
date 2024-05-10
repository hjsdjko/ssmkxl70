package com.entity.vo;

import com.entity.JiankangshenbaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 健康申报
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-27 00:24:19
 */
public class JiankangshenbaoVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 是否发烧
	 */
	
	private String shifoufashao;
		
	/**
	 * 途径地
	 */
	
	private String tujingdi;
		
	/**
	 * 接触史
	 */
	
	private String jiechushi;
		
	/**
	 * 健康情况
	 */
	
	private String jiankangqingkuang;
		
	/**
	 * 用户id
	 */
	
	private Long userid;
		
	/**
	 * 经度
	 */
	
	private Float longitude;
		
	/**
	 * 纬度
	 */
	
	private Float latitude;
		
	/**
	 * 地址
	 */
	
	private String fulladdress;
				
	
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
	 * 设置：是否发烧
	 */
	 
	public void setShifoufashao(String shifoufashao) {
		this.shifoufashao = shifoufashao;
	}
	
	/**
	 * 获取：是否发烧
	 */
	public String getShifoufashao() {
		return shifoufashao;
	}
				
	
	/**
	 * 设置：途径地
	 */
	 
	public void setTujingdi(String tujingdi) {
		this.tujingdi = tujingdi;
	}
	
	/**
	 * 获取：途径地
	 */
	public String getTujingdi() {
		return tujingdi;
	}
				
	
	/**
	 * 设置：接触史
	 */
	 
	public void setJiechushi(String jiechushi) {
		this.jiechushi = jiechushi;
	}
	
	/**
	 * 获取：接触史
	 */
	public String getJiechushi() {
		return jiechushi;
	}
				
	
	/**
	 * 设置：健康情况
	 */
	 
	public void setJiankangqingkuang(String jiankangqingkuang) {
		this.jiankangqingkuang = jiankangqingkuang;
	}
	
	/**
	 * 获取：健康情况
	 */
	public String getJiankangqingkuang() {
		return jiankangqingkuang;
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
				
	
	/**
	 * 设置：经度
	 */
	 
	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}
	
	/**
	 * 获取：经度
	 */
	public Float getLongitude() {
		return longitude;
	}
				
	
	/**
	 * 设置：纬度
	 */
	 
	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}
	
	/**
	 * 获取：纬度
	 */
	public Float getLatitude() {
		return latitude;
	}
				
	
	/**
	 * 设置：地址
	 */
	 
	public void setFulladdress(String fulladdress) {
		this.fulladdress = fulladdress;
	}
	
	/**
	 * 获取：地址
	 */
	public String getFulladdress() {
		return fulladdress;
	}
			
}
