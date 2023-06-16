create table student (
    s_id    	varchar2(10) NOT NULL,
    s_name  	varchar2(30) NOT NULL,
    s_grade 	number       NOT NULL,
    s_major 	varchar2(30) NOT NULL,
    s_pwd   	varchar2(20) NOT NULL,
    s_email 	varchar2(50),
    s_phone 	varchar2(15),
    s_address 	varchar2(50),
    CONSTRAINT stu_pk PRIMARY KEY (s_id)
);

insert into student values ('2012345', '김소미', 3, '소프트웨어학부', 'a1245', 'som45@sm.ac.kr', '010-2837-2993', '서울시 강서구');
insert into student values ('2212346', '이서연', 2, '소프트웨어학부', 'asdo37', 'seoseo@sm.ac.kr', '010-2111-2020', '서울시 강북구');
insert into student values ('2112347', '박수진', 3, '소프트웨어학부', 'hihihi', 'jjin11@sm.ac.kr', '010-0999-2823', '서울시 강남구');
insert into student values ('2012348', '정채영', 4, '경영학부', 'jung01', 'youngirl@sm.ac.kr', '010-1234-4833', '서울시 강동구');
insert into student values ('2012349', '유미래', 1, '기초공학부', 'miraeya', 'future00@sm.ac.kr', '010-1324-5325', '서울시 종로구');


create table professor (
    p_id    varchar2(10) NOT NULL,
    p_pwd   varchar2(30) NOT NULL,
    p_name  varchar2(30) NOT NULL,
    p_major varchar2(30),
    p_phone	varchar2(15),
    p_loc	varchar2(20),
    CONSTRAINT pro_pk PRIMARY KEY (p_id)
);

insert into professor values ('56789', 'a0000', '이현자', '소프트웨어학부', '02-3442-9384', '새힘-402');
insert into professor values ('56783', 'ky111', '이기용', '소프트웨어학부', '02-1119-0820', '새힘-406');
insert into professor values ('39230', 'yik', '여인권', '통계학과', '02-0919-1112', '사회-502');
insert into professor values ('23934', 'hihi', '김유경', '기초공학부', '02-0973-9999', '르네상스-304');
insert into professor values ('34719', 'yk7331, ''김유경', '기초공학부', '02-0973-9999', '르네상스-308');
insert into professor values ('26865', 'korea12', '박상일', '경영학부', '02-0973-9999', '순헌-310');
insert into professor values ('24958', 'umm01', '엄재근', '경영학부', '02-0973-9999', '순헌-505');
insert into professor values ('33218', 'ohohoh', '오준석', '경영학부', '02-0973-9999', '순헌-507');
insert into professor values ('22393', 'sundae', '박철순', '경영학부', '02-0973-9999', '순헌-306');
insert into professor values ('12443', 'tiger53', '정태범', '경영학부', '02-0973-9999', '순헌-304');
insert into professor values ('59485', 'joo0912', '정영주', '소프트웨어학부', '02-0973-9999', '새힘-401');
insert into professor values ('57664', 'stonebell', '유석종', '소프트웨어학부', '02-0973-9999', '새힘-407');
insert into professor values ('51345', 'park26', '박영훈', '소프트웨어학부', '02-0973-9999', '새힘-405');
insert into professor values ('52873', 'changmo', '창병모', '소프트웨어학부', '02-0973-9999', '새힘-109');
insert into professor values ('50919', '09woo', '최영우', '소프트웨어학부', '02-0973-9999', '새힘-209');


create table course (
    c_id    varchar2(20) NOT NULL,
    c_id_no number       NOT NULL,
    c_name  varchar2(50) NOT NULL,
    c_unit  number       NOT NULL,
    c_major varchar2(30),
    c_grade number,
    CONSTRAINT cs_pk PRIMARY KEY (c_id, c_id_no)
);

