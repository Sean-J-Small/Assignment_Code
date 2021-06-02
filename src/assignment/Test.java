package assignment;

public class Test {
	public static void main(String[] args) {
		double answer;
		
        Computer computer;
        
        computer = new Add();
        UseCompute.useCPU(computer,1,2);
        
        computer = new Subtract();
        UseCompute.useCPU(computer,1,2);
        
        computer = new Multiply();
        UseCompute.useCPU(computer,1,2);
        
        computer = new Divide();
        UseCompute.useCPU(computer,1,2);
        
	}
}
