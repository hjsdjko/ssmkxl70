package com.dao;

import com.entity.JiankangshenbaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JiankangshenbaoVO;
import com.entity.view.JiankangshenbaoView;


/**
 * 健康申报
 * 
 * @author 
 * @email 
 * @date 2021-03-27 00:24:19
 */
public interface JiankangshenbaoDao extends BaseMapper<JiankangshenbaoEntity> {
	
	List<JiankangshenbaoVO> selectListVO(@Param("ew") Wrapper<JiankangshenbaoEntity> wrapper);
	
	JiankangshenbaoVO selectVO(@Param("ew") Wrapper<JiankangshenbaoEntity> wrapper);
	
	List<JiankangshenbaoView> selectListView(@Param("ew") Wrapper<JiankangshenbaoEntity> wrapper);

	List<JiankangshenbaoView> selectListView(Pagination page,@Param("ew") Wrapper<JiankangshenbaoEntity> wrapper);
	
	JiankangshenbaoView selectView(@Param("ew") Wrapper<JiankangshenbaoEntity> wrapper);
	
}
