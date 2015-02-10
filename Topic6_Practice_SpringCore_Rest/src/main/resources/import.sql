INSERT INTO room (room_number) VALUES (1);
INSERT INTO room (room_number) VALUES (2);
INSERT INTO room (room_number) VALUES (3);

INSERT INTO attendee (first_name,last_name) VALUES ('Homero','Simpson');
INSERT INTO attendee (first_name,last_name) VALUES ('James','Bond');
INSERT INTO attendee (first_name,last_name) VALUES ('Walter','White');

INSERT INTO meeting (time_from, time_to, topic, room_room_id) VALUES('12','22','Reunion Importante',1);

INSERT INTO meeting_attendee (meetti,last_name) VALUES ('Walter','White');

INSERT INTO meeting_attendee
(meeting_meeting_id, attendee_attendee_id)
VALUES(1, 1);
--INSERT INTO meeting (time_from, time_to, topic, room_id) VALUES('20', '22', 'paradigmas', 1);
