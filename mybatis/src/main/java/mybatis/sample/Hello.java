package mybatis.sample;

import java.io.IOException;
import java.io.Reader;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Hello {
	public static void main(String[] args) throws IOException {
		Reader reader =Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory sessionFactory=new SqlSessionFactoryBuilder().build(reader);
		SqlSession session=sessionFactory.openSession();
		Student student=new Student("yuess", "it", 89, 7659550, "642969318");
		session.insert("student.insert",student);
		session.commit();
		session.close();
	}
}
