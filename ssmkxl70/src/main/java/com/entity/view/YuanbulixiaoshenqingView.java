package com.entity.view;

import com.entity.YuanbulixiaoshenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 院部离校申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-27 00:24:19
 */
@TableName("yuanbulixiaoshenqing")
public class YuanbulixiaoshenqingView  extends YuanbulixiaoshenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public YuanbulixiaoshenqingView(){
	}
 
 	public YuanbulixiaoshenqingView(YuanbulixiaoshenqingEntity yuanbulixiaoshenqingEntity){
 	try {
			BeanUtils.copyProperties(this, yuanbulixiaoshenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
