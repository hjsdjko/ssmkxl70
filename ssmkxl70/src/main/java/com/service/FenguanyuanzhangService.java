package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.FenguanyuanzhangEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.FenguanyuanzhangVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.FenguanyuanzhangView;


/**
 * 分管院长
 *
 * @author 
 * @email 
 * @date 2021-03-27 00:24:19
 */
public interface FenguanyuanzhangService extends IService<FenguanyuanzhangEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<FenguanyuanzhangVO> selectListVO(Wrapper<FenguanyuanzhangEntity> wrapper);
   	
   	FenguanyuanzhangVO selectVO(@Param("ew") Wrapper<FenguanyuanzhangEntity> wrapper);
   	
   	List<FenguanyuanzhangView> selectListView(Wrapper<FenguanyuanzhangEntity> wrapper);
   	
   	FenguanyuanzhangView selectView(@Param("ew") Wrapper<FenguanyuanzhangEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<FenguanyuanzhangEntity> wrapper);
   	
}

