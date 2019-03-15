package ch16;

public class E18 {

	public static void main(String[] args) {
		BerylliumSphere[] bs = new BerylliumSphere[]{
				new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere()};
		for(int i=0;i<bs.length;i++)
			System.out.print(bs[i].toString()+" ");
		
		System.out.println(bs.toString());
		
		BerylliumSphere[] bs1 = new BerylliumSphere[]{
						new BerylliumSphere(),new BerylliumSphere(),new BerylliumSphere(),
						new BerylliumSphere()};
		for(int i=0;i<bs1.length;i++)
			System.out.print(bs1[i].toString()+" ");
		
		System.out.println(bs1.toString());
		
		System.arraycopy(bs,0,bs1,0,2);
		for(int i=0;i<bs1.length;i++)
			System.out.print(bs1[i].toString()+" ");
		
		System.out.println(bs1.toString());
		

	}

}
