create table patient(
	id tinyint unsigned auto_increment, surname varchar(255) not null, first_name varchar(255) not null, date_of_birth date not null,
    room tinyint, admission datetime not null, dismissal datetime,
    septic bool not null, diagnosis varchar(255) not null, symptoms varchar(255),
    height tinyint unsigned, weight tinyint unsigned,
    primary key(id));