create table Sapprove_Faculty (
	facultyID LONG not null primary key,
	asuriteid VARCHAR(75) null,
	facultyName VARCHAR(75) null,
	facultyDept VARCHAR(75) null,
	contact VARCHAR(75) null,
	dateAdded DATE null,
	dateModified DATE null,
	assigned BOOLEAN
);

create table Sapprove_student (
	studentgeninfoid LONG not null primary key,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	asuriteid VARCHAR(75) null,
	department VARCHAR(75) null,
	level VARCHAR(75) null,
	cgpa VARCHAR(75) null,
	sex VARCHAR(75) null,
	phone VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	assigned BOOLEAN
);

create table cnua_useraccount (
	useraccountId LONG not null primary key IDENTITY,
	companyId LONG,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	eMail VARCHAR(75) null,
	phoneNo VARCHAR(75) null,
	major VARCHAR(75) null,
	cgpa VARCHAR(75) null,
	role VARCHAR(75) null,
	password_ VARCHAR(75) null,
	asuriteId VARCHAR(75) null,
	level VARCHAR(75) null,
	sex VARCHAR(75) null,
	dateAdded DATE null
);