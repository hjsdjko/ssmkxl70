package com.entity.view;

import com.entity.ZhuguanxiaolingdaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 主管校领导
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-03-27 00:24:19
 */
@TableName("zhuguanxiaolingdao")
public class ZhuguanxiaolingdaoView  extends ZhuguanxiaolingdaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhuguanxiaolingdaoView(){
	}
 
 	public ZhuguanxiaolingdaoView(ZhuguanxiaolingdaoEntity zhuguanxiaolingdaoEntity){
 	try {
			BeanUtils.copyProperties(this, zhuguanxiaolingdaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
