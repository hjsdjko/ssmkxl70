package com.dao;

import com.entity.FenguanyuanzhangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.FenguanyuanzhangVO;
import com.entity.view.FenguanyuanzhangView;


/**
 * 分管院长
 * 
 * @author 
 * @email 
 * @date 2021-03-27 00:24:19
 */
public interface FenguanyuanzhangDao extends BaseMapper<FenguanyuanzhangEntity> {
	
	List<FenguanyuanzhangVO> selectListVO(@Param("ew") Wrapper<FenguanyuanzhangEntity> wrapper);
	
	FenguanyuanzhangVO selectVO(@Param("ew") Wrapper<FenguanyuanzhangEntity> wrapper);
	
	List<FenguanyuanzhangView> selectListView(@Param("ew") Wrapper<FenguanyuanzhangEntity> wrapper);

	List<FenguanyuanzhangView> selectListView(Pagination page,@Param("ew") Wrapper<FenguanyuanzhangEntity> wrapper);
	
	FenguanyuanzhangView selectView(@Param("ew") Wrapper<FenguanyuanzhangEntity> wrapper);
	
}
