DROP TABLE IF EXISTS todo;
CREATE TABLE todo
(
    id          integer               not null,
    title       character varying(50) not null,
    content     character varying(200),
    created_at  timestamp,
    modified_at timestamp
);

CREATE UNIQUE INDEX todo_PKI on todo (id);

ALTER TABLE todo
    ADD CONSTRAINT todo_PKC PRIMARY KEY (id);

DROP TABLE IF EXISTS todo_comment;
CREATE TABLE todo_comment
(
    id          integer not null,
    todo_id     integer not null,
    content     character varying(200),
    created_at  timestamp,
    modified_at timestamp
);

CREATE UNIQUE INDEX todo_comment_PKI on todo_comment (id, todo_id);

ALTER TABLE todo_comment
    ADD CONSTRAINT todo_comment_PKC PRIMARY KEY (id);

ALTER TABLE todo_comment
    ADD CONSTRAINT todo_comment_FK1 FOREIGN KEY (todo_id) REFERENCES todo (id);
