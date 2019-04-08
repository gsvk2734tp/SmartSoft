DELETE FROM csv_parser;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO csv_parser(id, ssoid, ts, grp, type, subtype, url, orgid, formid, code, ltpa, sudirresponse, ymdh) VALUES
    (1000000, 'UserId1', '2499763594','group1' ,'type1' ,'subtype1' ,'https://www.mos.ru/pgu/ru/application/guis/-47/#step_1' ,'orgId1' ,'formid1' ,'ltpa1' ,'code1' ,'sudirresponse1' ,'dateTime1'),
    (1000001, 'UserId2', '2499763595','group1' ,'type1' ,'subtype1' ,'https://www.mos.ru/pgu/ru/application/guis/-47/#step_1' ,'orgId1' ,'formid1' ,'ltpa1' ,'code1' ,'sudirresponse1' ,'dateTime1'),
    (1000002, 'UserId3', '2499763596','group1' ,'type1' ,'subtype1' ,'https://www.mos.ru/pgu/ru/application/guis/-47/#step_1' ,'orgId1' ,'formid1' ,'ltpa1' ,'code1' ,'sudirresponse1' ,'dateTime1'),
    (1000003, 'UserId3', '2499763597','group1' ,'type1' ,'subtype1' ,'https://www.mos.ru/pgu/ru/application/guis/-47/#step_1' ,'orgId1' ,'formid1' ,'ltpa1' ,'code1' ,'sudirresponse1' ,'dateTime1'),
    (1000004, 'UserId3', '2499763598','group1' ,'type1' ,'subtype1' ,'https://www.mos.ru/pgu/ru/application/guis/-47/#step_1' ,'orgId1' ,'formid1' ,'ltpa1' ,'code1' ,'sudirresponse1' ,'dateTime1'),
    (1000005, 'UserId3', '1','group1' ,'type1' ,'subtype1' ,'https://www.mos.ru/pgu/ru/application/guis/-47/#step_2','orgId1' ,'formid1' ,'ltpa1' ,'code1' ,'sudirresponse1' ,'dateTime1'),
    (1000006, 'UserId4', '2','group1' ,'type1' ,'subtype1' ,'https://www.mos.ru/pgu/ru/application/guis/-47/#step_3','orgId1' ,'formid1' ,'ltpa1' ,'code1' ,'sudirresponse1' ,'dateTime1'),
    (1000007, 'UserId4', '3','group1' ,'type1' ,'subtype1' ,'https://www.mos.ru/pgu/ru/application/guis/-47/#step_4','orgId1' ,'formid1' ,'ltpa1' ,'code1' ,'sudirresponse1' ,'dateTime1'),
    (1000008, 'UserId4', '4','group1' ,'type1' ,'subtype1' ,'https://www.mos.ru/pgu/ru/application/guis/-47/#step_5','orgId1' ,'formid1' ,'ltpa1' ,'code1' ,'sudirresponse1' ,'dateTime1'),
    (1000009, 'UserId4', '5','group1' ,'type1' ,'subtype1' ,'https://www.mos.ru/pgu/ru/application/guis/-47/#step_6','orgId1' ,'formid1' ,'ltpa1' ,'code1' ,'sudirresponse1' ,'dateTime1');
