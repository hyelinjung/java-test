//���� 2���� �Ǽ��� �߿��� ū ���� ǥ��(���:if��)

/*
 * import java.util.Scanner;
 * 
 * public class Max2A {
 * 
 * public static void main(String[] args) { Scanner stdIn = new
 * Scanner(System.in);
 * 
 * System.out.println("�Ǽ� a:"); double a = stdn.nextDouble();
 * System.out.println("�Ǽ� b:"); double b = stdin.nextDouble();
 * 
 * 
 * double max; //ū ���� ���� if(a>b ) { max = a; }else { max = b; }
 * System.out.println("ư ���� ����" + max +"�Դϴ�."); }
 * 
 * }
 */
//2���� �Ǽ����� �о ū ���� ǥ��(���2: ���� ������)


  import java.util.Scanner;
  
  class Max2B {
  
  public static void main(String[] args) 
  { Scanner stdIn = new
  Scanner(System.in);
  
  System.out.println("�Ǽ� a:"); double a = stdIn.nextDouble();
  System.out.println("�Ǽ� b:"); double b = stdIn.nextDouble();
  
  
  double max = a>b ? a : b; System.out.println("ư ���� ����" + max +"�Դϴ�."); } }
  