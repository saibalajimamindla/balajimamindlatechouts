package lambdaexpressions;

interface caller {
void name(String na,String nc);

}

public class Ex1 {
	public static void main(String[] args) {
		caller c =(na,nc)->
		{
			System.out.println("the name is "+na+" "+nc);
		};
		c.name("balaji","Mamindla");
	}
	

}
