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


import com.dao.XueshengjibenxinxiDao;
import com.entity.XueshengjibenxinxiEntity;
import com.service.XueshengjibenxinxiService;
import com.entity.vo.XueshengjibenxinxiVO;
import com.entity.view.XueshengjibenxinxiView;

@Service("xueshengjibenxinxiService")
public class XueshengjibenxinxiServiceImpl extends ServiceImpl<XueshengjibenxinxiDao, XueshengjibenxinxiEntity> implements XueshengjibenxinxiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XueshengjibenxinxiEntity> page = this.selectPage(
                new Query<XueshengjibenxinxiEntity>(params).getPage(),
                new EntityWrapper<XueshengjibenxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XueshengjibenxinxiEntity> wrapper) {
		  Page<XueshengjibenxinxiView> page =new Query<XueshengjibenxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XueshengjibenxinxiVO> selectListVO(Wrapper<XueshengjibenxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XueshengjibenxinxiVO selectVO(Wrapper<XueshengjibenxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XueshengjibenxinxiView> selectListView(Wrapper<XueshengjibenxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XueshengjibenxinxiView selectView(Wrapper<XueshengjibenxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
