package TestFiles;

class employee extends Person{
	float salary;
	employee(int id,String name,float salary)
	{
		super(id,name);
		this.salary=salary;
	}
    void display()
    {
    	System.out.println(id+" "+name+" "+salary);
    }
}

