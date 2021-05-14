//package cn.spring.basic.config;
//
////import com.alibaba.boot.tddl.builder.datasource.TDataSourceBuilder;
////import com.alibaba.boot.tddl.builder.datasource.TGroupDataSourceBuilder;
////import com.alibaba.fastjson.JSON;
////import com.taobao.tddl.jdbc.group.TGroupDataSource;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.mybatis.spring.SqlSessionFactoryBean;
//import org.mybatis.spring.annotation.MapperScan;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.core.io.Resource;
//import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
//import org.springframework.jdbc.datasource.DataSourceTransactionManager;
//
//import javax.sql.DataSource;
//import java.io.IOException;
//
//@Configuration
//@PropertySource("classpath:application.properties")
//@MapperScan(basePackages = {"cn.spring.basic.mapper"}, sqlSessionFactoryRef = MybatisPropertyConfig.SQLSESSIONFACTORYREF)
//public class MybatisPropertyConfig {
//
//    private static final Logger LOGGER = LoggerFactory.getLogger(MybatisPropertyConfig.class);
//
//    static final String MAPPERLOCATION = "classpath:mybatis/sql/*.xml";
//    static final String SQLSESSIONFACTORYREF = "sqlSessionFactory";
//
//    public void aa(){
//        System.out.println(111);
//    }
//
////    @Bean(name = "propertyDataSource", initMethod = "init", destroyMethod = "destroy")
////    @Primary
////    public DataSource propertyDataSource() {
////        return TDataSourceBuilder.create().appName(propertyAppName).dynamicRule(true).sharding(propertySharding).build();
////    }
//
//
////    @Bean(name = MybatisPropertyConfig.SQLSESSIONFACTORYREF)
////    @Primary
////    public SqlSessionFactory sqlSessionFactoryBean(@Qualifier("propertyDataSource") DataSource dataSource) {
////        try {
////            SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
////            sessionFactoryBean.setDataSource(dataSource);
////            Resource[] resources = new PathMatchingResourcePatternResolver().getResources(MAPPERLOCATION);
////            sessionFactoryBean.setMapperLocations(resources);
////            return sessionFactoryBean.getObject();
////        } catch (IOException e) {
////            LOGGER.error("mybatis resolver mapper*xml is error", e);
////            return null;
////        } catch (Exception e) {
////            LOGGER.error("mybatis sqlSessionFactoryBean create error", e);
////            return null;
////        }
////    }
//
////    @Bean(name = "propertyTransaction")
////    public DataSourceTransactionManager propertyTransaction(@Qualifier("propertyDataSource") DataSource dataSource) throws Exception {
////        return new DataSourceTransactionManager(dataSource);
////    }
//
//
//
//
//}