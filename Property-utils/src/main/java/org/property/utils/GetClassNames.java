package org.property.utils;

import java.io.File;
import java.io.IOException;
import java.net.JarURLConnection;
import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.jar.JarFile;

public class GetClassNames {

	/**
	 * 获取某个包下所有类
	 * @param packageName 包名
	 * @param isRecursion 是否遍历子包
	 * @return 类的完整名字
	 */
	public static List classNames(String packageName,boolean isRecursion){
		List clazz = null;
		ClassLoader loader = Thread.currentThread().getContextClassLoader();
		String packagePath = packageName.replace('.', '/');//把包名的点改成斜杠
		URL url = loader.getResource(packagePath); // 获取绝对路径
		//System.out.println(packagePath);
		//System.out.println(url);
		if(url!=null) {
			String protocol = url.getProtocol(); //获取到的是file
			//System.out.println(protocol);
			if(protocol.equals("file")) {
				clazz =getClassNameFromDir(url.getPath(), packageName, isRecursion);
			}
		}
		return clazz;
	}
	
	/**
	 * 获取某包下的所有类
	 * @param filePath 文件路径
	 * @param packageName 类名集合
	 * @param isRecursion 是否遍历子包
	 * @return 类
	 */
	private static List getClassNameFromDir(String filePath,String packageName,boolean isRecursion) {
		Set<Class> Clazz = new HashSet<>();
		File file = new File(filePath);//包绝对路径
//		System.out.println(file);
		List list = new ArrayList<>();
		File[] files = file.listFiles();
		 
		 
		for (File childFile : files) {
			//System.out.println(childFile);
			list.add(childFile.getName());
		}
		return list;
		
	}
	
	
}
