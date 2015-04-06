CREATE TABLE "public"."t_user" (
"id" oid NOT NULL,
"name" text COLLATE "default",
"sex" text COLLATE "default",
"birthday" date,
CONSTRAINT "PK_T_USER" PRIMARY KEY ("id") USING INDEX TABLESPACE "wallet"
)
WITH (OIDS=FALSE)
TABLESPACE "wallet";

ALTER TABLE "public"."t_user" OWNER TO "wallet";