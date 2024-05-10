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


import com.dao.YuanshujiDao;
import com.entity.YuanshujiEntity;
import com.service.YuanshujiService;
import com.entity.vo.YuanshujiVO;
import com.entity.view.YuanshujiView;

@Service("yuanshujiService")
public class YuanshujiServiceImpl extends ServiceImpl<YuanshujiDao, YuanshujiEntity> implements YuanshujiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuanshujiEntity> page = this.selectPage(
                new Query<YuanshujiEntity>(params).getPage(),
                new EntityWrapper<YuanshujiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuanshujiEntity> wrapper) {
		  Page<YuanshujiView> page =new Query<YuanshujiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuanshujiVO> selectListVO(Wrapper<YuanshujiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuanshujiVO selectVO(Wrapper<YuanshujiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuanshujiView> selectListView(Wrapper<YuanshujiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuanshujiView selectView(Wrapper<YuanshujiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
