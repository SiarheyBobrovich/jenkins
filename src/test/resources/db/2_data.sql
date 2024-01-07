INSERT INTO houses (id, city, address, uuid)
VALUES (1, 'Минск', 'Пушкинская 1, 82', '44bdbda0-5e3f-47f5-b1fc-383452fd8a8d'),
       (2, 'Минск', 'Пушкинская 1, 207', '6c6c7195-9082-4b0a-8ba0-c4c0be9ca845'),
       (3, 'Минск', 'Пушкинская 1, 1', '5d81abd5-3302-431d-bd79-3287a714f6da');

INSERT INTO persons (id, surname, name, residency_id, uuid, series, number)
values (1, 'Бобрович', 'Сергей', 1, 'f4fe3df1-22cd-49ce-a54d-86f55a7f372e', 'MP', '1234567'),
       (2, 'Бобрович', 'Дарья', 1, '590f83e1-da56-4f23-a448-da4edaacba7c', 'MP', '1243567'),
       (3, 'Бобрович', 'Павел', 1, '183e02cd-6f59-44ad-8fef-d23997cf712a', 'MP', '1234167'),
       (4, 'Бобрович', 'Светлана', 2, '6ea03fcc-c6f1-45e5-8e38-a49ad0dfb762', 'MP', '3124567'),
       (5, 'Бобрович', 'Александр', 2, '758d003d-b913-41b5-b9c1-8993922e91f7', 'MP', '1234560');

INSERT INTO houses_owners (owners_id, owned_houses_id)
values (1, 2),
       (3, 2),
       (4, 1),
       (5, 1),
       (5, 3);

SELECT SETVAL('houses_id_seq', (SELECT max(id) FROM houses));
SELECT SETVAL('persons_id_seq', (SELECT max(id) FROM persons));
