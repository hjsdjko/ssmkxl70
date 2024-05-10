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


import com.dao.FenguanyuanzhangDao;
import com.entity.FenguanyuanzhangEntity;
import com.service.FenguanyuanzhangService;
import com.entity.vo.FenguanyuanzhangVO;
import com.entity.view.FenguanyuanzhangView;

@Service("fenguanyuanzhangService")
public class FenguanyuanzhangServiceImpl extends ServiceImpl<FenguanyuanzhangDao, FenguanyuanzhangEntity> implements FenguanyuanzhangService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<FenguanyuanzhangEntity> page = this.selectPage(
                new Query<FenguanyuanzhangEntity>(params).getPage(),
                new EntityWrapper<FenguanyuanzhangEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<FenguanyuanzhangEntity> wrapper) {
		  Page<FenguanyuanzhangView> page =new Query<FenguanyuanzhangView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<FenguanyuanzhangVO> selectListVO(Wrapper<FenguanyuanzhangEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public FenguanyuanzhangVO selectVO(Wrapper<FenguanyuanzhangEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<FenguanyuanzhangView> selectListView(Wrapper<FenguanyuanzhangEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public FenguanyuanzhangView selectView(Wrapper<FenguanyuanzhangEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
