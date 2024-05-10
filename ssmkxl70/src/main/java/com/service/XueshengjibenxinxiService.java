package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XueshengjibenxinxiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XueshengjibenxinxiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengjibenxinxiView;


/**
 * 学生基本信息
 *
 * @author 
 * @email 
 * @date 2021-03-27 00:24:19
 */
public interface XueshengjibenxinxiService extends IService<XueshengjibenxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XueshengjibenxinxiVO> selectListVO(Wrapper<XueshengjibenxinxiEntity> wrapper);
   	
   	XueshengjibenxinxiVO selectVO(@Param("ew") Wrapper<XueshengjibenxinxiEntity> wrapper);
   	
   	List<XueshengjibenxinxiView> selectListView(Wrapper<XueshengjibenxinxiEntity> wrapper);
   	
   	XueshengjibenxinxiView selectView(@Param("ew") Wrapper<XueshengjibenxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XueshengjibenxinxiEntity> wrapper);
   	
}

