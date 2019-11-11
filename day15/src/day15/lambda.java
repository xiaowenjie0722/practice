package day15;

import java.util.Arrays;
import java.util.Collections;



public class lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
classflower fClass1=new classflower(100, 168, 168);
classflower fClass2=new classflower(100, 168, 168);
classflower fClass3=new classflower(100, 168, 168);
classflower[] flower=new classflower[] {fClass1,fClass2,fClass3};
Collections.sort(Arrays.asList(flower),(classflower f1,classflower f2)->{
	return f1.face-f2.face;
});
for(classflower f:flower) {
	System.out.println(f.face);
}
	}

}
