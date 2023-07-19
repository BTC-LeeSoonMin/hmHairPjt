package com.btc.hair.admin.member;

import com.btc.hair.admin.member.services.impl.*;

import java.util.List;

public interface IMemberService {
    public int signUpConfirm(IAdminSignUpConfirm adminSignUpConfirm);
    public MemberDto signInConfirm(IAdminSignInConfirm adminSignInConfirm);
    public void signOutConfirm(IAdminSignOutConfirm adminSignOutConfirm);
    public MemberDto searchConfirm(IAdminSearchConfirm adminSearchConfirm);
    public List<MemberDto> allSearchConfirm(IAdminAllSearchConfirm adminAllSearchConfirm);
    public int modifyConfirm(IAdminModifyConfirm adminModifyConfirm);
    public int signDownConfirm(IAdminSignDownConfirm adminSignDownConfirm);
}
