package com.btc.hair.admin.session;

import com.btc.hair.admin.member.MemberDto;

public class AdminSession {
    private static AdminSession adminSession;

    private MemberDto loginedMemberDto;

    private AdminSession() {

    }

    public static AdminSession getInstance(){
        if(adminSession == null){
            adminSession = new AdminSession();
        }

        return adminSession;
    }

    public MemberDto getLoginedHairAdminDto() {
        return loginedMemberDto;
    }

    public void setLoginedHairAdminDto(MemberDto loginedMemberDto) {
        this.loginedMemberDto = loginedMemberDto;
    }
}
