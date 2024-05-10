package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JiaowuchuzhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JiaowuchuzhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JiaowuchuzhangView;


/**
 * 教务处长
 *
 * @author 
 * @email 
 * @date 2021-03-27 00:24:19
 */
public interface JiaowuchuzhangService extends IService<JiaowuchuzhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JiaowuchuzhangVO> selectListVO(Wrapper<JiaowuchuzhangEntity> wrapper);
   	
   	JiaowuchuzhangVO selectVO(@Param("ew") Wrapper<JiaowuchuzhangEntity> wrapper);
   	
   	List<JiaowuchuzhangView> selectListView(Wrapper<JiaowuchuzhangEntity> wrapper);
   	
   	JiaowuchuzhangView selectView(@Param("ew") Wrapper<JiaowuchuzhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JiaowuchuzhangEntity> wrapper);
   	
}

