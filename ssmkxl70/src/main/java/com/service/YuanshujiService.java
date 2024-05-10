package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.YuanshujiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.YuanshujiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.YuanshujiView;


/**
 * 院书记
 *
 * @author 
 * @email 
 * @date 2021-03-27 00:24:19
 */
public interface YuanshujiService extends IService<YuanshujiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<YuanshujiVO> selectListVO(Wrapper<YuanshujiEntity> wrapper);
   	
   	YuanshujiVO selectVO(@Param("ew") Wrapper<YuanshujiEntity> wrapper);
   	
   	List<YuanshujiView> selectListView(Wrapper<YuanshujiEntity> wrapper);
   	
   	YuanshujiView selectView(@Param("ew") Wrapper<YuanshujiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<YuanshujiEntity> wrapper);
   	
}

