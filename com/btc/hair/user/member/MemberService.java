package com.btc.hair.user.member;

import com.btc.hair.user.member.services.impl.*;

public class MemberService implements IMemberService {
    @Override
    public int SignUpConfirm(IUserSignUpConfirm userSignUpConfirm) {
        return 0;
    }

    @Override
    public MemberDto SignInConfirm(IUserSignInConfirm userSignInConfirm) {
        return null;
    }

    @Override
    public void SignOutConfirm(IUserSignOutConfirm userSignOutConfirm) {

    }

    @Override
    public MemberDto SearchConfirm(IUserSearchConfirm userSearchConfirm) {
        return null;
    }

    @Override
    public int ModifyConfirm(IUserModifyConfirm userModifyConfirm) {
        return 0;
    }

    @Override
    public void SignDownConfirm(IUserSignDownConfirm userSignDownConfirm) {

    }
}
