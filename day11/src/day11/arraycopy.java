package day11;

public class arraycopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] src= {1,2,3,4,5};
		int[] dest= {6,7,8,9,10};
     System.arraycopy(src,0, dest, 0, 3);
     for (int i = 0; i < src.length; i++) {
		System.out.print(" "+src[i]);
	}
     System.out.println();
     for (int i = 0; i < dest.length; i++) {
 		System.out.print(" "+dest[i]);
 	}
	}

}
