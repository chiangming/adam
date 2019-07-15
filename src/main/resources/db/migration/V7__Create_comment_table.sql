create table COMMENT
(
  ID           BIGINT AUTO_INCREMENT PRIMARY KEY,
  PARENT_ID    BIGINT  not null,
  TYPE         INTEGER not null,
  COMMENTATOR  BIGINT not null,
  GMT_CREATE   BIGINT  not null,
  GMT_MODIFIED BIGINT  not null,
  LIKE_COUNT   BIGINT default 0,
  CONTENT      VARCHAR(1024)
);