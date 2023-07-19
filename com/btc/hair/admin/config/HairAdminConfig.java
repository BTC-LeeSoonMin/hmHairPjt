package com.btc.hair.admin.config;

public class HairAdminConfig {

    // 관리자 회원가입, 로그인, 정보수정, 조회, 탈퇴 BY seari@gmail.com
    final static public byte ADMIN_SIGN_UP                      = 1;
    final static public byte ADMIN_SIGN_IN                      = 2;
    final static public byte ADMIN_SIGN_OUT                     = 3;
    final static public byte ADMIN_SEARCH                       = 4;
    final static public byte ADMIN_ALL_SEARCH                   = 5;
    final static public byte ADMIN_MODIFY                       = 6;
    final static public byte ADMIN_SIGN_DOWN                    = 7;

    // 관리자 서비스 종류 및 가격 등록, 조회, 수정, 삭제 BY seari@gmail.com
    final static public byte ADMIN_HAIR_INFO_REGIST         = 11;
    final static public byte ADMIN_HAIR_INFO_SEARCH         = 12;
    final static public byte ADMIN_HAIR_INFO_ALL_SEARCH     = 13;
    final static public byte ADMIN_HAIR_INFO_MODIFY         = 14;
    final static public byte ADMIN_HAIR_INFO_DELETE         = 15;

    // 관리자 서비스 결제 내역 조회
    final static public byte ADMIN_HAIR_MANAGE_SEARCH           = 16;
    final static public byte ADMIN_HAIR_MANAGE_ALL_SEARCH       = 17;

    // 관리자가 사용자 예약내역 조회
    final static public byte ADMIN_HAIR_RESERVATION_SEARCH       = 18;
    final static public byte ADMIN_HAIR_RESERVATION_ALL_SEARCH       = 19;



    //관리자 회원가입, 로그인 결과 BY gildong@gmail.com
    final static public byte ADMIN_SIGN_UP_SUCCESS      = 1;
    final static public byte ADMIN_SIGN_UP_ALREADY      = -1;
    final static public byte ADMIN_SIGN_UP_FAIL         = 0;
    final static public byte ADMIN_SIGN_IN_SUCCESS      = 1;
    final static public byte ADMIN_SIGN_IN_FAIL         = 0;

    // 관리자 서비스 종류 및 가격 결과 BY gildong@gmail.com
    final static public byte ADMIN_HAIR_INFO_REGIST_SUCCESS = 1;
    final static public byte ADMIN_HAIR_INFO_REGIST_ALREADY = -1;
    final static public byte ADMIN_HAIR_INFO_REGIST_FAIL = 0;

}
