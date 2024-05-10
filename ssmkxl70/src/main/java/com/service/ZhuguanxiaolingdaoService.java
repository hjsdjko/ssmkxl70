package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhuguanxiaolingdaoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhuguanxiaolingdaoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuguanxiaolingdaoView;


/**
 * 主管校领导
 *
 * @author 
 * @email 
 * @date 2021-03-27 00:24:19
 */
public interface ZhuguanxiaolingdaoService extends IService<ZhuguanxiaolingdaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhuguanxiaolingdaoVO> selectListVO(Wrapper<ZhuguanxiaolingdaoEntity> wrapper);
   	
   	ZhuguanxiaolingdaoVO selectVO(@Param("ew") Wrapper<ZhuguanxiaolingdaoEntity> wrapper);
   	
   	List<ZhuguanxiaolingdaoView> selectListView(Wrapper<ZhuguanxiaolingdaoEntity> wrapper);
   	
   	ZhuguanxiaolingdaoView selectView(@Param("ew") Wrapper<ZhuguanxiaolingdaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhuguanxiaolingdaoEntity> wrapper);
   	
}

