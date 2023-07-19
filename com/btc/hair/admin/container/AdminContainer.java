package com.btc.hair.admin.container;

import com.btc.hair.admin.member.MemberController;
import com.btc.hair.admin.member.MemberDao;
import com.btc.hair.admin.member.MemberService;
import com.btc.hair.admin.services.hairinfo.HairInfoController;
import com.btc.hair.admin.services.hairinfo.HairInfoDao;
import com.btc.hair.admin.services.hairinfo.HairInfoService;
import com.btc.hair.admin.services.hairmanage.HairManageController;
import com.btc.hair.admin.services.hairmanage.HairManageDao;
import com.btc.hair.admin.services.hairmanage.HairManageService;
import com.btc.hair.admin.services.hairreservation.HairReservationController;
import com.btc.hair.admin.services.hairreservation.HairReservationDao;
import com.btc.hair.admin.services.hairreservation.HairReservationService;

public class AdminContainer {

    private static AdminContainer adminContainer;

    // 관리자 멤버 서비스 관련
    private MemberController memberController;
    private MemberService hairAdminService;
    private MemberDao memberDao;

    // 관리자 서비스 타입 관련
    private HairInfoController hairInfoController;
    private HairInfoService hairInfoService;
    private HairInfoDao hairInfoDao;

    // 관리자 결제 관련
    private HairManageController hairManageController;
    private HairManageService hairManageService;
    private HairManageDao hairManageDao;

    // 관리자가 사용자 예약내역 조회 관련
    private HairReservationController hairReservationController;
    private HairReservationService hairReservationService;
    private HairReservationDao hairReservationDao;

    private AdminContainer() {

    }

    public static AdminContainer getInstance(){
        if(adminContainer == null) {
            adminContainer = new AdminContainer();
        }
        return adminContainer;
    }

    public MemberController getHairAdminController() {
        return memberController;
    }

    public void setHairAdminController(MemberController memberController) {
        this.memberController = memberController;
    }

    public MemberService getHairAdminService() {
        return hairAdminService;
    }

    public void setHairAdminService(MemberService hairAdminService) {
        this.hairAdminService = hairAdminService;
    }

    public MemberDao getHairAdminDao() {
        return memberDao;
    }

    public void setHairAdminDao(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    public HairInfoController getHairInfoController() {
        return hairInfoController;
    }

    public void setHairInfoController(HairInfoController hairInfoController) {
        this.hairInfoController = hairInfoController;
    }

    public HairInfoService getHairInfoService() {
        return hairInfoService;
    }

    public void setHairInfoService(HairInfoService hairInfoService) {
        this.hairInfoService = hairInfoService;
    }

    public HairInfoDao getHairInfoDao() {
        return hairInfoDao;
    }

    public void setHairInfoDao(HairInfoDao hairInfoDao) {
        this.hairInfoDao = hairInfoDao;
    }

    public HairManageController getHairManageController() {
        return hairManageController;
    }

    public void setHairManageController(HairManageController hairManageController) {
        this.hairManageController = hairManageController;
    }

    public HairManageService getHairManageService() {
        return hairManageService;
    }

    public void setHairManageService(HairManageService hairManageService) {
        this.hairManageService = hairManageService;
    }

    public HairManageDao getHairManageDao() {
        return hairManageDao;
    }

    public void setHairManageDao(HairManageDao hairManageDao) {
        this.hairManageDao = hairManageDao;
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
