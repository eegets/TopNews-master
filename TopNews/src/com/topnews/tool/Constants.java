package com.topnews.tool;

import java.util.ArrayList;
import java.util.List;

import com.topnews.bean.CityEntity;
//import com.topnews.bean.NewsClassify;
import com.topnews.bean.NewsEntity;

public class Constants {
	/*
	 * ��ȡ�����б�
	 */
	public static ArrayList<NewsEntity> getNewsList() {
		ArrayList<NewsEntity> newsList = new ArrayList<NewsEntity>();
		for(int i =0 ; i < 10 ; i++){
			NewsEntity news = new NewsEntity();
			news.setId(i);
			news.setNewsId(i);
			news.setCollectStatus(false);
			news.setCommentNum(i + 10);
			news.setInterestedStatus(true);
			news.setLikeStatus(true);
			news.setReadStatus(false);
			news.setNewsCategory("�Ƽ�");
			news.setNewsCategoryId(1);
			news.setSource_url("http://news.sina.com.cn/c/2014-05-05/134230063386.shtml");
			news.setTitle("�����ùȸ��۾�����10�����£�����������Ϸ");
			List<String> url_list = new ArrayList<String>();
			if(i%2 == 1){
				String url1 = "http://infopic.gtimg.com/qq_news/digi/pics/102/102066/102066094_400_640.jpg";
				String url2 = "http://infopic.gtimg.com/qq_news/digi/pics/102/102066/102066096_400_640.jpg";
				String url3 = "http://infopic.gtimg.com/qq_news/digi/pics/102/102066/102066099_400_640.jpg";
				news.setPicOne(url1);
				news.setPicTwo(url2);
				news.setPicThr(url3);
				news.setSource_url("http://tech.sina.com.cn/zl/post/detail/i/2013-11-06/pid_8436571.htm?from=groupmessage&isappinstalled=0");
				url_list.add(url1);
				url_list.add(url2);
				url_list.add(url3);
			}else{
				news.setTitle("AA�ó�:���ܶ����⳵ƽ̨");
				String url = "http://r3.sinaimg.cn/2/2014/0417/a7/6/92478595/580x1000x75x0.jpg";
				news.setPicOne(url);
				url_list.add(url);
			}
			news.setPicList(url_list);
			news.setPublishTime(Long.valueOf(i));
			news.setReadStatus(false);
			news.setSource("�ֻ���Ѷ��");
			news.setSummary("��Ѷ����Ѷ�����룺Gin���ȸ��۾�������Ŀǰ���Ŀɴ��������豸������Դ�����ȥ�κεط���ֻҪ���ɷ����������û��������ŭ������Ϊ�ֻ��ĵڶ��顰��ǿ��ʵ��ʾ������ʹ�á����⣬��Ȼ����δ��ʽ���ۣ����ȸ�����������г������˽���һ��Ŀ��Ź������۸���Ϊ1500��Ԫ��Լ�������9330Ԫ������Ȼ��ʮ�ְ��󣬵����ٿ�������һЩ�����ߵ�����ҲԤʾ�Źȸ��۾��Ĺ������ģ����������Խ��Խ���ˡ�");
			news.setMark(i);
			if(i == 4){
				news.setTitle("����ս��ǿ�ƻع�");
				news.setLocal("�ƹ�");
				news.setIsLarge(true);
				String url = "http://imgt2.bdstatic.com/it/u=3269155243,2604389213&fm=21&gp=0.jpg";
				news.setSource_url("http://games.sina.com.cn/zl/duanpian/2014-05-21/141297.shtml");
				news.setPicOne(url);
				url_list.clear();
				url_list.add(url);
			}else{
				news.setIsLarge(false);
			}
			if(i == 2){
				news.setComment("���۲��֣�˵�ķǳ��á�");
			}
			
			if(i <= 2){
				news.setPublishTime(Long.valueOf(DateTools.getTime()));
			}else if(i >2 && i <= 5){
				news.setPublishTime(Long.valueOf(DateTools.getTime()) - 86400);
			}else{
				news.setPublishTime(Long.valueOf(DateTools.getTime()) - 86400 * 2);
			}
			newsList.add(news);
		}
		return newsList;
	}
	
	/** mark=0 ���Ƽ� */
	public final static int mark_recom = 0;
	/** mark=1 ������ */
	public final static int mark_hot = 1;
	/** mark=2 ���׷� */
	public final static int mark_frist = 2;
	/** mark=3 ������ */
	public final static int mark_exclusive = 3;
	/** mark=4 ���ղ� */
	public final static int mark_favor = 4;
	
	/*
	 * ��ȡ�����б�
	 */
	public static ArrayList<CityEntity> getCityList(){
		ArrayList<CityEntity> cityList =new ArrayList<CityEntity>();
		CityEntity city1 = new CityEntity(1, "����", 'A');
		CityEntity city2 = new CityEntity(2, "����", 'B');
		CityEntity city3 = new CityEntity(3, "����", 'C');
		CityEntity city4 = new CityEntity(4, "��ɳ", 'C');
		CityEntity city5 = new CityEntity(5, "����", 'D');
		CityEntity city6 = new CityEntity(6, "������", 'H');
		CityEntity city7 = new CityEntity(7, "����", 'H');
		CityEntity city8 = new CityEntity(8, "��ɳ��", 'J');
		CityEntity city9 = new CityEntity(9, "����", 'J');
		CityEntity city10 = new CityEntity(10, "ɽ��", 'S');
		CityEntity city11 = new CityEntity(11, "����", 'S');
		CityEntity city12 = new CityEntity(12, "����", 'Y');
		CityEntity city13 = new CityEntity(13, "��ɽ", 'Z');
		cityList.add(city1);
		cityList.add(city2);
		cityList.add(city3);
		cityList.add(city4);
		cityList.add(city5);
		cityList.add(city6);
		cityList.add(city7);
		cityList.add(city8);
		cityList.add(city9);
		cityList.add(city10);
		cityList.add(city11);
		cityList.add(city12);
		cityList.add(city13);
		return cityList;
	}
	/* Ƶ�������� �纼�� ��Ӧ����ĿID */
	public final static int CHANNEL_CITY = 3;
}