insert into course values ('102934', 001, '데이터베이스프로그래밍', 3, '소프트웨어학부', 3);
insert into course values ('102229', 001, '데이터마이닝및분석', 3, '소프트웨어학부', 3);
insert into course values ('102119', 001, '빅데이터통계분석', 3, '통계학과', 4);
insert into course values ('108927', 001, 'R프로그래밍', 3, '통계학과', 2);
insert into course values ('101098', 001, '프로그래밍입문', 3, '기초공학부', 1);
insert into course values ('110294', 001, '데이터사이언스개론', 3, '소프트웨어학부', 2);
insert into course values ('103917', 001, '소프트웨어의이해', 3, '소프트웨어학부', 1);
insert into course values ('103917', 002, '소프트웨어의이해', 3, '소프트웨어학부', 1);
insert into course values ('100542', 001, '운영체제', 3, '소프트웨어학부', 3);
insert into course values ('100542', 002, '운영체제', 3, '소프트웨어학부', 3);
insert into course values ('100542', 003, '운영체제', 3, '소프트웨어학부', 3);
insert into course values ('100550', 001, '인공지능', 3, '소프트웨어학부', 4);
insert into course values ('100550', 002, '인공지능', 3, '소프트웨어학부', 4);
insert into course values ('100540', 001, '자료구조', 3, '소프트웨어학부', 3);
insert into course values ('101715', 001, '컴파일러', 3, '소프트웨어학부', 4);
insert into course values ('110984', 001, '데이터통계입문', 2, '소프트웨어학부', 1);
insert into course values ('100753', 001, '네트워크', 3, '소프트웨어학부', 4);
insert into course values ('120097', 001, '임베디드시스템', 3, '소프트웨어학부', 3);
insert into course values ('100655', 001, '컴퓨터그래픽스', 3, '소프트웨어학부', 3);
insert into course values ('100545', 001, '프로그래밍언어론', 3, '소프트웨어학부', 3);
insert into course values ('101058', 001, '경영과학1', 3, '경영학부', 2);
insert into course values ('101107', 001, '국제재무관리', 3, '경영학부', 4);
insert into course values ('101056', 001, '마케팅원론', 2, '경영학부', 3);
insert into course values ('101055', 001, '회계원리', 1, '경영학부', 3);
insert into course values ('101055', 002, '회계원리', 1, '경영학부', 3);
insert into course values ('101055', 003, '회계원리', 1, '경영학부', 3);
insert into course values ('101055', 004, '회계원리', 1, '경영학부', 3);
insert into course values ('101055', 005, '회계원리', 1, '경영학부', 3);


create table teach (
    t_id        varchar2(10)    NOT NULL,
    t_year      number          NOT NULL,
    t_semester  number          NOT NULL,
    t_time      number          NOT NULL,
    t_loc       varchar2(20)    NOT NULL,
    t_max       number          NOT NULL,
    c_id        varchar2(20),
    c_id_no     number,
    p_id		varchar2(10),
    CONSTRAINT teach_pk  PRIMARY KEY (t_id),
    CONSTRAINT teach_fk  FOREIGN KEY (c_id, c_id_no) REFERENCES course (c_id, c_id_no),
    CONSTRAINT teach_fk2 FOREIGN KEY (p_id) REFERENCES professor (p_id)
);

-- 23-2
insert into teach values ('001', 23, 2, 1, '명신-109', 3, '102934', 001, '56789');
insert into teach values ('002', 23, 2, 2, '명신-307', 50, '103917', 001, '56789');
insert into teach values ('003', 23, 2, 2, '명신-510', 40, '100545', 001, '56789');

insert into teach values ('004', 23, 2, 5, '명신-702', 90, '102229', 001, '56783');
insert into teach values ('005', 23, 2, 3, '명신-508', 30, '100542', 001, '56783');
insert into teach values ('006', 23, 2, 4, '명신-508', 30, '100542', 002, '56783');

insert into teach values ('007', 23, 2, 1, '명신-212', 40, '103917', 002, '57664');
insert into teach values ('008', 23, 2, 2, '명신-212', 50, '100540', 001, '57664');
insert into teach values ('009', 23, 2, 3, '명신-308', 40, '101098', 001, '57664');

