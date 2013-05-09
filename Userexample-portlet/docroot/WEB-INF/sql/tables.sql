create table NewUser_Employee (
	employeeId LONG not null primary key IDENTITY,
	companyId LONG,
	userId LONG,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	eMail VARCHAR(75) null,
	phoneNo VARCHAR(75) null,
	major VARCHAR(75) null,
	cgpa VARCHAR(75) null,
	role VARCHAR(75) null,
	password_ VARCHAR(75) null
);