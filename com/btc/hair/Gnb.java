package com.btc.hair;

import com.btc.hair.admin.session.AdminSession;
import com.btc.hair.user.session.UserSession;

public class Gnb {

    public static void showAdminGnb() {

        if (AdminSession.getInstance().getLoginedHairAdminDto() == null) {
            System.out.println("2)관리자 로그인 \t 99)시스템 종료");
        } else {
            System.out.print("3)관리자 로그아웃 \t 4) 관리자 정보 조회 5) 관리자 정보 전체 조회 4)관리자 정보 수정 \t 5)탈퇴 \t ");
            if (AdminSession.getInstance().getLoginedHairAdminDto().getA_id().equals("super")) {
                System.out.println("1)관리자 등록");

            } else {
                System.out.println();
            }

            System.out.println("11)서비스 등록 \t 12)서비스 조회 \t 13)서비스 전체 조회 \t 14)서비스 수정 \t 15)서비스 삭제");
            System.out.println("16)결제 내역 조회 \t 17)결제 내역 전체 조회 \t 18)예약 내역 조회 \t 19)예약 내역 전체 조회 \t 99)시스템 종료");

        }

    }

    public static void showUserGnb() {

        if (UserSession.getInstance().getLoginedHairUserDto() == null) {
            System.out.println("1)사용자 회원가입 \t 2)사용자 로그인 \t 99)시스템 종료");

        } else {
            System.out.println("3)사용자 로그아웃 \t 4)사용자 정보 조회 5)사용자 정보 수정 \t 6)탈퇴");
            System.out.println("11)사용자 예약 등록 \t 12)사용자 예약 내역 조회 \t 13)사용자 예약 취소");
        }

    }


}
