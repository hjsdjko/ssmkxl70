package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.JiaowuchuzhangDao;
import com.entity.JiaowuchuzhangEntity;
import com.service.JiaowuchuzhangService;
import com.entity.vo.JiaowuchuzhangVO;
import com.entity.view.JiaowuchuzhangView;

@Service("jiaowuchuzhangService")
public class JiaowuchuzhangServiceImpl extends ServiceImpl<JiaowuchuzhangDao, JiaowuchuzhangEntity> implements JiaowuchuzhangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaowuchuzhangEntity> page = this.selectPage(
                new Query<JiaowuchuzhangEntity>(params).getPage(),
                new EntityWrapper<JiaowuchuzhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaowuchuzhangEntity> wrapper) {
		  Page<JiaowuchuzhangView> page =new Query<JiaowuchuzhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaowuchuzhangVO> selectListVO(Wrapper<JiaowuchuzhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaowuchuzhangVO selectVO(Wrapper<JiaowuchuzhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaowuchuzhangView> selectListView(Wrapper<JiaowuchuzhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaowuchuzhangView selectView(Wrapper<JiaowuchuzhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
