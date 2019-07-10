## Adam
Demo project for Spring Boot

## 资料
[Spring Document](https://spring.io/guides)    
[Spring Web Document](https://spring.io/guides/gs/serving-web-content/)    
[Bootstrap Document](https://v3.bootcss.com/getting-started/)   
[Github OAuth Document](https://developer.github.com/apps/building-oauth-apps/)     
[OkHttp](https://square.github.io/okhttp/)  
[H2 Database](https://www.h2database.com/html/main.html)    
[Spring Database Support](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#boot-features-embedded-database-support)  
[mybatis-spring-boot-autoconfigure](http://www.mybatis.org/spring-boot-starter/mybatis-spring-boot-autoconfigure/)  

## Scripts
```sql
create table USER
(
  ID           INTEGER default (NEXT VALUE FOR PUBLIC.SYSTEM_SEQUENCE_57EB36C2_DF09_4A33_A2D1_15B9349807D5)
    primary key,
  ACCOUNT_ID   VARCHAR(100),
  NAME         VARCHAR(50),
  TOKEN        CHAR(36),
  GMT_CREATE   BIGINT,
  GMT_MODIFIED BIGINT
);
```

