package com.report.common.dal.admin.constant;

/**
 * 常量类
 * @author lishun
 * @since 2017年3月30日 上午11:45:28
 */
public class Constants {
	
	private Constants() {}
	
    public static class OpStatus {

        public final static int SUCC = 1;
        public final static int FAIL = 0;
    }

    public static class ResourceStatus {

        public final static int VALID = 1;
        public final static int INVALID = 0;
    }
    
    public static class MenuType {
        public static final String REPORT = "omp";
        public static final String PERMISSION = "per";
    }
    
    /** 管理员账号 */
    public static final String ADMIN_ACCOUNT = "per_admin";

    /** 登陆用户信息 */
    public static final String SESSION_LOGIN_INFO = "loginInfo";
    /** 用户默认密码 */
    public static final String DEFAULT_PASSWORD_FOR_MEMBER = "123456";
    public static final String MENU_LIST = "menuList";
    public static final String REPORT_MENU_LIST = "reportMenuList";
    
}
