create table poly_iProject (
	projectID LONG not null primary key,
	projectTitle VARCHAR(75) null,
	projectdescription VARCHAR(75) null,
	sponsor VARCHAR(75) null,
	requiredSkills VARCHAR(75) null,
	contact VARCHAR(75) null,
	status VARCHAR(75) null,
	link VARCHAR(75) null,
	departments VARCHAR(75) null,
	dateAdded DATE null,
	dateModified DATE null
);