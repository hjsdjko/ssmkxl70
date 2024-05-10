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


import com.dao.JiankangshenbaoDao;
import com.entity.JiankangshenbaoEntity;
import com.service.JiankangshenbaoService;
import com.entity.vo.JiankangshenbaoVO;
import com.entity.view.JiankangshenbaoView;

@Service("jiankangshenbaoService")
public class JiankangshenbaoServiceImpl extends ServiceImpl<JiankangshenbaoDao, JiankangshenbaoEntity> implements JiankangshenbaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JiankangshenbaoEntity> page = this.selectPage(
                new Query<JiankangshenbaoEntity>(params).getPage(),
                new EntityWrapper<JiankangshenbaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JiankangshenbaoEntity> wrapper) {
		  Page<JiankangshenbaoView> page =new Query<JiankangshenbaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JiankangshenbaoVO> selectListVO(Wrapper<JiankangshenbaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JiankangshenbaoVO selectVO(Wrapper<JiankangshenbaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JiankangshenbaoView> selectListView(Wrapper<JiankangshenbaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JiankangshenbaoView selectView(Wrapper<JiankangshenbaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
