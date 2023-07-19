package com.btc.hair.user.config;

public class HairUserConfig {

        // 사용자 회원가입, 로그인, 정보수정, 조회, 탈퇴 BY seari@gmail.com
        final static public byte USER_SIGN_UP                      = 1;
        final static public byte USER_SIGN_IN                      = 2;
        final static public byte USER_SIGN_OUT                     = 3;
        final static public byte USER_SEARCH                       = 4;
        final static public byte USER_MODIFY                       = 5;
        final static public byte USER_SIGN_DOWN                    = 6;


        // 사용자 예약 등록, 취소, 조회 BY seari@gmail.com
        final static public byte USER_RESERVATION_REGIST           = 11;
        final static public byte USER_RESERVATION_SEARCH           = 12;
        final static public byte USER_RESERVATION_DELETE           = 13;


        // 사용자 회원가입, 로그인 결과 BY gildong@gmail.com
        final static public byte USER_SIGN_UP_SUCCESS      = 1;
        final static public byte USER_SIGN_UP_ALREADY      = -1;
        final static public byte USER_SIGN_UP_FAIL         = 0;
        final static public byte USER_SIGN_IN_SUCCESS      = 1;
        final static public byte USER_SIGN_IN_FAIL         = 0;

    }

