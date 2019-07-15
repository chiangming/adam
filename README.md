## Adam
Demo project for Spring Boot

## Document
[Spring Document](https://spring.io/guides)     
[Spring Framework Documentation](https://docs.spring.io/spring/docs/5.0.3.RELEASE/spring-framework-reference/index.html)    
[Spring Web Document](https://spring.io/guides/gs/serving-web-content/)    
[Bootstrap Document](https://v3.bootcss.com/getting-started/)   
[Github OAuth Document](https://developer.github.com/apps/building-oauth-apps/)      
[Spring Database Support](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#boot-features-embedded-database-support)  
[Mybatis Spring Boot Autoconfigure](http://www.mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)  

## Tools
[OkHttp](https://square.github.io/okhttp/)   
[H2 Database](https://www.h2database.com/html/main.html)  
[Flayway](https://flywaydb.org/getstarted/)
[Lombok](https://www.projectlombok.org/)    
[Mybatis Generate](http://www.mybatis.org/generator/)

## Scripts

###SQL statements
```sql
CREATE TABLE USER
(
    ID int AUTO_INCREMENT PRIMARY KEY NOT NULL,
    ACCOUNT_ID VARCHAR(100),
    NAME VARCHAR(50),
    TOKEN VARCHAR(36),
    GMT_CREATE BIGINT,
    GMT_MODIFIED BIGINT
);
```

```sql
ALTER TABLE USER ADD BIO varchar(256) NULL;
```

###Flyway script
```bash
mvn flyway:migrate
mvn -Dmybatis.generator.overwrite=true mybatis-generator:generate
```