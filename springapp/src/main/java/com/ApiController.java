public class DemoController {
	@GetMapping("/{id}")
 public String getStudentName(@PathVariable int id) {
	if(id==1)	
	 return "Sahana"+id;
	else {
		return "";
	}
 }
}