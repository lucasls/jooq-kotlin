create table beatle(
    id int primary key,
    name varchar,
    instrument varchar,
    lead_vocals bool
);

insert into beatle values (1, 'john', 'guitar', true);
insert into beatle values (2, 'paul', 'bass', true);
insert into beatle values (3, 'george', 'guitar', false);
insert into beatle values (4, 'ringo', 'drums', false);