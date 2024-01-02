CREATE USER 'healthcare'@'%' IDENTIFIED BY 'healthcare';

GRANT ALL PRIVILEGES ON *.* TO 'healthcare'@'%';

CREATE DATABASE health;
USE health;

DROP TABLE IF EXISTS member;
CREATE TABLE member
(
    id       bigint NOT NULL AUTO_INCREMENT,
    nickname varchar(255) DEFAULT NULL,
    PRIMARY KEY (id),
    UNIQUE KEY unique_nickname (nickname)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS category;
CREATE TABLE category
(
    id   bigint NOT NULL AUTO_INCREMENT,
    name varchar(255) DEFAULT NULL,
    PRIMARY KEY (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS product;
CREATE TABLE product
(
    id            bigint       NOT NULL AUTO_INCREMENT,
    name          varchar(255) NOT NULL,
    price         bigint       NOT NULL,
    discount_rate bigint       NOT NULL,
    manufacturer  varchar(255) NOT NULL,
    distributor   varchar(255) NOT NULL,
    description   varchar(255) NOT NULL,
    category_id   bigint       NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (category_id) REFERENCES category (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS images;
CREATE TABLE images
(
    id         bigint       NOT NULL AUTO_INCREMENT,
    thumbnail      varchar(255) NOT NULL,
    image2     varchar(255),
    image3     varchar(255),
    image4     varchar(255),
    image5     varchar(255),
    product_id bigint       NOT NULL,
    PRIMARY KEY (id),
    FOREIGN KEY (product_id) REFERENCES product (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS product_favorite;
CREATE TABLE product_favorite
(
    id            bigint       NOT NULL AUTO_INCREMENT,
    member_id bigint NOT NULL,
    product_id bigint NOT NULL,
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
    PRIMARY KEY (id),
    FOREIGN KEY (product_id) REFERENCES product (id),
    FOREIGN KEY (member_id) REFERENCES member (id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;;


INSERT INTO member (nickname)
VALUES ('test');

INSERT INTO category (name)
VALUES ('by cazzle');
INSERT INTO category (name)
VALUES ('직장인');
INSERT INTO category (name)
VALUES ('어린이');
INSERT INTO category (name)
VALUES ('건강기능식품');
INSERT INTO category (name)
VALUES ('운동용품');

INSERT INTO product (name, price, discount_rate, manufacturer, distributor, description, category_id)
VALUES ('testProduct1', 10000, 25, 'lotteHealth', 'wugawuga','description', 1);
INSERT INTO product (name, price, discount_rate, manufacturer, distributor, description, category_id)
VALUES ('testProduct2', 10000, 0, 'lotteHealth', 'wugawuga','description', 1);
INSERT INTO product (name, price, discount_rate, manufacturer, distributor, description, category_id)
VALUES ('testProduct3', 10000, 25, 'lotteHealth', 'wugawuga','description', 1);
INSERT INTO product (name, price, discount_rate, manufacturer, distributor, description, category_id)
VALUES ('testProduct4', 10000, 25, 'lotteHealth', 'wugawuga','description', 1);
INSERT INTO product (name, price, discount_rate, manufacturer, distributor, description, category_id)
VALUES ('testProduct5', 10000, 25, 'lotteHealth', 'wugawuga','description', 1);
INSERT INTO product (name, price, discount_rate, manufacturer, distributor, description, category_id)
VALUES ('testProduct6', 10000, 25, 'lotteHealth', 'wugawuga','description', 1);
INSERT INTO product (name, price, discount_rate, manufacturer, distributor, description, category_id)
VALUES ('testProduct7', 10000, 25, 'lotteHealth', 'wugawuga','description', 1);
INSERT INTO product (name, price, discount_rate, manufacturer, distributor, description, category_id)
VALUES ('testProduct8', 10000, 25, 'lotteHealth', 'wugawuga','description', 1);
INSERT INTO product (name, price, discount_rate, manufacturer, distributor, description, category_id)
VALUES ('testProduct9', 10000, 25, 'lotteHealth', 'wugawuga','description', 1);
INSERT INTO product (name, price, discount_rate, manufacturer, distributor, description, category_id)
VALUES ('testProduct10', 10000, 25, 'lotteHealth', 'wugawuga','description', 1);
INSERT INTO product (name, price, discount_rate, manufacturer, distributor, description, category_id)
VALUES ('testProduct11', 10000, 25, 'lotteHealth', 'wugawuga','description', 1);
INSERT INTO product (name, price, discount_rate, manufacturer, distributor, description, category_id)
VALUES ('testProduct12', 10000, 25, 'lotteHealth', 'wugawuga','description', 1);
INSERT INTO product (name, price, discount_rate, manufacturer, distributor, description, category_id)
VALUES ('testProduct13', 10000, 25, 'lotteHealth', 'wugawuga','description', 1);
INSERT INTO product (name, price, discount_rate, manufacturer, distributor, description, category_id)
VALUES ('testProduct14', 10000, 25, 'lotteHealth', 'wugawuga','description', 1);
INSERT INTO product (name, price, discount_rate, manufacturer, distributor, description, category_id)
VALUES ('testProduct15', 10000, 25, 'lotteHealth', 'wugawuga','description', 1);
INSERT INTO product (name, price, discount_rate, manufacturer, distributor, description, category_id)
VALUES ('testProduct16', 10000, 25, 'lotteHealth', 'wugawuga','description', 1);
INSERT INTO product (name, price, discount_rate, manufacturer, distributor, description, category_id)
VALUES ('testProduct17', 10000, 25, 'lotteHealth', 'wugawuga','description', 1);
INSERT INTO product (name, price, discount_rate, manufacturer, distributor, description, category_id)
VALUES ('testProduct18', 10000, 25, 'lotteHealth', 'wugawuga','description', 1);
INSERT INTO product (name, price, discount_rate, manufacturer, distributor, description, category_id)
VALUES ('testProduct19', 10000, 25, 'lotteHealth', 'wugawuga','description', 1);
INSERT INTO product (name, price, discount_rate, manufacturer, distributor, description, category_id)
VALUES ('testProduct20', 10000, 25, 'lotteHealth', 'wugawuga','description', 2);
INSERT INTO product (name, price, discount_rate, manufacturer, distributor, description, category_id)
VALUES ('testProduct21', 10000, 25, 'lotteHealth', 'wugawuga','description', 3);
INSERT INTO product (name, price, discount_rate, manufacturer, distributor, description, category_id)
VALUES ('testProduct22', 10000, 25, 'lotteHealth', 'wugawuga','description', 4);
INSERT INTO product (name, price, discount_rate, manufacturer, distributor, description, category_id)
VALUES ('testProduct23', 10000, 25, 'lotteHealth', 'wugawuga','description', 5);

INSERT INTO images (thumbnail, image2, image3, image4, image5, product_id)
VALUES ('a.jpeg','b.jpeg','c.jpeg','d.jpeg','e.jpeg', 1);
INSERT INTO images (thumbnail, product_id)
VALUES ('a.jpeg', 2);
INSERT INTO images (thumbnail, product_id)
VALUES ('a.jpeg', 3);
INSERT INTO images (thumbnail, product_id)
VALUES ('a.jpeg', 4);
INSERT INTO images (thumbnail, product_id)
VALUES ('a.jpeg', 5);
INSERT INTO images (thumbnail, product_id)
VALUES ('a.jpeg', 6);
INSERT INTO images (thumbnail, product_id)
VALUES ('a.jpeg', 7);
INSERT INTO images (thumbnail, product_id)
VALUES ('a.jpeg', 8);
INSERT INTO images (thumbnail, product_id)
VALUES ('a.jpeg', 9);
INSERT INTO images (thumbnail, product_id)
VALUES ('a.jpeg', 10);
INSERT INTO images (thumbnail, product_id)
VALUES ('a.jpeg', 11);
INSERT INTO images (thumbnail, product_id)
VALUES ('a.jpeg', 12);
INSERT INTO images (thumbnail, product_id)
VALUES ('a.jpeg', 13);
INSERT INTO images (thumbnail, product_id)
VALUES ('a.jpeg', 14);
INSERT INTO images (thumbnail, product_id)
VALUES ('a.jpeg', 15);
INSERT INTO images (thumbnail, product_id)
VALUES ('a.jpeg', 16);
INSERT INTO images (thumbnail, product_id)
VALUES ('a.jpeg', 17);
INSERT INTO images (thumbnail, product_id)
VALUES ('a.jpeg', 18);
INSERT INTO images (thumbnail, product_id)
VALUES ('a.jpeg', 19);
INSERT INTO images (thumbnail, product_id)
VALUES ('a.jpeg', 20);
INSERT INTO images (thumbnail, product_id)
VALUES ('a.jpeg', 21);
INSERT INTO images (thumbnail, product_id)
VALUES ('a.jpeg', 22);
INSERT INTO images (thumbnail, product_id)
VALUES ('a.jpeg', 23);
