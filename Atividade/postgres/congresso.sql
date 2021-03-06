PGDMP     :                
    w         	   congresso    9.6.12    11.1 "    �           0    0    ENCODING    ENCODING        SET client_encoding = 'UTF8';
                       false            �           0    0 
   STDSTRINGS 
   STDSTRINGS     (   SET standard_conforming_strings = 'on';
                       false            �           0    0 
   SEARCHPATH 
   SEARCHPATH     8   SELECT pg_catalog.set_config('search_path', '', false);
                       false            �           1262    147456 	   congresso    DATABASE     y   CREATE DATABASE congresso WITH TEMPLATE = template0 ENCODING = 'UTF8' LC_COLLATE = 'en_US.utf8' LC_CTYPE = 'en_US.utf8';
    DROP DATABASE congresso;
             postgres    false            �            1259    148381    artigos    TABLE     �  CREATE TABLE public.artigos (
    id integer NOT NULL,
    titulo character varying(255) DEFAULT NULL::character varying,
    orientador character varying(255) DEFAULT NULL::character varying,
    coautores character varying(255) DEFAULT NULL::character varying,
    modalidade character varying(255) DEFAULT NULL::character varying,
    data_submissao character varying(20) DEFAULT NULL::character varying,
    id_participante bigint,
    url_download character varying(150) DEFAULT NULL::character varying
);
    DROP TABLE public.artigos;
       public         postgres    false            �            1259    148379    artigos_id_seq    SEQUENCE     w   CREATE SEQUENCE public.artigos_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 %   DROP SEQUENCE public.artigos_id_seq;
       public       postgres    false    188            �           0    0    artigos_id_seq    SEQUENCE OWNED BY     A   ALTER SEQUENCE public.artigos_id_seq OWNED BY public.artigos.id;
            public       postgres    false    187            �            1259    148403    inscricaoefetuada    TABLE       CREATE TABLE public.inscricaoefetuada (
    id integer NOT NULL,
    transacao character varying(255) NOT NULL,
    status character varying(255) NOT NULL,
    quantidade integer NOT NULL,
    valor double precision NOT NULL,
    formapagamento character varying(255) NOT NULL
);
 %   DROP TABLE public.inscricaoefetuada;
       public         postgres    false            �            1259    148401    inscricaoefetuada_id_seq    SEQUENCE     �   CREATE SEQUENCE public.inscricaoefetuada_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 /   DROP SEQUENCE public.inscricaoefetuada_id_seq;
       public       postgres    false    190            �           0    0    inscricaoefetuada_id_seq    SEQUENCE OWNED BY     U   ALTER SEQUENCE public.inscricaoefetuada_id_seq OWNED BY public.inscricaoefetuada.id;
            public       postgres    false    189            �            1259    148414 
   inscricoes    TABLE     �  CREATE TABLE public.inscricoes (
    id integer NOT NULL,
    data_inscricao timestamp without time zone,
    status_inscricao character varying(100) DEFAULT NULL::character varying,
    id_participante bigint,
    id_transacao character varying(255) DEFAULT NULL::character varying,
    preco double precision,
    tipodoevento character varying(50) DEFAULT NULL::character varying,
    tipodeparticipacao character varying(50) DEFAULT NULL::character varying
);
    DROP TABLE public.inscricoes;
       public         postgres    false            �            1259    148412    inscricoes_id_seq    SEQUENCE     z   CREATE SEQUENCE public.inscricoes_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 (   DROP SEQUENCE public.inscricoes_id_seq;
       public       postgres    false    192            �           0    0    inscricoes_id_seq    SEQUENCE OWNED BY     G   ALTER SEQUENCE public.inscricoes_id_seq OWNED BY public.inscricoes.id;
            public       postgres    false    191            �            1259    148354    participantes    TABLE       CREATE TABLE public.participantes (
    id integer NOT NULL,
    nome character varying(255) DEFAULT ''::character varying,
    email character varying(100) DEFAULT ''::character varying,
    nome_cracha character varying(100) DEFAULT ''::character varying,
    instituicao character varying(255) DEFAULT ''::character varying,
    cpf character varying(100) DEFAULT ''::character varying,
    telefone_residencial character varying(15) DEFAULT ''::character varying,
    telefone_comercial character varying(15) DEFAULT ''::character varying,
    telefone_celular character varying(15) DEFAULT ''::character varying,
    estado character varying(100) DEFAULT ''::character varying,
    cidade character varying(255) DEFAULT ''::character varying,
    bairro character varying(255) DEFAULT ''::character varying,
    logradouro character varying(255) DEFAULT ''::character varying,
    numero character varying(100) DEFAULT ''::character varying,
    cep character varying(12) DEFAULT ''::character varying,
    tipo_usuario character varying(100) DEFAULT ''::character varying,
    profissao character varying(150) DEFAULT NULL::character varying
);
 !   DROP TABLE public.participantes;
       public         postgres    false            �            1259    148352    participantes_id_seq    SEQUENCE     }   CREATE SEQUENCE public.participantes_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
 +   DROP SEQUENCE public.participantes_id_seq;
       public       postgres    false    186            �           0    0    participantes_id_seq    SEQUENCE OWNED BY     M   ALTER SEQUENCE public.participantes_id_seq OWNED BY public.participantes.id;
            public       postgres    false    185            �           2604    148384 
   artigos id    DEFAULT     h   ALTER TABLE ONLY public.artigos ALTER COLUMN id SET DEFAULT nextval('public.artigos_id_seq'::regclass);
 9   ALTER TABLE public.artigos ALTER COLUMN id DROP DEFAULT;
       public       postgres    false    188    187    188                       2604    148406    inscricaoefetuada id    DEFAULT     |   ALTER TABLE ONLY public.inscricaoefetuada ALTER COLUMN id SET DEFAULT nextval('public.inscricaoefetuada_id_seq'::regclass);
 C   ALTER TABLE public.inscricaoefetuada ALTER COLUMN id DROP DEFAULT;
       public       postgres    false    189    190    190                       2604    148417    inscricoes id    DEFAULT     n   ALTER TABLE ONLY public.inscricoes ALTER COLUMN id SET DEFAULT nextval('public.inscricoes_id_seq'::regclass);
 <   ALTER TABLE public.inscricoes ALTER COLUMN id DROP DEFAULT;
       public       postgres    false    191    192    192            �           2604    148357    participantes id    DEFAULT     t   ALTER TABLE ONLY public.participantes ALTER COLUMN id SET DEFAULT nextval('public.participantes_id_seq'::regclass);
 ?   ALTER TABLE public.participantes ALTER COLUMN id DROP DEFAULT;
       public       postgres    false    185    186    186            �          0    148381    artigos 
   TABLE DATA                  COPY public.artigos (id, titulo, orientador, coautores, modalidade, data_submissao, id_participante, url_download) FROM stdin;
    public       postgres    false    188   �,       �          0    148403    inscricaoefetuada 
   TABLE DATA               e   COPY public.inscricaoefetuada (id, transacao, status, quantidade, valor, formapagamento) FROM stdin;
    public       postgres    false    190   �,       �          0    148414 
   inscricoes 
   TABLE DATA               �   COPY public.inscricoes (id, data_inscricao, status_inscricao, id_participante, id_transacao, preco, tipodoevento, tipodeparticipacao) FROM stdin;
    public       postgres    false    192   =-       �          0    148354    participantes 
   TABLE DATA               �   COPY public.participantes (id, nome, email, nome_cracha, instituicao, cpf, telefone_residencial, telefone_comercial, telefone_celular, estado, cidade, bairro, logradouro, numero, cep, tipo_usuario, profissao) FROM stdin;
    public       postgres    false    186   Z-       �           0    0    artigos_id_seq    SEQUENCE SET     =   SELECT pg_catalog.setval('public.artigos_id_seq', 1, false);
            public       postgres    false    187            �           0    0    inscricaoefetuada_id_seq    SEQUENCE SET     G   SELECT pg_catalog.setval('public.inscricaoefetuada_id_seq', 1, false);
            public       postgres    false    189            �           0    0    inscricoes_id_seq    SEQUENCE SET     @   SELECT pg_catalog.setval('public.inscricoes_id_seq', 1, false);
            public       postgres    false    191            �           0    0    participantes_id_seq    SEQUENCE SET     C   SELECT pg_catalog.setval('public.participantes_id_seq', 1, false);
            public       postgres    false    185                       2606    148395    artigos artigos_pkey 
   CONSTRAINT     R   ALTER TABLE ONLY public.artigos
    ADD CONSTRAINT artigos_pkey PRIMARY KEY (id);
 >   ALTER TABLE ONLY public.artigos DROP CONSTRAINT artigos_pkey;
       public         postgres    false    188                       2606    148411 (   inscricaoefetuada inscricaoefetuada_pkey 
   CONSTRAINT     f   ALTER TABLE ONLY public.inscricaoefetuada
    ADD CONSTRAINT inscricaoefetuada_pkey PRIMARY KEY (id);
 R   ALTER TABLE ONLY public.inscricaoefetuada DROP CONSTRAINT inscricaoefetuada_pkey;
       public         postgres    false    190                       2606    148423    inscricoes inscricoes_pkey 
   CONSTRAINT     X   ALTER TABLE ONLY public.inscricoes
    ADD CONSTRAINT inscricoes_pkey PRIMARY KEY (id);
 D   ALTER TABLE ONLY public.inscricoes DROP CONSTRAINT inscricoes_pkey;
       public         postgres    false    192            	           2606    148378     participantes participantes_pkey 
   CONSTRAINT     ^   ALTER TABLE ONLY public.participantes
    ADD CONSTRAINT participantes_pkey PRIMARY KEY (id);
 J   ALTER TABLE ONLY public.participantes DROP CONSTRAINT participantes_pkey;
       public         postgres    false    186                       2606    148396 $   artigos artigos_id_participante_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.artigos
    ADD CONSTRAINT artigos_id_participante_fkey FOREIGN KEY (id_participante) REFERENCES public.participantes(id);
 N   ALTER TABLE ONLY public.artigos DROP CONSTRAINT artigos_id_participante_fkey;
       public       postgres    false    186    188    2057                       2606    148424 *   inscricoes inscricoes_id_participante_fkey    FK CONSTRAINT     �   ALTER TABLE ONLY public.inscricoes
    ADD CONSTRAINT inscricoes_id_participante_fkey FOREIGN KEY (id_participante) REFERENCES public.participantes(id);
 T   ALTER TABLE ONLY public.inscricoes DROP CONSTRAINT inscricoes_id_participante_fkey;
       public       postgres    false    192    186    2057            �      x������ � �      �   ;   x�3���4B.#CcC#c��a<Ks3S������453��D⛀��c���� =      �      x������ � �      �   �   x��α�0���u�)��uѸ(���4X�FlR:��ָ`B�����܇����fS� ��D�D�ư@\b��_[��R]�C�F(��;��3B����z�)��G�s(�Mu��"�M)�ˠ̍uv�Z�F�)������0C����ғ�ᛅ8����~jy�     