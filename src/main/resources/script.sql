INSERT INTO jwt.users (username, password, enabled) VALUES
          ('admin', '$2a$10$zRtSddENeM9dJFmgvXDMGOD2b4QMigVM2YIhRLf5eEHGKTj4IHPL2', true),
          ('guest', '$2a$10$/DvZMuWgZoObPhM0WwyVue2P392/FjUU4H1uLyGUABB/sHS18haNi', true);

INSERT INTO jwt.roles (name) VALUES
          ('USER'),
          ('ADMIN');

INSERT INTO jwt.users_roles (user_id, role_id) VALUES
          (1, 1),
          (1, 2),
          (2, 1),
          (2, 2);

INSERT INTO jwt.employees (first_name, last_name, function, salary) VALUES
          ('JAMES', 'Jones', 'Laborer', 3000),
          ('ROBERT', 'Williams', 'Retail sales associate', 4500),
          ('MICHAEL', 'Johnson', 'Administrative assistant', 6600);                              