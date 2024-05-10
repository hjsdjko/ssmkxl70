package com.entity.view;

import com.entity.LuxianhenjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 路线痕迹
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-27 00:24:19
 */
@TableName("luxianhenji")
public class LuxianhenjiView  extends LuxianhenjiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LuxianhenjiView(){
	}
 
 	public LuxianhenjiView(LuxianhenjiEntity luxianhenjiEntity){
 	try {
			BeanUtils.copyProperties(this, luxianhenjiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
