package adapter.driver;

import java.util.List;

import core.domain.ISS;
import port.driver.IssService;

@RestController
@RequestMapping(value = "/iss")
public class IssRestController {
	
	@Autowired
	private IssService issService;
	
	@PostMapping
	public void createIss(@RequestBody ISS iss) {
		issService.createIss(iss);
	}
	
	@PutMapping
	public void createIss(@RequestBody ISS iss) {
		issService.updateIss(iss);
	}
	
	@GetMapping("/{id}")
	public ISS getIss(@PathVariable("id") int id) {
		return issService.getIss(id);
	}
	
	@GetMapping
	public List<ISS> getAllIss(){
		return issService.getAllIss();
	}
	
	@DeleteMapping("/{id}")
	public void deleteIss(@PathVariable("id") int id) {
		issService.deleteIss(id);
	}

}
