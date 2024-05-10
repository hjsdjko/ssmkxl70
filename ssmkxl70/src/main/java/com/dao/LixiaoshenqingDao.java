package com.dao;

import com.entity.LixiaoshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LixiaoshenqingVO;
import com.entity.view.LixiaoshenqingView;


/**
 * 离校申请
 * 
 * @author 
 * @email 
 * @date 2021-03-27 00:24:19
 */
public interface LixiaoshenqingDao extends BaseMapper<LixiaoshenqingEntity> {
	
	List<LixiaoshenqingVO> selectListVO(@Param("ew") Wrapper<LixiaoshenqingEntity> wrapper);
	
	LixiaoshenqingVO selectVO(@Param("ew") Wrapper<LixiaoshenqingEntity> wrapper);
	
	List<LixiaoshenqingView> selectListView(@Param("ew") Wrapper<LixiaoshenqingEntity> wrapper);

	List<LixiaoshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<LixiaoshenqingEntity> wrapper);
	
	LixiaoshenqingView selectView(@Param("ew") Wrapper<LixiaoshenqingEntity> wrapper);
	
}
