package port.driver;

import java.util.List;

import core.domain.ISS;

public interface IssService {
	public void createIss(ISS iss);
	public void updateIss(ISS iss);
	public ISS getIss(int id);
	public List<ISS> getAllIss();
	public void deleteIss(int id);
}
