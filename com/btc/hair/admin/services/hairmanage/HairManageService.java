package com.btc.hair.admin.services.hairmanage;

import com.btc.hair.admin.services.hairmanage.services.impl.HairManageSearchConfirm;
import com.btc.hair.admin.services.hairmanage.services.impl.IHairManageAllSearchConfirm;
import com.btc.hair.admin.services.hairmanage.services.impl.IHairManageSearchConfirm;

import java.util.List;

public class HairManageService implements IHairManageService{
    @Override
    public HairManageDto searchManageConfirm(IHairManageSearchConfirm hairManageSearchConfirm) {
        return hairManageSearchConfirm.execute();
    }

    @Override
    public List<HairManageDto> allSearchManageConfirm(IHairManageAllSearchConfirm hairManageAllSearchConfirm) {
        return null;
    }

}
