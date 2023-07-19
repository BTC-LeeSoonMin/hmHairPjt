package com.btc.hair.admin.services.hairmanage;

import com.btc.hair.admin.services.hairmanage.services.impl.IHairManageAllSearchConfirm;
import com.btc.hair.admin.services.hairmanage.services.impl.IHairManageSearchConfirm;

import java.util.List;

public interface IHairManageService {

    public HairManageDto searchManageConfirm(IHairManageSearchConfirm hairManageSearchConfirm);
    public List<HairManageDto> allSearchManageConfirm(IHairManageAllSearchConfirm hairManageAllSearchConfirm);

}
