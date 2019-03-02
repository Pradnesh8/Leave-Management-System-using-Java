-- Table: pbl_users

-- DROP TABLE pbl_users;

CREATE TABLE pbl_users
(
  userid character varying(15) NOT NULL,
  username character varying(20),
  user_password character varying(20),
  user_type character varying(10),
  user_dept character varying(10),
  user_subject character varying(15),
  user_mobno character varying(10),
  leavetypecl character varying(2) DEFAULT '10'::character varying,
  leavetypeel character varying(2) DEFAULT '10'::character varying,
  leavetypesl character varying(2) DEFAULT '10'::character varying,
  CONSTRAINT pbl_users_pkey PRIMARY KEY (userid)
)
WITH (
  OIDS=FALSE
);
ALTER TABLE pbl_users
  OWNER TO postgres;
