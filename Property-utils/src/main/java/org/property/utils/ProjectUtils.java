package org.property.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.Id;

import freemarker.template.Configuration;
import freemarker.template.Template;

public class ProjectUtils {
	
	private static Configuration con = new Configuration(Configuration.VERSION_2_3_23);
	private static Map<String, Object> model =new HashMap<>(); //模型数据
	private static Class[] classes;  //实体类数组
	
	public static Class[] getClasses() {
		return classes;
	}

	public static void setClasses(Class[] classes) {
		ProjectUtils.classes = classes;
	}

	/**
	 * 完成freemarker的配置
	 */
	static {
		//读取文档文件
			//设置模板所在的路径
			try {
				con.setDirectoryForTemplateLoading(new File("src/main/resources"));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			//设置文件编码
			con.setDefaultEncoding("utf-8");
			
			//准备公共的模型数据
				//包路径
				model.put("projectName", "org.property");
				
	}
	/**
	 * 生成Dao接口
	 */
	public static void generateDaoInterface() throws Exception {
		
		Template template = con.getTemplate("dao.ftl");
		//根据classes批量生成dao接口
		
		if(classes ==null) {
			return;
		}
		for (Class clazz : classes) {
			String pkType = "Integer";
			Field[] fields = clazz.getDeclaredFields();//java.lang.reflect.Field; 获取所有的属性类型
			for (Field field : fields) {
				//看看哪个属性类型有id的注解  id是自己去属性
				if(field.getAnnotations().length>0) {
					if(field.getAnnotations()[0].annotationType() ==Id.class) {
						//如果是主键了，那么给PkType赋值
						pkType = field.getType().getSimpleName();
					}
				}
			}
			model.put("pojoName", clazz.getSimpleName());//反射获取实体类名字
			model.put("pkType",pkType);
			
			//输出到对应的目录
			File file = new File("src/main/java/org/property/dao/"+clazz.getSimpleName()+"Dao.java");
			if(file.exists() ==false) {
				file.createNewFile();
			}
			Writer out = new OutputStreamWriter(new FileOutputStream(file));
			template.process(model, out);
			
			System.out.println("ok");
		}
		
	}
	
	/**
	 * 生成Mapper
	 */
	public static void generateMappers() throws Exception {
		Template template = con.getTemplate("mapper.ftl");
		//根据classes批量生成dao接口
		
		if(classes ==null) {
			return;
		}
		List<String> columnNames = new ArrayList<>();
		for (Class clazz : classes) {
			String pkType = "Integer";
			Field[] fields = clazz.getDeclaredFields();//java.lang.reflect.Field; 获取所有的属性类型
			for (Field field : fields) {
				//看看哪个属性类型有id的注解  id是自己去属性
				if(field.getAnnotations().length>0 && field.getAnnotations()[0].annotationType() ==Id.class) {
					//如果是主键了，那么给PkType赋值
					pkType = field.getType().getSimpleName();
				}else {
					//如果不是主键就添加到列属性里面
					columnNames.add(field.getName());
				}
			}
			model.put("pojoName", clazz.getSimpleName());//反射获取实体类名字
			model.put("columnNames", columnNames); //实体类属性
		//根据类名自动计算表名SysUser--> sys_user
			StringBuffer sb = new StringBuffer(clazz.getSimpleName());//先把类名存到stringbuff中
			System.out.println(sb.toString());
			char[] array = clazz.getSimpleName().toCharArray();//把每个类名都转成一个char数组
			System.out.println(array);
			for (int i = 1; i < array.length; i++) {
				char c = array[i]; //获取一个char
				boolean isUpper =Character.isUpperCase(c);
				if(isUpper) {
					sb.insert(i, "_");
				}
			}
			System.out.println(sb.toString());
			model.put("table_name", sb.toString());//表名
		//输出到对应的目录
			File file = new File("src/main/java/org/property/mappers/"+clazz.getSimpleName()+"Mapper.xml");
			if(file.exists() ==false) {
				file.createNewFile();
			}
			Writer out = new OutputStreamWriter(new FileOutputStream(file));
			template.process(model, out);
			
			System.out.println("ok");
		}
	}
}
