package com.btc.hair.admin.services.hairmanage.services.impl;

import com.btc.hair.admin.services.hairmanage.HairManageDao;
import com.btc.hair.admin.services.hairmanage.HairManageDto;

public class HairManageSearchConfirm implements IHairManageSearchConfirm{

    String uId = null;
    HairManageDao hairManageDao = new HairManageDao();

    public HairManageSearchConfirm(String uId, HairManageDao hairManageDao) {
        this.uId = uId;
        this.hairManageDao = hairManageDao;

    }

    @Override
    public HairManageDto execute() {
        System.out.println("[HairManageSearchConfirm] HairManageDto()");

//        boolean isUser = hairManageDao
        return null;
    }
}
