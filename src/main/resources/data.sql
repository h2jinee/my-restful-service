insert into users(id, join_date, name, password, ssn) values (90001, now(), 'User1', 'test111', '101010-1111111');
insert into users(id, join_date, name, password, ssn) values (90002, now(), 'User2', 'test222', '222222-1111111');
insert into users(id, join_date, name, password, ssn) values (90003, now(), 'User3', 'test333', '333333-1111111');


insert into post(description, user_id) values ('My first Post', 90001);
insert into post(description, user_id) values ('My second Post', 90001);