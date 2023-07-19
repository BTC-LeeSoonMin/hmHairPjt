package com.btc.hair.user.container;

import com.btc.hair.user.member.MemberController;
import com.btc.hair.user.member.MemberDao;
import com.btc.hair.user.member.MemberService;
import com.btc.hair.user.services.reservation.HairReservationController;
import com.btc.hair.user.services.reservation.HairReservationDao;
import com.btc.hair.user.services.reservation.HairReservationService;

public class UserContainer {

    private static  UserContainer userContainer;

    // 사용자 멤버 서비스 관련
    private MemberController memberController;
    private MemberService hairUserService;
    private MemberDao memberDao;

    // 사용자 예약 서비스 관련
    private HairReservationController hairReservationController;
    private HairReservationService hairReservationService;
    private HairReservationDao hairReservationDao;

    private UserContainer(){

    }

    public static UserContainer getInstance() {
        if(userContainer == null){
            userContainer = new UserContainer();
        }
        return userContainer;
    }

    public MemberController getHairUserController() {
        return memberController;
    }

    public void setHairUserController(MemberController memberController) {
        this.memberController = memberController;
    }

    public MemberService getHairUserService() {
        return hairUserService;
    }

    public void setHairUserService(MemberService hairUserService) {
        this.hairUserService = hairUserService;
    }

    public MemberDao getHairUserDao() {
        return memberDao;
    }

    public void setHairUserDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public HairReservationController getHairReservationController() {
        return hairReservationController;
    }

    public void setHairReservationController(HairReservationController hairReservationController) {
        this.hairReservationController = hairReservationController;
    }

    public HairReservationService getHairReservationService() {
        return hairReservationService;
    }

    public void setHairReservationService(HairReservationService hairReservationService) {
        this.hairReservationService = hairReservationService;
    }

    public HairReservationDao getHairReservationDao() {
        return hairReservationDao;
    }

    public void setHairReservationDao(HairReservationDao hairReservationDao) {
        this.hairReservationDao = hairReservationDao;
    }
}
