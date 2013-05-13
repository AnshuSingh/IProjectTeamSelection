create table NS_useraccount (
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
	userapproved BOOLEAN,
	dateAdded DATE null
);