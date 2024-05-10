package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LuxianhenjiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LuxianhenjiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LuxianhenjiView;


/**
 * 路线痕迹
 *
 * @author 
 * @email 
 * @date 2021-03-27 00:24:19
 */
public interface LuxianhenjiService extends IService<LuxianhenjiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LuxianhenjiVO> selectListVO(Wrapper<LuxianhenjiEntity> wrapper);
   	
   	LuxianhenjiVO selectVO(@Param("ew") Wrapper<LuxianhenjiEntity> wrapper);
   	
   	List<LuxianhenjiView> selectListView(Wrapper<LuxianhenjiEntity> wrapper);
   	
   	LuxianhenjiView selectView(@Param("ew") Wrapper<LuxianhenjiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LuxianhenjiEntity> wrapper);
   	
}

