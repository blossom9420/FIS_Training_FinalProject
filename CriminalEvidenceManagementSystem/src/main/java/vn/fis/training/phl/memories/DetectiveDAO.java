package vn.fis.training.phl.memories;

import vn.fis.training.phl.memories.interfaces.IDetective;
import vn.fis.training.phl.models.Detective;

import java.util.List;
import java.util.Optional;


public class DetectiveDAO implements IDetective {
    @Override
    public void save(Detective detective) {
        MemoryDataSource.DETECTIVES.add(detective);
    }

    @Override
    public Optional<Detective> get(long id) {
        return MemoryDataSource.DETECTIVES.stream()
                .filter(detective -> detective.getId() == id)
                .findFirst();
    }

    @Override
    public List<Detective> getAll() {
        return MemoryDataSource.DETECTIVES;
    }

    @Override
    public void update(Detective updateDetective) {
        MemoryDataSource.DETECTIVES.stream()
                .filter(criminalCase -> criminalCase.getId() == criminalCase.getId())
                .forEach(c -> c.replace(updateDetective));
    }

    @Override
    public void delete(Detective detective) {
        MemoryDataSource.DETECTIVES.remove(detective);
    }
}
