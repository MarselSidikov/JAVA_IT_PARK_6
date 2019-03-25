create table service_user (
	id bigserial primary key,
	first_name varchar(20),
	last_name varchar(20),
	login varchar(20),
	password_hash varchar(120)
);

create table auth (
  id bigserial primary key,
  user_id bigint,
  cookie_value varchar(150),
  foreign key (user_id) references service_user(id)
);
