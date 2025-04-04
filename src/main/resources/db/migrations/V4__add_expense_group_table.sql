CREATE TABLE expense_group (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    owner BIGINT,
    FOREIGN KEY (owner) REFERENCES user(id) ON DELETE CASCADE
);

CREATE TABLE expense_group_members (
    expense_group_id BIGINT,
    member_id BIGINT,
    FOREIGN KEY (expense_group_id) REFERENCES expense_group(id) ON DELETE CASCADE,
    FOREIGN KEY (member_id) REFERENCES user(id) ON DELETE CASCADE
);