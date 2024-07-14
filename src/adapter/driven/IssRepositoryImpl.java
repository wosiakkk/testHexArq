package adapter.driven;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import core.domain.ISS;
import port.driven.IssRepository;

@Repository
public class IssRepositoryImpl implements IssRepository{

	//salvando em runtime para simular DB.
	private Map<Integer, ISS> issStore = new HashMap<Integer, ISS>();
	
	@Override
	public void createIss(ISS iss) {
		//save logic
		issStore.put(iss.getId(), iss);
	}

	@Override
	public void updateIss(ISS iss) {
		// update logic
		issStore.put(iss.getId(), iss);
	}

	@Override
	public ISS getIss(int id) {
		return issStore.get(id);
	}

	@Override
	public List<ISS> getAllISS() {
		return issStore.values().stream().collect(Collectors.toList());
	}

	@Override
	public void deleteIss(int id) {
		issStore.remove(id);
	}

}
