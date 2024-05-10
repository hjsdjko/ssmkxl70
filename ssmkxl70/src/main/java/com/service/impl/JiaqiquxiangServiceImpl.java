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


import com.dao.JiaqiquxiangDao;
import com.entity.JiaqiquxiangEntity;
import com.service.JiaqiquxiangService;
import com.entity.vo.JiaqiquxiangVO;
import com.entity.view.JiaqiquxiangView;

@Service("jiaqiquxiangService")
public class JiaqiquxiangServiceImpl extends ServiceImpl<JiaqiquxiangDao, JiaqiquxiangEntity> implements JiaqiquxiangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiaqiquxiangEntity> page = this.selectPage(
                new Query<JiaqiquxiangEntity>(params).getPage(),
                new EntityWrapper<JiaqiquxiangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiaqiquxiangEntity> wrapper) {
		  Page<JiaqiquxiangView> page =new Query<JiaqiquxiangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiaqiquxiangVO> selectListVO(Wrapper<JiaqiquxiangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiaqiquxiangVO selectVO(Wrapper<JiaqiquxiangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiaqiquxiangView> selectListView(Wrapper<JiaqiquxiangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiaqiquxiangView selectView(Wrapper<JiaqiquxiangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
