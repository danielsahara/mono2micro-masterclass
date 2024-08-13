create sequence flight_sequence start with 1 increment by 1;
insert into Flight(id,travelorderId,fromAirport,toAirport) values (nextval('flight_sequence'),1,'GRU', 'MCO');
insert into Flight(id,travelorderId,fromAirport,toAirport) values (nextval('flight_sequence'),2,'GRU', 'JFK');
insert into Flight(id,travelorderId,fromAirport,toAirport) values (nextval('flight_sequence'),3,'GRU', 'ATL');
insert into Flight(id,travelorderId,fromAirport,toAirport) values (nextval('flight_sequence'),4,'GRU', 'MEX');