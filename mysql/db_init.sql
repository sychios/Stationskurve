create table patienten(
	id tinyint unsigned auto_increment, name varchar(255) not null, vorname varchar(255) not null, geburtstag date not null,
    zimmer tinyint, aufnahme datetime not null, entlassung datetime,
    septisch bool not null, diagnose varchar(255) not null, beschwerden varchar(255),
    größe tinyint unsigned, gewicht tinyint unsigned,
    primary key(id));