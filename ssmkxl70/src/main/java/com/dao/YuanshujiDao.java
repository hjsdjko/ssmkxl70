package com.dao;

import com.entity.YuanshujiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.YuanshujiVO;
import com.entity.view.YuanshujiView;


/**
 * 院书记
 * 
 * @author 
 * @email 
 * @date 2021-03-27 00:24:19
 */
public interface YuanshujiDao extends BaseMapper<YuanshujiEntity> {
	
	List<YuanshujiVO> selectListVO(@Param("ew") Wrapper<YuanshujiEntity> wrapper);
	
	YuanshujiVO selectVO(@Param("ew") Wrapper<YuanshujiEntity> wrapper);
	
	List<YuanshujiView> selectListView(@Param("ew") Wrapper<YuanshujiEntity> wrapper);

	List<YuanshujiView> selectListView(Pagination page,@Param("ew") Wrapper<YuanshujiEntity> wrapper);
	
	YuanshujiView selectView(@Param("ew") Wrapper<YuanshujiEntity> wrapper);
	
}
