public class DemoController {
	@GetMapping("/{id}")
 public String getStudentName(@PathVariable int id) {
	 return "Sahana";
 }
}