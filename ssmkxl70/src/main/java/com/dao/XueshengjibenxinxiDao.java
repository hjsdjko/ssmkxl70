package com.dao;

import com.entity.XueshengjibenxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XueshengjibenxinxiVO;
import com.entity.view.XueshengjibenxinxiView;


/**
 * 学生基本信息
 * 
 * @author 
 * @email 
 * @date 2021-03-27 00:24:19
 */
public interface XueshengjibenxinxiDao extends BaseMapper<XueshengjibenxinxiEntity> {
	
	List<XueshengjibenxinxiVO> selectListVO(@Param("ew") Wrapper<XueshengjibenxinxiEntity> wrapper);
	
	XueshengjibenxinxiVO selectVO(@Param("ew") Wrapper<XueshengjibenxinxiEntity> wrapper);
	
	List<XueshengjibenxinxiView> selectListView(@Param("ew") Wrapper<XueshengjibenxinxiEntity> wrapper);

	List<XueshengjibenxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<XueshengjibenxinxiEntity> wrapper);
	
	XueshengjibenxinxiView selectView(@Param("ew") Wrapper<XueshengjibenxinxiEntity> wrapper);
	
}
