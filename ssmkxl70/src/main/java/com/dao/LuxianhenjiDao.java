package com.dao;

import com.entity.LuxianhenjiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.LuxianhenjiVO;
import com.entity.view.LuxianhenjiView;


/**
 * 路线痕迹
 * 
 * @author 
 * @email 
 * @date 2021-03-27 00:24:19
 */
public interface LuxianhenjiDao extends BaseMapper<LuxianhenjiEntity> {
	
	List<LuxianhenjiVO> selectListVO(@Param("ew") Wrapper<LuxianhenjiEntity> wrapper);
	
	LuxianhenjiVO selectVO(@Param("ew") Wrapper<LuxianhenjiEntity> wrapper);
	
	List<LuxianhenjiView> selectListView(@Param("ew") Wrapper<LuxianhenjiEntity> wrapper);

	List<LuxianhenjiView> selectListView(Pagination page,@Param("ew") Wrapper<LuxianhenjiEntity> wrapper);
	
	LuxianhenjiView selectView(@Param("ew") Wrapper<LuxianhenjiEntity> wrapper);
	
}
