DROP TABLE IF EXISTS MEMBER_PET;

CREATE TABLE MEMBER_PET
(
    ID          BIGINT AUTO_INCREMENT PRIMARY KEY,
    MEMBER_ID   BIGINT NOT NULL,
    PET_ID      BIGINT NOT NULL
)