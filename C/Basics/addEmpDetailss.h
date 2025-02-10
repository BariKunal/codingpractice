#include<stdio.h>
struct Employee{
	int emp_id;
	char emp_name[30];
	char emp_mail[40];
	int contact;
	int emp_sal;
}; 
//struct Employee *emp;
void addEmpDetails(struct Employee* emp, int n)
{	
//count1=n;
  //printf("--->%d", count1);
    int i;

	//printf("1:Enter Employee Details\n");
	for( i=0; i<n; i++)
	{
		printf("\n\n");
		printf("1: Enter Employee Id: ");
		scanf("%d",&emp[i].emp_id);
		printf("2: Enter Employee Name: ");
		_flushall();
		scanf("%s",&emp[i].emp_name);
		printf("3:Enter Employee E-mail: ");
		scanf("%s",&emp[i].emp_mail);
		printf("4:Enter Employee Contact: ");
		scanf("%d",&emp[i].contact);
		printf("5:Enter Employee Salary: ");
		scanf("%d",&emp[i].emp_sal);
		printf("\n\n");
	}
}

