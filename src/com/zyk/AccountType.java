package com.zyk;

/**
 * 功能描述:
 *
 * @author
 * @date
 * @version: 1.0
 */
enum AccountType
{
    SAVING, FIXED, CURRENT;
    private AccountType()
    {
        System.out.println("It is a account type");
    }
}
class EnumOne
{
    public static void main(String[]args)
    {
        System.out.println(AccountType.FIXED);
    }
}



