package com.btc.hair.admin.services.hairinfo;

import com.btc.hair.admin.services.hairinfo.services.impl.*;

import java.util.List;

public interface IHairInfoService {

    public int registInfoConfirm(IHairInfoRegistConfirm hairInfoRegistConfirm);
    public HairInfoDto searchInfoConfirm(IHairInfoSearchConfirm hairInfoSearchConfirm);
    public List<HairInfoDto> allSearchServiceConfirm(IHairInfoAllSearchConfirm hairInfoAllSearchConfirm);
    public int modifyInfoConfirm(IHairInfoModifyConfirm hairInfoModifyConfirm);
    public int deleteInfoConfirm(IHairInfoDeleteConfirm hairInfoDeleteConfirm);

}
