CREATE TABLE IF NOT EXISTS BOOK (
    id bigint(20) NOT NULL AUTO_INCREMENT,
    title varchar(256) NOT NULL,
    author varchar(64) NOT NULL,
    uuid varchar(128) NOT NULL,
    description varchar(256),
    createdAt timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
    updatedAt timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

