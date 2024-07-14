package core.impl;

import java.util.List;

import core.domain.ISS;
import port.driven.IssRepository;
import port.driver.IssService;

public class IssServiceImpl implements IssService{
	
	@Autowired
	private IssRepository issRepository;

	@Override
	public void createIss(ISS iss) {
		issRepository.createIss(iss);
	}

	@Override
	public void updateIss(ISS iss) {
		issRepository.updateIss(iss);
	}

	@Override
	public ISS getIss(int id) {
		return issRepository.getIss(id);
	}

	@Override
	public List<ISS> getAllIss() {
		return issRepository.getAllIss();
	}

	@Override
	public void deleteIss(int id) {
		issRepository.deleteIss(id);
	}

}
