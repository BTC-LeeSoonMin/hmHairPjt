package com.btc.hair.user.member;

import com.btc.hair.user.member.services.impl.*;

public interface IMemberService {
    public int SignUpConfirm(IUserSignUpConfirm userSignUpConfirm);
    public MemberDto SignInConfirm(IUserSignInConfirm userSignInConfirm);
    public void SignOutConfirm(IUserSignOutConfirm userSignOutConfirm);
    public MemberDto SearchConfirm(IUserSearchConfirm userSearchConfirm);
    public int ModifyConfirm(IUserModifyConfirm userModifyConfirm);
    public void SignDownConfirm(IUserSignDownConfirm userSignDownConfirm);
}
