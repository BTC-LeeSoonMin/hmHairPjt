package com.btc.hair.user.session;

import com.btc.hair.user.member.MemberDto;

public class UserSession {

    private static UserSession userSession;

    private MemberDto loginedMemberDto;

    private UserSession(){

    }

    public static UserSession getInstance() {
        if(userSession == null){
            userSession = new UserSession();
        }
        return userSession;

    }

    public MemberDto getLoginedHairUserDto() {
        return loginedMemberDto;
    }

    public void setLoginedHairUserDto(MemberDto loginedMemberDto) {
        this.loginedMemberDto = loginedMemberDto;
    }
}
