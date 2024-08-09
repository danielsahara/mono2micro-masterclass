create sequence travelorder_sequence start with 1 increment by 1;
-- insert into TravelOrder(id) values (nextval('travelorder_sequence'));
-- insert into TravelOrder(id) values (nextval('travelorder_sequence'));
-- insert into TravelOrder(id) values (nextval('travelorder_sequence'));
-- insert into TravelOrder(id) values (nextval('travelorder_sequence'));
-- insert into TravelOrder(id) values (nextval('travelorder_sequence'));
-- insert into TravelOrder(id) values (nextval('travelorder_sequence'));

create sequence flight_sequence start with 1 increment by 1;
-- insert into Flight(id,travelorderId,fromAirport,toAirport) values (nextval('flight_sequence'),1,'GRU', 'MCO');
-- insert into Flight(id,travelorderId,fromAirport,toAirport) values (nextval('flight_sequence'),2,'GRU', 'JFK');
-- insert into Flight(id,travelorderId,fromAirport,toAirport) values (nextval('flight_sequence'),3,'GRU', 'ATL');
-- insert into Flight(id,travelorderId,fromAirport,toAirport) values (nextval('flight_sequence'),4,'GRU', 'MEX');

create sequence hotel_sequence start with 1 increment by 1;
-- insert into Hotel(id,travelorderId,nights) values (nextval('hotel_sequence'), 1, 5);


