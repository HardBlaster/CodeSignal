CREATE PROCEDURE automaticNotifications()
    SELECT email
    FROM users
    WHERE lower(role) not in ("admin", "premium")
    ORDER BY email;
