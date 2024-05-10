package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaqiquxiangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaqiquxiangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaqiquxiangView;


/**
 * 假期去向
 *
 * @author 
 * @email 
 * @date 2021-03-27 00:24:19
 */
public interface JiaqiquxiangService extends IService<JiaqiquxiangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaqiquxiangVO> selectListVO(Wrapper<JiaqiquxiangEntity> wrapper);
   	
   	JiaqiquxiangVO selectVO(@Param("ew") Wrapper<JiaqiquxiangEntity> wrapper);
   	
   	List<JiaqiquxiangView> selectListView(Wrapper<JiaqiquxiangEntity> wrapper);
   	
   	JiaqiquxiangView selectView(@Param("ew") Wrapper<JiaqiquxiangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaqiquxiangEntity> wrapper);
   	
}

