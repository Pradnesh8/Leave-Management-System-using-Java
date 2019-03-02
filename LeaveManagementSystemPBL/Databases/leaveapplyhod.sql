-- Table: leaveapplyhod

-- DROP TABLE leaveapplyhod;

CREATE TABLE leaveapplyhod
(
  sr_no integer NOT NULL,
  userid character varying(15),
  username character varying(20),
  leave_apply_date character varying(20),
  leave_end_date character varying(20),
  no_of_days character varying(2),
  leavetype character varying(5),
  leavereason character varying(50),
  leavestatus character varying(10),
  CONSTRAINT leaveapplyhod_pkey PRIMARY KEY (sr_no)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE leaveapplyhod
  OWNER TO postgres;
