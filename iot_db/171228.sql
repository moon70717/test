create table movie_info(
mv_no int auto_increment primary key,
mv_name varchar(400),
mv_company varchar(400),
mv_director varchar(400),
mv_genre varchar(100),
play_room_num int,
time_num int);


create table play_room(
play_room_num int primary key auto_increment,
play_room_flower varchar(100),
play_room_name varchar(100)
);


create table play_time(
time_num int auto_increment primary key,
time_time varchar(500)
);


desc play_time;
desc play_room;
desc movie_info;

alter table movie_info add foreign key(play_room_num) references play_room(play_room_num);

alter table movie_info add foreign key(time_num) references play_time(time_num);

desc movie_info;


insert into play_time(time_time) values('8:00 -10:00'),('10:00 -12:00'),('12:00 -14:00'),('14:00 -16:00');

select * from play_time;

insert into play_room(play_room_flower,play_room_name) values('1층','주니어관'),('1층','어덜트관'),('2층','시니어관');

select * from play_room;

desc movie_info;
insert into movie_info(mv_name,mv_company,mv_director,mv_genre,play_room_num,time_num) values('톰과제리','월트디즈니','멜깁슨','애니메이션',1,1);

insert into movie_info(mv_name,mv_company,mv_director,mv_genre,play_room_num,time_num) values('색즉시공','아프리카티비','임창정','성인',2,3);

insert into movie_info(mv_name,mv_company,mv_director,mv_genre,play_room_num,time_num) values('러브액츄얼리','dreamworks','샘해밍턴','코미디로맨스',3,2);

delete from movie_info where mv_name='색즉시공';

select * from movie_info;

#톰과제리의 time_num을 검색
select pt.time_time from movie_info mi ,play_time pt
where mi.mv_name='톰과제리' and mi.time_num=pt.time_num;

#배급사가 월트디즈니인 영화의 상영시간을 기존시간 말고 나머지 상영시간중 남는거로  바꿔주세요
update movie_info mi set time_num=(
select min(pt.time_num) from play_time pt
where pt.time_num!=mi.time_num
)
where mv_company='월트디즈니';

# 1층에있는 상영관들에서 하는 영화 정보를 검색해주세요
select * from movie_info
where play_room_num=1;

# 어덜트관에서 상영하는 영화정보를 검색해주세요
select * from movie_info mi
where mi.play_room_num=(
select pr.play_room_num from play_room pr
where pr.play_room_name='어덜트관'
);
   update movie_info  set time_num = 
	(select time_num from (select time_num from 
	(select time_num from play_time where time_num not in
	(select time_num from movie_info where mv_company = '월트디즈니')) 
	as notnum limit 1)as gg)  where mv_company ='월트디즈니';