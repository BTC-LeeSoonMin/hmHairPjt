package com.btc.hair.admin.services.hairmanage;

import com.btc.hair.admin.container.AdminContainer;
import com.btc.hair.admin.services.hairmanage.services.impl.HairManageSearchConfirm;

public class HairManageController {

    HairManageService hairManageService = new HairManageService();

    public HairManageDto searchUserHairManage(String u_id) {
        System.out.println("[HairManageController] searchUserHairManage()");

        return hairManageService.searchManageConfirm(new HairManageSearchConfirm(u_id, AdminContainer.getInstance().getHairManageDao()));
    }
}
