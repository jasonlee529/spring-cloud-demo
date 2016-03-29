/*
 * Copyright 2014-2016 the infisa.cn.
 */
package cn.hebut.lee.export.file.word;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.xwpf.usermodel.XWPFDocument;
import org.jeecgframework.poi.word.WordExportUtil;

public class WordExport {

	public static void main(String[] args) {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String curTime = format.format(new Date());

		Map<String, Object> map = new HashMap<String, Object>();
		List<Map<String, Object>> mapList = new ArrayList<Map<String, Object>>();
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("type", "个人所得税");
		map1.put("presum", "1580");
		map1.put("thissum", "1750");
		map1.put("curmonth", "1-11月");
		map1.put("now", curTime);
		mapList.add(map1);
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("type", "增值税");
		map2.put("presum", "1080");
		map2.put("thissum", "1650");
		map2.put("curmonth", "1-11月");
		map2.put("now", curTime);
		mapList.add(map2);
		map.put("taxlist", mapList);
		map.put("totalpreyear", "2660");
		map.put("totalthisyear", "3400");
		Map<String, String> total = new HashMap<String, String>();
		total.put("orderId", "2660");
		total.put("orderCreateTime", "3400");
		total.put("supplyName", "3410");
		map.put("order", total);
		try {
			XWPFDocument doc = WordExportUtil.exportWord07(
					"/home/jason/Downloads/contractDemo.docx", map);
			FileOutputStream fos = new FileOutputStream("dist.docx");
			doc.write(fos);
			fos.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
