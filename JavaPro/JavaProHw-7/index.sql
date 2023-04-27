CREATE TABLE users
(
    id           SERIAL PRIMARY KEY,
    name         VARCHAR(15) NOT NULL,
    surname      VARCHAR(15) NOT NULL,
    phone_number VARCHAR(14) NOT NULL,
    gander       VARCHAR(6)
);

INSERT INTO users
VALUES (DEFAULT, 'Ivan', 'Ivanov', '+380992345678', 'male');
INSERT INTO users
VALUES (DEFAULT, 'Ivan', 'Prokopenko', '+380992345677', 'male');
INSERT INTO users
VALUES (DEFAULT, 'Jon', 'Jons', '+380992345676', 'male');
INSERT INTO users
VALUES (DEFAULT, 'Ignat', 'Churchman', '+380992345675', 'male');
INSERT INTO users
VALUES (DEFAULT, 'Albert', 'Ignatowski', '+380992345674', 'male');
INSERT INTO users
VALUES (DEFAULT, 'Vincent', 'Vega', '+390992345674', 'male');
INSERT INTO users
VALUES (DEFAULT, 'Mia', 'Wallace', '+330992345674', 'female');
INSERT INTO users
VALUES (DEFAULT, 'Daisy', 'Domergue', '+330996345674', 'female');
INSERT INTO users
VALUES (10000, 'Thor', 'OdinSun', '+130996000000', 'male');

CREATE TABLE devices
(
    id          SERIAL PRIMARY KEY,
    name        VARCHAR NOT NULL,
    mac_address VARCHAR NOT NULL,
    user_id     INT,
    FOREIGN KEY (user_id) REFERENCES users (id)
);

INSERT INTO devices
VALUES (DEFAULT, 'Iphone 14', ' 00:aa:00:64:c8:09 ', 1);
INSERT INTO devices
VALUES (DEFAULT, 'Iphone 14 pro', '00:aa:00:64:c8:01 ', 2);
INSERT INTO devices
VALUES (DEFAULT, 'Iphone 13', '00:aa:00:64:c8:07 ', 3);
INSERT INTO devices
VALUES (DEFAULT, 'Asus tuf', '00:aa:00:64:c8:04 ', 4);
INSERT INTO devices
VALUES (DEFAULT, 'Galaxy s22', '00:aa:00:63:c8:04 ', 5);
INSERT INTO devices
VALUES (DEFAULT, 'Galaxy s23 ultra', '01:aa:00:63:c8:04 ', 6);
INSERT INTO devices
VALUES (DEFAULT, 'HP Omen', '01:aa:02:63:c8:04 ', 6);
INSERT INTO devices
VALUES (DEFAULT, 'Galaxy watch', '01:aa:02:63:c8:04 ', 6);
INSERT INTO devices
VALUES (DEFAULT, 'Iphone 14', '01:aa:02:63:c8:14 ', 7);
INSERT INTO devices
VALUES (DEFAULT, 'Iphone 12', '01:aa:02:63:c8:14 ', 8);
INSERT INTO devices
VALUES (DEFAULT, 'Lightning hummer', '00:aa:00:00:c0:00 ', 10000);
INSERT INTO devices
VALUES (DEFAULT, 'macbook pro', '01:aa:02:63:c8:12 ', 10000);

SELECT *
FROM users;
SELECT name
FROM users;

SELECT *
FROM users
ORDER BY name;
SELECT *
FROM users
ORDER BY name DESC;

SELECT *
FROM users
WHERE name = 'Ivan';

SELECT *
FROM users
WHERE id > 0
  AND id < 1000;

SELECT *
FROM users
WHERE phone_number LIKE '+380%';

SELECT MAX(id)
FROM users;


SELECT *
FROM users
         FULL JOIN devices d on users.id = d.user_id;

SELECT users.name, devices.name
FROM users
         INNER JOIN devices ON users.id = devices.user_id;

SELECT user_id, COUNT(user_id)
FROM devices
GROUP BY user_id;

SELECT user_id, COUNT(user_id)
FROM devices
GROUP BY user_id
ORDER BY count(user_id) DESC;


