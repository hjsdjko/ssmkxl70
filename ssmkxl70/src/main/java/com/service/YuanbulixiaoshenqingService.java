package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuanbulixiaoshenqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuanbulixiaoshenqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuanbulixiaoshenqingView;


/**
 * 院部离校申请
 *
 * @author 
 * @email 
 * @date 2021-03-27 00:24:19
 */
public interface YuanbulixiaoshenqingService extends IService<YuanbulixiaoshenqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuanbulixiaoshenqingVO> selectListVO(Wrapper<YuanbulixiaoshenqingEntity> wrapper);
   	
   	YuanbulixiaoshenqingVO selectVO(@Param("ew") Wrapper<YuanbulixiaoshenqingEntity> wrapper);
   	
   	List<YuanbulixiaoshenqingView> selectListView(Wrapper<YuanbulixiaoshenqingEntity> wrapper);
   	
   	YuanbulixiaoshenqingView selectView(@Param("ew") Wrapper<YuanbulixiaoshenqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuanbulixiaoshenqingEntity> wrapper);
   	
}