insert into teach values ('010', 23, 2, 1, '순헌-307', 40, '101055', 001, '24958');
insert into teach values ('011', 23, 2, 2, '순헌-307', 40, '101055', 002, '24958');
insert into teach values ('012', 23, 2, 3, '순헌-307', 40, '101055', 003, '24958');
insert into teach values ('013', 23, 2, 6, '순헌-510', 30, '101107', 001, '24958');

insert into teach values ('014', 23, 2, 1, '진리-311', 40, '101058', 001, '33218');
insert into teach values ('015', 23, 2, 3, '진리-309', 50, '101056', 001, '33218');
insert into teach values ('016', 23, 2, 1, '순헌-210', 40, '101055', 004, '33218');
insert into teach values ('017', 23, 2, 2, '순헌-210', 50, '101055', 005, '33218');

insert into teach values ('035', 23, 2, 3, '사회-510', 30, '102119', 001, '39230');

-- 23-1 
insert into teach values ('018', 23, 1, 1, '명신-311', 30, '100545', 001, '52873');
insert into teach values ('019', 23, 1, 3, '명신-510', 40, '103917', 001, '51345');
insert into teach values ('020', 23, 1, 4, '명신-510', 50, '103917', 002, '57664');
insert into teach values ('021', 23, 1, 2, '명신-408', 30, '100540', 001, '57664');
insert into teach values ('022', 23, 1, 6, '명신-209', 40, '100542', 003, '57664');
insert into teach values ('036', 23, 1, 6, '명신-304', 40, '100550', 002, '50919');

-- 22-2 
insert into teach values ('023', 22, 2, 2, '명신-410', 30, '100540', 001, '57664');
insert into teach values ('024', 22, 2, 1, '명신-210', 40, '100753', 001, '57664');
insert into teach values ('025', 22, 2, 3, '명신-311', 40, '101715', 001, '57664');
insert into teach values ('026', 22, 2, 3, '명신-312', 40, '110294', 001, '56783');
insert into teach values ('027', 22, 2, 3, '진리-409', 30, '101056', 001, '24958');
insert into teach values ('028', 22, 2, 4, '진리-409', 30, '101058', 001, '24958');


-- 22-1
insert into teach values ('029', 22, 1, 4, '명신-701', 70, '110984', 001, '57664');
insert into teach values ('030', 22, 1, 1, '명신-210', 40, '120097', 001, '57664');
insert into teach values ('031', 22, 1, 3, '명신-311', 50, '100655', 001, '57664');
insert into teach values ('032', 22, 1, 3, '명신-312', 40, '101107', 001, '12443');
insert into teach values ('033', 22, 1, 3, '사회-510', 30, '102119', 001, '39230');
insert into teach values ('034', 22, 1, 2, '사회-510', 30, '108927', 001, '39230');


create table enroll (
    e_id        varchar2(10)    NOT NULL,
    e_year      number          NOT NULL,
    e_semester  number          NOT NULL,
    s_id        varchar2(10),
    c_id        varchar2(20),
    c_id_no     number,
    t_id        varchar2(10),
    CONSTRAINT enroll_pk  PRIMARY KEY (e_id),
    CONSTRAINT enroll_fk  FOREIGN KEY (s_id) REFERENCES student (s_id),
    CONSTRAINT enroll_fk2 FOREIGN KEY (c_id, c_id_no) REFERENCES course (c_id, c_id_no),
    CONSTRAINT enroll_fk3 FOREIGN KEY (t_id) REFERENCES teach (t_id)
);

-- 23-2
insert into enroll values ('019', 23, 2, '2012345', '102934', 001, '001');
insert into enroll values ('020', 23, 2, '2012345', '101055', 002, '012');
insert into enroll values ('021', 23, 2, '2012345', '103917', 002, '007');
insert into enroll values ('022', 23, 2, '2012345', '101098', 001, '009');
insert into enroll values ('023', 23, 2, '2012345', '102119', 001, '035');

