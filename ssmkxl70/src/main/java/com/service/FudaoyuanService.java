package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FudaoyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FudaoyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FudaoyuanView;


/**
 * 辅导员
 *
 * @author 
 * @email 
 * @date 2021-03-27 00:24:19
 */
public interface FudaoyuanService extends IService<FudaoyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FudaoyuanVO> selectListVO(Wrapper<FudaoyuanEntity> wrapper);
   	
   	FudaoyuanVO selectVO(@Param("ew") Wrapper<FudaoyuanEntity> wrapper);
   	
   	List<FudaoyuanView> selectListView(Wrapper<FudaoyuanEntity> wrapper);
   	
   	FudaoyuanView selectView(@Param("ew") Wrapper<FudaoyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FudaoyuanEntity> wrapper);
   	
}

