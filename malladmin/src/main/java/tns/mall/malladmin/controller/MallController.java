package tns.mall.malladmin.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tns.mall.malladmin.entity.Mall;
import tns.mall.malladmin.service.MallService;
@RestController

public class MallController {
	@Autowired
	MallService mallService;
	// http://localhost:8071/student - Post
	@RequestMapping("/Mall")
	@PostMapping
	public Mall addMall(@RequestBody Mall mall)
	{
	return mallService.save(mall);
	}
	@GetMapping(path="/{id}")
	public Mall getMall(@PathVariable long id)
	{
	return mallService.getMall(id);
	}
	@PutMapping(path="/{id}")
	public Mall updateMall(@RequestBody Mall mall, @PathVariable long id)
	{
	return mallService.updateMall(id,mall);
	}
	@DeleteMapping(path="/{id}")
	public String deleteMall(@PathVariable int id)
	{
	return mallService.delete(id); 
	}

	@GetMapping
	public List<Mall> getAllMalls()
	{
	return mallService.getMallist();
	}
	}




	


