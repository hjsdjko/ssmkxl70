package com.dao;

import com.entity.JiaqiquxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaqiquxiangVO;
import com.entity.view.JiaqiquxiangView;


/**
 * 假期去向
 * 
 * @author 
 * @email 
 * @date 2021-03-27 00:24:19
 */
public interface JiaqiquxiangDao extends BaseMapper<JiaqiquxiangEntity> {
	
	List<JiaqiquxiangVO> selectListVO(@Param("ew") Wrapper<JiaqiquxiangEntity> wrapper);
	
	JiaqiquxiangVO selectVO(@Param("ew") Wrapper<JiaqiquxiangEntity> wrapper);
	
	List<JiaqiquxiangView> selectListView(@Param("ew") Wrapper<JiaqiquxiangEntity> wrapper);

	List<JiaqiquxiangView> selectListView(Pagination page,@Param("ew") Wrapper<JiaqiquxiangEntity> wrapper);
	
	JiaqiquxiangView selectView(@Param("ew") Wrapper<JiaqiquxiangEntity> wrapper);
	
}
