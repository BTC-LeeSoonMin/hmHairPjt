package com.btc.hair.admin.services.hairmanage.impl;

import com.btc.hair.admin.services.hairmanage.HairManageController;
import com.btc.hair.admin.services.hairmanage.HairManageDto;

import java.util.Scanner;

public class AdminHairManageSearch implements IAdminHairManage{

    HairManageController hairManageController = new HairManageController();


    @Override
    public void execute(Scanner sc) {
        System.out.println("--------------------- 관리자 모드 - 결제 내역 조회 ---------------------");
        System.out.println("결제 내역을 조회할 회원의 id를 입력하세요.");
        String u_id = sc.next();

        HairManageDto hairManageDto = hairManageController.searchUserHairManage(u_id);

        if (hairManageDto != null) {
            System.out.println("--------------------- " + u_id + " 님의 결제 내역 ---------------------");


        }

    }
}
