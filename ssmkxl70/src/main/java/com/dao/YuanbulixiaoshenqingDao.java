package com.dao;

import com.entity.YuanbulixiaoshenqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuanbulixiaoshenqingVO;
import com.entity.view.YuanbulixiaoshenqingView;


/**
 * 院部离校申请
 * 
 * @author 
 * @email 
 * @date 2021-03-27 00:24:19
 */
public interface YuanbulixiaoshenqingDao extends BaseMapper<YuanbulixiaoshenqingEntity> {
	
	List<YuanbulixiaoshenqingVO> selectListVO(@Param("ew") Wrapper<YuanbulixiaoshenqingEntity> wrapper);
	
	YuanbulixiaoshenqingVO selectVO(@Param("ew") Wrapper<YuanbulixiaoshenqingEntity> wrapper);
	
	List<YuanbulixiaoshenqingView> selectListView(@Param("ew") Wrapper<YuanbulixiaoshenqingEntity> wrapper);

	List<YuanbulixiaoshenqingView> selectListView(Pagination page,@Param("ew") Wrapper<YuanbulixiaoshenqingEntity> wrapper);
	
	YuanbulixiaoshenqingView selectView(@Param("ew") Wrapper<YuanbulixiaoshenqingEntity> wrapper);
	
}
