package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiankangshenbaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiankangshenbaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiankangshenbaoView;


/**
 * 健康申报
 *
 * @author 
 * @email 
 * @date 2021-03-27 00:24:19
 */
public interface JiankangshenbaoService extends IService<JiankangshenbaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiankangshenbaoVO> selectListVO(Wrapper<JiankangshenbaoEntity> wrapper);
   	
   	JiankangshenbaoVO selectVO(@Param("ew") Wrapper<JiankangshenbaoEntity> wrapper);
   	
   	List<JiankangshenbaoView> selectListView(Wrapper<JiankangshenbaoEntity> wrapper);
   	
   	JiankangshenbaoView selectView(@Param("ew") Wrapper<JiankangshenbaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiankangshenbaoEntity> wrapper);
   	
}

