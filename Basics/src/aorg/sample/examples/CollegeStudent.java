package aorg.sample.examples;


public class CollegeStudent extends Student {

		CollegeStudent(int id, String name) {
			super(id, name);
		}
		
		
		public static void main(String[] args) {
			
			CollegeStudent s = new CollegeStudent(1, "Naveen");
			System.out.println(s.id + " " + s.name);
			
		
			
		}
}
