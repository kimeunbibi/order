CREATE TABLE orders (
                        id BIGINT AUTO_INCREMENT PRIMARY KEY,
                        product_name VARCHAR(100) NOT NULL,
                        quantity INT NOT NULL,
                        order_date TIMESTAMP NOT NULL
);
