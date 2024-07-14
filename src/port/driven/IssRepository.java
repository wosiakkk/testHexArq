package port.driven;

import java.util.List;

import core.domain.ISS;

public interface IssRepository {
	public void createIss(ISS iss);
	public void updateIss(ISS iss);
	public ISS getIss(int id);
	public List<ISS> getAllISS();
	public void deleteIss(int id);
}
