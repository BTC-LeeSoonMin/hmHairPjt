package com.btc.hair;

import com.btc.hair.admin.config.HairAdminConfig;
import com.btc.hair.admin.container.AdminContainer;
import com.btc.hair.admin.member.impl.*;
import com.btc.hair.admin.services.hairinfo.HairInfoController;
import com.btc.hair.admin.services.hairinfo.HairInfoDao;
import com.btc.hair.admin.services.hairinfo.HairInfoService;
import com.btc.hair.admin.services.hairinfo.impl.*;
import com.btc.hair.admin.services.hairmanage.HairManageController;
import com.btc.hair.admin.services.hairmanage.HairManageDao;
import com.btc.hair.admin.services.hairmanage.HairManageService;
import com.btc.hair.admin.services.hairmanage.impl.AdminHairManageAllSearch;
import com.btc.hair.admin.services.hairmanage.impl.AdminHairManageSearch;
import com.btc.hair.admin.services.hairreservation.impl.AdminReservationAllSearch;
import com.btc.hair.admin.services.hairreservation.impl.AdminReservationSearch;
import com.btc.hair.config.HairConfig;
import com.btc.hair.user.config.HairUserConfig;
import com.btc.hair.user.container.UserContainer;
import com.btc.hair.user.member.MemberController;
import com.btc.hair.user.member.MemberDao;
import com.btc.hair.user.member.MemberService;
import com.btc.hair.user.member.impl.*;
import com.btc.hair.user.services.reservation.HairReservationController;
import com.btc.hair.user.services.reservation.HairReservationDao;
import com.btc.hair.user.services.reservation.HairReservationService;
import com.btc.hair.user.services.reservation.impl.UserReservationDelete;
import com.btc.hair.user.services.reservation.impl.UserReservationRegist;
import com.btc.hair.user.services.reservation.impl.UserReservationSearch;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {

        AdminContainer adminContainer = AdminContainer.getInstance();
        UserContainer userContainer = UserContainer.getInstance();

        adminContainer.setHairAdminController(new com.btc.hair.admin.member.MemberController());
        adminContainer.setHairAdminService(new com.btc.hair.admin.member.MemberService());
        adminContainer.setHairAdminDao(new com.btc.hair.admin.member.MemberDao());

        adminContainer.setHairInfoController(new HairInfoController());
        adminContainer.setHairInfoService(new HairInfoService());
        adminContainer.setHairInfoDao(new HairInfoDao());

        adminContainer.setHairManageController(new HairManageController());
        adminContainer.setHairManageService(new HairManageService());
        adminContainer.setHairManageDao(new HairManageDao());

        adminContainer.setHairReservationController(new com.btc.hair.admin.services.hairreservation.HairReservationController());
        adminContainer.setHairReservationService(new com.btc.hair.admin.services.hairreservation.HairReservationService());
        adminContainer.setHairReservationDao(new com.btc.hair.admin.services.hairreservation.HairReservationDao());

        userContainer.setHairUserController(new MemberController());
        userContainer.setHairUserService(new MemberService());
        userContainer.setHairUserDao(new MemberDao());

        userContainer.setHairReservationController(new HairReservationController());
        userContainer.setHairReservationService(new HairReservationService());
        userContainer.setHairReservationDao(new HairReservationDao());

        Scanner sc = new Scanner(System.in);
        System.out.println("1)관리자 모드 \t 2)사용자 모드 99)시스템 종료 ");



        switch (sc.nextInt()){
            case HairConfig.ADMIN_MODE:

                boolean isAdminModeFlag =true;
                while (isAdminModeFlag){

                    Gnb.showAdminGnb();

                    IAdminMember iAdminMember = null;
                    switch (sc.nextInt()){

                        case HairAdminConfig.ADMIN_SIGN_UP:
                            iAdminMember = new AdminSignUp();

                            break;

                        case HairAdminConfig.ADMIN_SIGN_IN:
                            iAdminMember = new AdminSignIn();

                            break;

                        case HairAdminConfig.ADMIN_SIGN_OUT:
                            iAdminMember = new AdminSignOut();

                            break;

                        case HairAdminConfig.ADMIN_SEARCH:
                            iAdminMember = new AdminSearch();

                            break;

                        case HairAdminConfig.ADMIN_ALL_SEARCH:
                            iAdminMember = new AdminAllSearch();

                            break;

                        case HairAdminConfig.ADMIN_MODIFY:
                            iAdminMember = new AdminModify();

                            break;

                        case HairAdminConfig.ADMIN_SIGN_DOWN:
                            iAdminMember = new AdminSignDown();

                            break;

                        case HairAdminConfig.ADMIN_HAIR_INFO_REGIST:
                            iAdminMember = new AdminHairInfoRegist();

                            break;

                        case HairAdminConfig.ADMIN_HAIR_INFO_SEARCH:
                            iAdminMember = new AdminHairInfoSearch();

                            break;

                        case HairAdminConfig.ADMIN_HAIR_INFO_ALL_SEARCH:
                            iAdminMember = new AdminHairInfoAllSearch();

                            break;

                        case HairAdminConfig.ADMIN_HAIR_INFO_MODIFY:
                            iAdminMember = new AdminHairInfoModify();

                            break;

                        case HairAdminConfig.ADMIN_HAIR_INFO_DELETE:
                            iAdminMember = new AdminHairInfoDelete();

                            break;

                        case HairAdminConfig.ADMIN_HAIR_MANAGE_SEARCH:
                            //관리자 모드 - 결제 내역 조회
                            iAdminMember = new AdminHairManageSearch();

                            break;

                        case HairAdminConfig.ADMIN_HAIR_MANAGE_ALL_SEARCH:
                            //관리자 모드 - 결제 내역 전체 조회
                            iAdminMember = new AdminHairManageAllSearch();

                            break;

                        case HairAdminConfig.ADMIN_HAIR_RESERVATION_SEARCH:
                            //관리자 모드 - 예약 내역 조회
                            iAdminMember = new AdminReservationSearch();

                            break;

                        case HairAdminConfig.ADMIN_HAIR_RESERVATION_ALL_SEARCH:
                            //관리자 모드 - 예약 내역 전체 조회
                            iAdminMember = new AdminReservationAllSearch();

                            break;

                        case HairConfig.SYSTEM_SHUTDOWN:
                            iAdminMember = new AdminSystemShutdown();
                            isAdminModeFlag = false;

                            break;

                    }
                    //스캐너는 프로그램 끝날 때까지 닫으면 안됨
                    iAdminMember.execute(sc);

                }

                break;

            case HairConfig.USER_MODE:

                boolean isUserModeFlag =true;
                while (isUserModeFlag) {
                    Gnb.showUserGnb();
                    IUserMember iUserMember = null;
                    switch(sc.nextInt()){
                        case HairUserConfig.USER_SIGN_UP:
                            iUserMember = new UserSignUp();

                            break;

                        case HairUserConfig.USER_SIGN_IN:
                            iUserMember = new UserSignIn();

                            break;

                        case HairUserConfig.USER_SIGN_OUT:
                            iUserMember = new UserSignOut();

                            break;

                        case HairUserConfig.USER_SEARCH:
                            iUserMember = new UserSearch();
                            break;

                        case HairUserConfig.USER_MODIFY:
                            iUserMember = new UserModify();
                            break;

                        case HairUserConfig.USER_SIGN_DOWN:
                            iUserMember = new UserSignDown();
                            break;

                        case HairUserConfig.USER_RESERVATION_REGIST:
                            iUserMember = new UserReservationRegist();

                            break;

                        case HairUserConfig.USER_RESERVATION_SEARCH:
                            iUserMember = new UserReservationSearch();

                            break;

                        case HairUserConfig.USER_RESERVATION_DELETE:
                            iUserMember = new UserReservationDelete();

                            break;
                        case HairConfig.SYSTEM_SHUTDOWN:
                            iUserMember = new UserSystemShutdown();
                            isUserModeFlag = false;

                            break;
                    }

                    iUserMember.execute(sc);

                }
                break;
        }

        sc.close();

    }

}
