DELETE FROM csv_parser;
ALTER SEQUENCE global_seq RESTART WITH 100000;

INSERT INTO csv_parser(id, ssoid, ts, grp, type, subtype, url, orgid, formid, code, ltpa, sudirresponse, ymdh) VALUES
    (100000, 'UserId1', '2499763594','group1' ,'type1' ,'subtype1' ,'url1' ,'orgId1' ,'formid1' ,'ltpa1' ,'code1' ,'sudirresponse1' ,'dateTime1'),
    (100001, 'UserId2', '2499763594','group1' ,'type1' ,'subtype1' ,'url1' ,'orgId1' ,'formid1' ,'ltpa1' ,'code1' ,'sudirresponse1' ,'dateTime1'),
    (100002, 'UserId3', '2499763594','group1' ,'type1' ,'subtype1' ,'url2' ,'orgId1' ,'formid1' ,'ltpa1' ,'code1' ,'sudirresponse1' ,'dateTime1'),
    (100003, 'UserId3', '2499763594','group1' ,'type1' ,'subtype1' ,'url3' ,'orgId1' ,'formid1' ,'ltpa1' ,'code1' ,'sudirresponse1' ,'dateTime1'),
    (100004, 'UserId3', '2499763594','group1' ,'type1' ,'subtype1' ,'url1' ,'orgId1' ,'formid1' ,'ltpa1' ,'code1' ,'sudirresponse1' ,'dateTime1'),
    (100005, 'UserId3', '1','group1' ,'type1' ,'subtype1' ,'url1' ,'orgId1' ,'formid1' ,'ltpa1' ,'code1' ,'sudirresponse1' ,'dateTime1'),
    (100006, 'UserId4', '2','group1' ,'type1' ,'subtype1' ,'url1' ,'orgId1' ,'formid1' ,'ltpa1' ,'code1' ,'sudirresponse1' ,'dateTime1'),
    (100007, 'UserId4', '3','group1' ,'type1' ,'subtype1' ,'url1' ,'orgId1' ,'formid1' ,'ltpa1' ,'code1' ,'sudirresponse1' ,'dateTime1'),
    (100008, 'UserId4', '4','group1' ,'type1' ,'subtype1' ,'url1' ,'orgId1' ,'formid1' ,'ltpa1' ,'code1' ,'sudirresponse1' ,'dateTime1'),
    (100009, 'UserId4', '5','group1' ,'type1' ,'subtype1' ,'url1' ,'orgId1' ,'formid1' ,'ltpa1' ,'code1' ,'sudirresponse1' ,'dateTime1');
