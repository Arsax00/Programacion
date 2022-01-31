package actividad2;
/**
 * 
 * @author Sara Jordana
 *
 */
public class CondicialEjercicio1 {
public static void main (String []args) {
int i= 8,j=5,k;
float x=0.55F,y=-0.01F,z=0;
char a,b='p',c='q';

	k=(j==5)?i:j;
	System.out.println(k);
   
	k=(j>5)?i:j;
	System.out.println(k);
   
	z=(x>=0)?x:0;
    System.out.println(z);
	
    z=(y>=0)?y:0; 
    System.out.println(z);
    
    a=(b<c)?b:c;
    System.out.println(a);
    
    k=(j>0)?j:0;
    System.out.println(k);
    
    k=(i>0&&j>0)?0:1;
    System.out.println(k);
    
    k=(y>0||x>0)?i+1:i-1;
    System.out.println(k);
    
    a=(a<'c')?b:c;
    System.out.println(a);
    
    a=(b>=c)?b:'r';
    System.out.println(a);

}
}