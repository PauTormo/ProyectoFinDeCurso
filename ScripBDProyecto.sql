create schema project;
use project;
create table weapons(
weapon_id int(6) auto_increment primary key,
weapon_name varchar(30) not null,
weapon_image_path varchar(200),
strength int(3),
speed int(3),
weapon_race varchar(20),
points int(2));

create table race(
race_id int(9) primary key,
race_name varchar(20) not null,
hp int(3) not null,
strength int(2) not null,
speed int(2) not null,
agility int(2) not null,
defense int(2) not null,
points int(2) not null
);

create table warriors(
warrior_id int(6) auto_increment primary key,
warrior_name varchar(30) not null,
warrior_image_path varchar(200) not null,
race_id int(9) not null,
foreign key (race_id)
	references race(race_id)
);

create table players(
player_id int(6) auto_increment primary key,
player_name varchar(30) not null);

create table ranking(
player_id int(6),
total_points int(20),
warrior_id int(6),
foreign key (player_id)
	references players(player_id),
foreign key (warrior_id)
	references warriors(warrior_id));

create table battle(
battle_id int(9) auto_increment primary key,
player_id int(6) not null,
warrior_id int(6) not null,
warrior_weapon_id int(6) not null,
oponent_id int(6) not null,
oponent_weapon_id int(6) not null,
injuries_caused int(10) not null,
injuries_suffered int(10) not null,
battle_points int (12) not null,
foreign key (player_id)
	references players(player_id),
foreign key (warrior_id) 
	references warriors(warrior_id),
foreign key (warrior_weapon_id)
	references weapons(weapon_id),
foreign key (oponent_id)
	references warriors(warrior_id),
foreign key (oponent_weapon_id)
	references weapons(weapon_id)
);

/*INSERT INTO RACE*/
/*Dwarf*/
insert into race
values(1,"Dwarf",60,6,4,5,3,21);

/*Elf*/
insert into race
values(2,"Elf",40,4,2,7,7,19);

/*Human*/
insert into race
values(3,"Human",50,5,3,6,5,20);



/*INSERT INTO WEAPONS*/
/*dagger*/
insert into weapons(weapon_name,weapon_image_path,strength,speed,weapon_race,points)
values("Dagger","dagger.jpg",0,3,"Elf,Human",10);

/*dirk*/
insert into weapons(weapon_name,weapon_image_path,strength,speed,weapon_race,points)
values("dirk","dirk.jpg",0,4,"Dwarf,Elf,Human",12);

/*Sword*/
insert into weapons(weapon_name,weapon_image_path,strength,speed,weapon_race,points)
values("Sword","Sword.jpg",1,1,"Dwarf,Elf,Human",10);

/*Double sword*/
insert into weapons(weapon_name,weapon_image_path,strength,speed,weapon_race,points)
values("Double Swords","double swords.jpg",2,2,"Dwarf,Human",14);

/*Scimitar*/
insert into weapons(weapon_name,weapon_image_path,strength,speed,weapon_race,points)
values("Simitar","Scimitar.jpg",1,2,"Dwarf,Human",14);

/*Katana*/
insert into weapons(weapon_name,weapon_image_path,strength,speed,weapon_race,points)
values("katana","katana.jpg",5,0,"Dwarf",20);

/*Ax*/
insert into weapons(weapon_name,weapon_image_path,strength,speed,weapon_race,points)
values("Ax","ax.jpg",3,0,"Dwarf,Human",10);

/*Two-handed Ax*/
insert into weapons(weapon_name,weapon_image_path,strength,speed,weapon_race,points)
values("Two-Handed ax","two-handed ax.jpg",2,3,"Dwarf",18);

/*Bow*/
insert into weapons(weapon_name,weapon_image_path,strength,speed,weapon_race,points)
values("Bow","bow.jpg",1,5,"Elf",15);



/*INSERT INTO WARRIORS*/

/*HUMANS*/
/*Boromir*/
insert into warriors(warrior_name,warrior_image_path,race_id)
values("Boromir","Boromir.jpg",3);

/*Aragorn*/
insert into warriors(warrior_name,warrior_image_path,race_id)
values("Aragorn","Aragorn.jpg",3);

/*Eomer*/
insert into warriors(warrior_name,warrior_image_path,race_id)
values("Eomer","eomer.png",3);

/*DWARF*/
/*Gimli*/
insert into warriors(warrior_name,warrior_image_path,race_id)
values("Gimli","gimli.png",1);

/*Balin*/
insert into warriors(warrior_name,warrior_image_path,race_id)
values("Balin","balin.jpeg",1);

/*Dwalin*/
insert into warriors(warrior_name,warrior_image_path,race_id)
values("Dwalin","dwalin.jpg",1);

/*ELF*/
/*Haldir*/
insert into warriors(warrior_name,warrior_image_path,race_id)
values("Haldir","haldir.jpg",2);

/*Legolas*/
insert into warriors(warrior_name,warrior_image_path,race_id)
values("Legolas","legolas.jpg",2);

/*Elrond*/
insert into warriors(warrior_name,warrior_image_path,race_id)
values("Elrond","elrond.jpg",2);




