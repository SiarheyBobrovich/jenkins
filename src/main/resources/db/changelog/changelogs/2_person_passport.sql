BEGIN TRANSACTION;

ALTER TABLE persons
    ADD COLUMN series VARCHAR(2);
ALTER TABLE persons
    ADD COLUMN number VARCHAR(10);

UPDATE persons
SET series = 'МР'
WHERE id IN (1, 2, 3);
UPDATE persons
SET series = 'МС'
WHERE id IN (4, 5);

ALTER TABLE persons
    ALTER COLUMN series SET NOT NULL;
ALTER TABLE persons
    ALTER COLUMN number SET NOT NULL;
COMMIT;
