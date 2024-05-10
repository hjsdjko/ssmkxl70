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


import com.dao.ZhuguanxiaolingdaoDao;
import com.entity.ZhuguanxiaolingdaoEntity;
import com.service.ZhuguanxiaolingdaoService;
import com.entity.vo.ZhuguanxiaolingdaoVO;
import com.entity.view.ZhuguanxiaolingdaoView;

@Service("zhuguanxiaolingdaoService")
public class ZhuguanxiaolingdaoServiceImpl extends ServiceImpl<ZhuguanxiaolingdaoDao, ZhuguanxiaolingdaoEntity> implements ZhuguanxiaolingdaoService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhuguanxiaolingdaoEntity> page = this.selectPage(
                new Query<ZhuguanxiaolingdaoEntity>(params).getPage(),
                new EntityWrapper<ZhuguanxiaolingdaoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhuguanxiaolingdaoEntity> wrapper) {
		  Page<ZhuguanxiaolingdaoView> page =new Query<ZhuguanxiaolingdaoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhuguanxiaolingdaoVO> selectListVO(Wrapper<ZhuguanxiaolingdaoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhuguanxiaolingdaoVO selectVO(Wrapper<ZhuguanxiaolingdaoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhuguanxiaolingdaoView> selectListView(Wrapper<ZhuguanxiaolingdaoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhuguanxiaolingdaoView selectView(Wrapper<ZhuguanxiaolingdaoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
