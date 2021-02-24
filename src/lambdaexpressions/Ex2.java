package lambdaexpressions;
interface addition
{
int add(int i,int j);	
}

public class Ex2 {
	public static void main(String[] args) {
		
		addition a1 = (i,j)->(i+j);
		System.out.println(a1.add(10, 20));
		
		addition a2 =(i,j)->
		{
			return i+j;
		};
		System.out.println(a2.add(10, 20));
	}

}
