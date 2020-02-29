package com.hr.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.hr.entity.Users;

public class Test1 {
	public static void main(String[] args) throws IOException {
		//�����������ļ�
		InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
		//����session����
		SqlSessionFactory sf = new SqlSessionFactoryBuilder().build(in);
		//����session
		SqlSession session = sf.openSession();
		
		//ʹ��session������ɾ�Ĳ�
		//��ѯȫ��
		//List<Users> list = session.selectList("com.hr.dao.UsersMapper.queryAll");
		//System.out.println(list);
		
		//��ѯ����
		//Users u = session.selectOne("com.hr.dao.UsersMapper.queryOne", 1);
		//System.out.println(u);
		
		//��������ģ����ѯ
//		List<Users> list = session.selectList("com.hr.dao.UsersMapper.queryLike","��");
//		System.out.println(list);
		
		//����С�ڶ��ٶ���
//		List<Users> list = session.selectList("com.hr.dao.UsersMapper.queryByAge",2);
//		System.out.println(list);
		
		
		//���
//		Users u = new Users();
//		u.setUname("����");
//		u.setSex("��");
//		u.setAge(10);
//		u.setUsid(2);
//		int count = session.insert("com.hr.dao.UsersMapper.insert",u);
//		session.commit();//��ɾ����Ҫ�ύ����
//		System.out.println(count);
//		System.out.println(u.getUid());
		
		
		//�޸�
//		Users u = new Users();
//		u.setUid(6);
//		u.setSex("��");
//		u.setUsid(2);
//		u.setAge(15);
//		u.setUname("������");
//		int count = session.insert("com.hr.dao.UsersMapper.update",u);
//		session.commit();//��ɾ����Ҫ�ύ����
//		System.out.println(count);
//		System.out.println(u.getUid());
		
		//ɾ��
		int count = session.delete("com.hr.dao.UsersMapper.delete", 1);
		session.commit();//��ɾ����Ҫ�ύ����
		System.out.println(count);
		
		
		//�ر�session
		session.close();
	}
}
