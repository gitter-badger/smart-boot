package me.danbai.dbapi.service.test;


import org.junit.runner.RunWith;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(
        locations = "classpath:service-config.xml")
@Transactional( "transactionManager")
@Rollback(false)
public abstract class AbstractUnitTest {

}