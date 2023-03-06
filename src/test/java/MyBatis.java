import com.edu.cn.mybatis.mapper.NewsMapper;
import com.edu.cn.mybatis.pojo.News;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;



import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class MyBatis {
    //测试类，对是否成功进行数据库操作进行测试
    @Test
    public void testInsert() throws IOException {
        //获取核心配置文件的输入流
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();

        News news=new News();
        //news.setTopic(new Topic(1));
        //news.setTitle("Mybatis配置文件添加测试");

        NewsMapper newsMapper=sqlSession.getMapper(NewsMapper.class);
//        newsMapper.insertNews(news);
//        System.out.println("nid:"+news.getNid()'?');
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void testSelectDetail() throws IOException {
        //获取核心配置文件的输入流
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();

        NewsMapper newsMapper=sqlSession.getMapper(NewsMapper.class);
//        News news=newsMapper.selectDetail(231);
        sqlSession.close();
//        System.out.println(news);
    }
    @Test
    public void testSelectByCondition() throws IOException {
        //获取核心配置文件的输入流
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();

        NewsMapper newsMapper=sqlSession.getMapper(NewsMapper.class);
        News news=new News();
        //news.setNtid(1);
        //news.setTitle("%韩国%");
//        List<News> newList=newsMapper.selectByCondition(news);
        sqlSession.close();
//        System.out.println(newList);
        //System.out.println("newsList size:"+newsList.size());
    }

    @Test
    public void testinsertNews() throws IOException {
        //获取核心配置文件的输入流
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();

        NewsMapper newsMapper=sqlSession.getMapper(NewsMapper.class);
        News news=new News();
        //news.setNtid(1);
//        news.setNtitle("Mybatis插入新闻测试");
//        Integer res=newsMapper.insertNews(news);
//        System.out.println("当前影响的记录条数为："+res);
//        System.out.println("当前插入成功的新闻id为："+news.getNid());
        sqlSession.commit();//手动提交事务
        sqlSession.close();
    }

    @Test
    public void testDeleteByIds() throws IOException {
        //获取核心配置文件的输入流
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession=sqlSessionFactory.openSession();

        NewsMapper newsMapper=sqlSession.getMapper(NewsMapper.class);
//        int ids[]={259,260,261};
//        newsMapper.deleteByIds(ids);
        sqlSession.commit();//手动提交事务
        sqlSession.close();
    }

}
