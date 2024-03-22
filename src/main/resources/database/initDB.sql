CREATE TABLE IF NOT EXISTS products
(
    id    BIGSERIAL PRIMARY KEY ,
    title  VARCHAR(200) NOT NULL ,
    description VARCHAR(254) NOT NULL ,
    price INT  NOT NULL,
    city VARCHAR(200),
    author VARCHAR(200)
    );

insert into products values (1,'asd','asd',123,'asd')