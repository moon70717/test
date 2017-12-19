update user_info
set uiname=?,uiage=?,uipwd=?,cino=?,uiregdate=now(),address=?
where uino=?;

desc user_info;

select * from user_info;

update class_info
set cidesc=?
where cino=?;

delete from user_info
where uino=21;


INSERT INTO USER_INFO(UINAME,UIAGE,UIID,UIPWD,CINO,uiregdate,address) VALUES ("갑길동",33,"ttest","GGG",3,Now(),"서울");