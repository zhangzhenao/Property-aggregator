package org.property.test;


import java.util.List;

import org.junit.Test;
import org.property.pojo.Admin;
import org.property.pojo.Baoan;
import org.property.pojo.Dandong;
import org.property.pojo.Dictionary;
import org.property.pojo.Fangchan;
import org.property.pojo.Fangjian;
import org.property.pojo.Huodong;
import org.property.pojo.Kaifashang;
import org.property.pojo.Louceng;
import org.property.pojo.Permission;
import org.property.pojo.Role;
import org.property.pojo.RoleQuanxian;
import org.property.pojo.RoleUser;
import org.property.pojo.Sheshi;
import org.property.pojo.Shigu;
import org.property.pojo.Xinjian;
import org.property.pojo.Xuncha;
import org.property.pojo.Yanfang;
import org.property.pojo.Yanlian;
import org.property.pojo.Yezhubiao;
import org.property.pojo.Yijian;
import org.property.pojo.Zhiqin;
import org.property.pojo.Zhuangxiu;
import org.property.pojo.Zigongsi;
import org.property.utils.ProjectUtils;

public class testGenerter {

	@Test
	public void test() throws Exception {
		
		/**
		 * 调用方法，说明你要创建的是哪个类，可以填写多个
		 */
		ProjectUtils.setClasses(new Class[] {
				Admin.class,Baoan.class,Dandong.class,
				Dictionary.class,Fangchan.class,Fangjian.class,
				Huodong.class,Kaifashang.class,Louceng.class,
				Permission.class,Role.class,RoleQuanxian.class,
				RoleUser.class,Sheshi.class,Shigu.class,Xinjian.class,
				Xuncha.class,Yanfang.class,Yanlian.class,Yezhubiao.class,
				Yijian.class,Zhiqin.class,Zhuangxiu.class,Zigongsi.class,
		});
		
		/**
		 * 生成dao和mapper
		 */
		ProjectUtils.generateDaoInterface();
		//ProjectUtils.generateMappers();
	}

}
