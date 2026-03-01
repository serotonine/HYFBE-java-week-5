-- Example 2: INSERT and UPDATE

INSERT INTO students (student_id, full_name, email)
VALUES
    (1, 'Sara Ahmed', 'sara@example.com'),
    (2, 'Leo Janssen', 'leo@example.com');

INSERT INTO courses (course_id, title, code)
VALUES
    (10, 'Java Fundamentals', 'JAVA-101'),
    (20, 'Databases Intro', 'DB-101');

UPDATE students
SET email = 'leo.janssen@example.com'
WHERE student_id = 2;
