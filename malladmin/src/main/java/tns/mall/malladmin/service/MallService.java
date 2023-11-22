package tns.mall.malladmin.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tns.mall.malladmin.entity.Mall;
import tns.mall.malladmin.repository.MallRepository;
@Service

public class MallService {
	@Autowired
	MallRepository mallRepository;
	public Mall save(Mall ml)
	{
	return mallRepository.save(ml);
	}
	public Mall getMall(long id)
	{
	return mallRepository.findById(id).get();
	}
	public Mall updateMall(long id,Mall mall)
	{
	    Mall ml = mallRepository.findById(id).get();
		ml.setName(mall.getName());
		ml.setPassword(mall.getPassword());
		return mallRepository.save(ml);

	}
	public String delete(long id)
	{
	mallRepository.deleteById(id);
	return "Entity with this id is deleted" +id;
	}
	public List<Mall> getMallist()
	{
	return mallRepository.findAll();
	}
	}





