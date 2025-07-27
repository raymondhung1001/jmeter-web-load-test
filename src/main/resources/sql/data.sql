-- Insert default admin user
INSERT INTO users (username, password, full_name)
VALUES ('admin', 'admin123', 'System Administrator');

INSERT INTO users (username, password, full_name)
VALUES ('admin2', 'admin123', 'System Administrator');

-- Insert additional test users
INSERT INTO users (username, password, full_name)
VALUES ('user1', 'password1', 'Test User One');

INSERT INTO users (username, password, full_name)
VALUES ('user2', 'password2', 'Test User Two');