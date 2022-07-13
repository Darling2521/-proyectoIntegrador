-- SEQUENCE: public.prospects_ prospect_id_seq

-- DROP SEQUENCE IF EXISTS public."prospects_ prospect_id_seq";

CREATE SEQUENCE IF NOT EXISTS public."prospects_ prospect_id_seq"
    INCREMENT 1
    START 1
    MINVALUE 1
    MAXVALUE 2147483647
    CACHE 1
    OWNED BY prospects." prospect_id";
-- Table: public.prospects

-- DROP TABLE IF EXISTS public.prospects;

CREATE TABLE IF NOT EXISTS public.prospects
(
    " prospect_id" integer NOT NULL DEFAULT nextval('"prospects_ prospect_id_seq"'::regclass),
    name character varying COLLATE pg_catalog."default",
    dni character varying COLLATE pg_catalog."default",
    " source" character varying COLLATE pg_catalog."default",
    " phone" character varying COLLATE pg_catalog."default",
    " address" character varying COLLATE pg_catalog."default",
    mail character varying COLLATE pg_catalog."default",
    created timestamp with time zone,
    updated timestamp with time zone,
    enable boolean,
    CONSTRAINT prospects_pkey PRIMARY KEY (" prospect_id")
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.prospects
    OWNER to postgres;