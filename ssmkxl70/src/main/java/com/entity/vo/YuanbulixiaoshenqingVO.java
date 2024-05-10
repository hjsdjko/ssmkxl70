package com.entity.vo;

import com.entity.YuanbulixiaoshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 院部离校申请
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-03-27 00:24:19
 */
public class YuanbulixiaoshenqingVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 专业
	 */
	
	private String zhuanye;
		
	/**
	 * 学院
	 */
	
	private String xueyuan;
		
	/**
	 * 离校理由
	 */
	
	private String lixiaoliyou;
		
	/**
	 * 到达地点
	 */
	
	private String daodadidian;
		
	/**
	 * 开始时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaishishijian;
		
	/**
	 * 回校时间
	 */
	
	private String huixiaoshijian;
		
	/**
	 * 紧急联系人
	 */
	
	private String jinjilianxiren;
		
	/**
	 * 紧急联系人电话
	 */
	
	private String jinjilianxirendianhua;
		
	/**
	 * 附件
	 */
	
	private String fujian;
		
	/**
	 * 辅导员姓名
	 */
	
	private String fudaoyuanxingming;
		
	/**
	 * 辅导员工号
	 */
	
	private String fudaoyuangonghao;
		
	/**
	 * 院书记姓名
	 */
	
	private String yuanshujixingming;
		
	/**
	 * 院书记工号
	 */
	
	private String yuanshujigonghao;
		
	/**
	 * 是否审核
	 */
	
	private String sfsh;
		
	/**
	 * 审核回复
	 */
	
	private String shhf;
		
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
	 * 设置：学院
	 */
	 
	public void setXueyuan(String xueyuan) {
		this.xueyuan = xueyuan;
	}
	
	/**
	 * 获取：学院
	 */
	public String getXueyuan() {
		return xueyuan;
	}
				
	
	/**
	 * 设置：离校理由
	 */
	 
	public void setLixiaoliyou(String lixiaoliyou) {
		this.lixiaoliyou = lixiaoliyou;
	}
	
	/**
	 * 获取：离校理由
	 */
	public String getLixiaoliyou() {
		return lixiaoliyou;
	}
				
	
	/**
	 * 设置：到达地点
	 */
	 
	public void setDaodadidian(String daodadidian) {
		this.daodadidian = daodadidian;
	}
	
	/**
	 * 获取：到达地点
	 */
	public String getDaodadidian() {
		return daodadidian;
	}
				
	
	/**
	 * 设置：开始时间
	 */
	 
	public void setKaishishijian(Date kaishishijian) {
		this.kaishishijian = kaishishijian;
	}
	
	/**
	 * 获取：开始时间
	 */
	public Date getKaishishijian() {
		return kaishishijian;
	}
				
	
	/**
	 * 设置：回校时间
	 */
	 
	public void setHuixiaoshijian(String huixiaoshijian) {
		this.huixiaoshijian = huixiaoshijian;
	}
	
	/**
	 * 获取：回校时间
	 */
	public String getHuixiaoshijian() {
		return huixiaoshijian;
	}
				
	
	/**
	 * 设置：紧急联系人
	 */
	 
	public void setJinjilianxiren(String jinjilianxiren) {
		this.jinjilianxiren = jinjilianxiren;
	}
	
	/**
	 * 获取：紧急联系人
	 */
	public String getJinjilianxiren() {
		return jinjilianxiren;
	}
				
	
	/**
	 * 设置：紧急联系人电话
	 */
	 
	public void setJinjilianxirendianhua(String jinjilianxirendianhua) {
		this.jinjilianxirendianhua = jinjilianxirendianhua;
	}
	
	/**
	 * 获取：紧急联系人电话
	 */
	public String getJinjilianxirendianhua() {
		return jinjilianxirendianhua;
	}
				
	
	/**
	 * 设置：附件
	 */
	 
	public void setFujian(String fujian) {
		this.fujian = fujian;
	}
	
	/**
	 * 获取：附件
	 */
	public String getFujian() {
		return fujian;
	}
				
	
	/**
	 * 设置：辅导员姓名
	 */
	 
	public void setFudaoyuanxingming(String fudaoyuanxingming) {
		this.fudaoyuanxingming = fudaoyuanxingming;
	}
	
	/**
	 * 获取：辅导员姓名
	 */
	public String getFudaoyuanxingming() {
		return fudaoyuanxingming;
	}
				
	
	/**
	 * 设置：辅导员工号
	 */
	 
	public void setFudaoyuangonghao(String fudaoyuangonghao) {
		this.fudaoyuangonghao = fudaoyuangonghao;
	}
	
	/**
	 * 获取：辅导员工号
	 */
	public String getFudaoyuangonghao() {
		return fudaoyuangonghao;
	}
				
	
	/**
	 * 设置：院书记姓名
	 */
	 
	public void setYuanshujixingming(String yuanshujixingming) {
		this.yuanshujixingming = yuanshujixingming;
	}
	
	/**
	 * 获取：院书记姓名
	 */
	public String getYuanshujixingming() {
		return yuanshujixingming;
	}
				
	
	/**
	 * 设置：院书记工号
	 */
	 
	public void setYuanshujigonghao(String yuanshujigonghao) {
		this.yuanshujigonghao = yuanshujigonghao;
	}
	
	/**
	 * 获取：院书记工号
	 */
	public String getYuanshujigonghao() {
		return yuanshujigonghao;
	}
				
	
	/**
	 * 设置：是否审核
	 */
	 
	public void setSfsh(String sfsh) {
		this.sfsh = sfsh;
	}
	
	/**
	 * 获取：是否审核
	 */
	public String getSfsh() {
		return sfsh;
	}
				
	
	/**
	 * 设置：审核回复
	 */
	 
	public void setShhf(String shhf) {
		this.shhf = shhf;
	}
	
	/**
	 * 获取：审核回复
	 */
	public String getShhf() {
		return shhf;
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
