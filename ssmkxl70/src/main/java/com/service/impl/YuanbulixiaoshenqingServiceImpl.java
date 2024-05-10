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


import com.dao.YuanbulixiaoshenqingDao;
import com.entity.YuanbulixiaoshenqingEntity;
import com.service.YuanbulixiaoshenqingService;
import com.entity.vo.YuanbulixiaoshenqingVO;
import com.entity.view.YuanbulixiaoshenqingView;

@Service("yuanbulixiaoshenqingService")
public class YuanbulixiaoshenqingServiceImpl extends ServiceImpl<YuanbulixiaoshenqingDao, YuanbulixiaoshenqingEntity> implements YuanbulixiaoshenqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YuanbulixiaoshenqingEntity> page = this.selectPage(
                new Query<YuanbulixiaoshenqingEntity>(params).getPage(),
                new EntityWrapper<YuanbulixiaoshenqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YuanbulixiaoshenqingEntity> wrapper) {
		  Page<YuanbulixiaoshenqingView> page =new Query<YuanbulixiaoshenqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YuanbulixiaoshenqingVO> selectListVO(Wrapper<YuanbulixiaoshenqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YuanbulixiaoshenqingVO selectVO(Wrapper<YuanbulixiaoshenqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YuanbulixiaoshenqingView> selectListView(Wrapper<YuanbulixiaoshenqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YuanbulixiaoshenqingView selectView(Wrapper<YuanbulixiaoshenqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
