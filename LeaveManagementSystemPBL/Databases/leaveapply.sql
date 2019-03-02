-- Table: leaveapply

-- DROP TABLE leaveapply;

CREATE TABLE leaveapply
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
  CONSTRAINT leaveapply_pkey PRIMARY KEY (sr_no)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE leaveapply
  OWNER TO postgres;
