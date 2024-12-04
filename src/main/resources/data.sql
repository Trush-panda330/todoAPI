INSERT INTO todo (title, details, created_at, due_date, updated_at, status, is_deleted)
VALUES
    ('タスク1', 'タスク1の詳細内容', NOW(), '2024-12-10 12:00:00', NOW(), 'ACTIVE', 0),
    ('タスク2', 'タスク2の詳細内容', NOW(), '2024-12-12 15:30:00', NOW(), 'ACTIVE', 0),
    ('タスク3', 'タスク3の詳細内容', NOW(), '2024-12-14 10:00:00', NOW(), 'COMPLETED', 0),
    ('タスク4', 'タスク4の詳細内容', NOW(), '2024-12-15 16:00:00', NOW(), 'ACTIVE', 0),
    ('タスク5', 'タスク5の詳細内容', NOW(), '2024-12-20 09:00:00', NOW(), 'ACTIVE', 0);

INSERT INTO todo_status_history (todo_id, status, is_deleted, changed_at)
VALUES
    (1, 'ACTIVE', 0, '2024-12-01 10:00:00'),
    (1, 'COMPLETED', 0, '2024-12-02 14:00:00'),
    (2, 'ACTIVE', 0, '2024-12-02 11:30:00'),
    (3, 'ACTIVE', 0, '2024-12-03 12:00:00'),
    (3, 'COMPLETED', 0, '2024-12-04 13:45:00'),
    (4, 'ACTIVE', 0, '2024-12-04 09:00:00'),
    (5, 'ACTIVE', 0, '2024-12-05 16:00:00');
