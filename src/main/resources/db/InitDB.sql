DROP TABLE IF EXISTS csv_parser;

DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE global_seq START 100000;

CREATE TABLE csv_parser
(
  id                  INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
  ssoid               VARCHAR,
  ts                  varchar,
  grp                 VARCHAR,
  type                VARCHAR,
  subtype             VARCHAR,
  url                 VARCHAR,
  orgid               VARCHAR,
  formid              VARCHAR,
  code                VARCHAR,
  ltpa                VARCHAR,
  sudirresponse       VARCHAR,
  ymdh                VARCHAR
);
