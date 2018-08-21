
package snippet;

import java.util.Map;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.cn.solomon.entity.SysUser;
import com.cn.solomon.service.ISysUserService;

@RunWith(SpringJUnit4ClassRunner.class) // 表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = { "classpath:spring-mybatis.xml" })

public class TestMyBatis {
	private final Logger logger = Logger.getLogger(getClass());
	// private ApplicationContext ac = null;
	@Resource
	private ISysUserService sysUserService = null;

	// @Before
	// public void before() {
	// ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	// userService = (IUserService) ac.getBean("userService");
	// }

	@Test
	public void test1() {
		Map<String,String> m = System.getenv();
		for(String m1 :m.keySet()){
			System.out.println(m1+"<>"+m.get(m1));
		}
		logger.info(System.getenv("myweb.root"));
		SysUser user = sysUserService.getUser("1");
		// System.out.println(user.getUserName());
		// logger.info("值："+user.getUserName());
		logger.info(JSON.toJSONString(user));
	}
	
	public static void main(String[] args) {
		String [] c = new String[5];
		c[1] = "1";
		c[2] = "2";
		c[3] = "3";
		c[4] = "4";
		int k = 3;
		System.out.println(c[k=4]);
		System.out.println(k);
	}
}