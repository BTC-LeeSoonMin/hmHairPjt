package com.btc.hair.admin.member;

import com.btc.hair.admin.member.services.impl.*;

import java.util.List;

public class MemberService implements IMemberService {

    @Override
    public int signUpConfirm(IAdminSignUpConfirm adminSignUpConfirm) {
        return 0;
    }

    @Override
    public MemberDto signInConfirm(IAdminSignInConfirm adminSignInConfirm) {
        return null;
    }

    @Override
    public void signOutConfirm(IAdminSignOutConfirm adminSignOutConfirm) {

    }

    @Override
    public MemberDto searchConfirm(IAdminSearchConfirm adminSearchConfirm) {
        return null;
    }

    @Override
    public List<MemberDto> allSearchConfirm(IAdminAllSearchConfirm adminAllSearchConfirm) {
        return null;
    }

    @Override
    public int modifyConfirm(IAdminModifyConfirm adminModifyConfirm) {
        return 0;
    }

    @Override
    public int signDownConfirm(IAdminSignDownConfirm adminSignDownConfirm) {
        return 0;
    }
}
