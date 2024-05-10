package com.dao;

import com.entity.ZhuguanxiaolingdaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhuguanxiaolingdaoVO;
import com.entity.view.ZhuguanxiaolingdaoView;


/**
 * 主管校领导
 * 
 * @author 
 * @email 
 * @date 2021-03-27 00:24:19
 */
public interface ZhuguanxiaolingdaoDao extends BaseMapper<ZhuguanxiaolingdaoEntity> {
	
	List<ZhuguanxiaolingdaoVO> selectListVO(@Param("ew") Wrapper<ZhuguanxiaolingdaoEntity> wrapper);
	
	ZhuguanxiaolingdaoVO selectVO(@Param("ew") Wrapper<ZhuguanxiaolingdaoEntity> wrapper);
	
	List<ZhuguanxiaolingdaoView> selectListView(@Param("ew") Wrapper<ZhuguanxiaolingdaoEntity> wrapper);

	List<ZhuguanxiaolingdaoView> selectListView(Pagination page,@Param("ew") Wrapper<ZhuguanxiaolingdaoEntity> wrapper);
	
	ZhuguanxiaolingdaoView selectView(@Param("ew") Wrapper<ZhuguanxiaolingdaoEntity> wrapper);
	
}
