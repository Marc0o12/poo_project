DROP TABLE IF EXISTS public.tbprodutos;

CREATE TABLE IF NOT EXISTS public.tbproducts
(
    name text COLLATE pg_catalog."default",
    quantity integer,
    value real,
    id integer NOT NULL GENERATED ALWAYS AS IDENTITY ( INCREMENT 1 START 1 MINVALUE 1 MAXVALUE 2147483647 CACHE 1 )
)