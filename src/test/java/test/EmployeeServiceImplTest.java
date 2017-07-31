package test;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import mapper.DevelopmentMapper;
import mapper.WorkRecordMapper;
import po.Development;
import po.DevelopmentExample;
import po.DevelopmentExample.Criteria;
import po.WorkRecord;
import po.WorkRecordExample;


public class EmployeeServiceImplTest {
	
	private ApplicationContext applicationContext;
	private DevelopmentMapper developmentMapper;
	private WorkRecordMapper workRecordMapper;
	@Before
	public void setUp() throws Exception {
		applicationContext=new ClassPathXmlApplicationContext("classpath:Spring/applicationContext-dao.xml");
		developmentMapper=(DevelopmentMapper) applicationContext.getBean("developmentMapper");
		workRecordMapper=(WorkRecordMapper)applicationContext.getBean("workRecordMapper");
	}
	@Test
	public void test2() {
		DevelopmentExample example=new DevelopmentExample();
		Criteria criteria =example.createCriteria();
		List <Development>list=developmentMapper.selectByExample(example);
		for(Development development:list){
			System.out.println(development.getdName());
		}
	}
	@Test
	public void test3() throws Exception {
		WorkRecordExample example=new WorkRecordExample();
		po.WorkRecordExample.Criteria criteria=example.createCriteria();
		String year ="2015";
		criteria.andWDateBetween(new SimpleDateFormat("yyyy-MM-dd").parse(year+"-01-01"), new SimpleDateFormat("yyyy-MM-dd").parse(year+"-12-31"));
		criteria.andWNoEqualTo(4150223l);
		List<WorkRecord>list=workRecordMapper.selectByExample(example);
		for(WorkRecord workRecord:list){
			System.out.println(workRecord.getwDate().toString()+":"+workRecord.getwNo());
		}
	}
	@Test
	public void test4() throws Exception {
		WorkRecordExample example=new WorkRecordExample();
		po.WorkRecordExample.Criteria criteria=example.createCriteria();
		criteria.andWTypeEqualTo(1);
		List<WorkRecord>list=workRecordMapper.selectByExample(example);
		for(WorkRecord workRecord:list){
			System.out.println(workRecord.getwDate().toString()+":"+workRecord.getwType());
		}
	}
	@Test
	public void test6() throws Exception {
		Date date=new SimpleDateFormat("yyyy-MM-dd").parse("2002-2-2");
		System.out.println(date.getTime()
				+ 1000 + (int)(Math.random() * ((50000 - 1000) + 1)));
	}
	

}
