package com.shuangtixi.deptwo.one;

public class DataCenter {
    public static TUser[] users;

    static {
        users = new TUser[1];
    }

    /*
     * 写一个扩容的方法，假设每次扩容一倍
     */
    public static void largeUserCapacity() {
        // 建立一个新的数组，长度为原来的一倍
        TUser[] newUsers = new TUser[users.length * 2];
        // 复制数据
        System.arraycopy(users, 0, newUsers, 0, users.length);
        // 将users指向新的数组
        users = newUsers;
    }

}
