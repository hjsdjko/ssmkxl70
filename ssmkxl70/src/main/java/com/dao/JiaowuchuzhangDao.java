package com.dao;

import com.entity.JiaowuchuzhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiaowuchuzhangVO;
import com.entity.view.JiaowuchuzhangView;


/**
 * 教务处长
 * 
 * @author 
 * @email 
 * @date 2021-03-27 00:24:19
 */
public interface JiaowuchuzhangDao extends BaseMapper<JiaowuchuzhangEntity> {
	
	List<JiaowuchuzhangVO> selectListVO(@Param("ew") Wrapper<JiaowuchuzhangEntity> wrapper);
	
	JiaowuchuzhangVO selectVO(@Param("ew") Wrapper<JiaowuchuzhangEntity> wrapper);
	
	List<JiaowuchuzhangView> selectListView(@Param("ew") Wrapper<JiaowuchuzhangEntity> wrapper);

	List<JiaowuchuzhangView> selectListView(Pagination page,@Param("ew") Wrapper<JiaowuchuzhangEntity> wrapper);
	
	JiaowuchuzhangView selectView(@Param("ew") Wrapper<JiaowuchuzhangEntity> wrapper);
	
}
