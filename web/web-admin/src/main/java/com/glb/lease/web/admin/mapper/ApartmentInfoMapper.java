package com.glb.lease.web.admin.mapper;

import com.glb.lease.model.entity.ApartmentInfo;
import com.glb.lease.model.enums.LeaseStatus;
import com.glb.lease.web.admin.vo.apartment.ApartmentItemVo;
import com.glb.lease.web.admin.vo.apartment.ApartmentQueryVo;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

/**
* @author liubo
* @description 针对表【apartment_info(公寓信息表)】的数据库操作Mapper
* @createDate 2023-07-24 15:48:00
* @Entity com.glb.lease.model.ApartmentInfo
*/
public interface ApartmentInfoMapper extends BaseMapper<ApartmentInfo> {

}




