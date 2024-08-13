create sequence hotel_sequence start with 1 increment by 1;
insert into Hotel(id,travelorderId,nights) values (nextval('hotel_sequence'), 1, 5);
insert into Hotel(id,travelorderId,nights) values (nextval('hotel_sequence'), 2, 2);
insert into Hotel(id,travelorderId,nights) values (nextval('hotel_sequence'), 3, 3);
insert into Hotel(id,travelorderId,nights) values (nextval('hotel_sequence'), 4, 10);
insert into Hotel(id,travelorderId,nights) values (nextval('hotel_sequence'), 5, 10);