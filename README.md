## Adam
Demo project for Spring Boot

## materials
[Spring Document](https://spring.io/guides)    
[Spring Web Document](https://spring.io/guides/gs/serving-web-content/)    
[Bootstrap Document](https://v3.bootcss.com/getting-started/)   
[Github OAuth Document](https://developer.github.com/apps/building-oauth-apps/)     
[OkHttp](https://square.github.io/okhttp/)    
[Spring Database Support](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#boot-features-embedded-database-support)  
[mybatis-spring-boot-autoconfigure](http://www.mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)  

## tools
[H2 Database](https://www.h2database.com/html/main.html)  
[Flayway](https://flywaydb.org/getstarted/)

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
```