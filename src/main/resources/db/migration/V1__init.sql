CREATE TABLE IF NOT EXISTS Conference (
    id SERIAL PRIMARY KEY,
    title VARCHAR(100) NOT NULL,
    description VARCHAR(100) NOT NULL,
    city VARCHAR(100) NOT NULL,
    total_attendants INT NOT NULL
    );

CREATE TABLE IF NOT EXISTS Assistant (
    id SERIAL PRIMARY KEY,
    fullname VARCHAR(100) NOT NULL,
    rols VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    Conference_id INT,
    FOREIGN KEY (Conference_id) REFERENCES conference(id)
    );