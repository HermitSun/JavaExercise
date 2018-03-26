package test;

import java.util.*;
import java.io.*;

public class Curriculum {
	
	private Scanner input=new Scanner(System.in);
	File f=new File("D:/CurriculumSchedule.txt");
	ArrayList<String> curriculumList=new ArrayList<>();
	//实例
	public static void main(String[] args) {
		new Curriculum().startAndGetInput();
	}
	//启动
	public void startAndGetInput() {
		if(!f.exists()) {
			try {
				f.createNewFile();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		//如果用于存储的文件不存在，则创建
		String s=input.nextLine();
		
		String[] commands=s.split(" ");
		if(commands.length==1) {
			String command=commands[0];
			getCommand(command);
		}
		else {
			String command=commands[0];
			String data=commands[1];
			getCommand(command,data);
		}
	}
	//将输入分为两部分（以空格为界），前一部分是指令，后一部分是课程内容
	public void getCommand(String command,String data) {
		switch(command) {
		case"Add":
			addData(data);
			break;
		case"Remove":
			removeData(data);
			break;
		case"Update":
			updateData(data);
			break;
		case"Find":
			findData(data);
			break;
		}
	}
	public void getCommand(String command) {
		switch(command) {
		case"Show":
			showData();
			break;
		}
	}
	//支持的命令
	public void addData(String data) {
		if(judgeNameRepeat(data,readFile())) {
			System.out.println("课程冲突");
		}
		else {
			writeFile(data,true);
			System.out.println("已添加到文件中");
		}
	}
	//添加，第二个参数表示在末尾追加
	public void removeData(String data) {
		if(!fileIsEmpty()) {
			String[] contents=readFile();
			ArrayList<String> list=new ArrayList<>(Arrays.asList(contents));
			//转换成ArrayList方便处理
			if(list.contains(data)) {
				list.remove(data);
				clearData();
				//清空文件再写入，否则会出现玄学错误（？）
				for(String s:list) {
					writeFile(s,false);
				}
				System.out.println("已从文件删除");
			}
			else {
				System.out.println("课程不存在");
			}
		}
	}
	//删除，第二个参数表示从开头开始
	public void updateData(String data) {
		if(!fileIsEmpty()) {
			System.out.println("1:修改日期");
			System.out.println("2:修改节次");
			System.out.println("3:修改地点");
			System.out.println("需要更大幅度修改请删除后再次添加");
			showData();
			
			Map<Integer,String> map=new HashMap<>();
			for(int i=0;i<curriculumList.size();i++) {
				map.put(i, curriculumList.get(i));
			}
			
			int command=input.nextInt();
			switch(command) {
			case'1':
				String date=input.nextLine();
			}
			
			
			
			System.out.println("已更新文件");
		}
	}
	//更新（未实现）
	public void findData(String data) {
		if(!fileIsEmpty()) {
			String[] contents=readFile();
			ArrayList<String> list=new ArrayList<>(Arrays.asList(contents));
			//转换成ArrayList方便处理
			for(String s:list) {
				if(s.startsWith(data)) {
					String[] ss=s.split("，");
					System.out.println(ss[2]+"，"+ss[3]);
					return;
				}
			}
			System.out.println("不存在此课程");
		}
	}
	//搜索
	public void showData() {
		if(!fileIsEmpty()) {
			String[] contents=readFile();
			ArrayList<String> list=new ArrayList<>(Arrays.asList(contents));
			//转换成ArrayList方便处理
			Comparator<String> second=new Comparator<String>() {
				public int compare(String s1, String s2) {
					return compareNumber(s1,s2);
				}
			};
			//比较节数
			ArrayList<String> monday=new ArrayList<>();
			ArrayList<String> tuesday=new ArrayList<>();
			ArrayList<String> wednesday=new ArrayList<>();
			ArrayList<String> thursday=new ArrayList<>();
			ArrayList<String> friday=new ArrayList<>();
			for(String s:list) {
				if(s.startsWith("星期一")) {
					monday.add(s);
				}
				if(s.startsWith("星期二")) {
					tuesday.add(s);
				}
				if(s.startsWith("星期三")) {
					wednesday.add(s);
				}
				if(s.startsWith("星期四")) {
					thursday.add(s);
				}
				if(s.startsWith("星期五")) {
					friday.add(s);
				}
			}
			
			Collections.sort(monday, second);
			Collections.sort(tuesday, second);
			Collections.sort(wednesday, second);
			Collections.sort(thursday, second);
			Collections.sort(friday, second);
			
			for(String s:monday) {
				curriculumList.add(s);
			}
			for(String s:tuesday) {
				curriculumList.add(s);
			}
			for(String s:wednesday) {
				curriculumList.add(s);
			}
			for(String s:thursday) {
				curriculumList.add(s);
			}
			for(String s:friday) {
				curriculumList.add(s);
			}
			for(String s:curriculumList) {
				System.out.println(s);
			}
		}
	}
	//显示
	@SuppressWarnings("resource")
	public String[] readFile() {
		String[] contents = null;
		try {
			FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			String content=br.readLine();
			if(content==null) {
				return null;
			}
			contents=content.split("@");
			br.close();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
		return contents;
	}
	//读取文件
	public void writeFile(String data,boolean state) {
		try {
			FileWriter fw=new FileWriter(f,state);
			PrintWriter pw=new PrintWriter(fw);
			if(data!="") {
				pw.write(data+"@");
				pw.flush();
			}
			pw.close();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	//写入文件
	public void clearData() {
		try {
			FileWriter fw = new FileWriter(f,false);
			fw.close();
		}catch(IOException ex) {
			ex.printStackTrace();
		}
	}
	//清空文件
	public boolean judgeNameRepeat(String data,String[] contents) {
		if(contents==null) {
			return false;
		}
		for(String s:contents) {
			String[] ss=s.split("，");
			String regex=ss[0]+"，"+ss[1]+"，"+"(\\S)+"+"，"+ss[3];
			if(data.matches(regex)) {
				return true;
			}
		}
		return false;
	}
	//判断课程名重复，使用正则表达式
	public boolean fileIsEmpty() {
		if(readFile()==null) {
			System.out.println("暂无课程信息");
			return true;
		}
		return false;
	}
	//判断文件是否为空
	public int compareNumber(String s1,String s2) {
		if(s1.matches("(\\S)+三、四节(\\S)+")&&s2.matches("(\\S)+七、八节(\\S)+")) {
			return -1*s1.compareTo(s2);
		}
		else if(s1.matches("(\\S)+五、六节(\\S)+")&&s2.matches("(\\S)+七、八节(\\S)+")) {
			return -1*s1.compareTo(s2);
		}
		else if(s1.matches("(\\S)+五、六节(\\S)+")&&s2.matches("(\\S)+九、十节(\\S)+")) {
			return -1*s1.compareTo(s2);
		}
		else if(s1.matches("(\\S)+七、八节(\\S)+")&&s2.matches("(\\S)+三、四节(\\S)+")) {
			return -1*s1.compareTo(s2);
		}
		else if(s1.matches("(\\S)+七、八节(\\S)+")&&s2.matches("(\\S)+五、六节(\\S)+")) {
			return -1*s1.compareTo(s2);
		}
		else if(s1.matches("(\\S)+九、十节(\\S)+")&&s2.matches("(\\S)+五、六节(\\S)+")) {
			return -1*s1.compareTo(s2);
		}
		else {
			return s1.compareTo(s2);
		}
	}
	//比较课程节数
}