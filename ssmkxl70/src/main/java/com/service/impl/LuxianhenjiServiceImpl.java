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


import com.dao.LuxianhenjiDao;
import com.entity.LuxianhenjiEntity;
import com.service.LuxianhenjiService;
import com.entity.vo.LuxianhenjiVO;
import com.entity.view.LuxianhenjiView;

@Service("luxianhenjiService")
public class LuxianhenjiServiceImpl extends ServiceImpl<LuxianhenjiDao, LuxianhenjiEntity> implements LuxianhenjiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<LuxianhenjiEntity> page = this.selectPage(
                new Query<LuxianhenjiEntity>(params).getPage(),
                new EntityWrapper<LuxianhenjiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<LuxianhenjiEntity> wrapper) {
		  Page<LuxianhenjiView> page =new Query<LuxianhenjiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<LuxianhenjiVO> selectListVO(Wrapper<LuxianhenjiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public LuxianhenjiVO selectVO(Wrapper<LuxianhenjiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<LuxianhenjiView> selectListView(Wrapper<LuxianhenjiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public LuxianhenjiView selectView(Wrapper<LuxianhenjiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
