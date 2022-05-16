create table user_details (
				user_id int generated always as identity,
				user_password varchar(200),
				user_first_name varchar(20),
				user_last_name varchar(20),
				user_type varchar(20),
				user_removed boolean,
				primary key(user_id)
			);

insert into user_details(user_password, user_first_name, user_last_name, user_type, user_removed) values('1234','John','Smith','customer', false);
insert into user_details(user_password, user_first_name, user_last_name, user_type, user_removed) values('5678','Carl','Max','employee', false);
