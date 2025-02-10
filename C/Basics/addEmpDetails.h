#include<stdio.h>
#include "struct.h"


//struct Employee{
//	int emp_id;
//	char emp_name[30];
//	char emp_mail[40];
//	int contact;
//	int emp_sal;
//};

struct Employee *emp;

void addEmpDetails()
{
	int i,n;


	printf("1: Enter Employee Details\n");
	for(i=0; i<n; i++)
	{
		printf("1: Enter Employee Id: \n");
		scanf("%d",&emp[i].emp_id);
		printf("2: Enter Employee Name: \n");
		scanf("%s",&emp[i].emp_name);
		printf("3:Enter Employee E-mail: \n");
		scanf("%s",&emp[i].emp_mail);
		printf("4:Enter Employee Contact: \n");
		scanf("%d",&emp[i].contact);
		printf("5:Enter Employee Salary: \n");
		scanf("%d",&emp[i].emp_sal);
		printf("\n\n");
	}
}
