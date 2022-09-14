--It's my small and simple shop SQL project))
CREATE DATABASE shop;
USE shop;
--Here created a POJO(Car) object
CREATE TABLE Car
(
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
    mark VARCHAR(25) NOT NULL,
    price INT NOT NULL,
    year_of_release VARCHAR(4) NOT NULL,
    model VARCHAR(25) NOT NULL,
    color VARCHAR(10) NOT NULL,
    volume DOUBLE NOT NULL,
    transmission_type VARCHAR(12) NOT NULL
);

CREATE TABLE Users
(
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
    age INT,
    first_name VARCHAR(30) NOT NULL,
    last_name VARCHAR(30) NOT NULL,
    email VARCHAR(40) NOT NULL,
    phone VARCHAR(13) NOT NULL
);

CREATE TABLE Orders
(
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
    users_id BIGINT,
    product_name VARCHAR(50) NOT NULL,
    date_of_order DATETIME,
    FOREIGN KEY (users_id) REFERENCES Users (id) ON DELETE CASCADE ON UPDATE CASCADE
);

CREATE TABLE Products
(
	id BIGINT PRIMARY KEY AUTO_INCREMENT,
    orders_id BIGINT,
    items_id BIGINT,
    FOREIGN KEY (orders_id) REFERENCES Orders (id) ON DELETE CASCADE ON UPDATE CASCADE,
    FOREIGN KEY (items_id) REFERENCES Car (id) ON DELETE CASCADE ON UPDATE CASCADE
);
--Inserted values to table;
        INSERT INTO Orders (id, users_id, product_name, date_of_order)
            VALUES (1, 1, 'Macarons', '2022-09-14 14:42:34');

        INSERT INTO Users(id, age, first_name, last_name, email, phone)
            VALUES (1, 18, 'Beknazar', 'Abdykalykuulu', 'beknazarabdykalykuulu@gmail.com', '+996555439317');

        INSERT INTO Car (id, mark, price, year_of_release, model, color, volume, transmission_type)
			VALUES (1, 'Mercedes-Benz', 1640000, '2011', 'CAR203142', 'white', 3.2, 'automat');

		INSERT INTO Products (id, orders_id, items_id)
			VALUES (1, 1, 1);
