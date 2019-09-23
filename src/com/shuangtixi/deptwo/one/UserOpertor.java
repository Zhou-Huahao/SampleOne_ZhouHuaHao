package com.shuangtixi.deptwo.one;
public class UserOpertor {
    public boolean addUser(TUser user) {
        boolean canAdd = false;
        for (int i = 0; i < DataCenter.users.length; i++) {
            if (DataCenter.users[i] == null) {
                // 保存用户到用户数组中
                DataCenter.users[i] = user;
                canAdd = true;
                break;
            }
            // 如果容量满了，需要扩容
            if (i == DataCenter.users.length - 1) {
                // 扩容后用户对象插入的位置
                int pos = DataCenter.users.length;
                // 完成扩容操作
                DataCenter.largeUserCapacity();
                DataCenter.users[pos] = user;
            }
        }
        return canAdd;
    }

    /**
     * 判断用户名是否存在
     *
     * @param userName
     *            用户名
     * @return true 用户名存在 or false 用户名不存在
     */
    public boolean judgeUserNameExist(String userName) {
        for (int i = 0; i < DataCenter.users.length; i++) {
            if (DataCenter.users[i] != null
                    && DataCenter.users[i].getUserName().equals(userName)) {
                // 用户名存在
                return true;
            } else if (DataCenter.users[i] == null) {
                break;
            }
        }
        return false;
    }

    /**
     * 判断用户是否存在
     *
     * @param user
     *            用户对象
     * @return true 存在 or false 不存在
     */
    public boolean judgeUserExist(TUser user) {
        for (int i = 0; i < DataCenter.users.length; i++) {
            if (DataCenter.users[i] != null
                    && DataCenter.users[i].getUserName().equals(
                    user.getUserName())
                    && DataCenter.users[i].getUserPassword().equals(
                    user.getUserPassword())) {
                // 用户存在
                return true;
            } else if (DataCenter.users[i] == null) {
                break;
            }
        }
        return false;
    }
}







