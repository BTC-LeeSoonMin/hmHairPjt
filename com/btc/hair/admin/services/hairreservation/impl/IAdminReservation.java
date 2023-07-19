package com.btc.hair.admin.services.hairreservation.impl;

import com.btc.hair.admin.member.impl.IAdminMember;

import java.util.Scanner;

public interface IAdminReservation extends IAdminMember {
    public void execute(Scanner sc);
}