insert into enroll values ('024', 23, 2, '2212346', '103917', 002, '007');
insert into enroll values ('025', 23, 2, '2212346', '102934', 001, '001');
insert into enroll values ('026', 23, 2, '2212346', '100540', 001, '008');
insert into enroll values ('027', 23, 2, '2212346', '101098', 001, '009');

insert into enroll values ('028', 23, 2, '2112347', '102934', 001, '001');
insert into enroll values ('029', 23, 2, '2112347', '103917', 002, '007');
insert into enroll values ('030', 23, 2, '2112347', '101055', 001, '010');
insert into enroll values ('031', 23, 2, '2112347', '102119', 001, '035');

insert into enroll values ('032', 23, 2, '2012348', '103917', 002, '007');
insert into enroll values ('033', 23, 2, '2012348', '100540', 001, '008');
insert into enroll values ('034', 23, 2, '2012348', '102229', 001, '004');

insert into enroll values ('035', 23, 2, '2012349', '101055', 003, '012');
insert into enroll values ('036', 23, 2, '2012349', '102119', 001, '035');

--(2012345 학생)
insert into enroll values ('001', 23, 1, '2012345', '100545', 001, '018');
insert into enroll values ('002', 23, 1, '2012345', '100540', 001, '021');
insert into enroll values ('003', 23, 1, '2012345', '100542', 003, '022');
insert into enroll values ('004', 23, 1, '2012345', '100550', 002, '036');

insert into enroll values ('005', 22, 2, '2012345', '100753', 001, '024'); 
insert into enroll values ('006', 22, 2, '2012345', '101715', 001, '025'); 
insert into enroll values ('007', 22, 2, '2012345', '110294', 001, '026'); 
insert into enroll values ('008', 22, 2, '2012345', '101056', 001, '027');
insert into enroll values ('009', 22, 2, '2012345', '101058', 001, '028');

insert into enroll values ('014', 22, 1, '2012345', '110984', 001, '029');
insert into enroll values ('015', 22, 1, '2012345', '120097', 001, '030');
insert into enroll values ('016', 22, 1, '2012345', '101107', 001, '032');
insert into enroll values ('017', 22, 1, '2012345', '100655', 001, '031');
insert into enroll values ('018', 22, 1, '2012345', '108927', 001, '034');




create table history (
	e_id    varchar2(10) NOT NULL,
	s_id 	varchar2(10) NOT NULL,
	h_score varchar2(10),
	CONSTRAINT history_pk  PRIMARY KEY (e_id),
	CONSTRAINT history_fk  FOREIGN KEY (e_id) REFERENCES enroll (e_id),
	CONSTRAINT history_fk2  FOREIGN KEY (s_id) REFERENCES student (s_id)
);

insert into history values ('001', '2012345', 'A+');
insert into history values ('002', '2012345', 'B+');
insert into history values ('003', '2012345', 'A0');
insert into history values ('004', '2012345', 'B-');
insert into history values ('005', '2012345', 'A+');
insert into history values ('006', '2012345', 'A+');
insert into history values ('007', '2012345', 'A+');
insert into history values ('008', '2012345', 'B+');
insert into history values ('009', '2012345', 'B0');
insert into history values ('014', '2012345', 'A0');
insert into history values ('015', '2012345', 'A+');
insert into history values ('016', '2012345', 'B-');
insert into history values ('017', '2012345', 'A+');
insert into history values ('018', '2012345', 'A0');


create table heart (
	s_id	varchar2(10),
	t_id	varchar2(10),
	CONSTRAINT heart_pk PRIMARY KEY (s_id, t_id),
	CONSTRAINT heart_fk FOREIGN KEY (s_id) REFERENCES student (s_id),
	CONSTRAINT heart_fk2 FOREIGN KEY (t_id) REFERENCES teach (t_id)
);

insert into heart values ('2012345', '013');
insert into heart values ('2012345', '003');


