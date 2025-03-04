//   Q1. WAP to Create Application Voting using following classes 
//	First class Voter with field : id , name and age and Mark Voter as POJO class
//	Second class is VotingMaching with following methods 
//	   a)Void verifyVoter(Voter …v): this method can accept the voter details
//	   b)Void showValidVote(): this method can show the voter whose age is greater than 18
//	   c)Void showInvalidVote(): this method can show the voter list whose age is less than 18.

//	Note: write main method class name as VotingMachineApplication


class Voter 
{
    private int id;
    private String name;
    private int age;

    public void setVoterid(int i)
    {
	id = i;
    }
    public int getVoterid()
    {
	return id;
    }
    public void setVoterName(String n)
    {
	name = n;
    }
    public String getVoterName()
    {
	return name;
    }
    public void setVoterage(int ag)
    {
	age = ag;
    }
    public int getVoterage()
    {
	return age;
    }
}
class VotingMaching
{
    Voter voter[];
    void verifyVoter(Voter ...v)
    {
	voter=v;
    }
    void showValidVote()
    {	
	System.out.println("Valid Voters...");
	for(int i=0; i<voter.length; i++)
	{
	    if(voter[i].getVoterage()>=18)
	    {
	    	System.out.println(voter[i].getVoterid()+"\t"+voter[i].getVoterName()+"\t"+voter[i].getVoterage());	
	    }
	}
    }
    void showInvalidVote()
    {	
	System.out.println("Invalid Voters...");
	for(int i=0; i<voter.length; i++)
	{
	    if(voter[i].getVoterage()<18)
	    {
	    	System.out.println(voter[i].getVoterid()+"\t"+voter[i].getVoterName()+"\t"+voter[i].getVoterage());	
	    }
	}
    } 
}
public class VotingMachineApplication
{
    public static void main(String x[])
    { 
 	VotingMaching vm = new VotingMaching();
	
	Voter v1 = new Voter();
	v1.setVoterid(1);
	v1.setVoterName("ABC");
	v1.setVoterage(18);

	Voter v2 = new Voter();
	v2.setVoterid(2);
	v2.setVoterName("PQR");
	v2.setVoterage(22);

	Voter v3 = new Voter();
	v3.setVoterid(3);
	v3.setVoterName("XYZ");
	v3.setVoterage(17);

	vm.verifyVoter(v1,v2,v3);
	vm.showValidVote();
	vm.showInvalidVote();
    }
}